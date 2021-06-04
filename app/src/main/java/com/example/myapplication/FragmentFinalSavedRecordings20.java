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

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;

import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;

import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Objects;

public class FragmentFinalSavedRecordings20 extends Fragment {

    BarChart mChart1;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         View v = inflater.inflate( R.layout.fragment_final_saved_recordings20, container, false );

        MultipalColor(v);

        return v;

    }

    public void MultipalColor(View v) {
        mChart1 = v.findViewById( R.id.bar_chart1 );

        mChart1.getDescription().setEnabled( false );

        // if more than 60 entries are displayed in the chart, no values will be
        // drawn
        mChart1.setMaxVisibleValueCount( 40 );

        // scaling can now only be done on x- and y-axis separately
        mChart1.setPinchZoom( false );
        mChart1.animateY( 2000 );

        mChart1.setDrawGridBackground( false );
        mChart1.setDrawBarShadow( false );

        mChart1.setDrawValueAboveBar( false );
        mChart1.setHighlightFullBarEnabled( false );

        // change the position of the y-labels
        YAxis leftAxis = mChart1.getAxisLeft();
        leftAxis.setValueFormatter( new MyAxisValueFormatter() );
        leftAxis.setAxisMinimum( 0f ); // this replaces setStartAtZero(true)
        mChart1.getAxisRight().setEnabled( false );

        XAxis xLabels = mChart1.getXAxis();
        xLabels.setPosition( XAxis.XAxisPosition.TOP );

        // chart.setDrawXLabels(false);
        // chart.setDrawYLabels(false);

        // setting data;

        Legend l = mChart1.getLegend();
        l.setVerticalAlignment( Legend.LegendVerticalAlignment.BOTTOM );
        l.setHorizontalAlignment( Legend.LegendHorizontalAlignment.RIGHT );
        l.setOrientation( Legend.LegendOrientation.HORIZONTAL );
        l.setDrawInside( false );
        l.setFormSize( 8f );
        l.setFormToTextSpace( 4f );
        l.setXEntrySpace( 6f );

        ArrayList<BarEntry> yVals1 = new ArrayList<BarEntry>();

        for (int i = 0; i < 2+ 1; i++) {
            float mult = (60);
            float val1 = (float) (Math.random() * mult) + mult / 3;
            float val2 = (float) (Math.random() * mult) + mult / 3;
            float val3 = (float) (Math.random() * mult) + mult / 3;

            yVals1.add( new BarEntry( i,
                    new float[]{val1, val2, val3},
                    getResources().getDrawable( R.drawable.ic_logout) ) );
        }

        BarDataSet set1;

        if (mChart1.getData() != null &&
                mChart1.getData().getDataSetCount() > 0) {
            set1 = (BarDataSet) mChart1.getData().getDataSetByIndex( 0 );
            set1.setValues( yVals1 );
            mChart1.getData().notifyDataChanged();
            mChart1.notifyDataSetChanged();
        } else {
            set1 = new BarDataSet( yVals1, "Bar1-Home,Bar2-Clinic" );
            set1.setDrawIcons( false );
            set1.setColors( getColors() );
            set1.setStackLabels( new String[]{"Knee Pain","Headache ","MusclePain"} );

            ArrayList<IBarDataSet> dataSets = new ArrayList<IBarDataSet>();
            dataSets.add( set1 );

            BarData data = new BarData( dataSets );
            data.setValueFormatter( new MyAxisValueFormatter() );
            data.setValueTextColor( Color.WHITE );

            mChart1.setData( data );
        }

        mChart1.setFitBars( true );
        mChart1.invalidate();


    }

    private int[] getColors() {

        // have as many colors as stack-values per entry
        int[] colors = new int[3];

        System.arraycopy( ColorTemplate.MATERIAL_COLORS, 0, colors, 0, 3 );

        return colors;
    }

}








