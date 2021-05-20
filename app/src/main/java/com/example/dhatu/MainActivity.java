package com.example.dhatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView questionda, answer, score;
    Button option1,option2,option3,option4;

    private  Questions questions = new Questions();
    private String answers;
    private int questionsLenght = questions.questions.length;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        option1 = (Button) findViewById(R.id.op1);
        option2 = (Button) findViewById(R.id.op2);
        option3 = (Button) findViewById(R.id.op3);
        option4 = (Button) findViewById(R.id.op4);
        questionda = (TextView) findViewById(R.id.questionsbro);
        score = (TextView) findViewById(R.id.score);

        updateQuestions(r.nextInt(questionsLenght));



        if(option1.getText()== answers){
            option1.setOnClickListener(v -> gotocorrectAct());
            }else{
            option1.setOnClickListener(v ->  gotowrongAct());
        }
        if(option2.getText()== answers){
            option2.setOnClickListener(v ->  gotocorrectAct());
        }else{
            option2.setOnClickListener(v ->  gotowrongAct());
        }
        if(option3.getText()== answers){
            option3.setOnClickListener(v ->  gotocorrectAct());
        }else{
            option3.setOnClickListener(v ->  gotowrongAct());
        }
        if(option4.getText()== answers){
            option4.setOnClickListener(v ->  gotocorrectAct());
        }else{
            option4.setOnClickListener(v ->  gotowrongAct());
        }


    }

    private void updateQuestions(int num){
        questionda.setText(questions.getquestions(num));
        option1.setText(questions.getoption1(num));
        option2.setText(questions.getoption2(num));
        option3.setText(questions.getoption3(num));
        option4.setText(questions.getoption4(num));

        answers = questions.getanswer(num);
    }

    public void gotocorrectAct() {
        Intent intent = new Intent(this, correctAct.class);
        startActivity(intent);
    }

    public void gotowrongAct() {
        Intent intent = new Intent(this, wrongAct.class);
        startActivity(intent);
    }




}