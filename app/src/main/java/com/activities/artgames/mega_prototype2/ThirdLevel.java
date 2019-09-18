package com.activities.artgames.mega_prototype2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ThirdLevel extends AppCompatActivity implements View.OnClickListener {

    boolean[] pressed = {false, false, false, false, false,
            false, false, false, false, false,
            false, false, false, false, false,
            false, false, false, false, false,
            false, false, false, false, false};

    SupportCodeTwo sc = new SupportCodeTwo();
    boolean per = false;

    int[][] cells = {{9, 9, 9, 9, 9, 9, 9},  // 0 - free, 9 - blocked
                     {9, 4, 0, 5, 9, 0, 9},  // 1 - black up, 2 - black right
                     {9, 9, 0, 20, 0, 0, 9}, // 3 - black down, 4 - black left
                     {9, 9, 9, 0, 9, 0, 9},  // black + 4 = blue
                     {9, 9, 0, 20, 0, 0, 9}, // 20 - connector empty, 21 - connector w/black,
                     {9, 4, 0, 7, 9, 0, 9},  // 22 - connector filled
                     {9, 9, 9, 9, 9, 9, 9}};

    Button kekes[][] = new Button[5][5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_level);
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
                kekes[0][0].setBackgroundResource(R.mipmap.start_black_selected);
                break;
            case (R.id.button2):
                kekes[0][1].setBackgroundResource(R.mipmap.cons9);
                break;
            case (R.id.button3):
                kekes[0][2].setBackgroundResource(R.mipmap.start_blue_selected);
                per = true;
                break;
            case (R.id.button7):
                kekes[0][1].setBackgroundResource(R.mipmap.cons5);
                kekes[1][1].setBackgroundResource(R.mipmap.cons7);
                break;
            case (R.id.button8):
                if (!per) {
                    kekes[1][1].setBackgroundResource(R.mipmap.cons3);
                    kekes[1][2].setBackgroundResource(R.mipmap.peres_black);
                } else {
                    kekes[1][2].setBackgroundResource(R.mipmap.peres_finished);
                }
                break;
            case (R.id.button9):
                kekes[1][3].setBackgroundResource(R.mipmap.cons9);
                break;
            case (R.id.button10):
                kekes[1][3].setBackgroundResource(R.mipmap.cons1);
                kekes[1][4].setBackgroundResource(R.mipmap.cons9);
                break;
            case (R.id.button13):
                kekes[2][2].setBackgroundResource(R.mipmap.cons2b);
                break;
            case (R.id.button15):
                kekes[1][4].setBackgroundResource(R.mipmap.cons5);
                kekes[2][4].setBackgroundResource(R.mipmap.cons7);
                break;
            case (R.id.button17):
                kekes[3][1].setBackgroundResource(R.mipmap.cons10);
                break;
            case (R.id.button18):
                if (!per) {
                    kekes[3][3].setBackgroundResource(R.mipmap.cons1);
                    kekes[3][2].setBackgroundResource(R.mipmap.peres_black);
                } else {
                    kekes[2][2].setBackgroundResource(R.mipmap.cons2b);
                    kekes[3][2].setBackgroundResource(R.mipmap.peres_finished);
                }
                break;
            case (R.id.button19):
                kekes[3][4].setBackgroundResource(R.mipmap.cons6);
                kekes[3][3].setBackgroundResource(R.mipmap.cons10);
                break;
            case (R.id.button20):
                kekes[2][4].setBackgroundResource(R.mipmap.cons2);
                kekes[3][4].setBackgroundResource(R.mipmap.cons7);
                break;
            case (R.id.button21):
                kekes[4][1].setBackgroundResource(R.mipmap.cons6);
                kekes[0][0].setBackgroundResource(R.mipmap.start_black_opened);
                kekes[4][0].setBackgroundResource(R.mipmap.finish_black_opened);
                break;
            case (R.id.button22):
                kekes[3][1].setBackgroundResource(R.mipmap.cons4);
                kekes[4][1].setBackgroundResource(R.mipmap.cons7);
                break;
            case (R.id.button23):
                kekes[0][2].setBackgroundResource(R.mipmap.start_blue_opened);
                kekes[4][2].setBackgroundResource(R.mipmap.finish_blue_opened);
                break;

        }
    }
}
