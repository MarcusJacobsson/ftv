package se.marcusjacobsson.ftv.service.xml_model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "GetDepartureArrivalResult")
public class GetDepartureArrivalResult {

    @Element(name = "Code")
    private String code;
    @Element(name = "Message", required = false)
    private String message;
    @Element(name = "Lines")
    private Lines lines;
    @Element(name = "StopAreaData")
    private StopAreaData stopAreaData;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Lines getLines() {
        return lines;
    }

    public StopAreaData getStopAreaData() {
        return stopAreaData;
    }
}
