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

public class ApprovePatient extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    EditText et6;
    ImageButton ib6;
    RecyclerView recyclerView12;
    List<Versions12> versionsList12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_approve_patient );

        getSupportActionBar().hide();

        recyclerView12 = findViewById( R.id.recyclerView12);
        initData12();
        setRecyclerView12();

        et6 = findViewById( R.id.et6 );
        ib6 = findViewById( R.id.ib6 );

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

    private void setRecyclerView12() {
        VersionsAdapter12 versionsAdapter12 = new VersionsAdapter12(versionsList12);
        recyclerView12.setAdapter( versionsAdapter12);
        recyclerView12.setHasFixedSize( true );
    }

    private void initData12() {
        versionsList12 = new ArrayList<>();
        versionsList12.add( new Versions12( "Approved Appointments",R.drawable.ic_arrow_drop ));

    }




/////////////////////////////////////////////////////////////////////////////////////////////////////////



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
        et6.setText( date );
    }










}