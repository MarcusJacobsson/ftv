package se.marcusjacobsson.ftv.service.xml_model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root
public class RealTime {

    @ElementList(inline = true, required = false)
    private List<RealTimeInfo> realTimeInfo;

    public List getRealTimeInfo() {
        return realTimeInfo;
    }
}
