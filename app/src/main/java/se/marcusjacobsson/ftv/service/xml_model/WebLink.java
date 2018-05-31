package se.marcusjacobsson.ftv.service.xml_model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "WebLink")
public class WebLink {

    @Element(name = "URL", required = false)
    private String url;

    public String getUrl() {
        return url;
    }
}
