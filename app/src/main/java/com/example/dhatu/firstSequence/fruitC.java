package com.example.dhatu.firstSequence;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.dhatu.MainActivity;
import com.example.dhatu.R;

public class fruitC extends AppCompatActivity {

    ImageButton fruitsound;
    Button back2,nxt;
    MediaPlayer fruitsoundbruh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruitc);

        back2 = (Button) findViewById(R.id.back2f);
        back2.setOnClickListener(v -> openquestion());
        fruitsoundbruh = MediaPlayer.create(fruitC.this, R.raw.fruit);
        final MediaPlayer fruitsoundbruh = MediaPlayer.create(this, R.raw.fruit);


        fruitsound = (ImageButton) findViewById(R.id.fruitsound);
        fruitsound.setOnClickListener(v -> playBoy());

        nxt = (Button) findViewById(R.id.nxtf);
        nxt.setOnClickListener(v -> opennext());
    }


    private void openquestion(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void playBoy(){
        fruitsoundbruh.start();
    }

    private void opennext(){
        Intent intent = new Intent(this, Question3.class);
        startActivity(intent);
    }


}
