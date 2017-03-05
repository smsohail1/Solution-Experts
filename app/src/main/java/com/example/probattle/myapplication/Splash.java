package com.example.probattle.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;

/**
 * Created by probattle on 3/4/2017.
 */
public class Splash extends Activity {
ImageView splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splach);
        splash= (ImageView) findViewById(R.id.splach);
        final Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        splash.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                animation.cancel();
                Intent i=new Intent(Splash.this,CurrentStaus.class);
                startActivity(i);
                finish();
            }
        },5000);
    }

}



