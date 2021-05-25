package com.example.dhatu.firstSequence;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dhatu.R;

public class WebView1 extends AppCompatActivity {
    private WebView webview1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview1);

        webview1=(WebView)findViewById(R.id.webview1);
        WebSettings webSettings = webview1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview1.loadUrl("https://www.sanskrit-lexicon.uni-koeln.de/scans/AEScan/2020/web/webtc/indexcaller.php");
    }
}
