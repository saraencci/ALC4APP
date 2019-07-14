package com.saraencci.alc4app;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;


import java.net.InetAddress;

public class myWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(" About ALC");
        setContentView(R.layout.activity_myweb);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String url ="https://andela.com/alc/";
        WebView webView;
        webView = (WebView)findViewById(R.id.webView);

//checkiing for network connection

        if (InternetConnection.checkConnection(this)) {
            //network not available
           // Toast.makeText(this, "network availabe", Toast.LENGTH_SHORT).show();
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setAppCacheEnabled(true);
            webView.getSettings().setDatabaseEnabled(true);
            webView.getSettings().setDomStorageEnabled(true);
            webView.getSettings().setSupportZoom(true);
            webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            webView.getSettings().setBuiltInZoomControls(true);


            webView.getSettings().setGeolocationEnabled(true);
            webView.setWebViewClient(new WebViewClient(){

                @Override
                public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                    handler.proceed();

                }
            });
            webView.loadUrl(url);

        } else {
            // Network not Available...
            Toast.makeText(this, "NO INTERNET CONNECTION", Toast.LENGTH_LONG).show();
        }


    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }


}




