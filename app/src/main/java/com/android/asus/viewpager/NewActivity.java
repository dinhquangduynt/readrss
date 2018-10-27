package com.android.asus.viewpager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        webview = findViewById(R.id.webviewTinTuc);

        Intent intent = getIntent();

        String link = intent.getStringExtra("linkTinTuc");

        webview.loadUrl(link);

        webview.setWebViewClient(new WebViewClient());
    }
}
