package com.example.sontran.myapplication;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public boolean clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void onStart() {
        super.onStart();
        Random rand = new Random();
        Float xAxis = 5.0f;
        Float yAxis = 5.0f;
        Button butt = (Button) findViewById(R.id.myButton);
        xAxis = rand.nextFloat() * 15.00f + 1;
        yAxis = rand.nextFloat() * 15.00f + 1;
        while (clicked == false) {
            butt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity.this.clicked = true;
                }
            });
            xAxis = rand.nextFloat() * 15 + 1;
            yAxis = rand.nextFloat() * 15 + 1;
            butt.setX(xAxis);
            butt.setY(yAxis);
//       }
        }

    }
}
