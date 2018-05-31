package se.marcusjacobsson.ftv.service.xml_model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "FootNote")
public class FootNote {

    @Element(name = "Index")
    private String index;
    @Element(name = "Text")
    private String text;

    public String getIndex() {
        return index;
    }

    public String getText() {
        return text;
    }
}
