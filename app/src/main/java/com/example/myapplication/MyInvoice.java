package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MyInvoice extends AppCompatActivity {

    RecyclerView recyclerView19;
    List<Versions19> versionsList19;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_my_invoice );

        getSupportActionBar().hide();

        recyclerView19 = findViewById( R.id.recyclerView19 );
        initData19();
        setRecyclerView19();
    }

        private void setRecyclerView19() {
            VersionsAdapter19 versionsAdapter19 = new VersionsAdapter19(versionsList19);
            recyclerView19.setAdapter( versionsAdapter19);
            recyclerView19.setHasFixedSize( true );
        }


    private void initData19() {
        versionsList19 = new ArrayList<>();
        versionsList19.add( new Versions19( "Add Treatment and Charges",R.drawable.ic_arrow_drop ));

    }
}
