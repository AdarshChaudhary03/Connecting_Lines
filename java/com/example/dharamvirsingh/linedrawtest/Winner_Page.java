package com.example.dharamvirsingh.linedrawtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Winner_Page extends AppCompatActivity {

    TextView winname,winscore;
    ImageButton playagain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner__page);

        winname  = (TextView)findViewById(R.id.winname);
        winscore = (TextView)findViewById(R.id.winscore);
        playagain = (ImageButton)findViewById(R.id.playagain);

        Bundle t1 = getIntent().getExtras();
        if(t1==null)
        {
            return;
        }
        String Winner = t1.getString("WinnerName");
        String Score = t1.getString("WinnerScore");

        winname.setText(Winner);
        winscore.setText("Score :\t"+Score);

        playagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Winner_Page.this,Start_Game.class);
                startActivity(i);

            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Winner_Page.this,Start_Game.class);
        startActivity(i);
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        finish();
        super.onPause();
    }

}
