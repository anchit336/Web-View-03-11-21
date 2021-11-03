package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = "https://www.youtube.com/c/GeekyHub";
        webView = findViewById(R.id.webview);

        webView.loadUrl(url);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
    }

    @Override
    public void onBackPressed(){
        if (webView.canGoBack()){
            webView.canGoBack();
        } else {
            super.onBackPressed();
        }
    }
}