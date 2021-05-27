package com.example.aksharas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.aksharas.quiz.QuestionPage;

public class learning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);

        CardView button = (CardView) findViewById(R.id.basics);
        button.setOnClickListener(v -> openquiz());

        CardView button2 = (CardView) findViewById(R.id.back20);
        button2.setOnClickListener(v -> openhome());

    }

    public void openquiz(){
        Intent intent = new Intent(this, QuestionPage.class);
        startActivity(intent);
    }

    public void openhome(){
        Intent intent = new Intent(this, homepage.class);
        startActivity(intent);
    }


}