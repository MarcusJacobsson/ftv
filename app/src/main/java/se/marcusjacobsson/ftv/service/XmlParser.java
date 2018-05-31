package se.marcusjacobsson.ftv.service;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.transform.TransformerException;

import se.marcusjacobsson.ftv.service.xml_model.GetDepartureArrivalResult;

public class XmlParser {

    public static String GetXmlStringFromResult(Document result, String elementTagName){

        String xmlString = "";
        NodeList nodeList = result.getElementsByTagName(elementTagName);

        try {
            xmlString = NodeListConverter.nodeListToString(nodeList);
        } catch (TransformerException e) {
            e.printStackTrace();
        }

        return xmlString;
    }

    public static GetDepartureArrivalResult ParseXmlString(String xmlString){

        Serializer serializer = new Persister();
        GetDepartureArrivalResult getDepartureArrivalResult = null;

        try {
            getDepartureArrivalResult = serializer.read(GetDepartureArrivalResult.class, xmlString);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return getDepartureArrivalResult;
    }
}
