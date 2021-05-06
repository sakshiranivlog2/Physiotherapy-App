package com.example.myapplication;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.Calendar;

public class Appointedlist extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    EditText at5;
    ImageButton ib5;

    TabLayout tablayout;
    ViewPager viewpager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_appointedlist );

        getSupportActionBar().hide();


        tablayout = findViewById( R.id.tablayout );
        viewpager = findViewById( R.id.viewpager );
        at5 = findViewById( R.id.at5 );
        ib5 = findViewById( R.id.ib5 );

        ViewPagerAdapter adapter = new ViewPagerAdapter( getSupportFragmentManager() );
        adapter.add( new FragmentRecord(), "OPD Patients");
        adapter.add( new FragmentSavedRecordings(), "Home Patients" );
        viewpager.setAdapter( adapter );
        tablayout.setupWithViewPager( viewpager );


        ib5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        } );


/////////////////////////////////////////////////////////////////////////////////////////////////////////
        at5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        } );

    }

    private void showDatePickerDialog(){

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
        );

        datePickerDialog.show();


    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
       String date = + dayOfMonth + "/" + (month + 1) + "/" + year;
        at5.setText( date );
    }



    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////





    }


