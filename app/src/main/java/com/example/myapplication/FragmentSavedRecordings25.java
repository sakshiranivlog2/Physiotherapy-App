package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class FragmentSavedRecordings25 extends Fragment {

    BarChart bar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate( R.layout.fragment_saved_recordings25, container, false );

        bar = v.findViewById( R.id.barchart4 );

        hii();
        return v;

    }

    private void hii() {
        ArrayList<BarEntry> information = new ArrayList<>();
        information.add( new BarEntry( 1, 1200 ) );
        information.add( new BarEntry( 2, 1400 ) );
        information.add( new BarEntry( 3, 1800 ) );

        BarDataSet dataSet = new BarDataSet( information, "Revenue Generated per Month");
        dataSet.setColors( ColorTemplate.MATERIAL_COLORS );
        dataSet.setValueTextColor( Color.BLACK );
        dataSet.setValueTextSize( 20f );

        BarData barData = new BarData( dataSet );

        bar.setFitBars( true );
        bar.setData( barData );
        bar.getDescription().setText( "Total Income" );
        bar.animateY( 2000 );



    }


    @Override
    public void onStart() {
        super.onStart();
       hii();
    }
}





