package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.RelativeLayout;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class semipie extends AppCompatActivity {

    private PieChart mChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_semipie );


        mChart = (PieChart) findViewById( R.id.chart1 );
        mChart.setBackgroundColor( Color.WHITE );

        moveOffScreen();

        mChart.setUsePercentValues( true );
        mChart.getDescription().setEnabled( false );
        mChart.setDrawHoleEnabled( false );


        mChart.setMaxAngle( 180 );
        mChart.setRotationAngle( 180 );
        mChart.setCenterTextOffset( 0,-20 );
        mChart.animateY( 2000, Easing.EaseInOutCubic );


        Legend l = mChart.getLegend();
        l.setVerticalAlignment( Legend.LegendVerticalAlignment.TOP );
        l.setHorizontalAlignment( Legend.LegendHorizontalAlignment.CENTER);
        l.setOrientation( Legend.LegendOrientation.HORIZONTAL );
        l.setDrawInside( false );
        l.setYOffset( 50f );

        mChart.setEntryLabelColor( Color.WHITE );
        mChart.setEntryLabelTextSize( 12f );



        setData( 4, 100 );

    }

    String[] countries = new String[]{"India","USA","UK","Libya","Cuba"};
    private void setData(int count, int range){

        ArrayList<PieEntry> values = new ArrayList<>(  );

        for (int i=0; i<count; i++){
            float val = (float) ((Math.random()*range)+range/5);
            values.add(new PieEntry( val,countries[i] ));
        }

        PieDataSet dataSet = new PieDataSet( values,"Partner" );
        dataSet.setSelectionShift(5f);
        dataSet.setSliceSpace( 3f );
        dataSet.setColors( ColorTemplate.MATERIAL_COLORS );

        PieData data = new PieData( dataSet );
        data.setValueFormatter( new PercentFormatter(  ) );
        data.setValueTextSize( 15f );
        data.setValueTextColor( Color.WHITE );

        mChart.setData( data );
        mChart.invalidate();


    }

    private void moveOffScreen(){
        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics( metrics );
        int height = metrics.heightPixels;

        int offset = (int) (height*0.2);

        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)mChart.getLayoutParams();
        params.setMargins( 0,0,0,-offset );
        mChart.setLayoutParams( params );





    }
















}
