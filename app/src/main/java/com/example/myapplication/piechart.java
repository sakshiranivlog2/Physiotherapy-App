package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class piechart extends AppCompatActivity {

    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_piechart );

        pieChart = (PieChart) findViewById( R.id.piechart );

        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);

        pieChart.setDragDecelerationFrictionCoef( 0.99f );

        pieChart.setDrawHoleEnabled( true );
        pieChart.setHoleColor( Color.WHITE );
        pieChart.setTransparentCircleRadius( 61f );

        ArrayList<PieEntry> yValues = new ArrayList<>();

        yValues.add(new PieEntry( 34f, "Bangladesh" ));
        yValues.add(new PieEntry( 23f, "USA" ));
        yValues.add(new PieEntry( 14f, "UK" ));
       // yValues.add(new PieEntry( 35, "India" ));
      //  yValues.add(new PieEntry( 40, "Russia" ));
      //  yValues.add(new PieEntry( 23, "Japan" ));

        Description description = new Description();
        description.setText( "Made By Sakshi" );
        description.setTextSize( 15 );
        pieChart.setDescription( description );

       pieChart.animateY(3000, Easing.EaseInOutCubic);

        PieDataSet dataSet = new PieDataSet( yValues,"Countries" );
        dataSet.setSliceSpace( 3f );
        dataSet.setSelectionShift( 5f );
        dataSet.setColors( ColorTemplate.JOYFUL_COLORS );


        PieData data = new PieData( (dataSet) );
        data.setValueTextSize( 10f );
        data.setValueTextColor( Color.YELLOW );

        pieChart.setData( data );



    }
}
