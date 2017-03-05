package com.example.probattle.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by probattle on 3/5/2017.
 */
public class CurrentStaus extends ActionBarActivity {
    EditText  acc,email,pass,name;
    Button next;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currentstatus);
        next= (Button) findViewById(R.id.next);
                acc= (EditText) findViewById(R.id.accNo);

        email= (EditText) findViewById(R.id.input_email);
        pass= (EditText) findViewById(R.id.input_password);
        name= (EditText) findViewById(R.id.input_name);
        acc.setEnabled(false);
        pass.setEnabled(false);
        name.setEnabled(false);
        email.setEnabled(false);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CurrentStaus.this,StockListCompnay.class);
                startActivity(i);
            }
        });

    }
}
