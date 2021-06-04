package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class FragmentFinalSavedRecordings25 extends Fragment {

    PieChart pieChart;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate( R.layout.fragment_final_saved_recordings25, container, false );
        pieChart = (PieChart) v.findViewById( R.id.piechart4 );

        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);

        pieChart.setDragDecelerationFrictionCoef( 0.99f );

        pieChart.setDrawHoleEnabled( true );
        pieChart.setHoleColor( Color.WHITE );
        pieChart.setTransparentCircleRadius( 31f );

        ArrayList<PieEntry> yValues = new ArrayList<>();

        yValues.add(new PieEntry( 34f, "Revenue" ));
        yValues.add(new PieEntry( 23f, "Appointment" ));
        yValues.add(new PieEntry( 14f, "Patients" ));

        Description description = new Description();
        description.setText( "Growth Analysis" );
        description.setTextSize( 15 );
        pieChart.setDescription( description );

        pieChart.animateY(3000, Easing.EaseInOutCubic);

        PieDataSet dataSet = new PieDataSet( yValues,"Growth Analysis" );
        dataSet.setSliceSpace( 3f );
        dataSet.setSelectionShift( 5f );
        dataSet.setColors( ColorTemplate.JOYFUL_COLORS );


        PieData data = new PieData( (dataSet) );
        data.setValueTextSize( 10f );
        data.setValueTextColor( Color.RED );

        pieChart.setData( data );


    return v;
    }
}





