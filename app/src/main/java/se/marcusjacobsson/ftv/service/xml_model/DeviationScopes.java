package se.marcusjacobsson.ftv.service.xml_model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "DeviationScopes")
public class DeviationScopes {

    @ElementList(inline = true, required = false)
    private List<DeviationScope> deviationScopes;

    public List<DeviationScope> getDeviationScopes() {
        return deviationScopes;
    }
}
