package com.example.dharamvirsingh.linedrawtest;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Player4 extends AppCompatActivity implements View.OnClickListener{

    ImageButton p1,p2,p3,p4,p5,p6,p7,p8,p9,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,turncolor;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,score1,score2,score3,score4;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9;
    public static boolean a,b,c,d,e,f,g,h,i;
    public static int TURN1;
    public static int player1=0;
    public static int player2=0;
    public static int player3=0;
    public static int player4=0;
    public static int test=0;
    Animation rotation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player4);

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

        tv1 = (TextView)findViewById(R.id.tv1);
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
        score3 = (TextView)findViewById(R.id.score3);
        score4 = (TextView)findViewById(R.id.score4);

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

        TURN1=1;
        PlayerTurn();
        startrotate();
    }

    private void startrotate() {

        rotation = AnimationUtils.loadAnimation(Player4.this,R.anim.rotate);
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

    public void PlayerTurn()
    {
        if(test>0) {
            test = 0;
        }
        /*if(TURN1==1)
        {
            Toast.makeText(Player4.this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
        }
        else if(TURN1==2)
        {
            Toast.makeText(Player4.this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
        }
        else if(TURN1==3)
        {
            Toast.makeText(Player4.this, "Player 3 Turn", Toast.LENGTH_SHORT).show();
        }
        else if(TURN1==4)
        {
            Toast.makeText(Player4.this, "Player 4 Turn", Toast.LENGTH_SHORT).show();
        }*/
    }

    @Override
    public void onClick(View v) {


        switch (v.getId())

        {

            case R.id.l1:

                if(TURN1==1)
                {
                    l1.setBackgroundResource(R.drawable.green2);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l1.setBackgroundResource(R.drawable.blue2);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l1.setBackgroundResource(R.drawable.orange2);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l1.setBackgroundResource(R.drawable.yellow2);
                    TURN1=1;
                }
                l1.setEnabled(false);
                check();
                break;

            case R.id.l2:
                if(TURN1==1)
                {
                    l2.setBackgroundResource(R.drawable.green2);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l2.setBackgroundResource(R.drawable.blue2);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l2.setBackgroundResource(R.drawable.orange2);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l2.setBackgroundResource(R.drawable.yellow2);
                    TURN1=1;
                }
                l2.setEnabled(false);

                check();

                break;

            case R.id.l3:

                if(TURN1==1)
                {
                    l3.setBackgroundResource(R.drawable.green2);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l3.setBackgroundResource(R.drawable.blue2);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l3.setBackgroundResource(R.drawable.orange2);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l3.setBackgroundResource(R.drawable.yellow2);
                    TURN1=1;
                }
                l3.setEnabled(false);
                check();

                break;

            case R.id.l4:
                if(TURN1==1)
                {
                    l4.setBackgroundResource(R.drawable.green2);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l4.setBackgroundResource(R.drawable.blue2);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l4.setBackgroundResource(R.drawable.orange2);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l4.setBackgroundResource(R.drawable.yellow2);
                    TURN1=1;
                }
                l4.setEnabled(false);
                check();
                break;

            case R.id.l5:
                if(TURN1==1)
                {
                    l5.setBackgroundResource(R.drawable.green2);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l5.setBackgroundResource(R.drawable.blue2);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l5.setBackgroundResource(R.drawable.orange2);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l5.setBackgroundResource(R.drawable.yellow2);
                    TURN1=1;
                }
                l5.setEnabled(false);
                check();
                break;

            case R.id.l6:
                if(TURN1==1)
                {
                    l6.setBackgroundResource(R.drawable.green2);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l6.setBackgroundResource(R.drawable.blue2);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l6.setBackgroundResource(R.drawable.orange2);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l6.setBackgroundResource(R.drawable.yellow2);
                    TURN1=1;
                }
                l6.setEnabled(false);
                check();
                break;

            case R.id.l7:
                if(TURN1==1)
                {
                    l7.setBackgroundResource(R.drawable.green);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l7.setBackgroundResource(R.drawable.blue);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l7.setBackgroundResource(R.drawable.orange);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l7.setBackgroundResource(R.drawable.yellow);
                    TURN1=1;
                }
                l7.setEnabled(false);
                check();
                break;

            case R.id.l8:
                if(TURN1==1)
                {
                    l8.setBackgroundResource(R.drawable.green);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l8.setBackgroundResource(R.drawable.blue);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l8.setBackgroundResource(R.drawable.orange);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l8.setBackgroundResource(R.drawable.yellow);
                    TURN1=1;
                }
                l8.setEnabled(false);
                check();
                break;

            case R.id.l9:
                if(TURN1==1)
                {
                    l9.setBackgroundResource(R.drawable.green);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l9.setBackgroundResource(R.drawable.blue);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l9.setBackgroundResource(R.drawable.orange);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l9.setBackgroundResource(R.drawable.yellow);
                    TURN1=1;
                }
                l9.setEnabled(false);
                check();
                break;

            case R.id.l10:
                if(TURN1==1)
                {
                    l10.setBackgroundResource(R.drawable.green);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l10.setBackgroundResource(R.drawable.blue);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l10.setBackgroundResource(R.drawable.orange);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l10.setBackgroundResource(R.drawable.yellow);
                    TURN1=1;
                }
                l10.setEnabled(false);
                check();
                break;

            case R.id.l11:
                if(TURN1==1)
                {
                    l11.setBackgroundResource(R.drawable.green);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l11.setBackgroundResource(R.drawable.blue);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l11.setBackgroundResource(R.drawable.orange);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l11.setBackgroundResource(R.drawable.yellow);
                    TURN1=1;
                }
                l11.setEnabled(false);
                check();
                break;

            case R.id.l12:
                if(TURN1==1)
                {
                    l12.setBackgroundResource(R.drawable.green);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l12.setBackgroundResource(R.drawable.blue);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l12.setBackgroundResource(R.drawable.orange);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l12.setBackgroundResource(R.drawable.yellow);
                    TURN1=1;
                }
                l12.setEnabled(false);
                check();
                break;

            case R.id.l13:

                if(TURN1==1)
                {
                    l13.setBackgroundResource(R.drawable.green2);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l13.setBackgroundResource(R.drawable.blue2);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l13.setBackgroundResource(R.drawable.orange2);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l13.setBackgroundResource(R.drawable.yellow2);
                    TURN1=1;
                }
                l13.setEnabled(false);
                check();
                break;

            case R.id.l14:
                if(TURN1==1)
                {
                    l14.setBackgroundResource(R.drawable.green);
                }
                else if(TURN1==2)
                {
                    l14.setBackgroundResource(R.drawable.blue);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l14.setBackgroundResource(R.drawable.orange);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l14.setBackgroundResource(R.drawable.yellow);
                    TURN1=1;
                }
                l14.setEnabled(false);

                check();

                break;

            case R.id.l15:

                if(TURN1==1)
                {
                    l15.setBackgroundResource(R.drawable.green2);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l15.setBackgroundResource(R.drawable.blue2);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l15.setBackgroundResource(R.drawable.orange2);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l15.setBackgroundResource(R.drawable.yellow2);
                    TURN1=1;
                }
                l15.setEnabled(false);
                check();

                break;

            case R.id.l16:
                if(TURN1==1)
                {
                    l16.setBackgroundResource(R.drawable.green);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l16.setBackgroundResource(R.drawable.blue);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l16.setBackgroundResource(R.drawable.orange);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l16.setBackgroundResource(R.drawable.yellow);
                    TURN1=1;
                }
                l16.setEnabled(false);
                check();
                break;

            case R.id.l17:
                if(TURN1==1)
                {
                    l17.setBackgroundResource(R.drawable.green2);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l17.setBackgroundResource(R.drawable.blue2);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l17.setBackgroundResource(R.drawable.orange2);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l17.setBackgroundResource(R.drawable.yellow2);
                    TURN1=1;
                }
                l17.setEnabled(false);
                check();
                break;

            case R.id.l18:
                if(TURN1==1)
                {
                    l18.setBackgroundResource(R.drawable.green);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l18.setBackgroundResource(R.drawable.blue);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l18.setBackgroundResource(R.drawable.orange);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l18.setBackgroundResource(R.drawable.yellow);
                    TURN1=1;
                }
                l18.setEnabled(false);
                check();
                break;

            case R.id.l19:
                if(TURN1==1)
                {
                    l19.setBackgroundResource(R.drawable.green2);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l19.setBackgroundResource(R.drawable.blue2);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l19.setBackgroundResource(R.drawable.orange2);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l19.setBackgroundResource(R.drawable.yellow2);
                    TURN1=1;
                }
                l19.setEnabled(false);
                check();
                break;

            case R.id.l20:
                if(TURN1==1)
                {
                    l20.setBackgroundResource(R.drawable.green);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l20.setBackgroundResource(R.drawable.blue);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l20.setBackgroundResource(R.drawable.orange);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l20.setBackgroundResource(R.drawable.yellow);
                    TURN1=1;
                }
                l20.setEnabled(false);
                check();
                break;

            case R.id.l21:
                if(TURN1==1)
                {
                    l21.setBackgroundResource(R.drawable.green2);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l21.setBackgroundResource(R.drawable.blue2);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l21.setBackgroundResource(R.drawable.orange2);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l21.setBackgroundResource(R.drawable.yellow2);
                    TURN1=1;
                }
                l21.setEnabled(false);
                check();
                break;

            case R.id.l22:
                if(TURN1==1)
                {
                    l22.setBackgroundResource(R.drawable.green);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l22.setBackgroundResource(R.drawable.blue);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l22.setBackgroundResource(R.drawable.orange);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l22.setBackgroundResource(R.drawable.yellow);
                    TURN1=1;
                }
                l22.setEnabled(false);
                check();
                break;

            case R.id.l23:
                if(TURN1==1)
                {
                    l23.setBackgroundResource(R.drawable.green2);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l23.setBackgroundResource(R.drawable.blue2);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l23.setBackgroundResource(R.drawable.orange2);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l23.setBackgroundResource(R.drawable.yellow2);
                    TURN1=1;
                }
                l23.setEnabled(false);
                check();
                break;

            case R.id.l24:
                if(TURN1==1)
                {
                    l24.setBackgroundResource(R.drawable.green);
                    TURN1=2;
                }
                else if(TURN1==2)
                {
                    l24.setBackgroundResource(R.drawable.blue);
                    TURN1=3;
                }
                else if(TURN1==3)
                {
                    l24.setBackgroundResource(R.drawable.orange);
                    TURN1=4;
                }
                else if(TURN1==4)
                {
                    l24.setBackgroundResource(R.drawable.yellow);
                    TURN1=1;
                }
                l24.setEnabled(false);
                check();
                break;

        }

        turncolorcheck();

    }

    private void turncolorcheck() {

        if(TURN1==1)
        {
            turncolor.setBackgroundResource(R.drawable.green2);
        }
        else if(TURN1==2)
        {
            turncolor.setBackgroundResource(R.drawable.blue2);

        }
        else if(TURN1==3)
        {
            turncolor.setBackgroundResource(R.drawable.orange2);

        }
        else if(TURN1==4)
        {
            turncolor.setBackgroundResource(R.drawable.yellow2);

        }

    }


    private void check() {

        if (!l1.isEnabled()
                && !l8.isEnabled()
                && !l3.isEnabled()
                && !l7.isEnabled()) {

            if (a) {
                iv1.setVisibility(View.VISIBLE);
                if (TURN1 == 1) {
                    iv1.setBackgroundResource(R.drawable.yellowcircle);
                    player4++;
                    //TURN1=4;
                } else if (TURN1 == 2) {
                    iv1.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN1=1;
                } else if (TURN1 == 3) {
                    iv1.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN1=2;
                } else if (TURN1 == 4) {
                    iv1.setBackgroundResource(R.drawable.orangecircle);
                    player3++;
                    //TURN1=3;
                }
                test++;
                a = false;
            } else {

            }
        }

        if (!l2.isEnabled()
                && !l9.isEnabled()
                && !l4.isEnabled()
                && !l8.isEnabled()) {
            if (b) {

                iv2.setVisibility(View.VISIBLE);
                if (TURN1 == 1) {
                    iv2.setBackgroundResource(R.drawable.yellowcircle);
                    player4++;
                    //TURN1=4;
                } else if (TURN1 == 2) {
                    iv2.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN1=1;
                } else if (TURN1 == 3) {
                    iv2.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN1=2;
                } else if (TURN1 == 4) {
                    iv2.setBackgroundResource(R.drawable.orangecircle);
                    player3++;
                    //TURN1=3;
                }
                test++;
                b = false;
            } else {

            }
        }

        if (!l3.isEnabled()
                && !l11.isEnabled()
                && !l5.isEnabled()
                && !l10.isEnabled()) {

            if (c) {
                iv4.setVisibility(View.VISIBLE);
                if (TURN1 == 1) {
                    iv4.setBackgroundResource(R.drawable.yellowcircle);
                    player4++;
                    //TURN1=4;
                } else if (TURN1 == 2) {
                    iv4.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN1=1;
                } else if (TURN1 == 3) {
                    iv4.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN1=2;
                } else if (TURN1 == 4) {
                    iv4.setBackgroundResource(R.drawable.orangecircle);
                    player3++;
                    //TURN1=3;
                }

                test++;

                c = false;
            } else {

            }
        }

        if (!l4.isEnabled()
                && !l12.isEnabled()
                && !l6.isEnabled()
                && !l11.isEnabled()) {

            if (d) {
                iv5.setVisibility(View.VISIBLE);
                if (TURN1 == 1) {
                    iv5.setBackgroundResource(R.drawable.yellowcircle);
                    player4++;
                    //TURN1=4;
                } else if (TURN1 == 2) {
                    iv5.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN1=1;
                } else if (TURN1 == 3) {
                    iv5.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN1=2;
                } else if (TURN1 == 4) {
                    iv5.setBackgroundResource(R.drawable.orangecircle);
                    player3++;
                    //TURN1=3;
                }

                test++;

                d = false;
            } else {

            }
        }

        if (!l9.isEnabled()
                && !l13.isEnabled()
                && !l14.isEnabled()
                && !l15.isEnabled()) {

            if (e) {
                iv3.setVisibility(View.VISIBLE);
                if (TURN1 == 1) {
                    iv3.setBackgroundResource(R.drawable.yellowcircle);
                    player4++;
                    //TURN1=4;
                } else if (TURN1 == 2) {
                    iv3.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN1=1;
                } else if (TURN1 == 3) {
                    iv3.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN1=2;
                } else if (TURN1 == 4) {
                    iv3.setBackgroundResource(R.drawable.orangecircle);
                    player3++;
                    //TURN1=3;
                }

                test++;
                e = false;
            } else {

            }
        }

        if (!l12.isEnabled()
                && !l15.isEnabled()
                && !l16.isEnabled()
                && !l17.isEnabled()) {

            if (f) {
                iv6.setVisibility(View.VISIBLE);
                if (TURN1 == 1) {
                    iv6.setBackgroundResource(R.drawable.yellowcircle);
                    player4++;
                    //TURN1=4;
                } else if (TURN1 == 2) {
                    iv6.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN1=1;
                } else if (TURN1 == 3) {
                    iv6.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN1=2;
                } else if (TURN1 == 4) {
                    iv6.setBackgroundResource(R.drawable.orangecircle);
                    player3++;
                    //TURN1=3;
                }

                test++;
                f = false;
            } else {

            }
        }

        if (!l17.isEnabled()
                && !l18.isEnabled()
                && !l19.isEnabled()
                && !l20.isEnabled()) {

            if (g) {
                iv9.setVisibility(View.VISIBLE);
                if (TURN1 == 1) {
                    iv9.setBackgroundResource(R.drawable.yellowcircle);
                    player4++;
                    //TURN1=4;
                } else if (TURN1 == 2) {
                    iv9.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN1=1;
                } else if (TURN1 == 3) {
                    iv9.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN1=2;
                } else if (TURN1 == 4) {
                    iv9.setBackgroundResource(R.drawable.orangecircle);
                    player3++;
                    //TURN1=3;
                }

                test++;
                g = false;
            } else {

            }
        }

        if (!l6.isEnabled()
                && !l20.isEnabled()
                && !l21.isEnabled()
                && !l22.isEnabled()) {

            if (h) {
                iv8.setVisibility(View.VISIBLE);
                if (TURN1 == 1) {
                    iv8.setBackgroundResource(R.drawable.yellowcircle);
                    player4++;
                    //TURN1=4;
                } else if (TURN1 == 2) {
                    iv8.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN1=1;
                } else if (TURN1 == 3) {
                    iv8.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN1=2;
                } else if (TURN1 == 4) {
                    iv8.setBackgroundResource(R.drawable.orangecircle);
                    player3++;
                    //TURN1=3;
                }

                test++;
                h = false;
            } else {

            }
        }

        if (!l5.isEnabled()
                && !l22.isEnabled()
                && !l23.isEnabled()
                && !l24.isEnabled()) {

            if (i) {
                iv7.setVisibility(View.VISIBLE);
                if (TURN1 == 1) {
                    iv7.setBackgroundResource(R.drawable.yellowcircle);
                    player4++;
                    //TURN1=4;
                } else if (TURN1 == 2) {
                    iv7.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN1=1;
                } else if (TURN1 == 3) {
                    iv7.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN1=2;
                } else if (TURN1 == 4) {
                    iv7.setBackgroundResource(R.drawable.orangecircle);
                    player3++;
                    //TURN1=3;
                }
                test++;
                i = false;
            } else {

            }
        }

        if (test == 1 || test == 2) {
            if (TURN1 == 1) {
                TURN1 = 4;
            } else if (TURN1 == 2) {
                TURN1 = 1;
            } else if (TURN1 == 3) {
                TURN1 = 2;
            } else if (TURN1 == 4) {
                TURN1 = 3;
            }
        }

        score1.setText("" + player1);
        score2.setText("" + player2);
        score3.setText("" + player3);
        score4.setText("" + player4);

        PlayerTurn();

        if (iv1.getVisibility() == View.VISIBLE
                && iv2.getVisibility() == View.VISIBLE
                && iv3.getVisibility() == View.VISIBLE
                && iv4.getVisibility() == View.VISIBLE
                && iv5.getVisibility() == View.VISIBLE
                && iv6.getVisibility() == View.VISIBLE
                && iv7.getVisibility() == View.VISIBLE
                && iv8.getVisibility() == View.VISIBLE
                && iv9.getVisibility() == View.VISIBLE) {

            CountDownTimer countdowntimer = new CountDownTimer(2000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {

                }

                @Override
                public void onFinish() {

                    if (player1 > player2
                            && player1 > player3
                            && player1 > player4) {
                        Toast.makeText(Player4.this, "Player 1 Wins..!!", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Player4.this, Winner_Page.class);
                        String playername = "Player 1";
                        String playerscore = score1.getText().toString();
                        i.putExtra("WinnerName", playername);
                        i.putExtra("WinnerScore", playerscore);
                        startActivity(i);
                    } else if (player2 > player1
                            && player2 > player3
                            && player2 > player4) {
                        Toast.makeText(Player4.this, "Player 2 Wins..!!", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Player4.this, Winner_Page.class);
                        String playername = "Player 2";
                        String playerscore = score2.getText().toString();
                        i.putExtra("WinnerName", playername);
                        i.putExtra("WinnerScore", playerscore);
                        startActivity(i);

                    } else if (player3 > player1
                            && player3 > player2
                            && player3 > player4) {
                        Toast.makeText(Player4.this, "Player 3 Wins..!!", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Player4.this, Winner_Page.class);
                        String playername = "Player 3";
                        String playerscore = score3.getText().toString();
                        i.putExtra("WinnerName", playername);
                        i.putExtra("WinnerScore", playerscore);
                        startActivity(i);
                    } else if (player4 > player1
                            && player4 > player2
                            && player4 > player3) {
                        Toast.makeText(Player4.this, "Player 4 Wins..!!", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Player4.this, Winner_Page.class);
                        String playername = "Player 4";
                        String playerscore = score4.getText().toString();
                        i.putExtra("WinnerName", playername);
                        i.putExtra("WinnerScore", playerscore);
                        startActivity(i);

                    } else {
                        Toast.makeText(Player4.this, "Match Draw..!!", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Player4.this, Winner_Page.class);
                        String playername = "Match Draw..!!";
                        String playerscore = "";
                        i.putExtra("WinnerName", playername);
                        i.putExtra("WinnerScore", playerscore);
                        startActivity(i);
                    }

                }


            }.start();


        }
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Player4.this,Start_Game.class);
        startActivity(i);
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        finish();
        super.onPause();
    }

}

