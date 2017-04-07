package com.example.dharamvirsingh.linedrawtest;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Start_Game extends AppCompatActivity {

    Button play;
    Spinner sp,sp2;
    String[] players = {"SELECT PLAYERS","2 PLAYERS","3 PLAYERS","4 PLAYERS"};
    String[] grid={"3*3 SQUARE COURT","5*4 RECTANGLE GROUND"};
    public static int a;
    public static String num,grids;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start__game);

        sp = (Spinner)findViewById(R.id.sp);
        sp2 = (Spinner)findViewById(R.id.sp2);
        play = (Button)findViewById(R.id.play);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Start_Game.this,android.R.layout.simple_spinner_dropdown_item,players);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(Start_Game.this,android.R.layout.simple_spinner_dropdown_item,grid);
        sp.setAdapter(adapter);
        sp2.setAdapter(adapter2);




        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        num = players[position];

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
        });






        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                grids = grid[position];
                if(grids.equalsIgnoreCase("3*3 SQUARE COURT"))
                {
                    a=1;
                }
                else if(grids.equalsIgnoreCase("5*4 RECTANGLE GROUND"))
                {
                    a=2;
                }
                else
                {
                    a=3;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num.equalsIgnoreCase("2 PLAYERS")) {
                    if (a == 1)
                    {
                        Intent i = new Intent(Start_Game.this, MainActivity.class);
                        startActivity(i);
                    }
                    else if(a==2)
                    {
                        Intent i = new Intent(Start_Game.this, Main2Activity.class);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(Start_Game.this, "Error..!!", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(num.equalsIgnoreCase("3 PLAYERS"))
                {
                    if (a == 1)
                    {
                        Intent i = new Intent(Start_Game.this, Player3.class);
                        startActivity(i);
                    }
                    else if(a==2)
                    {
                        Intent i = new Intent(Start_Game.this, Player3Grid.class);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(Start_Game.this, "Error..!!", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(num.equalsIgnoreCase("4 PLAYERS"))
                {
                    if (a == 1)
                    {
                        Intent i = new Intent(Start_Game.this, Player4.class);
                        startActivity(i);
                    }
                    else if(a==2)
                    {
                        Intent i = new Intent(Start_Game.this, Player4Grid.class);
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(Start_Game.this, "Error..!!", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(Start_Game.this, "Please Select Players..!!", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder albuilder = new AlertDialog.Builder(context);
        albuilder.setTitle("EXIT");
        albuilder.setMessage("Do you want to exit ?");
        albuilder.setCancelable(false);
        albuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Start_Game.this.finish();
                System.exit(0);
            }
        });

        albuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = albuilder.create();
        alertDialog.show();
        super.onBackPressed();
    }


}
