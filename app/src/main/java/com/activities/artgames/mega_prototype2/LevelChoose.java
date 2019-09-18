package com.activities.artgames.mega_prototype2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelChoose extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_choose);
        ((Button)findViewById(R.id.buttonlvl1)).setOnClickListener(this);
        ((Button)findViewById(R.id.buttonlvl2)).setOnClickListener(this);
        ((Button)findViewById(R.id.buttonlvl3)).setOnClickListener(this);
        ((Button)findViewById(R.id.buttonlvl4)).setOnClickListener(this);
        ((Button)findViewById(R.id.buttonlvl5)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonlvl1:
                Intent firstlvl = new Intent(this, FirstLevel.class);
                startActivity(firstlvl);
                break;
            case R.id.buttonlvl2:
                Intent secondlvl = new Intent(this, second_level.class);
                startActivity(secondlvl);
                break;
            case R.id.buttonlvl3:
                Intent thirdlevel = new Intent(this, ThirdLevel.class);
                startActivity(thirdlevel);
                break;
            case R.id.buttonlvl4:
                Intent fourthlevel = new Intent(this, FourthLevel.class);
                startActivity(fourthlevel);
                break;
            case R.id.buttonlvl5:
                Intent fifthlevel = new Intent(this, FifthLevel.class);
                startActivity(fifthlevel);
                break;
        }
    }
}
