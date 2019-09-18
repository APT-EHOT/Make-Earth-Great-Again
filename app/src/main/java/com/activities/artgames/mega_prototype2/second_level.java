package com.activities.artgames.mega_prototype2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class second_level extends AppCompatActivity implements View.OnClickListener {



    SupportCodeOne sc = new SupportCodeOne();

    int[][] cells = {{9, 9, 9, 9, 9, 9, 9},  // 0 - free, 9 - blocked
                     {9, 4, 0, 0, 0, 6, 9},  // 1 - black up, 2 - black right
                     {9, 9, 0, 0, 9, 9, 9},  // 3 - black down, 4 - black left
                     {9, 9, 0, 0, 9, 9, 9},  // black + 4 = blue
                     {9, 9, 0, 0, 0, 9, 9},
                     {9, 4, 0, 9, 0, 6, 9},
                     {9, 9, 9, 9, 9, 9, 9}};


    Button kekes[][] = new Button[5][5];

    boolean[] pressed = {false, false, false, false, false,
            false, false, false, false, false,
            false, false, false, false, false,
            false, false, false, false, false,
            false, false, false, false, false};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_level);
        kekes[0][0] = (Button)findViewById(R.id.button1);
        kekes[0][1] = (Button)findViewById(R.id.button2);
        kekes[0][2] = (Button)findViewById(R.id.button3);
        kekes[0][3] = (Button)findViewById(R.id.button4);
        kekes[0][4] = (Button)findViewById(R.id.button5);
        kekes[1][0] = (Button)findViewById(R.id.button6);
        kekes[1][1] = (Button)findViewById(R.id.button7);
        kekes[1][2] = (Button)findViewById(R.id.button8);
        kekes[1][3] = (Button)findViewById(R.id.button9);
        kekes[1][4] = (Button)findViewById(R.id.button10);
        kekes[2][0] = (Button)findViewById(R.id.button11);
        kekes[2][1] = (Button)findViewById(R.id.button12);
        kekes[2][2] = (Button)findViewById(R.id.button13);
        kekes[2][3] = (Button)findViewById(R.id.button14);
        kekes[2][4] = (Button)findViewById(R.id.button15);
        kekes[3][0] = (Button)findViewById(R.id.button16);
        kekes[3][1] = (Button)findViewById(R.id.button17);
        kekes[3][2] = (Button)findViewById(R.id.button18);
        kekes[3][3] = (Button)findViewById(R.id.button19);
        kekes[3][4] = (Button)findViewById(R.id.button20);
        kekes[4][0] = (Button)findViewById(R.id.button21);
        kekes[4][1] = (Button)findViewById(R.id.button22);
        kekes[4][2] = (Button)findViewById(R.id.button23);
        kekes[4][3] = (Button)findViewById(R.id.button24);
        kekes[4][4] = (Button)findViewById(R.id.button25);
        ((Button) findViewById(R.id.button1)).setOnClickListener(this);
        ((Button) findViewById(R.id.button2)).setOnClickListener(this);
        ((Button) findViewById(R.id.button3)).setOnClickListener(this);
        ((Button) findViewById(R.id.button4)).setOnClickListener(this);
        ((Button) findViewById(R.id.button5)).setOnClickListener(this);
        ((Button) findViewById(R.id.button6)).setOnClickListener(this);
        ((Button) findViewById(R.id.button7)).setOnClickListener(this);
        ((Button) findViewById(R.id.button8)).setOnClickListener(this);
        ((Button) findViewById(R.id.button9)).setOnClickListener(this);
        ((Button) findViewById(R.id.button10)).setOnClickListener(this);
        ((Button) findViewById(R.id.button11)).setOnClickListener(this);
        ((Button) findViewById(R.id.button12)).setOnClickListener(this);
        ((Button) findViewById(R.id.button13)).setOnClickListener(this);
        ((Button) findViewById(R.id.button14)).setOnClickListener(this);
        ((Button) findViewById(R.id.button15)).setOnClickListener(this);
        ((Button) findViewById(R.id.button16)).setOnClickListener(this);
        ((Button) findViewById(R.id.button17)).setOnClickListener(this);
        ((Button) findViewById(R.id.button18)).setOnClickListener(this);
        ((Button) findViewById(R.id.button19)).setOnClickListener(this);
        ((Button) findViewById(R.id.button20)).setOnClickListener(this);
        ((Button) findViewById(R.id.button21)).setOnClickListener(this);
        ((Button) findViewById(R.id.button22)).setOnClickListener(this);
        ((Button) findViewById(R.id.button23)).setOnClickListener(this);
        ((Button) findViewById(R.id.button24)).setOnClickListener(this);
        ((Button) findViewById(R.id.button25)).setOnClickListener(this);
        ((Button) findViewById(R.id.delete_button)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.button1):
                if ((!pressed[0]) && (!pressed[4])) {
                    pressed[0] = true;
                    kekes[0][0].setBackgroundResource(R.mipmap.start_black_selected);
                } else if (pressed[0]) {
                    pressed[0] = false;
                    kekes[0][0].setBackgroundResource(R.mipmap.start_black_closed);
                }
                break;
            case (R.id.button2):
                if ((pressed[0]) || (pressed[4])) {
                    sc.basement(2, 1, cells, kekes, pressed);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "SELECT START BUTTON", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case (R.id.button3):
                if ((pressed[0]) || (pressed[4])) {
                    sc.basement(3, 1, cells, kekes, pressed);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "SELECT START BUTTON", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case (R.id.button4):
                if ((pressed[0]) || (pressed[4])) {
                    sc.basement(4, 1, cells, kekes, pressed);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "SELECT START BUTTON", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case (R.id.button5):
                if ((!pressed[0]) && (!pressed[4])) {
                    pressed[4] = true;
                    kekes[0][4].setBackgroundResource(R.mipmap.start_blue_selected);
                } else if (pressed[4]) {
                    pressed[4] = false;
                    kekes[0][4].setBackgroundResource(R.mipmap.start_blue_closed);
                }
                break;
            case (R.id.button7):
                if ((pressed[0]) || (pressed[4])) {
                    sc.basement(2, 2, cells, kekes, pressed);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "SELECT START BUTTON", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case (R.id.button8):
                if ((pressed[0]) || (pressed[4])) {
                    sc.basement(3, 2, cells, kekes, pressed);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "SELECT START BUTTON", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case (R.id.button12):
                if ((pressed[0]) || (pressed[4])) {
                    sc.basement(2, 3, cells, kekes, pressed);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "SELECT START BUTTON", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case (R.id.button13):
                if ((pressed[0]) || (pressed[4])) {
                    sc.basement(3, 3, cells, kekes, pressed);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "SELECT START BUTTON", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case (R.id.button17):
                if ((pressed[0]) || (pressed[4])) {
                    sc.basement(2, 4, cells, kekes, pressed);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "SELECT START BUTTON", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case (R.id.button18):
                if ((pressed[0]) || (pressed[4])) {
                    sc.basement(3, 4, cells, kekes, pressed);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "SELECT START BUTTON", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case (R.id.button19):
                if ((pressed[0]) || (pressed[4])) {
                    sc.basement(4, 4, cells, kekes, pressed);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "SELECT START BUTTON", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case (R.id.button21):
                if ((pressed[0]) || (pressed[4])) {
                    sc.basement(1, 5, cells, kekes, pressed);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "SELECT START BUTTON", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case (R.id.button22):
                if ((pressed[0]) || (pressed[4])) {
                    sc.basement(2, 5, cells, kekes, pressed);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "SELECT START BUTTON", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case (R.id.button24):
                if ((pressed[0]) || (pressed[4])) {
                    sc.basement(4, 5, cells, kekes, pressed);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "SELECT START BUTTON", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case (R.id.button25):
                kekes[0][0].setBackgroundResource(R.mipmap.start_black_closed);
                kekes[0][1].setBackgroundResource(R.mipmap.consempty);
                break;
            }
        }
    }

