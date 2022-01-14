package com.luucckkyy.jjeett.ertyfv.jsl;

import android.content.Intent;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

import com.luucckkyy.jjeett.ertyfv.MainActivity;
import com.luucckkyy.jjeett.ertyfv.SetText;

public class YUT extends WebViewClient {

    public static LJ lj;



    @Override
    public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
        if (errorResponse.getStatusCode() == 404){
            lj.startActivity(new Intent(lj.getApplicationContext(), MainActivity.class));
            lj.finishAffinity();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageFinished(WebView view, String url) {
        lj.getSharedPreferences(lj.getPackageName(), lj.MODE_PRIVATE).edit().putString(SetText.kkkk("c2F2ZWRVcmw="),url).apply();
    }
}
