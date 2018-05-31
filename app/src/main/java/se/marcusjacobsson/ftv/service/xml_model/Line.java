package se.marcusjacobsson.ftv.service.xml_model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Line")
public class Line {

    @Element(name = "Name")
    private String name;
    @Element(name="No")
    private String no;
    @Element(name="JourneyDateTime")
    private String journeyDateTime;
    @Element(name="IsTimingPoint")
    private String isTimingPoint;
    @Element(name = "StopPoint", required = false)
    private String stopPoint;
    @Element(name="LineTypeId")
    private String lineTypeId;
    @Element(name="LineTypeName")
    private String lineTypeName;
    @Element(name = "Towards")
    private String towards;
    @Element(name = "FootNotes", required = false)
    private FootNotes footNotes;
    @Element(name = "RealTime")
    private RealTime realTime;
    @Element(name = "TrainNo")
    private String trainNo;
    @Element(name = "Deviations")
    private Deviations deviations;
    @Element(name = "RunNo")
    private String runNo;

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public String getJourneyDateTime() {
        return journeyDateTime;
    }

    public String getIsTimingPoint() {
        return isTimingPoint;
    }

    public String getStopPoint() {
        return stopPoint;
    }

    public String getLineTypeId() {
        return lineTypeId;
    }

    public String getLineTypeName() {
        return lineTypeName;
    }

    public String getTowards() {
        return towards;
    }

    public FootNotes getFootNotes() {
        return footNotes;
    }

    public RealTime getRealTime() {
        return realTime;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public Deviations getDeviations() {
        return deviations;
    }

    public String getRunNo() {
        return runNo;
    }
}
