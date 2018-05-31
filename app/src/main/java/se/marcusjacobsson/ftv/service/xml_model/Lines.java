package se.marcusjacobsson.ftv.service.xml_model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "Lines")
public class Lines {

    @ElementList(inline = true)
    private List<Line> lines;

    public List getLines() {
        return lines;
    }
}
