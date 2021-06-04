package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.fragment.app.Fragment;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class FragmentSavedRecordings20 extends Fragment {

    PieChart pieChart;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        getActivity().getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN );

        View v = inflater.inflate( R.layout.fragment_saved_recordings20, container, false );
        pieChart = v.findViewById( R.id.piechart );


        funcpie();

        funcpie2();

        return v;


    }

    private void funcpie2() {
        pieChart.animateY(3000, Easing.EaseInOutCubic);
    }

    private void funcpie() {
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);

        pieChart.setDragDecelerationFrictionCoef( 0.99f );

        pieChart.setDrawHoleEnabled( true );
        pieChart.setHoleColor( Color.WHITE );
        pieChart.setTransparentCircleRadius( 61f );

        ArrayList<PieEntry> yValues = new ArrayList<>();

        yValues.add(new PieEntry( 34f, "Approved" ));
        yValues.add(new PieEntry( 23f, "Cancelled" ));
        yValues.add(new PieEntry( 14f, "Query" ));
        // yValues.add(new PieEntry( 35, "India" ));
        //  yValues.add(new PieEntry( 40, "Russia" ));
        //  yValues.add(new PieEntry( 23, "Japan" ));

        Description description = new Description();
        description.setText( "Total Appointments" );
        description.setTextSize( 15 );
        pieChart.setDescription( description );

        pieChart.animateY(3000, Easing.EaseInOutCubic);
        //  pieChart.animateXY(2000,2000);
     //   pieChart.invalidate();
        pieChart.animateXY(1000, 1000,Easing.EaseInOutCubic,Easing.EaseInOutCubic );

        PieDataSet dataSet = new PieDataSet( yValues,"Appointments" );
        dataSet.setSliceSpace( 3f );
        dataSet.setSelectionShift( 5f );
        dataSet.setColors( ColorTemplate.JOYFUL_COLORS );


        PieData data = new PieData( (dataSet) );
        data.setValueTextSize( 10f );
        data.setValueTextColor( Color.YELLOW );

        pieChart.setData( data );


    }





    }








