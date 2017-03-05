package com.example.probattle.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by probattle on 3/4/2017.
 */
public class LineChartGraph extends AppCompatActivity {

    public static final long NOTIFY_INTERVAL = 30 * 1000; // 30 seconds

    // run on another Thread to avoid crash
    private Handler mHandler = new Handler();
    // timer handling
    private Timer mTimer = null;


    LineChart chart;
    ArrayList<Entry> BARENTRY;
    ArrayList<String> BarEntryLabels;
    LineDataSet Bardataset;
    LineData BARDATA;
    int rand;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);
        chart = (LineChart) findViewById(R.id.lineChart);


        BARENTRY = new ArrayList<>();

        BarEntryLabels = new ArrayList<String>();

        AddValuesToBARENTRY();

        AddValuesToBarEntryLabels();

        Bardataset = new LineDataSet(BARENTRY, "Projects");

        BARDATA = new LineData(BarEntryLabels, Bardataset);

        Bardataset.setColors(ColorTemplate.COLORFUL_COLORS);

        chart.setData(BARDATA);

        chart.animateY(3000);


        // cancel if already existed
        if (mTimer != null) {
            mTimer.cancel();
        } else {
            // recreate new
            mTimer = new Timer();
        }
        // schedule task
        mTimer.scheduleAtFixedRate(new TimeDisplayTimerTask(), 0, NOTIFY_INTERVAL);


    }


    class TimeDisplayTimerTask extends TimerTask {

        @Override
        public void run() {
            // run on another thread
            mHandler.post(new Runnable() {

                @Override
                public void run() {
                    Log.i("dsddsaa", "timer");
                    chart.clear();
                    BarEntryLabels.clear();
                    BARENTRY.clear();
                    AddValuesToBARENTRY();

                    AddValuesToBarEntryLabels();
                    Bardataset = new LineDataSet(BARENTRY, "Projects");

                    BARDATA = new LineData(BarEntryLabels, Bardataset);

                    Bardataset.setColors(ColorTemplate.COLORFUL_COLORS);

                    chart.setData(BARDATA);


                }

            });
        }


    }


    public void AddValuesToBARENTRY() {

        for (int i = 0; i < 12; i++) {
            rand = (int) (Math.random() * 50000 + 30000);
            float z = (float) rand;
            BARENTRY.add(new Entry(z, i));

        }

    }

    public void AddValuesToBarEntryLabels() {

        BarEntryLabels.add("January");
        BarEntryLabels.add("February");
        BarEntryLabels.add("March");
        BarEntryLabels.add("April");
        BarEntryLabels.add("May");
        BarEntryLabels.add("June");
        BarEntryLabels.add("July");
        BarEntryLabels.add("August");
        BarEntryLabels.add("September");
        BarEntryLabels.add("Octobar");
        BarEntryLabels.add("November");
        BarEntryLabels.add("December");

    }

}
