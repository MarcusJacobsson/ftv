package se.marcusjacobsson.ftv.service;

import org.w3c.dom.NodeList;

import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class NodeListConverter {

    public static String nodeListToString(NodeList nodes) throws TransformerException {

        DOMSource source = new DOMSource();
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

        for (int i = 0; i < nodes.getLength(); ++i) {
            source.setNode(nodes.item(i));
            transformer.transform(source, result);
        }

        return writer.toString();
    }
}
