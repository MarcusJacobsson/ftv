package se.marcusjacobsson.ftv.service.xml_model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "Deviations")
public class Deviations {

    @ElementList(inline = true, required = false)
    private List<Deviation> deviations;

    public List getDeviations() {
        return deviations;
    }
}
