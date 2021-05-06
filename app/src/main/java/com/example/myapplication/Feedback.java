package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Feedback extends AppCompatActivity {

    RecyclerView recyclerView9;
    List<Versions9> versionsList9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_feedback );

        getSupportActionBar().hide();

        recyclerView9 = findViewById( R.id.recyclerView9 );
        initData9();
        setRecyclerView9();
    }

    private void setRecyclerView9() {
        VersionsAdapter9 versionsAdapter9 = new VersionsAdapter9(versionsList9);
        recyclerView9.setAdapter( versionsAdapter9);
        recyclerView9.setHasFixedSize( true );

    }

    private void initData9() {
        versionsList9 = new ArrayList<>();
        versionsList9.add( new Versions9( "Feedback",R.drawable.ic_arrow_drop ));

    }
}
