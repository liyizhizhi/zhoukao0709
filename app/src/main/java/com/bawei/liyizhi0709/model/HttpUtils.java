package com.bawei.liyizhi0709.model;

import android.os.Handler;
import android.os.Message;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils {


    public HttpUtils() {
    }

    private static HttpUtils utils = new HttpUtils();

    public static HttpUtils getUtils() {
        return utils;
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

        }
    };

    public void getData(String str) {

        try {
            URL url = new URL(str);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.connect();
            int code = connection.getResponseCode();
if (code==200){
    InputStream stream = connection.getInputStream();
    BufferedReader reader=new BufferedReader(new InputStreamReader(stream));
    StringBuffer buffer = new StringBuffer();
    String strs="";
    while ((strs=reader.readLine())!=null){
        buffer.append(strs);
    }
    String string = buffer.toString();
    Message message = handler.obtainMessage();


}

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
