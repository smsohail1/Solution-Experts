package com.example.probattle.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by probattle on 3/5/2017.
 */
public class Buy  extends Activity {
    TextView totalBalance, currentStockRate,afterBuyingText;
    Button submitStock;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy);
        submitStock= (Button) findViewById(R.id.button);
        totalBalance= (TextView) findViewById(R.id.textView2);
        currentStockRate= (TextView) findViewById(R.id.textView4);
        afterBuyingText= (TextView) findViewById(R.id.textView5);

        submitStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afterBuyingText.setText("After Buying Your Total Amount is "+":  $3577.77");
            }
        });
    }
}
