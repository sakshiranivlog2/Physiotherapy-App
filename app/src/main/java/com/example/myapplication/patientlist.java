package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabLayout;

import java.util.Calendar;

public class patientlist extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    EditText at5;
    ImageButton ib5;
    TabLayout tablayout27;
    ViewPager viewpager27;
    CardView c3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_patientlist );

        getSupportActionBar().hide();

        tablayout27 = findViewById( R.id.tablayout27 );
        viewpager27 = findViewById( R.id.viewpager27 );
        at5 = findViewById( R.id.at5 );
        ib5 = findViewById( R.id.ib5 );
        c3 = findViewById( R.id.c3 );

        ViewPagerAdapter27 adapter27 = new ViewPagerAdapter27( getSupportFragmentManager() );
        adapter27.add( new FragmentRecord27(), "OPD Patients");
        adapter27.add( new FragmentFinalSavedRecordings27(), "Home Patients" );
        viewpager27.setAdapter( adapter27 );
        tablayout27.setupWithViewPager( viewpager27 );




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


    public void hh(View view) {
        Intent i = new Intent(patientlist.this,clinictoday.class);
        startActivity( i );
    }
}
