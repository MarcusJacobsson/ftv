package se.marcusjacobsson.ftv.service.xml_model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "StopAreaData")
public class StopAreaData {

    @Element(name = "Name")
    private String name;
    @Element(name = "X")
    private String x;
    @Element(name = "Y")
    private String y;

    public String getName() {
        return name;
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }
}
