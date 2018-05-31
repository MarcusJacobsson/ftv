package se.marcusjacobsson.ftv.service.xml_model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "FootNotes")
public class FootNotes {

    @ElementList(inline = true)
    private List<FootNote> footNotes;

    public List getFootNotes() {
        return footNotes;
    }
}
