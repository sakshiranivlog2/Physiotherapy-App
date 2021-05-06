package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ClinicManager extends AppCompatActivity {

    RecyclerView recyclerView17,recyclerView18;
    List<Versions17> versionsList17;
    List<Versions18> versionsList18;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_clinic_manager );

        getSupportActionBar().hide();

        recyclerView17 = findViewById( R.id.recyclerView17 );
        recyclerView18 = findViewById( R.id.recyclerView18 );
        initData17();
        setRecyclerView17();
        initData8();
        setRecyclerView8();


    }

    private void setRecyclerView8() {
        VersionsAdapter18 versionsAdapter18 = new VersionsAdapter18(versionsList18);
        recyclerView18.setAdapter( versionsAdapter18 );
        recyclerView18.setHasFixedSize( true );

    }

    private void initData8() {
        versionsList18 = new ArrayList<>();
        versionsList18.add( new Versions18( R.drawable.appointa,"ADMIN AND OTHERS",R.drawable.ic_arrow_drop ));


    }

    //////////////////////////////////////////////////////////////////////////

    private void setRecyclerView17() {
        VersionsAdapter17 versionsAdapter17 = new VersionsAdapter17( versionsList17);
        recyclerView17.setAdapter( versionsAdapter17 );
        recyclerView17.setHasFixedSize( true );

    }

    private void initData17() {

        versionsList17 = new ArrayList<>( );

        versionsList17.add( new Versions17(  R.drawable.appointa,"PHYSIO STAFF",R.drawable.ic_arrow_drop));


    }
}
