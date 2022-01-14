package com.luucckkyy.jjeett.ertyfv;

import android.os.Build;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class SetText {

    public static void setText(TextView textView){

       new Thread(new Runnable() {

           @Override
           public void run() {
               for (int i = 0; i<30;i++){
                   int max = 800;
                   int min = 600;
               max -= min;
               int a = (int) (Math.random() * ++max) + min;

               textView.post(new Runnable() {
                   @Override
                   public void run() {
                       textView.setText(""+a);
                   }
               });
               try {
                   Thread.sleep(10);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }}
       }).start();

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String  kkkk(String s){
        Base64.Decoder dec = Base64.getDecoder();
        String ouire = new String(dec.decode(s));
        return ouire;
    }


}
