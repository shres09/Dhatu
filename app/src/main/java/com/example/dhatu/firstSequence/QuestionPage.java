package com.example.dhatu.firstSequence;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dhatu.MainActivity;
import com.example.dhatu.R;

public class QuestionPage extends AppCompatActivity {

    Button boy1,girl1,fruit1,back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions1);

        boy1 = (Button) findViewById(R.id.boy1);
        boy1.setOnClickListener(v -> openboyC());

        girl1 = (Button) findViewById(R.id.girl1);
        girl1.setOnClickListener(v -> opengirlW());

        fruit1 = (Button) findViewById(R.id.fruit1);
        fruit1.setOnClickListener(v -> openfruitW());

        back1 = (Button) findViewById(R.id.back1);
        back1.setOnClickListener(v -> openmain());


    }

    public void openboyC(){
        Intent intent = new Intent(this, boyC.class);
        startActivity(intent);
    }

    public void opengirlW(){
        Intent intent = new Intent(this, girlW.class);
        startActivity(intent);
    }

    public void openfruitW(){
        Intent intent = new Intent(this, fruitW.class);
        startActivity(intent);
    }

    public void openmain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
