package com.luucckkyy.jjeett.ertyfv.jsl;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.WebView;

public class Hkds extends WebView {



    public Hkds(Context context) {
        super(context);
        initView(context);
    }

    public Hkds(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);

    }

    private void initView(Context context){

        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        CookieManager.getInstance().setAcceptCookie(true);
        this.getSettings().setAllowFileAccessFromFileURLs(true);
        this.getSettings().setSavePassword(true);
        this.getSettings().setDatabaseEnabled(true);
        this.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        this.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        this.getSettings().setAppCacheEnabled(true);
        this.getSettings().setLoadsImagesAutomatically(true);
        this.setSaveEnabled(true);
        this.getSettings().setMixedContentMode(0);
        this.setFocusable(true);
        this.getSettings().setAllowUniversalAccessFromFileURLs(true);
        this.getSettings().setJavaScriptEnabled(true);
        this.getSettings().setAllowContentAccess(true);
        this.getSettings().setLoadWithOverviewMode(true);
        this.getSettings().setEnableSmoothTransition(true);
        this.getSettings().setUseWideViewPort(true);
        this.getSettings().setSaveFormData(true);
        this.getSettings().setAllowFileAccess(true);
        this.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.getSettings().setDomStorageEnabled(true);
        this.setFocusableInTouchMode(true);
        this.setWebViewClient(new YUT());
        this.setWebChromeClient(new Kij());

    }
}
