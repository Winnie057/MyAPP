package com.example.user.reservation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button reservation,inquire,detection;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reservation=(Button) findViewById(R.id.reservation);
        inquire=(Button) findViewById(R.id.inquire);
        detection=(Button) findViewById(R.id.detection);
        reservation.setOnClickListener(this);
        inquire.setOnClickListener(this);
        detection.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.reservation:
                intent = new Intent();
                intent.setClass(MainActivity.this,ReserActivity.class);
                startActivity(intent);
                break;
        }
    }
}
