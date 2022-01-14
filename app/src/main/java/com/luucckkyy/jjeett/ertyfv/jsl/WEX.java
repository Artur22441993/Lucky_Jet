package com.luucckkyy.jjeett.ertyfv.jsl;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.luucckkyy.jjeett.ertyfv.R;
import com.luucckkyy.jjeett.ertyfv.SetText;

public class WEX extends Activity {

    WebView webPlis;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.poli);

        webPlis = findViewById(R.id.webPoli);

        CookieManager.getInstance().setAcceptThirdPartyCookies(webPlis, true);
        CookieManager.getInstance().setAcceptCookie(true);
        webPlis.getSettings().setAllowFileAccessFromFileURLs(true);
        webPlis.getSettings().setSavePassword(true);
        webPlis.getSettings().setDatabaseEnabled(true);
        webPlis.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        webPlis.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        webPlis.getSettings().setAppCacheEnabled(true);
        webPlis.getSettings().setLoadsImagesAutomatically(true);
        webPlis.setSaveEnabled(true);
        webPlis.getSettings().setMixedContentMode(0);
        webPlis.setFocusable(true);
        webPlis.getSettings().setAllowUniversalAccessFromFileURLs(true);
        webPlis.getSettings().setJavaScriptEnabled(true);
        webPlis.getSettings().setAllowContentAccess(true);
        webPlis.getSettings().setLoadWithOverviewMode(true);
        webPlis.getSettings().setEnableSmoothTransition(true);
        webPlis.getSettings().setUseWideViewPort(true);
        webPlis.getSettings().setSaveFormData(true);
        webPlis.getSettings().setAllowFileAccess(true);
        webPlis.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webPlis.getSettings().setDomStorageEnabled(true);
        webPlis.setFocusableInTouchMode(true);
        webPlis.setWebViewClient(new WebClientPoli());
        webPlis.setWebChromeClient(new WebChromePoli());
        webPlis.loadUrl(SetText.kkkk("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49UU1DQXo4YXRvdlA5TXdUNFFTMGNWY3N1VUJMdk9UR2I="));
    }
}
