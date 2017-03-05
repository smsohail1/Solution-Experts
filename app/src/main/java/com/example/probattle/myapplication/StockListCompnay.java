package com.example.probattle.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by probattle on 3/4/2017.
 */
public class StockListCompnay extends Activity {
Button google,facebook,microsoft,fetchsky,amazon;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        google= (Button) findViewById(R.id.google);
        facebook= (Button) findViewById(R.id.facebook);
        microsoft= (Button) findViewById(R.id.microsoft);
        fetchsky= (Button) findViewById(R.id.fetchsky);
        amazon= (Button) findViewById(R.id.amazon);
        intent=new Intent(StockListCompnay.this,CompnayDescription.class);

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("position","1");
                startActivity(intent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("position","2");

                startActivity(intent);

            }
        });
        microsoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("position","3");

                startActivity(intent);

            }
        });
        fetchsky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("position","4");

                startActivity(intent);

            }
        });
        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("position","5");

                startActivity(intent);

            }
        });


    }
}
