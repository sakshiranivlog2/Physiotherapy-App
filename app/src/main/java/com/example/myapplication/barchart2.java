package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class barchart2 extends AppCompatActivity {

    BarChart bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_barchart2 );


        bar = findViewById( R.id.barchart );

        ArrayList<BarEntry> information = new ArrayList<>( );
        information.add( new BarEntry( 2010,1000 ) );
        information.add( new BarEntry( 2011,1200 ) );
        information.add( new BarEntry( 2012,1400 ) );
        information.add( new BarEntry( 2013,1600 ) );
        information.add( new BarEntry( 2014,1700 ) );

        BarDataSet dataSet= new BarDataSet( information,"Report" );
        dataSet.setColors( ColorTemplate.MATERIAL_COLORS );
        dataSet.setValueTextColor( Color.BLACK );
        dataSet.setValueTextSize( 20f );

        BarData barData = new BarData( dataSet );

        bar.setFitBars( true );
        bar.setData( barData );
        bar.getDescription().setText( "Bar Report Demo" );
        bar.animateY( 2000 );


    }
}