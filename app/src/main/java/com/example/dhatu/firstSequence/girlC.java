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

import com.example.dhatu.R;

public class girlC extends AppCompatActivity {

    ImageButton girlsound;
    Button back2,nxt;
    MediaPlayer girlsoundbruh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girlc);

        back2 = (Button) findViewById(R.id.back2g);
        back2.setOnClickListener(v -> openquestion());
        girlsoundbruh = MediaPlayer.create(girlC.this, R.raw.girl);
        final MediaPlayer girlsoundbruh = MediaPlayer.create(this, R.raw.girl);


        girlsound = (ImageButton) findViewById(R.id.girlsound);
        girlsound.setOnClickListener(v -> playBoy());

        nxt = (Button) findViewById(R.id.nxtg);
        nxt.setOnClickListener(v -> opennext());
    }


    private void openquestion(){
        Intent intent = new Intent(this, Question2.class);
        startActivity(intent);
    }

    public void playBoy(){
        girlsoundbruh.start();
    }

    private void opennext(){
        Intent intent = new Intent(this, Question3.class);
        startActivity(intent);
    }


}
