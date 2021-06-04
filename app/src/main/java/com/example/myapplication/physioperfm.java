package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

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
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ViewPortHandler;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class physioperfm extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    RecyclerView recyclerView20;
    List<Versions20> versionsList20;
    EditText et6;
    ImageButton ib6;
    Button ph;
    LineChart mpLineChart;
    int colorArray[] = {R.color.color1, R.color.color2,R.color.color3,R.color.color4};
    int[] colorClassArray = new int[] {Color.BLUE,Color.CYAN,Color.GREEN,Color.MAGENTA};
    String[] legendName = {"X-axis:No. of patient","Y-axis:Time","X","Y"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_physioperfm );

        getSupportActionBar().hide();

      //////////////////////
        mpLineChart = (LineChart) findViewById( R.id.line_chart6 );
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
        lineDataSet1.setColors(colorArray);



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

        xAxis.setValueFormatter( new linechart.MyAxisValueFormatter() );
        yAxisLeft.setValueFormatter( new linechart.MyAxisValueFormatter() );



        Description description = new Description();
        description.setText( "" );
        description.setTextColor( Color.BLUE );
        description.setTextSize( 20 );
        mpLineChart.setDescription( description );



        LineData data = new LineData( dataSets );
        lineDataSet1.setValueFormatter( new linechart.MyValueFormatter() );
        mpLineChart.setData( data );
        mpLineChart.animateXY(1000,2000, Easing.EaseInOutBounce, Easing.EaseInExpo );
        mpLineChart.invalidate();

        //////////////////////
        ActivityCompat.requestPermissions( this,new String[]{WRITE_EXTERNAL_STORAGE,
                READ_EXTERNAL_STORAGE}, PackageManager.PERMISSION_GRANTED );

        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy( builder.build());



        recyclerView20 = findViewById( R.id.recyclerView20 );
        initData20();
        setRecyclerView20();
        et6 = findViewById( R.id.et6 );
        ib6 = findViewById( R.id.ib6 );
        ph= findViewById( R.id.ph );



        ib6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        } );


        et6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        } );

    }


    private void setRecyclerView20() {
        VersionsAdapter20 versionsAdapter20 = new VersionsAdapter20( versionsList20 );
        recyclerView20.setAdapter( versionsAdapter20 );
        recyclerView20.setHasFixedSize( true );
    }

    private void initData20() {
        versionsList20 = new ArrayList<>();
        versionsList20.add( new Versions20( "Name", R.drawable.ic_arrow_drop ) );

    }


    private void showDatePickerDialog() {

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get( Calendar.YEAR ),
                Calendar.getInstance().get( Calendar.MONTH ),
                Calendar.getInstance().get( Calendar.DAY_OF_MONTH )
        );

        datePickerDialog.show();


    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date = +dayOfMonth + "/" + (month + 1) + "/" + year;
        et6.setText( date );
    }

////////////////////////////////////////////////////////////////////////////////////////////////////

    public void phh(View view)  {


        ph.setVisibility( View.GONE );
        ///////////////////////////////////////////////////////////////////////////////
        View view1 = getWindow().getDecorView().getRootView();
        view1.setDrawingCacheEnabled( true );

        Bitmap bitmap = Bitmap.createBitmap(view1.getDrawingCache());
        // view1.setDrawingCacheEnabled( true );
//////////////////////////////////////////////////////

        Toast.makeText( physioperfm.this,"Download Started...",Toast.LENGTH_SHORT ).show();


        String filePath = Environment.getExternalStorageDirectory()+"/Download/"+ Calendar.getInstance().getTime().toString()
                +".jpg";
        Toast.makeText( physioperfm.this,"Download Completed",Toast.LENGTH_SHORT ).show();


        File fileScreenshot = new File(filePath);

        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream( fileScreenshot );
            bitmap.compress( Bitmap.CompressFormat.JPEG,100,fileOutputStream );
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Intent intent = new Intent( Intent.ACTION_GET_CONTENT );

        Intent intent = new Intent( Intent.ACTION_VIEW );
        Uri uri = Uri.fromFile(fileScreenshot);
        intent.setDataAndType( uri, "image/jpeg" );
        intent.addFlags( Intent.FLAG_ACTIVITY_NEW_TASK );
        //  PendingIntent contentIntent = PendingIntent.getActivity(int context, id, intent,
        //     PendingIntent.FLAG_UPDATE_CURRENT);
        this.startActivity( intent );



    }

    private ArrayList<Entry> dataValues1()
    {
        ArrayList<Entry> dataVals = new ArrayList<Entry>();
        dataVals.add(  new Entry( 0,20 ));
        dataVals.add(  new Entry( 1,24 ));
        dataVals.add(  new Entry( 2,2 ));
        dataVals.add(  new Entry( 3,10));
        dataVals.add(  new Entry( 4,28));
        dataVals.add(  new Entry( 5,20 ));
        dataVals.add(  new Entry( 6,24 ));
        dataVals.add(  new Entry( 7,23 ));
        dataVals.add(  new Entry( 8,10));
        dataVals.add(  new Entry( 9,18));
        dataVals.add(  new Entry( 10,10));
        dataVals.add(  new Entry( 11,5));


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

    private class MyValueFormatter extends ValueFormatter implements IValueFormatter {

        @Override
        public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
            return value + " $";
        }
    }

    private class MyAxisValueFormatter extends ValueFormatter implements IAxisValueFormatter {

        @Override
        public String getFormattedValue(float value, AxisBase axis) {
            axis.setLabelCount(3,true);
            return value + " $";
        }




    }





}
