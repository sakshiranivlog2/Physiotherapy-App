package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    ProgressBar p1;
    int count = 0;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash );

        getSupportActionBar().hide();


        p1 = findViewById( R.id.p1 );

        timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                count++;
                p1.setProgress( count );
                if (count == 100) {
                    timer.cancel();
                }
            }
        };
        timer.schedule( timerTask, 0, 100 );


        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent( SplashActivity.this, MainActivity.class );
                overridePendingTransition( android.R.anim.fade_in, android.R.anim.fade_out );
                startActivity( intent );
                finish();
            }
        }, 1500 );


    }
}
