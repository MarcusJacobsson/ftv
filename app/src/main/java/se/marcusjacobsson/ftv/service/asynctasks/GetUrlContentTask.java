package se.marcusjacobsson.ftv.service.asynctasks;

import android.os.AsyncTask;

import org.w3c.dom.Document;

import java.net.URL;

public class GetUrlContentTask extends AsyncTask<URL, Integer, Document> {

    private IGetUrlContentTask getUrlContentTaskInterface;

    public interface IGetUrlContentTask{
        void getUrlContentTaskCallback(Document result);
    }

    public void setGetUrlContentTaskInterface(IGetUrlContentTask getUrlContentTaskInterface){
        this.getUrlContentTaskInterface = getUrlContentTaskInterface;
    }

    @Override
    protected Document doInBackground(URL... urls) {

        return GetUrlContentTaskHelper.getDocumentFromUrl(urls[0]);
    }

    protected void onProgressUpdate(Integer... progress) {

    }

    protected void onPostExecute(Document result) {

        getUrlContentTaskInterface.getUrlContentTaskCallback(result);
    }
}