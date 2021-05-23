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

public class boyC extends AppCompatActivity {

    ImageButton boysound;
    Button back2;
    MediaPlayer boysoundbruh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boyc);

       back2 = (Button) findViewById(R.id.back2);
       back2.setOnClickListener(v -> openquestion());
       boysoundbruh = MediaPlayer.create(boyC.this, R.raw.boy);
        final MediaPlayer boysoundbruh = MediaPlayer.create(this, R.raw.boy);


       boysound = (ImageButton) findViewById(R.id.boysound);
       boysound.setOnClickListener(v -> playBoy());
    }

    private void openquestion(){
        Intent intent = new Intent(this, QuestionPage.class);
        startActivity(intent);
    }

    public void playBoy(){
        boysoundbruh.start();
    }


}
