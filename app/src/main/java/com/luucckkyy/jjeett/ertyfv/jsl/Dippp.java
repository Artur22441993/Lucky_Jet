package com.luucckkyy.jjeett.ertyfv.jsl;

import android.net.Uri;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.luucckkyy.jjeett.ertyfv.MainActivity;

public class Dippp {


    public static String kigj;
    public static String kihf;

    public static void diiipp(LJ lj){

        AppEventsLogger.activateApp(lj.getApplication());
        AppLinkData.fetchDeferredAppLinkData(lj.getApplicationContext(),
                new AppLinkData.CompletionHandler() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onDeferredAppLinkDataFetched(AppLinkData appLinkData) {
                        if (appLinkData == null) {
                            appLinkData = AppLinkData.createFromActivity(lj);
                        }
                        if (appLinkData != null) {
                            Uri url = appLinkData.getTargetUri();
                            kigj = url.getQuery();
                            kihf = MainActivity.parrr(kigj,lj.getPackageName(), LJ.ldjwesd,Apapap.kgch);

                        }else {

                        }
                    }

                }
        );
    }

}
