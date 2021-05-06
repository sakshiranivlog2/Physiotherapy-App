package com.example.myapplication;


import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CancelPage2 extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {


    EditText et10;
    ImageButton ib10;
    RecyclerView recyclerView11;
    List<Versions11> versionsList11;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cancel_page2 );

        getSupportActionBar().hide();

        recyclerView11 = findViewById( R.id.recyclerView11 );
        et10 = findViewById( R.id.et10 );
        ib10 = findViewById( R.id.ib10 );



        ib10.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        } );


        et10.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        } );
        setRecyclerView11();
        initData11();



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
        et10.setText( date );
    }








    private void setRecyclerView11() {
        versionsList11 = new ArrayList<>();
        versionsList11.add( new Versions11( "Cancelled Appointments", R.drawable.ic_arrow_drop ) );

    }

    private void initData11() {

        VersionsAdapter11 versionsAdapter11 = new VersionsAdapter11(versionsList11);
        recyclerView11.setAdapter( versionsAdapter11);
        recyclerView11.setHasFixedSize( true );
    }



    }


