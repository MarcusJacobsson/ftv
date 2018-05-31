package se.marcusjacobsson.ftv.service;

import org.w3c.dom.Document;

import java.io.IOException;
import java.net.URL;

import se.marcusjacobsson.ftv.service.asynctasks.GetUrlContentTask;
import se.marcusjacobsson.ftv.service.xml_model.GetDepartureArrivalResult;

public class SkanetrafikenService implements GetUrlContentTask.IGetUrlContentTask {

    private GetUrlContentTask getUrlContentTask;
    private ISkanetrafikenService skanetrafikenServiceInterface;

    public interface ISkanetrafikenService{
        void SkanetrafikenServiceCallback(GetDepartureArrivalResult getDepartureArrivalResult);
    }

    public SkanetrafikenService(){

        getUrlContentTask = new GetUrlContentTask();
        getUrlContentTask.setGetUrlContentTaskInterface(this);
    }

    public void getStationResult() throws IOException {

        String selPointFrKey = "81216"; //Stop Area id
        String inpDate = "2018-05-30";  //date for departure  yyyy-mm-dd
        String inpTime = "18:00";       //time for departure  hh:mm

        URL url = new URL("http://www.labs.skanetrafiken.se/v2.2/stationresults.asp?selPointFrKey=" + selPointFrKey + "&inpDate=" + inpDate + "&inpTime=" + inpTime);
        getUrlContentTask.execute(url);
    }

    @Override
    public void getUrlContentTaskCallback(Document result) {

        String xmlString = XmlParser.GetXmlStringFromResult(result, "GetDepartureArrivalResult");
        GetDepartureArrivalResult getDepartureArrivalResult = XmlParser.ParseXmlString(xmlString);
        skanetrafikenServiceInterface.SkanetrafikenServiceCallback(getDepartureArrivalResult);
    }

    public void setSkanetrafikenServiceInterface(ISkanetrafikenService skanetrafikenServiceInterface){
        this.skanetrafikenServiceInterface = skanetrafikenServiceInterface;
    }
}
