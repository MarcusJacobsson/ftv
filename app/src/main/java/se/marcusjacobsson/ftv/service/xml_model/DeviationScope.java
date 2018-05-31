package se.marcusjacobsson.ftv.service.xml_model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "DeviationScope")
public class DeviationScope {

    @Element(name = "ScopeAttribute")
    private String scopeAttribute;
    @Element(name="FromDateTime")
    private String fromDateTime;
    @Element(name="ToDateTime")
    private String toDateTime;

    public String getScopeAttribute() {
        return scopeAttribute;
    }

    public String getFromDateTime() {
        return fromDateTime;
    }

    public String getToDateTime() {
        return toDateTime;
    }

}
