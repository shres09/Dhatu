package com.example.dhatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dhatu.firstSequence.QuestionPage;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button lvl1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvl1 = (Button) findViewById(R.id.lvl1);
        lvl1.setOnClickListener(v -> openquestions());
    }

    public void openquestions(){
        Intent intent = new Intent(this, QuestionPage.class);
        startActivity(intent);
    }

}