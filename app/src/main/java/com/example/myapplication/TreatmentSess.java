package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TreatmentSess extends AppCompatActivity {


    RecyclerView recyclerView14;
    List<Versions14> versionsList14;

    private static final  String TAG = "MainActivity";
    EditText mDisplayDate;
    ImageButton display;
    private DatePickerDialog.OnDateSetListener mDateSetListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_treatment_sess );

        getSupportActionBar().hide();


        recyclerView14 = findViewById( R.id.recyclerView14 );
        mDisplayDate = findViewById( R.id.mDisplayDate );
        display = findViewById( R.id.display );
        initData14();
        setRecyclerView14();

        display.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get( Calendar.YEAR );
                int month = cal.get( Calendar.MONTH );
                int day = cal.get( Calendar.DAY_OF_MONTH );


                DatePickerDialog dialog = new DatePickerDialog(
                        TreatmentSess.this,
                        android.R.style.Theme_Holo_Dialog_MinWidth,
                        mDateSetListener,
                        year, month, day );
                dialog.getWindow().setBackgroundDrawable( new ColorDrawable( Color.TRANSPARENT ) );
                dialog.show();


            }
        } );



        mDisplayDate.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get( Calendar.YEAR );
                int month = cal.get( Calendar.MONTH );
                int day = cal.get( Calendar.DAY_OF_MONTH );


                DatePickerDialog dialog = new DatePickerDialog(
                        TreatmentSess.this,
                        android.R.style.Theme_Holo_Dialog_MinWidth,
                        mDateSetListener,
                        year, month, day );
                dialog.getWindow().setBackgroundDrawable( new ColorDrawable( Color.TRANSPARENT ) );
                dialog.show();


            }
        } );

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDateSet: dd/mm/yyy: " + day + "/" + month + "/" +year);
                String date = day + "/" + month + "/" + year;
                mDisplayDate.setText( date );
            }
        };







    }

    private void setRecyclerView14() {
        VersionsAdapter14 versionsAdapter14 = new VersionsAdapter14( versionsList14 );
        recyclerView14.setAdapter( versionsAdapter14 );
        recyclerView14.setHasFixedSize( true );
    }

    private void initData14() {
        versionsList14 = new ArrayList<>();
        versionsList14.add( new Versions14( "TREATMENTS", R.drawable.ic_arrow_drop ) );

    }




}


