package org.dimigo.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created by HIPERCUBE on 5/14/15.
 */
public class HttpRequestBot {

    public int i = 0;

    public static void main(String[] args) throws Exception {

        HttpRequestBot http = new HttpRequestBot();
        while (true) {
            Thread.sleep(50);
            http.request();
        }
    }

    public void request() {
        String url = "https://m.search.naver.com/search.naver?sm=mtb_hty.top&where=m&query=한국디지털미디어고등학교+선생님사랑해요";
        URL obj = null;
        try {
            obj = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection con = null;
        try {
            con = (HttpURLConnection) obj.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // optional default is GET
        try {
            con.setRequestMethod("GET");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }

        //add request header
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        con.setRequestProperty("Accept-Charset", "ISO-8859-1");
        int responseCode = 0;
        try {
            responseCode = con.getResponseCode();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("[ " + i + " ]     " + responseCode);
        i++;
    }
}
