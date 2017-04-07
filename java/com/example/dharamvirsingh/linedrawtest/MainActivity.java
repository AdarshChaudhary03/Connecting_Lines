package com.example.dharamvirsingh.linedrawtest;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton p1,p2,p3,p4,p5,p6,p7,p8,p9,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,turncolor;
    TextView tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,score1,score2;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9;
    public static boolean a,b,c,d,e,f,g,h,i,TURN;
    public static int a1,a2,a3,a4,a5,a6,a7,a8,a9;
    public static int player1=0;
    public static int player2=0;
    public static int test=0;
    Animation rotation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        p1= (ImageButton)findViewById(R.id.p1);
        p2= (ImageButton)findViewById(R.id.p2);
        p3= (ImageButton)findViewById(R.id.p3);
        p4= (ImageButton)findViewById(R.id.p4);
        p5= (ImageButton)findViewById(R.id.p5);
        p6= (ImageButton)findViewById(R.id.p6);
        p7= (ImageButton)findViewById(R.id.p7);
        p8= (ImageButton)findViewById(R.id.p8);
        p9= (ImageButton)findViewById(R.id.p9);

        l1 = (ImageButton)findViewById(R.id.l1);
        l2 = (ImageButton)findViewById(R.id.l2);
        l3 = (ImageButton)findViewById(R.id.l3);
        l4 = (ImageButton)findViewById(R.id.l4);
        l5 = (ImageButton)findViewById(R.id.l5);
        l6 = (ImageButton)findViewById(R.id.l6);
        l7 = (ImageButton)findViewById(R.id.l7);
        l8 = (ImageButton)findViewById(R.id.l8);
        l9 = (ImageButton)findViewById(R.id.l9);
        l10 = (ImageButton)findViewById(R.id.l10);
        l11 = (ImageButton)findViewById(R.id.l11);
        l12 = (ImageButton)findViewById(R.id.l12);
        l13 = (ImageButton)findViewById(R.id.l13);
        l14 = (ImageButton)findViewById(R.id.l14);
        l15 = (ImageButton)findViewById(R.id.l15);
        l16 = (ImageButton)findViewById(R.id.l16);
        l17 = (ImageButton)findViewById(R.id.l17);
        l18 = (ImageButton)findViewById(R.id.l18);
        l19 = (ImageButton)findViewById(R.id.l19);
        l20 = (ImageButton)findViewById(R.id.l20);
        l21 = (ImageButton)findViewById(R.id.l21);
        l22 = (ImageButton)findViewById(R.id.l22);
        l23 = (ImageButton)findViewById(R.id.l23);
        l24 = (ImageButton)findViewById(R.id.l24);
        turncolor = (ImageButton)findViewById(R.id.turncolor);

        //tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        tv5 = (TextView)findViewById(R.id.tv5);
        tv6 = (TextView)findViewById(R.id.tv6);
        tv7 = (TextView)findViewById(R.id.tv7);
        tv8 = (TextView)findViewById(R.id.tv8);
        tv9 = (TextView)findViewById(R.id.tv9);
        score1 = (TextView)findViewById(R.id.score1);
        score2 = (TextView)findViewById(R.id.score2);

        iv1 = (ImageView)findViewById(R.id.iv1);
        iv2 = (ImageView)findViewById(R.id.iv2);
        iv3 = (ImageView)findViewById(R.id.iv3);
        iv4 = (ImageView)findViewById(R.id.iv4);
        iv5 = (ImageView)findViewById(R.id.iv5);
        iv6 = (ImageView)findViewById(R.id.iv6);
        iv7 = (ImageView)findViewById(R.id.iv7);
        iv8 = (ImageView)findViewById(R.id.iv8);
        iv9 = (ImageView)findViewById(R.id.iv9);


        p1.setOnClickListener(this);
        p2.setOnClickListener(this);
        p3.setOnClickListener(this);
        p4.setOnClickListener(this);
        p5.setOnClickListener(this);
        p6.setOnClickListener(this);
        p7.setOnClickListener(this);
        p8.setOnClickListener(this);
        p9.setOnClickListener(this);

        l1.setOnClickListener(this);
        l2.setOnClickListener(this);
        l3.setOnClickListener(this);
        l4.setOnClickListener(this);
        l5.setOnClickListener(this);
        l6.setOnClickListener(this);
        l7.setOnClickListener(this);
        l8.setOnClickListener(this);
        l9.setOnClickListener(this);
        l10.setOnClickListener(this);
        l11.setOnClickListener(this);
        l12.setOnClickListener(this);
        l13.setOnClickListener(this);
        l14.setOnClickListener(this);
        l15.setOnClickListener(this);
        l16.setOnClickListener(this);
        l17.setOnClickListener(this);
        l18.setOnClickListener(this);
        l19.setOnClickListener(this);
        l20.setOnClickListener(this);
        l21.setOnClickListener(this);
        l22.setOnClickListener(this);
        l23.setOnClickListener(this);
        l24.setOnClickListener(this);

        a= true;
        b= true;
        c= true;
        d= true;
        e= true;
        f= true;
        g= true;
        h= true;
        i= true;

        a1=0;
        a2=0;
        a3=0;
        a4=0;
        a5=0;
        a6=0;
        a7=0;
        a8=0;
        a9=0;

        TURN=true;
        PlayerTurn();
        startrotate();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.first:
                Intent i = new Intent(MainActivity.this,About_Us.class);
                startActivity(i);
                break;
            case R.id.second:
                Intent i1 = new Intent(MainActivity.this,Start_Game.class);
                startActivity(i1);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void PlayerTurn()
    {
        if(test>0) {
            test = 0;
        }
        /*if(TURN)
        {
            Toast.makeText(MainActivity.this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
        }*/
    }

    @Override
    public void onClick(View v) {


        switch (v.getId())

        {

            case R.id.l1:

                if(TURN)
                {
                    l1.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l1.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l1.setEnabled(false);
                check();
                break;

            case R.id.l2:
                if(TURN)
                {
                    l2.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l2.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l2.setEnabled(false);

                check();

                break;

            case R.id.l3:

                if(TURN)
                {
                    l3.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l3.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l3.setEnabled(false);
                check();

                break;

            case R.id.l4:
                if(TURN)
                {
                    l4.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l4.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l4.setEnabled(false);
                check();
                break;

            case R.id.l5:
                if(TURN)
                {
                    l5.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l5.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l5.setEnabled(false);
                check();
                break;

            case R.id.l6:
                if(TURN)
                {
                    l6.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l6.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l6.setEnabled(false);
                check();
                break;

            case R.id.l7:
                if(TURN)
                {
                    l7.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l7.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l7.setEnabled(false);
                check();
                break;

            case R.id.l8:
                if(TURN)
                {
                    l8.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l8.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l8.setEnabled(false);
                check();
                break;

            case R.id.l9:
                if(TURN)
                {
                    l9.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l9.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l9.setEnabled(false);
                check();
                break;

            case R.id.l10:
                if(TURN)
                {
                    l10.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l10.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l10.setEnabled(false);
                check();
                break;

            case R.id.l11:
                if(TURN)
                {
                    l11.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l11.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l11.setEnabled(false);
                check();
                break;

            case R.id.l12:
                if(TURN)
                {
                    l12.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l12.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l12.setEnabled(false);
                check();
                break;

            case R.id.l13:

                if(TURN)
                {
                    l13.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l13.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l13.setEnabled(false);
                check();
                break;

            case R.id.l14:
                if(TURN)
                {
                    l14.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l14.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l14.setEnabled(false);

                check();

                break;

            case R.id.l15:

                if(TURN)
                {
                    l15.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l15.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l15.setEnabled(false);
                check();

                break;

            case R.id.l16:
                if(TURN)
                {
                    l16.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l16.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l16.setEnabled(false);
                check();
                break;

            case R.id.l17:
                if(TURN)
                {
                    l17.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l17.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l17.setEnabled(false);
                check();
                break;

            case R.id.l18:
                if(TURN)
                {
                    l18.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l18.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l18.setEnabled(false);
                check();
                break;

            case R.id.l19:
                if(TURN)
                {
                    l19.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l19.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l19.setEnabled(false);
                check();
                break;

            case R.id.l20:
                if(TURN)
                {
                    l20.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l20.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l20.setEnabled(false);
                check();
                break;

            case R.id.l21:
                if(TURN)
                {
                    l21.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l21.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l21.setEnabled(false);
                check();
                break;

            case R.id.l22:
                if(TURN)
                {
                    l22.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l22.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l22.setEnabled(false);
                check();
                break;

            case R.id.l23:
                if(TURN)
                {
                    l23.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l23.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l23.setEnabled(false);
                check();
                break;

            case R.id.l24:
                if(TURN)
                {
                    l24.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l24.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l24.setEnabled(false);
                check();
                break;

        }

        turncolorcheck();

        }

    private void turncolorcheck() {

        if(!TURN)
        {
            turncolor.setBackgroundResource(R.drawable.blue2);
        }
        else if(TURN)
        {
            turncolor.setBackgroundResource(R.drawable.green2);
        }

    }


    private void check() {

        if(!l1.isEnabled()
                && !l8.isEnabled()
                && !l3.isEnabled()
                && !l7.isEnabled()) {

            if (a) {
                a1=1;
                //boxcreate();
                //tv1.setVisibility(View.VISIBLE);
                iv1.setVisibility(View.VISIBLE);
                if (TURN) {
                    //tv1.setText("2");
                    iv1.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    //tv1.setText("1");
                    iv1.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                a=false;
            }
            else
            {

            }
        }

        if(!l2.isEnabled()
                && !l9.isEnabled()
                && !l4.isEnabled()
                && !l8.isEnabled()) {
            if (b) {

                a2=1;
                //boxcreate();
                //tv2.setVisibility(View.VISIBLE);
                iv2.setVisibility(View.VISIBLE);
                if (TURN) {
                    //tv2.setText("2");
                    iv2.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv2.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                b=false;
            }
            else
            {

            }
        }

        if(!l3.isEnabled()
                && !l11.isEnabled()
                && !l5.isEnabled()
                && !l10.isEnabled()) {

            if (c) {
                a3=1;
                //boxcreate();
                //tv3.setVisibility(View.VISIBLE);
                iv4.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv4.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv4.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                c=false;
            }
            else {

            }
        }

        if(!l4.isEnabled()
                && !l12.isEnabled()
                && !l6.isEnabled()
                && !l11.isEnabled())
        {

            if(d) {
                a4=1;
                //boxcreate();
                //tv4.setVisibility(View.VISIBLE);
                iv5.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv5.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv5.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                d=false;
            }
            else
            {

            }
        }

        if(!l9.isEnabled()
                && !l13.isEnabled()
                && !l14.isEnabled()
                && !l15.isEnabled()) {

            if (e) {
                a5=1;
                //boxcreate();
                //tv9.setVisibility(View.VISIBLE);
                iv3.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv3.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv3.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                e=false;
            }
            else
            {

            }
        }

        if(!l12.isEnabled()
                && !l15.isEnabled()
                && !l16.isEnabled()
                && !l17.isEnabled()) {

            if (f) {
                a6=1;
                //boxcreate();
                //tv8.setVisibility(View.VISIBLE);
                iv6.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv6.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv6.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                f=false;
            }
            else
            {

            }
        }

        if(!l17.isEnabled()
                && !l18.isEnabled()
                && !l19.isEnabled()
                && !l20.isEnabled()) {

            if (g) {
                a7=1;
                //boxcreate();
                //tv7.setVisibility(View.VISIBLE);
                iv9.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv9.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv9.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                g=false;
            }
            else
            {

            }
        }

        if(!l6.isEnabled()
                && !l20.isEnabled()
                && !l21.isEnabled()
                && !l22.isEnabled()) {

            if (h) {
                a8=1;
                //boxcreate();
                //tv6.setVisibility(View.VISIBLE);
                iv8.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv8.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv8.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                h=false;
            }
            else
            {

            }
        }

        if(!l5.isEnabled()
                && !l22.isEnabled()
                && !l23.isEnabled()
                && !l24.isEnabled()) {

            if (i) {
                a9=1;
                //boxcreate();
                //tv5.setVisibility(View.VISIBLE);
                iv7.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv7.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv7.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                i=false;
            }
            else
            {

            }
        }

        if(test==1 || test==2)
        {
            if(TURN)
            {
                TURN=false;
            }
            else if(!TURN)
            {
                TURN=true;
            }
        }

        score1.setText(""+player1);
        score2.setText(""+player2);


        /*if(TURN)
        {
            TURN=false;
        }
        else if(!TURN)
        {
            TURN=true;
        }*/


        PlayerTurn();

        if(iv1.getVisibility()==View.VISIBLE
                && iv2.getVisibility()==View.VISIBLE
                && iv3.getVisibility()==View.VISIBLE
                && iv4.getVisibility()==View.VISIBLE
                && iv5.getVisibility()==View.VISIBLE
                && iv6.getVisibility()==View.VISIBLE
                && iv7.getVisibility()==View.VISIBLE
                && iv8.getVisibility()==View.VISIBLE
                && iv9.getVisibility()==View.VISIBLE)
        {

            CountDownTimer countdowntimer = new CountDownTimer(2000,1000) {
                @Override
                public void onTick(long millisUntilFinished) {

                }

                @Override
                public void onFinish() {

                    if(player1>player2)
                    {
                        Toast.makeText(MainActivity.this, "Player 1 Wins..!!", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this,Winner_Page.class);
                        String playername = "Player 1";
                        String playerscore = score1.getText().toString();
                        i.putExtra("WinnerName",playername);
                        i.putExtra("WinnerScore",playerscore);
                        startActivity(i);
                    }
                    else if (player2>player1)
                    {
                        Toast.makeText(MainActivity.this, "Player 2 Wins..!!", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this,Winner_Page.class);
                        String playername = "Player 2";
                        String playerscore = score2.getText().toString();
                        i.putExtra("WinnerName",playername);
                        i.putExtra("WinnerScore",playerscore);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Draw..!!", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this,Winner_Page.class);
                        String playername = "DRAW..!!";
                        String playerscore = score1.getText().toString();
                        i.putExtra("WinnerName",playername);
                        i.putExtra("WinnerScore",playerscore);
                        startActivity(i);
                    }


                }
            }.start();


        }

    }

    

    private void startrotate() {

        rotation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
        rotation.setFillAfter(true);
        iv1.startAnimation(rotation);
        iv2.startAnimation(rotation);
        iv3.startAnimation(rotation);
        iv4.startAnimation(rotation);
        iv5.startAnimation(rotation);
        iv6.startAnimation(rotation);
        iv7.startAnimation(rotation);
        iv8.startAnimation(rotation);
        iv9.startAnimation(rotation);

    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(MainActivity.this,Start_Game.class);
        startActivity(i);
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        finish();
        super.onPause();
    }

}
