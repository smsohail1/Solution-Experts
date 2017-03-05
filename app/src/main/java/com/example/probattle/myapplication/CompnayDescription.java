package com.example.probattle.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by probattle on 3/4/2017.
 */
public class CompnayDescription extends Activity {
    ImageView companyLogo;
    TextView desc, avgStock;
    String position;
    Button bar, lineChart;
    Button barChartDesc, LineChartDesc;

    int rand;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);
        companyLogo = (ImageView) findViewById(R.id.companyLogo);
        desc = (TextView) findViewById(R.id.desc);
        avgStock = (TextView) findViewById(R.id.avgStock);
        bar = (Button) findViewById(R.id.bar);
        lineChart = (Button) findViewById(R.id.LineChart);

        barChartDesc = (Button) findViewById(R.id.barChartDesc);

        LineChartDesc = (Button) findViewById(R.id.LineChartDesc);


        bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CompnayDescription.this, Buy.class);
                startActivity(intent);
            }
        });

        lineChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompnayDescription.this, sell.class);
                startActivity(intent);
            }
        });


        barChartDesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompnayDescription.this, BarChartActivity.class);
                startActivity(intent);
            }
        });

        LineChartDesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompnayDescription.this, LineChartGraph.class);
                startActivity(intent);
            }
        });


        Intent i = getIntent();
        position = i.getStringExtra("position");
        Log.i("aa", position + "");
        if (position.equalsIgnoreCase("1")) {
            companyLogo.setImageResource(R.drawable.google);
            desc.setText(
                    "Google is an American multinational technology company specializing in Internet-related services and products." +
                            " These include online advertising technologies, search, cloud computing, software, and hardware");
            avgStock.setText("34455.4");

        } else if (position.equalsIgnoreCase("2")) {
            companyLogo.setImageResource(R.drawable.facebook);
            desc.setText("Facebook is an American for-profit corporation and online social media and social networking service based in Menlo Park, California. Wikipedia");
            avgStock.setText("2322.2");

        } else if (position.equalsIgnoreCase("3")) {
            companyLogo.setImageResource(R.drawable.microsoft);
            desc.setText("Microsoft Corporation /ˈmaɪkrəˌsɒft, -roʊ-, -ˌsɔːft/ is an American multinational technology company headquartered in Redmond, Washington, that develops, manufactures, licenses.");
            avgStock.setText("3222.4");

        } else if (position.equalsIgnoreCase("4")) {
            companyLogo.setImageResource(R.drawable.fetchsky);
            desc.setText("Amazon.com, also called Amazon, is an American electronic commerce and cloud computing company that was founded on July 5, 1994 by Jeff Bezos and is based in Seattle, Washington");
            avgStock.setText("1112.2");

        } else if (position.equalsIgnoreCase("5")) {
            companyLogo.setImageResource(R.drawable.amzon);
            desc.setText("Amazon.com, also called Amazon, is an American electronic commerce and cloud computing company that was founded on July 5, 1994 by Jeff Bezos and is based in Seattle, Washington. Wikipedia.");
            avgStock.setText("34344.2");

        }


    }


}