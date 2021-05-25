package com.example.dhatu.firstSequence;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dhatu.R;

public class WebView2 extends AppCompatActivity {

    private WebView webview2;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_webview2);

            webview2=(WebView)findViewById(R.id.webview2);
            WebSettings webSettings = webview2.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webview2.loadUrl("https://sanskritdictionary.org/");
        }
    }
