package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ViewPortHandler;

import java.util.ArrayList;

public class linechart extends AppCompatActivity {

    LineChart mpLineChart;
    int colorArray[] = {R.color.color1, R.color.color2,R.color.color3,R.color.color4};
    int[] colorClassArray = new int[] {Color.BLUE,Color.CYAN,Color.GREEN,Color.MAGENTA};
    String[] legendName = {"Cow","Dog","Cat","Rat"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_linechart );

        mpLineChart = (LineChart) findViewById( R.id.line_chart );
        LineDataSet lineDataSet1 = new LineDataSet( dataValues1(), "Data Set 1" );
        LineDataSet lineDataSet2 = new LineDataSet( dataValues1(), "Data Set 2" );
        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(lineDataSet1  );
        dataSets.add(lineDataSet2  );

        //mpLineChart.setBackgroundColor( Color.GREEN );
        mpLineChart.setNoDataText( "No Data" );
        mpLineChart.setNoDataTextColor( Color.BLUE );

        mpLineChart.setDrawGridBackground( true );
        mpLineChart.setDrawBorders( true );
        mpLineChart.setBorderColor( Color.RED );
       // mpLineChart.setBorderWidth( 5 );

        lineDataSet1.setLineWidth( 4 );
        lineDataSet1.setColor(Color.RED);
        lineDataSet1.setDrawCircles( true );
        lineDataSet1.setDrawCircleHole( true );
        lineDataSet1.setCircleColor( Color.GRAY );
        lineDataSet1.setCircleHoleColor( Color.GREEN );
        lineDataSet1.setCircleRadius( 10 );
        lineDataSet1.setCircleHoleRadius( 5 );
        lineDataSet1.setValueTextSize( 10 );
        lineDataSet1.setValueTextColor( Color.BLUE );
       // lineDataSet1.enableDashedLine( 5,10,0 );
        lineDataSet1.setColors(colorArray, linechart.this);



        Legend legend = mpLineChart.getLegend();

        legend.setEnabled( true );
        legend.setTextColor( Color.RED );
        legend.setTextSize( 15 );
        legend.setForm( Legend.LegendForm.LINE );
        legend.setFormSize( 20 );
        legend.setXEntrySpace( 15 );
        legend.setFormToTextSpace( 10 );

        LegendEntry[] legendEntries = new LegendEntry[4];
        for(int i=0; i<legendEntries.length; i++){

            LegendEntry entry = new LegendEntry(  );
            entry.formColor = colorClassArray[i];
            entry.label = String.valueOf(legendName[i]);
            legendEntries[i] = entry;
        }

        legend.setCustom( legendEntries );


        XAxis xAxis = mpLineChart.getXAxis();
        YAxis yAxisLeft = mpLineChart.getAxisLeft();
        YAxis yAxisRight = mpLineChart.getAxisRight();

        xAxis.setValueFormatter( new MyAxisValueFormatter() );
        yAxisLeft.setValueFormatter( new MyAxisValueFormatter() );



        Description description = new Description();
        description.setText( "Zoo" );
        description.setTextColor( Color.BLUE );
        description.setTextSize( 20 );
        mpLineChart.setDescription( description );



        LineData data = new LineData( dataSets );
        lineDataSet1.setValueFormatter( new MyValueFormatter() );
        mpLineChart.setData( data );
        mpLineChart.animateXY(5000,4000, Easing.EaseInOutBounce, Easing.EaseInExpo );
        mpLineChart.invalidate();
    }

    private ArrayList<Entry> dataValues1()
    {
        ArrayList<Entry> dataVals = new ArrayList<Entry>();
        dataVals.add(  new Entry( 0,20 ));
        dataVals.add(  new Entry( 1,24 ));
        dataVals.add(  new Entry( 2,2 ));
        dataVals.add(  new Entry( 3,10));
        dataVals.add(  new Entry( 4,28));


        return dataVals;
    }

    private ArrayList<Entry> dataValues2()
    {
        ArrayList<Entry> dataVals = new ArrayList<Entry>();
        dataVals.add(  new Entry( 0,12 ));
        dataVals.add(  new Entry( 2,16 ));
        dataVals.add(  new Entry( 3,23 ));
        dataVals.add(  new Entry( 5,1));
        dataVals.add(  new Entry( 7,18));


        return dataVals;
    }

    static class MyValueFormatter extends ValueFormatter implements IValueFormatter{

        @Override
        public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
            return value + " $";
        }
    }

    static class MyAxisValueFormatter extends ValueFormatter implements IAxisValueFormatter {

        @Override
        public String getFormattedValue(float value, AxisBase axis) {
            axis.setLabelCount(3,true);
            return value + " $";
        }
    }


}
