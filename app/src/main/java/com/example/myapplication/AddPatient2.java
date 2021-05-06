package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Calendar;

public class AddPatient2 extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{


    EditText etDate;
    ImageButton ib1;
    Button submit;
    DatePickerDialog.OnDateSetListener setListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_add_patient2 );

        getSupportActionBar().hide();

        etDate = findViewById( R.id.et_date6 );
        submit = findViewById( R.id.submit );
        ib1 = findViewById( R.id.ib1 );
        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR );
        final int month = calendar.get(Calendar.MONTH );
        final int day = calendar.get(Calendar.DAY_OF_MONTH);


        ib1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        } );


/////////////////////////////////////////////////////////////////////////////////////////////////////////
        etDate.setOnClickListener( new View.OnClickListener() {
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
        //  String date = "month/day/year: " + month + "/" + dayOfMonth + "/" + year;
        //  String date = + month + "/" + dayOfMonth + "/" + year;
        String date = + dayOfMonth + "/" + (month + 1) + "/" + year;
        etDate.setText( date );
    }

    }


