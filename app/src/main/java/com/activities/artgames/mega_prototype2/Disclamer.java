package com.activities.artgames.mega_prototype2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Disclamer extends AppCompatActivity implements View.OnClickListener {

    boolean tpab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclamer);
        ((Button) findViewById(R.id.button)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent gotomenu = new Intent(this, LevelChoose.class);
                startActivity(gotomenu);
                break;
        }
    }
}