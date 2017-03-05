package com.example.probattle.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by probattle on 3/5/2017.
 */
public class sell extends Activity {
    Button submit;
    TextView textView12;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sell);
        submit= (Button) findViewById(R.id.button2);
        textView12= (TextView) findViewById(R.id.textView12);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView12.setText("Now Your Total Balance is :"+": $50262.36");
            }
        });
    }}
