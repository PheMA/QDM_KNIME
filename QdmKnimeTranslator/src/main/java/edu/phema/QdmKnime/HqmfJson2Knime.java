/**
 * 
 */
package edu.phema.QdmKnime;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import net.lingala.zip4j.exception.ZipException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.json.JSONException;

import edu.phema.QdmKnimeInterfaces.ConnectionInterface;
import edu.phema.QdmKnimeInterfaces.NodeInterface;
import edu.phema.QdmKnimeInterfaces.QdmDataElementInterface;
import edu.phema.jaxb.ihe.svs.ConceptListType;
import edu.phema.jaxb.ihe.svs.RetrieveValueSetResponseType;
import edu.phema.knime.exceptions.SetUpIncompleteException;
import edu.phema.knime.exceptions.WrittenAlreadyException;
import edu.phema.readers.HqmfJson;
import edu.phema.vsac.VsacConnector;

/**
 * @author Huan Mo
 *
 */
public class HqmfJson2Knime {

	/**
	 * 
	 */
	
	private VsacConnector vsac;
	
	public HqmfJson2Knime(VsacConnector vsac) {
		// TODO Auto-generated constructor stub
		this.vsac = vsac;
	}
	
	public void translate(Path hqmfJsonPath, Path outputPath) 
			throws IOException, JSONException, WrittenAlreadyException, SetUpIncompleteException {
		String jsonDoc = Toolkit.readFile(hqmfJsonPath.toString());
		HqmfJson measure = new HqmfJson(jsonDoc);
		KnimeProject kProject = new KnimeProject(outputPath.getParent(), outputPath.getFileName().toString());
		ArrayList<NodeInterface> nodes = new ArrayList<NodeInterface>();  // the index will the knime id
		ArrayList<ConnectionInterface> conns = new ArrayList<ConnectionInterface>();
		HashMap <String, QdmDataElementInterface> sourceDataCriteriaNodes = new HashMap <String, QdmDataElementInterface> ();
		HashMap <NodeInterface, Integer> nodeLevels = new HashMap <NodeInterface, Integer> (); // Start with 0
		HashMap <String, NodeInterface> dataCriteriaNodes = new HashMap <String, NodeInterface> ();
		
		/*
		 * Measure Period object need to be created and linked to sourceDataCriteria every time it is used
		 * It cannot be reused
		 * */
		String measureStart = measure.getMeasureStartDatetime();  // yyyyMMddHHmm
		String measureEnd = measure.getMeasureEndDatetime();   // yyyyMMddHHmm
		
		for (String sourceDataCriteriaName : measure.getSourceDataCrtieriaList()){
			QdmDataElement element = new QdmDataElement(nodes.size());
			nodes.add(element);
			sourceDataCriteriaNodes.put(sourceDataCriteriaName, element);
			nodeLevels.put(element, new Integer(0));
			String description = measure.getSourceDataCriteriaInfo(sourceDataCriteriaName, "description");
			element.setQdmDataElementText(description);
			int endTypeIndex = description.matches(":") ? description.indexOf(":") - 1 : description.length() - 1;
			element.setQdmDataType(description.substring(0, endTypeIndex));
			String valueSet_oid = measure.getSourceDataCriteriaInfo(sourceDataCriteriaName, "code_list_id");
			if (valueSet_oid != null) {
				try {
					element.setValueSet(vsac.getValueSetXml(valueSet_oid));
				} catch (JAXBException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				};
			}
		}
		
		for (String dataCriteriaName : measure.getDataCrtieriaList()){
			QdmDataElementInterface sourceElement = sourceDataCriteriaNodes.get(
					measure.getDataCriteriaInfo(dataCriteriaName, "source_data_criteria"));
			NodeInterface frontier = sourceElement; 
			int frontierLevel = nodeLevels.get(frontier);   // for nodeLevels
			if (! measure.typeOfValueInDataCriteria(dataCriteriaName).equals("")){
				String text = measure.getTextOfValueInDataCriteria(dataCriteriaName);
				String columnType = "unknown";
				Attribute attr_value = new Attribute(nodes.size());
				nodes.add(attr_value);
				Connection conn = new Connection(conns.size());
				conns.add(conn);
				conn.setSource(frontier.getId(), 0);
				conn.setDest(attr_value.getId(), 1);  // Port for native nodes start from 1
				attr_value.setInputElementId(0, frontier.getOutputElementId(0));
				nodeLevels.put(attr_value, ++ frontierLevel);
				attr_value.setAttributeName("value");
				if (measure.typeOfValueInDataCriteria(dataCriteriaName).equals("IVL_PQ")){
					columnType = "Double";
					Double[] high_low = measure.getValueIVL_PQInDataCriteriaHL(dataCriteriaName);
					attr_value.setMode_Comparison(high_low[0], high_low[1]);
				} else if (measure.typeOfValueInDataCriteria(dataCriteriaName).equals("CD")){
					columnType = "String";
					ArrayList<String> codes = new ArrayList<String>();
					ArrayList<String> displayNames = new ArrayList<String>();
					HashMap<String, String> cd = measure.getValueCDInDataCriteria(dataCriteriaName);
					String oid = cd.get("code_list_id");
					String code = cd.get("code");
					if (oid != null){
						JAXBElement<RetrieveValueSetResponseType> returnedValueSet = vsac.getValueSetJaxb(oid);
						codes.addAll(getCodes(returnedValueSet));
						displayNames.addAll(getCodeDisplayNames(returnedValueSet));
					} 
					if (code != null){
						codes.add(code);
					}
					ArrayList<String> allStrings = new ArrayList<String>();
					allStrings.addAll(codes);
					allStrings.addAll(displayNames);
					String regExp = "\\b(" + StringUtils.join(allStrings, '|') + ")\\b";
					attr_value.setMode_textTool(regExp, false, false, true);

				}
				sourceElement.addQdmAttributes("value", columnType, text);
				attr_value.setAnnotationText(text);
				frontier = attr_value; 
			}
			
			/*
			 * field_values
			 * */
			for (String fieldName : measure.getDataCriteriaFieldsList(dataCriteriaName)){
				String text = measure.getTextOfFieldValuesInDataCriteria(dataCriteriaName, fieldName);
				String columnType = "unknown";
				Attribute attr_value = new Attribute(nodes.size());
				nodes.add(attr_value);
				Connection conn = new Connection(conns.size());
				conns.add(conn);
				conn.setSource(frontier.getId(), 0);
				conn.setDest(attr_value.getId(), 1);  // Port for native nodes start from 1
				attr_value.setInputElementId(0, frontier.getOutputElementId(0));
				nodeLevels.put(attr_value, ++ frontierLevel);
				attr_value.setAttributeName(fieldName);
				if (measure.typeOfFieldValueInDataCriteria(dataCriteriaName, fieldName).equals("IVL_PQ")){
					columnType = "Double";
					Double[] high_low = measure.getFieldValues_IVL_PQInDataCriteriaHL(dataCriteriaName, fieldName);
					attr_value.setMode_Comparison(high_low[0], high_low[1]);
				} else if (measure.typeOfFieldValueInDataCriteria(dataCriteriaName, fieldName).equals("CD")){
					columnType = "String";
					ArrayList<String> codes = new ArrayList<String>();
					ArrayList<String> displayNames = new ArrayList<String>();
					HashMap<String, String> cd = measure.getFieldValuesCDInDataCriteria(dataCriteriaName, fieldName);
					String oid = cd.get("code_list_id");
					String code = cd.get("code");
					if (oid != null){
						JAXBElement<RetrieveValueSetResponseType> returnedValueSet = vsac.getValueSetJaxb(oid);
						codes.addAll(getCodes(returnedValueSet));
						displayNames.addAll(getCodeDisplayNames(returnedValueSet));
					} 
					if (code != null){
						codes.add(code);
					}
					ArrayList<String> allStrings = new ArrayList<String>();
					allStrings.addAll(codes);
					allStrings.addAll(displayNames);
					String regExp = "\\b(" + StringUtils.join(allStrings, '|') + ")\\b";
					attr_value.setMode_textTool(regExp, false, false, true);
				}
				sourceElement.addQdmAttributes(fieldName, columnType, text);
				attr_value.setAnnotationText(text);
				frontier = attr_value; 
				
				/*
				 * temporal_references
				 * */
				
			}
			dataCriteriaNodes.put(dataCriteriaName, frontier);
		}
		
		ArrayList<ArrayList<NodeInterface>> nodesTable = new ArrayList<ArrayList<NodeInterface>> ();
		for (NodeInterface node : nodes){
			/*
			 * Initiate columns
			 * */
			for (int i = nodesTable.size(); i <= nodeLevels.get(node).intValue(); i ++){
				nodesTable.add(new ArrayList<NodeInterface>());
			}
			
			nodesTable.get(nodeLevels.get(node).intValue()).add(node);
		}
		
		for (int i = 0; i < nodesTable.size(); i ++){
			ArrayList<NodeInterface> column = nodesTable.get(i);
			for (int j = 0; j < column.size(); j ++){
				NodeInterface node = column.get(j);
				node.setX(300 * (i + 1));
				node.setY(150 * (j + 1));
			}
		}
		
		kProject.addKnimeNodes(nodes);
		kProject.addKnimeConnections(conns);
		
		try {
			kProject.buildProject();
		} catch (ZipException | JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static ArrayList<String> getCodeDisplayNames(JAXBElement<RetrieveValueSetResponseType> vsacXmlJaxb){
		ArrayList<String> re = new ArrayList<String>();
		
		for(int i = 0; 
				i < vsacXmlJaxb.getValue().getValueSet().getConceptList().size(); 
				i++){
			ConceptListType concepts = 
					vsacXmlJaxb.getValue().getValueSet().getConceptList().get(i);
			for (int j = 0; j < concepts.getConcept().size(); j ++){
				re.add(concepts.getConcept().get(j).getDisplayName());
			}
		}
		return re;
	}
	
	private static ArrayList<String> getCodes(JAXBElement<RetrieveValueSetResponseType> vsacXmlJaxb){
		ArrayList<String> re = new ArrayList<String>();
		
		for(int i = 0; 
				i < vsacXmlJaxb.getValue().getValueSet().getConceptList().size(); 
				i++){
			ConceptListType concepts = 
					vsacXmlJaxb.getValue().getValueSet().getConceptList().get(i);
			for (int j = 0; j < concepts.getConcept().size(); j ++){
				re.add(concepts.getConcept().get(j).getCode());
			}
		}
		return re;
	}

	
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws JSONException 
	 */
	public static void main(String[] args) throws IOException, JSONException {
		// TODO Auto-generated method stub
		Path hqmfJsonFile = Paths.get("src/test/resources/cypress-bundle-latest/sources/eh/CMS30v4/hqmf_model.json");
		Path outputDir = Paths.get(System.getProperty("java.io.tmpdir")).resolve("qdmKnime/CMS30v4");
		if (args.length == 2) {
			hqmfJsonFile = Paths.get(args[0]);
			outputDir = Paths.get(args[1]);
		}
		if(outputDir.toFile().exists()){
			FileUtils.deleteDirectory(outputDir.toFile());
		}
		
		if (Paths.get(outputDir.toString() + ".zip").toFile().exists()) {
			Paths.get(outputDir.toString() + ".zip").toFile().delete();
		}
		HqmfJson2Knime translator = new HqmfJson2Knime(new VsacConnector("henryhmo", "2525WestEnd"));
		translator.translate(hqmfJsonFile, outputDir);
		System.out.println(outputDir.toString());
	}

}
