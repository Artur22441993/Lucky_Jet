package com.luucckkyy.jjeett.ertyfv;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.onesignal.OneSignal;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1, imageView2, imageView3, imageViewSpin;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        imageView1 = findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView3);
        imageView3 = findViewById(R.id.imageView4);
        imageViewSpin = findViewById(R.id.imageView5);
        textView = findViewById(R.id.textView);

        imageViewSpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetText.setText(textView);
                SetImg1.setImg(imageView1);
                SetImg2.setImg2(imageView2);
                SetImg3.setImg3(imageView3);


            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String parrr(String kfhj, String poiunc, String oufhd, String lfjkdf){

        String jsd;
        String ds;
        String po;
        String qwew;
        String vfc;
        String vcv;
        String loin;

        String[] kkdsh = kfhj.split("::");

        try {
            jsd = kkdsh[0];
        }catch (Exception e){
            jsd = "";
        }
        try {
            ds = kkdsh[1];
        }catch (Exception e){
            ds = "";
        }

        try {
            po = kkdsh[2];
        }catch (Exception e){
            po = "";

        }

        try {
            qwew = kkdsh[3];
        }catch (Exception e){
            qwew = "";
        }

        try {
            vfc = kkdsh[4];
        }catch (Exception e){
            vfc = "";
        }


        try {
            vcv = kkdsh[5];
        }catch (Exception e){
            vcv = "";
        }

        try {
            loin = kkdsh[6];
        }catch (Exception e){
            loin = "";
        }

        OneSignal.sendTag(SetText.kkkk("c3ViX2FwcA=="),ds);

        String khsdh = SetText.kkkk("P2J1bmRsZT0=") + poiunc + SetText.kkkk("JmFkX2lkPQ==") + oufhd + SetText.kkkk("JmFwcHNfaWQ9") + lfjkdf +
                SetText.kkkk("JnN1YjY9") + ds +
                SetText.kkkk("JnN1Yjc9") + po +
                SetText.kkkk("JnN1YjI9") + qwew +
                SetText.kkkk("JnN1YjM9") + vfc +
                SetText.kkkk("JnN1YjQ9") + vcv +
                SetText.kkkk("JnN1YjU9") + loin;

        String gfdh = jsd + khsdh;
        return gfdh ;

    }
}