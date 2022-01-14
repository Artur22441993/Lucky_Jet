package com.luucckkyy.jjeett.ertyfv.jsl;

import android.app.Application;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.luucckkyy.jjeett.ertyfv.MainActivity;
import com.luucckkyy.jjeett.ertyfv.SetText;

import java.util.Map;

public class Apapap extends Application {

    public static String kgch;
    public static String khfsb = "";
    public static String kiyh;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();

        LJ.onne(this);
        LJ.aaaiid(Apapap.this);
        kgch = AppsFlyerLib.getInstance().getAppsFlyerUID(this);

        AppsFlyerLib.getInstance().init(SetText.kkkk("ekw3TTZqTFVNelh2WEpqZExYU3hlUQ=="), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                hdk(map);
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },this);
        AppsFlyerLib.getInstance().start(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void hdk(Map<String, Object> map){
        khfsb = map.get(SetText.kkkk("YWZfc3RhdHVz")).toString();
        if (khfsb.equals(SetText.kkkk("Tm9uLW9yZ2FuaWM="))){
            String str =map.get(SetText.kkkk("Y2FtcGFpZ24=")).toString();
            kiyh = MainActivity.parrr(str,getPackageName(),LJ.ldjwesd, kgch);
        }
    }
}
