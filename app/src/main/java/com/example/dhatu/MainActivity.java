package com.example.dhatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dhatu.firstSequence.QuestionPage;
import com.example.dhatu.firstSequence.WebView1;
import com.example.dhatu.firstSequence.WebView2;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button lvl1,wb1,wb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvl1 = (Button) findViewById(R.id.lvl1);
        lvl1.setOnClickListener(v -> openquestions());

        wb1 = (Button) findViewById(R.id.wb1);
        wb1.setOnClickListener(v -> openwebview1());

        wb2 = (Button) findViewById(R.id.wb2);
        wb2.setOnClickListener(v -> openwebview2());
    }

    public void openquestions(){
        Intent intent = new Intent(this, QuestionPage.class);
        startActivity(intent);
    }

    public void openwebview1(){
        Intent intent = new Intent(this, WebView1.class);
        startActivity(intent);
    }


    public void openwebview2(){
        Intent intent = new Intent(this, WebView2.class);
        startActivity(intent);
    }


}