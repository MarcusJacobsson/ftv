package se.marcusjacobsson.ftv.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.xml.sax.SAXException;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import se.marcusjacobsson.ftv.service.SkanetrafikenService;
import se.marcusjacobsson.ftv.R;
import se.marcusjacobsson.ftv.service.xml_model.GetDepartureArrivalResult;

public class MainActivity extends AppCompatActivity implements SkanetrafikenService.ISkanetrafikenService {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SkanetrafikenService service = new SkanetrafikenService();
        service.setSkanetrafikenServiceInterface(this);

        try {
            service.getStationResult();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void SkanetrafikenServiceCallback(GetDepartureArrivalResult getDepartureArrivalResult) {
        System.out.println("Got result from SkanetrafikenService");
    }
}
