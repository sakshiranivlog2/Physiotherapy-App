package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.transition.TransitionInflater;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

import static com.github.mikephil.charting.animation.Easing.EaseInOutCubic;

public class FragmentFinalSavedRecordings21 extends Fragment {

    private PieChart mChart3;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      //  TransitionInflater inflater1 = TransitionInflater.from( requireContext() );

        View v = inflater.inflate( R.layout.fragment_final_saved_recordings21, container, false );


        mChart3 = (PieChart) v.findViewById( R.id.chart3 );
        mChart3.setBackgroundColor( Color.WHITE );

        moveOffScreen();

        mChart3.setUsePercentValues( true );
        mChart3.getDescription().setEnabled( false );
        mChart3.setDrawHoleEnabled( false );



        mChart3.setMaxAngle( 180 );
        mChart3.setRotationAngle( 180 );
        mChart3.setCenterTextOffset( 0,-20 );
        mChart3.animateY( 2000, Easing.EaseInOutCubic );


        Legend l = mChart3.getLegend();
        l.setVerticalAlignment( Legend.LegendVerticalAlignment.TOP );
        l.setHorizontalAlignment( Legend.LegendHorizontalAlignment.CENTER);
        l.setOrientation( Legend.LegendOrientation.HORIZONTAL );
        l.setDrawInside( false );
        l.setYOffset( 50f );

        mChart3.setEntryLabelColor( Color.WHITE );
        mChart3.setEntryLabelTextSize( 12f );



        setData( 2, 100 );

        return v;

    }



    String[] expense = new String[]{"Electricity","Water"};
    private void setData(int count, int range){

        ArrayList<PieEntry> values = new ArrayList<>(  );

        for (int i=0; i<count; i++){
            float val = (float) ((Math.random()*range)+range/5);
            values.add(new PieEntry( val,expense[i] ));
        }

        PieDataSet dataSet = new PieDataSet( values,"Total Expense" );
        dataSet.setSelectionShift(5f);
        dataSet.setSliceSpace( 3f );
        dataSet.setColors( ColorTemplate.MATERIAL_COLORS );

        PieData data = new PieData( dataSet );
        data.setValueFormatter( new PercentFormatter(  ) );
        data.setValueTextSize( 15f );
        data.setValueTextColor( Color.WHITE );

        mChart3.setData( data );
        mChart3.invalidate();


    }

    private void moveOffScreen(){
        Display display = getActivity().getWindowManager().getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics( metrics );
        int height = metrics.heightPixels;

        int offset = (int) (height*0.2);

        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)mChart3.getLayoutParams();
        params.setMargins( 0,0,0,-offset );
        mChart3.setLayoutParams( params );

    }

    @Override
    public void onResume() {
        super.onResume();
        mChart3.animateY( 2000, Easing.EaseInOutCubic );
    }

    @Override
    public void onStart() {
        super.onStart();
        mChart3.animateY( 2000, Easing.EaseInOutCubic );
    }
}








