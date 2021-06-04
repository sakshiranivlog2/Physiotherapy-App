package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;

import java.util.ArrayList;

public class area2 extends AppCompatActivity {

    LineChart lineChart5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_area2 );

        lineChart5 = findViewById( R.id.lineChart5 );

        ArrayList<String> xAXES = new ArrayList<>();
        ArrayList<String> yAXESsin = new ArrayList<>();
        ArrayList<String> yAXEScos = new ArrayList<>();
        double x = 0;
        int numDataPoints = 1000;
        for(int i=0; i<numDataPoints; i++){
            float sinFunction = Float.parseFloat( String.valueOf( Math.sin(x) ) );
        }





    }
}
