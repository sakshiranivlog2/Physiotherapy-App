package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Adapter.Adapter;
import com.example.myapplication.Adapter.Versionsaddd;

import java.util.ArrayList;
import java.util.List;

public class MarsActivity extends AppCompatActivity {

    RecyclerView recyclerView3;
    List<Versionsaddd> versionsList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_mars );

        getSupportActionBar().hide();

        recyclerView3 = findViewById( R.id.recyclerView3);
        initData();
        setRecyclerView();


    }

    private void setRecyclerView() {
        Adapter versionsAdapter = new Adapter( versionsList );
        recyclerView3.setAdapter( versionsAdapter );
        recyclerView3.setHasFixedSize( true );

    }

    private void initData() {

        versionsList = new ArrayList<>(  );

        versionsList.add( new Versionsaddd( R.drawable.list,"Select from Patients list",R.drawable.ic_arrow_drop ) );
        versionsList.add( new Versionsaddd( R.drawable.appointa,"Add New Patient",R.drawable.ic_arrow_drop) );
        versionsList.add( new Versionsaddd( R.drawable.pna,"Physio Name",R.drawable.ic_arrow_drop ) );
        versionsList.add( new Versionsaddd( R.drawable.date,"Choose Date",R.drawable.ic_arrow_drop ) );
        versionsList.add( new Versionsaddd( R.drawable.dat,"Choose Time",R.drawable.ic_arrow_drop ) );


    }
}
