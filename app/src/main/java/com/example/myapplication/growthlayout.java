package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class growthlayout extends AppCompatActivity {

    Button launch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_growthlayout );

        getSupportActionBar().hide();

        launch = findViewById( R.id.launch );
    }

    public void ll(View view) {
        Intent i = new Intent( growthlayout.this, GrowthChart.class );
        startActivity( i );
    }
}
