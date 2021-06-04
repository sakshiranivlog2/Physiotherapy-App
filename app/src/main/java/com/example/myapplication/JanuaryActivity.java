package com.example.myapplication;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class JanuaryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Versions> versionsList;

    FloatingActionButton bt_float2,bt_jj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_january );

        getSupportActionBar().hide();

        recyclerView = findViewById( R.id.recyclerView );
        bt_float2 = findViewById( R.id.bt_float2 );
        bt_jj = findViewById( R.id.bt_jj );
        initData();
        setRecyclerView();


    }

    public void addapp(View view) {
        Intent i = new Intent( JanuaryActivity.this,AddPatient2.class );
        startActivity( i );
    }

    public void kii(View view) {
        Intent i = new Intent( JanuaryActivity.this,AprilActivity.class );
        startActivity( i );
    }



    private void setRecyclerView() {
        VersionsAdapter versionsAdapter = new VersionsAdapter( versionsList );
        recyclerView.setAdapter( versionsAdapter );
        recyclerView.setHasFixedSize( true );

    }

    private void initData() {

        versionsList = new ArrayList<>(  );

        versionsList.add( new Versions( R.drawable.incc,"Income","Rs.0",R.drawable.ic_arrow_drop ) );
        versionsList.add( new Versions( R.drawable.appointl,"Appointments","0",R.drawable.ic_arrow_drop) );
        versionsList.add( new Versions( R.drawable.list,"Patients","0",R.drawable.ic_arrow_drop ) );
        versionsList.add( new Versions( R.drawable.excc,"Expense","Rs.0",R.drawable.ic_arrow_drop ) );


    }
}
