package se.marcusjacobsson.ftv.service.xml_model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "RealTimeInfo")
public class RealTimeInfo {

    @Element(name = "NewDepPoint", required = false)
    private String newDepPoint;
    @Element(name = "NewArrPoint", required = false)
    private String newArrPoint;
    @Element(name = "DepTimeDeviation", required = false)
    private String depTimeDeviation;
    @Element(name = "DepDeviationAffect", required = false)
    private String depDeviationAffect;
    @Element(name = "ArrTimeDeviation", required = false)
    private String arrTimeDeviation;
    @Element(name = "ArrDeviationAffect", required = false)
    private String arrDeviationAffect;
    @Element(name = "Canceled", required = false)
    private String canceled;

    public String getNewDepPoint() {
        return newDepPoint;
    }

    public String getNewArrPoint() {
        return newArrPoint;
    }

    public String getDepTimeDeviation() {
        return depTimeDeviation;
    }

    public String getDepDeviationAffect() {
        return depDeviationAffect;
    }

    public String getArrTimeDeviation() {
        return arrTimeDeviation;
    }

    public String getArrDeviationAffect() {
        return arrDeviationAffect;
    }

    public String getCanceled() {
        return canceled;
    }
}
