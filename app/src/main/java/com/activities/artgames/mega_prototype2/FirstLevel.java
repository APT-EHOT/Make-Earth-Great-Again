package com.activities.artgames.mega_prototype2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstLevel extends AppCompatActivity implements View.OnClickListener {

    String[] cons  = {"0", "0", "0", "0", "0", "0", "0", "0",
            "0", "0", "0", "0", "0", "0", "0", "0"};
    private Button button1; boolean b1pressed = false;
    private Button button2; boolean b2pressed = false;
    private Button button3; boolean b3pressed = false;
    private Button button4; boolean b4pressed = false;
    private Button button8; boolean b8pressed = false;
    private Button button9; boolean b9pressed = false;
    private Button button10; boolean b10pressed = false;
    private Button button11; boolean b11pressed = false;
    private Button button12; boolean b12pressed = false;
    private Button button13; boolean b13pressed = false;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button14;
    private Button button15;
    private Button button16;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_level);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        button10 = (Button)findViewById(R.id.button10);
        button11 = (Button)findViewById(R.id.button11);
        button12 = (Button)findViewById(R.id.button12);
        button13 = (Button)findViewById(R.id.button13);
        button14 = (Button)findViewById(R.id.button14);
        button15 = (Button)findViewById(R.id.button15);
        button16 = (Button)findViewById(R.id.button16);
        ((Button) findViewById(R.id.button1)).setOnClickListener(this);
        ((Button) findViewById(R.id.button2)).setOnClickListener(this);
        ((Button) findViewById(R.id.button3)).setOnClickListener(this);
        ((Button) findViewById(R.id.button4)).setOnClickListener(this);
        ((Button) findViewById(R.id.button8)).setOnClickListener(this);
        ((Button) findViewById(R.id.button9)).setOnClickListener(this);
        ((Button) findViewById(R.id.button10)).setOnClickListener(this);
        ((Button) findViewById(R.id.button11)).setOnClickListener(this);
        ((Button) findViewById(R.id.button12)).setOnClickListener(this);
        ((Button) findViewById(R.id.button13)).setOnClickListener(this);
        ((Button) findViewById(R.id.delete_button)).setOnClickListener(this);
        button5.setBackgroundResource(R.mipmap.consblocked);
        button6.setBackgroundResource(R.mipmap.consblocked);
        button7.setBackgroundResource(R.mipmap.consblocked);
        button14.setBackgroundResource(R.mipmap.consblocked);
        button15.setBackgroundResource(R.mipmap.consblocked);
        button16.setBackgroundResource(R.mipmap.consblocked);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                if (!b1pressed) {
                    b1pressed = true;
                    cons[0] = "0w";
                    button1.setBackgroundResource(R.mipmap.start_black_selected);
                }
                break;
            case R.id.button2:
                if ((b1pressed) && (!b2pressed)) {
                    b2pressed = true;
                    cons[0] = "3";
                    cons[1] = "9";
                    button2.setBackgroundResource(R.mipmap.cons9);
                } else if (b2pressed) {
                    cons[1] = "9w";
                    button2.setBackgroundResource(R.mipmap.cons9w);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "UNREACHEBLE", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case R.id.button3:
                if ((b2pressed) && (!b3pressed)) {
                    b3pressed = true;
                    cons[1] = "2";
                    cons[2] = "9";
                    button2.setBackgroundResource(R.mipmap.cons1);
                    button3.setBackgroundResource(R.mipmap.cons9);
                } else if (b3pressed) {
                    cons[2] = "9w";
                    button3.setBackgroundResource(R.mipmap.cons9w);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "UNREACHEBLE", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case R.id.button4:
                if ((b3pressed) && (!b4pressed)) {
                    b4pressed = true;
                    cons[2] = "2";
                    cons[3] = "9";
                    button3.setBackgroundResource(R.mipmap.cons1);
                    button4.setBackgroundResource(R.mipmap.cons9);
                } else if (b4pressed) {
                    cons[3] = "9w";
                    button4.setBackgroundResource(R.mipmap.cons9w);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "UNREACHEBLE", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case R.id.button8:
                if ((b4pressed) && (!b8pressed)) {
                    b8pressed = true;
                    cons[3] = "5";
                    cons[7] = "8";
                    button4.setBackgroundResource(R.mipmap.cons5);
                    button8.setBackgroundResource(R.mipmap.cons7);
                } else if (b8pressed) {
                    cons[7] = "8w";
                    button8.setBackgroundResource(R.mipmap.cons7w);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "UNREACHEBLE", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case R.id.button12:
                if ((b8pressed) && (!b12pressed)) {
                    b12pressed = true;
                    cons[7] = "1";
                    cons[11] = "8";
                    button8.setBackgroundResource(R.mipmap.cons2);
                    button12.setBackgroundResource(R.mipmap.cons7);
                } else if (b12pressed) {
                    cons[11] = "8w";
                    button12.setBackgroundResource(R.mipmap.cons7w);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "UNREACHEBLE", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case R.id.button11:
                if ((b12pressed) && (!b11pressed)) {
                    b11pressed = true;
                    cons[11] = "6";
                    cons[10] = "10";
                    button12.setBackgroundResource(R.mipmap.cons6);
                    button11.setBackgroundResource(R.mipmap.cons10);
                } else if (b11pressed) {
                    cons[10] = "10w";
                    button11.setBackgroundResource(R.mipmap.cons10w);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "UNREACHEBLE", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case R.id.button10:
                if ((b11pressed) && (!b10pressed)) {
                    b10pressed = true;
                    cons[10] = "2";
                    cons[9] = "10";
                    button11.setBackgroundResource(R.mipmap.cons1);
                    button10.setBackgroundResource(R.mipmap.cons10);
                } else if (b10pressed) {
                    cons[9] = "10w";
                    button10.setBackgroundResource(R.mipmap.cons10w);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "UNREACHEBLE", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case R.id.button9:
                if ((b10pressed) && (!b9pressed)) {
                    b9pressed = true;
                    cons[9] = "2";
                    cons[8] = "10";
                    button10.setBackgroundResource(R.mipmap.cons1);
                    button9.setBackgroundResource(R.mipmap.cons10);
                } else if (b9pressed) {
                    cons[8] = "10w";
                    button9.setBackgroundResource(R.mipmap.cons10w);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "UNREACHEBLE", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case R.id.button13:
                if ((b9pressed) && (!b13pressed)) {
                    b13pressed = true;
                    cons[8] = "4";
                    cons[12] = "1";
                    button9.setBackgroundResource(R.mipmap.cons4);
                    button1.setBackgroundResource(R.mipmap.start_black_opened);
                    button13.setBackgroundResource(R.mipmap.finish_black_opened);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "UNREACHEBLE", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
            case R.id.delete_button:
                for (int i = 0; i <= 15; i++) {
                    cons[i] = "0";
                }
                b1pressed = false;
                b2pressed = false;
                b3pressed = false;
                b4pressed = false;
                b8pressed = false;
                b9pressed = false;
                b10pressed = false;
                b11pressed = false;
                b12pressed = false;
                b13pressed = false;
                button1.setBackgroundResource(R.mipmap.start_black_closed);
                button2.setBackgroundResource(R.mipmap.consempty);
                button3.setBackgroundResource(R.mipmap.consempty);
                button4.setBackgroundResource(R.mipmap.consempty);
                button8.setBackgroundResource(R.mipmap.consempty);
                button9.setBackgroundResource(R.mipmap.consempty);
                button10.setBackgroundResource(R.mipmap.consempty);
                button11.setBackgroundResource(R.mipmap.consempty);
                button12.setBackgroundResource(R.mipmap.consempty);
                button13.setBackgroundResource(R.mipmap.finish_black_closed);
                break;
        }

    }


}

