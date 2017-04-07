package com.example.dharamvirsingh.linedrawtest;

import android.content.Intent;
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

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    ImageButton l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,
                l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47,l48,l49,turncolor;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15,tv16,tv17,tv18,tv19,tv20,score1,score2;
    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10,iv11,iv12,iv13,iv14,iv15,iv16,iv17,iv18,iv19,iv20;
    public static boolean a,b,c,d,e,f,g,h,i,
                            j,k,l,m,n,o,p,q,r,s,t;
    public static boolean TURN;
    public static int player1=0;
    public static int player2=0;
    public static int test=0;
    Animation rotation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

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
        l25 = (ImageButton)findViewById(R.id.l25);
        l26 = (ImageButton)findViewById(R.id.l26);
        l27 = (ImageButton)findViewById(R.id.l27);
        l28 = (ImageButton)findViewById(R.id.l28);
        l29 = (ImageButton)findViewById(R.id.l29);
        l30 = (ImageButton)findViewById(R.id.l30);
        l31 = (ImageButton)findViewById(R.id.l31);
        l32 = (ImageButton)findViewById(R.id.l32);
        l33= (ImageButton)findViewById(R.id.l33);
        l34 = (ImageButton)findViewById(R.id.l34);
        l35 = (ImageButton)findViewById(R.id.l35);
        l36 = (ImageButton)findViewById(R.id.l36);
        l37 = (ImageButton)findViewById(R.id.l37);
        l38 = (ImageButton)findViewById(R.id.l38);
        l39 = (ImageButton)findViewById(R.id.l39);
        l40 = (ImageButton)findViewById(R.id.l40);
        l41 = (ImageButton)findViewById(R.id.l41);
        l42 = (ImageButton)findViewById(R.id.l42);
        l43 = (ImageButton)findViewById(R.id.l43);
        l44 = (ImageButton)findViewById(R.id.l44);
        l45 = (ImageButton)findViewById(R.id.l45);
        l46 = (ImageButton)findViewById(R.id.l46);
        l47 = (ImageButton)findViewById(R.id.l47);
        l48 = (ImageButton)findViewById(R.id.l48);
        l49 = (ImageButton)findViewById(R.id.l49);
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
        tv10 = (TextView)findViewById(R.id.tv10);
        tv11 = (TextView)findViewById(R.id.tv11);
        tv12 = (TextView)findViewById(R.id.tv12);
        tv13 = (TextView)findViewById(R.id.tv13);
        tv14 = (TextView)findViewById(R.id.tv14);
        tv15 = (TextView)findViewById(R.id.tv15);
        tv16 = (TextView)findViewById(R.id.tv16);
        tv17 = (TextView)findViewById(R.id.tv17);
        tv18 = (TextView)findViewById(R.id.tv18);
        tv19 = (TextView)findViewById(R.id.tv19);
        tv20 = (TextView)findViewById(R.id.tv20);
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
        iv10 = (ImageView)findViewById(R.id.iv10);
        iv11 = (ImageView)findViewById(R.id.iv11);
        iv12 = (ImageView)findViewById(R.id.iv12);
        iv13 = (ImageView)findViewById(R.id.iv13);
        iv14 = (ImageView)findViewById(R.id.iv14);
        iv15 = (ImageView)findViewById(R.id.iv15);
        iv16 = (ImageView)findViewById(R.id.iv16);
        iv17 = (ImageView)findViewById(R.id.iv17);
        iv18 = (ImageView)findViewById(R.id.iv18);
        iv19 = (ImageView)findViewById(R.id.iv19);
        iv20 = (ImageView)findViewById(R.id.iv20);

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
        l25.setOnClickListener(this);
        l26.setOnClickListener(this);
        l27.setOnClickListener(this);
        l28.setOnClickListener(this);
        l29.setOnClickListener(this);
        l30.setOnClickListener(this);
        l31.setOnClickListener(this);
        l32.setOnClickListener(this);
        l33.setOnClickListener(this);
        l34.setOnClickListener(this);
        l35.setOnClickListener(this);
        l36.setOnClickListener(this);
        l37.setOnClickListener(this);
        l38.setOnClickListener(this);
        l39.setOnClickListener(this);
        l40.setOnClickListener(this);
        l41.setOnClickListener(this);
        l42.setOnClickListener(this);
        l43.setOnClickListener(this);
        l44.setOnClickListener(this);
        l45.setOnClickListener(this);
        l46.setOnClickListener(this);
        l47.setOnClickListener(this);
        l48.setOnClickListener(this);
        l49.setOnClickListener(this);

        a= true;
        b= true;
        c= true;
        d= true;
        e= true;
        f= true;
        g= true;
        h= true;
        i= true;
        j= true;
        k= true;
        l= true;
        m= true;
        n= true;
        o= true;
        p= true;
        q= true;
        r= true;
        s= true;
        t= true;

        TURN=true;
        PlayerTurn();
        startrotate();



    }

    private void startrotate() {

        rotation = AnimationUtils.loadAnimation(Main2Activity.this,R.anim.rotate);
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
        iv10.startAnimation(rotation);
        iv11.startAnimation(rotation);
        iv12.startAnimation(rotation);
        iv13.startAnimation(rotation);
        iv14.startAnimation(rotation);
        iv15.startAnimation(rotation);
        iv16.startAnimation(rotation);
        iv17.startAnimation(rotation);
        iv18.startAnimation(rotation);
        iv19.startAnimation(rotation);
        iv20.startAnimation(rotation);

    }

    private void PlayerTurn() {
        if(test>0) {
            test = 0;
        }
        /*if(TURN)
        {
            Toast.makeText(Main2Activity.this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(Main2Activity.this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
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
                    l7.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l7.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l7.setEnabled(false);
                check();
                break;

            case R.id.l8:
                if(TURN)
                {
                    l8.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l8.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l8.setEnabled(false);
                check();
                break;

            case R.id.l9:
                if(TURN)
                {
                    l9.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l9.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l9.setEnabled(false);
                check();
                break;

            case R.id.l10:
                if(TURN)
                {
                    l10.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l10.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l10.setEnabled(false);
                check();
                break;

            case R.id.l11:
                if(TURN)
                {
                    l11.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l11.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l11.setEnabled(false);
                check();
                break;

            case R.id.l12:
                if(TURN)
                {
                    l12.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l12.setBackgroundResource(R.drawable.blue2);
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
                    l14.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l14.setBackgroundResource(R.drawable.blue2);
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
                    l16.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l16.setBackgroundResource(R.drawable.blue2);
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
                    l18.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l18.setBackgroundResource(R.drawable.blue2);
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
                    l20.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l20.setBackgroundResource(R.drawable.blue2);
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
                    l22.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l22.setBackgroundResource(R.drawable.blue2);
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
                    l24.setBackgroundResource(R.drawable.green2);
                    TURN=false;
                }
                else
                {
                    l24.setBackgroundResource(R.drawable.blue2);
                    TURN=true;
                }
                l24.setEnabled(false);
                check();
                break;


            case R.id.l25:

                if(TURN)
                {
                    l25.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l25.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l25.setEnabled(false);
                check();
                break;

            case R.id.l26:
                if(TURN)
                {
                    l26.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l26.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l26.setEnabled(false);

                check();

                break;

            case R.id.l27:

                if(TURN)
                {
                    l27.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l27.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l27.setEnabled(false);
                check();

                break;

            case R.id.l28:
                if(TURN)
                {
                    l28.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l28.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l28.setEnabled(false);
                check();
                break;

            case R.id.l29:
                if(TURN)
                {
                    l29.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l29.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l29.setEnabled(false);
                check();
                break;

            case R.id.l30:
                if(TURN)
                {
                    l30.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l30.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l30.setEnabled(false);
                check();
                break;

            case R.id.l31:
                if(TURN)
                {
                    l31.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l31.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l31.setEnabled(false);
                check();
                break;

            case R.id.l32:
                if(TURN)
                {
                    l32.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l32.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l32.setEnabled(false);
                check();
                break;

            case R.id.l33:
                if(TURN)
                {
                    l33.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l33.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l33.setEnabled(false);
                check();
                break;

            case R.id.l34:
                if(TURN)
                {
                    l34.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l34.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l34.setEnabled(false);
                check();
                break;

            case R.id.l35:
                if(TURN)
                {
                    l35.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l35.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l35.setEnabled(false);
                check();
                break;

            case R.id.l36:
                if(TURN)
                {
                    l36.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l36.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l36.setEnabled(false);
                check();
                break;

            case R.id.l37:

                if(TURN)
                {
                    l37.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l37.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l37.setEnabled(false);
                check();
                break;

            case R.id.l38:
                if(TURN)
                {
                    l38.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l38.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l38.setEnabled(false);

                check();

                break;

            case R.id.l39:

                if(TURN)
                {
                    l39.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l39.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l39.setEnabled(false);
                check();

                break;

            case R.id.l40:
                if(TURN)
                {
                    l40.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l40.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l40.setEnabled(false);
                check();
                break;

            case R.id.l41:
                if(TURN)
                {
                    l41.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l41.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l41.setEnabled(false);
                check();
                break;

            case R.id.l42:
                if(TURN)
                {
                    l42.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l42.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l42.setEnabled(false);
                check();
                break;

            case R.id.l43:
                if(TURN)
                {
                    l43.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l43.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l43.setEnabled(false);
                check();
                break;

            case R.id.l44:
                if(TURN)
                {
                    l44.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l44.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l44.setEnabled(false);
                check();
                break;

            case R.id.l45:
                if(TURN)
                {
                    l45.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l45.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l45.setEnabled(false);
                check();
                break;

            case R.id.l46:
                if(TURN)
                {
                    l46.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l46.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l46.setEnabled(false);
                check();
                break;

            case R.id.l47:
                if(TURN)
                {
                    l47.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l47.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l47.setEnabled(false);
                check();
                break;

            case R.id.l48:
                if(TURN)
                {
                    l48.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l48.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l48.setEnabled(false);
                check();
                break;

            case R.id.l49:
                if(TURN)
                {
                    l49.setBackgroundResource(R.drawable.green);
                    TURN=false;
                }
                else
                {
                    l49.setBackgroundResource(R.drawable.blue);
                    TURN=true;
                }
                l49.setEnabled(false);
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
                && !l26.isEnabled()
                && !l5.isEnabled()
                && !l25.isEnabled()) {

            if (a) {
                iv1.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv1.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
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
                && !l27.isEnabled()
                && !l6.isEnabled()
                && !l26.isEnabled()) {
            if (b) {

                iv2.setVisibility(View.VISIBLE);
                if (TURN) {
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
                && !l7.isEnabled()
                && !l27.isEnabled()
                && !l28.isEnabled()) {

            if (c) {
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
                c=false;
            }
            else {

            }
        }

        if(!l4.isEnabled()
                && !l8.isEnabled()
                && !l28.isEnabled()
                && !l29.isEnabled())
        {

            if(d) {
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
                d=false;
            }
            else
            {

            }
        }

        if(!l5.isEnabled()
                && !l9.isEnabled()
                && !l30.isEnabled()
                && !l31.isEnabled()) {

            if (e) {
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
                e=false;
            }
            else
            {

            }
        }

        if(!l6.isEnabled()
                && !l10.isEnabled()
                && !l31.isEnabled()
                && !l32.isEnabled()) {

            if (f) {
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

        if(!l7.isEnabled()
                && !l11.isEnabled()
                && !l32.isEnabled()
                && !l33.isEnabled()) {

            if (g) {
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
                g=false;
            }
            else
            {

            }
        }

        if(!l8.isEnabled()
                && !l12.isEnabled()
                && !l33.isEnabled()
                && !l34.isEnabled()) {

            if (h) {
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

        if(!l9.isEnabled()
                && !l13.isEnabled()
                && !l35.isEnabled()
                && !l36.isEnabled()) {

            if (i) {
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
                i=false;
            }
            else
            {

            }
        }

        if(!l10.isEnabled()
                && !l14.isEnabled()
                && !l36.isEnabled()
                && !l37.isEnabled()) {

            if (j) {
                iv10.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv10.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv10.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                j=false;
            }
            else
            {

            }
        }
        if(!l11.isEnabled()
                && !l15.isEnabled()
                && !l37.isEnabled()
                && !l38.isEnabled()) {

            if (k) {
                iv11.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv11.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv11.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                k=false;
            }
            else
            {

            }
        }
        if(!l12.isEnabled()
                && !l16.isEnabled()
                && !l38.isEnabled()
                && !l39.isEnabled()) {

            if (l) {
                iv12.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv12.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv12.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                l=false;
            }
            else
            {

            }
        }


        if(!l13.isEnabled()
                && !l17.isEnabled()
                && !l40.isEnabled()
                && !l41.isEnabled()) {

            if (m) {
                iv13.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv13.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv13.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                m=false;
            }
            else
            {

            }
        }

        if(!l14.isEnabled()
                && !l18.isEnabled()
                && !l41.isEnabled()
                && !l42.isEnabled()) {

            if (n) {
                iv14.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv14.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv14.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                n=false;
            }
            else
            {

            }
        }

        if(!l15.isEnabled()
                && !l19.isEnabled()
                && !l42.isEnabled()
                && !l43.isEnabled()) {

            if (o) {
                iv15.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv15.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv15.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                o=false;
            }
            else
            {

            }
        }

        if(!l16.isEnabled()
                && !l20.isEnabled()
                && !l43.isEnabled()
                && !l44.isEnabled()) {

            if (p) {
                iv16.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv16.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv16.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                p=false;
            }
            else
            {

            }
        }

        if(!l17.isEnabled()
                && !l21.isEnabled()
                && !l45.isEnabled()
                && !l46.isEnabled()) {

            if (q) {
                iv17.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv17.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv17.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                q=false;
            }
            else
            {

            }
        }

        if(!l18.isEnabled()
                && !l22.isEnabled()
                && !l46.isEnabled()
                && !l47.isEnabled()) {

            if (r) {
                iv18.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv18.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv18.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                r=false;
            }
            else
            {

            }
        }


        if(!l19.isEnabled()
                && !l23.isEnabled()
                && !l47.isEnabled()
                && !l48.isEnabled()) {

            if (s) {
                iv19.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv19.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv19.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                s=false;
            }
            else
            {

            }
        }


        if(!l20.isEnabled()
                && !l24.isEnabled()
                && !l48.isEnabled()
                && !l49.isEnabled()) {

            if (t) {
                iv20.setVisibility(View.VISIBLE);
                if (TURN) {
                    iv20.setBackgroundResource(R.drawable.bluecircle);
                    player2++;
                    //TURN=false;
                } else {
                    iv20.setBackgroundResource(R.drawable.greencircle);
                    player1++;
                    //TURN=true;
                }
                test++;
                t=false;
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

        PlayerTurn();

        if(iv1.getVisibility()==View.VISIBLE
                && iv2.getVisibility()==View.VISIBLE
                && iv3.getVisibility()==View.VISIBLE
                && iv4.getVisibility()==View.VISIBLE
                && iv5.getVisibility()==View.VISIBLE
                && iv6.getVisibility()==View.VISIBLE
                && iv7.getVisibility()==View.VISIBLE
                && iv8.getVisibility()==View.VISIBLE
                && iv9.getVisibility()==View.VISIBLE
                && iv10.getVisibility()==View.VISIBLE
                && iv11.getVisibility()==View.VISIBLE
                && iv12.getVisibility()==View.VISIBLE
                && iv13.getVisibility()==View.VISIBLE
                && iv14.getVisibility()==View.VISIBLE
                && iv15.getVisibility()==View.VISIBLE
                && iv16.getVisibility()==View.VISIBLE
                && iv17.getVisibility()==View.VISIBLE
                && iv18.getVisibility()==View.VISIBLE
                && iv19.getVisibility()==View.VISIBLE
                && iv20.getVisibility()==View.VISIBLE)
        {

            CountDownTimer countdowntimer = new CountDownTimer(2000,1000) {
                @Override
                public void onTick(long millisUntilFinished) {

                }

                @Override
                public void onFinish() {

                    if(player1>player2)
                    {
                        Toast.makeText(Main2Activity.this, "Player 1 Wins..!!", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Main2Activity.this,Winner_Page.class);
                        String playername = "Player 1";
                        String playerscore = score1.getText().toString();
                        i.putExtra("WinnerName",playername);
                        i.putExtra("WinnerScore",playerscore);
                        startActivity(i);
                    }
                    else if (player2>player1)
                    {
                        Toast.makeText(Main2Activity.this, "Player 2 Wins..!!", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Main2Activity.this,Winner_Page.class);
                        String playername = "Player 2";
                        String playerscore = score2.getText().toString();
                        i.putExtra("WinnerName",playername);
                        i.putExtra("WinnerScore",playerscore);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(Main2Activity.this, "Draw..!!", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Main2Activity.this,Winner_Page.class);
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

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Main2Activity.this,Start_Game.class);
        startActivity(i);
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        finish();
        super.onPause();
    }
}
