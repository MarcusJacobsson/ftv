package se.marcusjacobsson.ftv.service.xml_model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Deviation")
public class Deviation {

    @Element(name = "DeviationScopes" ,required = false)
    private DeviationScopes deviationScopes;
    @Element(name = "PublicNote")
    private String publicNote;
    @Element(name = "Header")
    private String header;
    @Element(name = "Details")
    private String details;
    @Element(name = "Summary", required = false)
    private String summary;
    @Element(name = "ShortText")
    private String shortText;
    @Element(name = "Importance")
    private String importance;
    @Element(name = "Influence")
    private String influence;
    @Element(name = "Urgency")
    private String urgency;
    @Element(name = "WebLinks", required = false)
    private WebLink webLink;

    public DeviationScopes getDeviationScopes() {
        return deviationScopes;
    }

    public String getPublicNote() {
        return publicNote;
    }

    public String getHeader() {
        return header;
    }

    public String getDetails() {
        return details;
    }

    public String getSummary() {
        return summary;
    }

    public String getShortText() {
        return shortText;
    }

    public String getImportance() {
        return importance;
    }

    public String getInfluence() {
        return influence;
    }

    public String getUrgency() {
        return urgency;
    }

    public WebLink getWebLink() {
        return webLink;
    }
}
