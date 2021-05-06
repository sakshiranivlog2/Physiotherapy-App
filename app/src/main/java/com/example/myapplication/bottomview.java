package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class bottomview extends AppCompatActivity {

    FloatingActionButton bt_float2,bt_jj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_bottomview );

        getSupportActionBar().hide();

        bt_float2 = findViewById( R.id.bt_float2 );
        bt_jj = findViewById( R.id.bt_jj );
    }

    public void addapp(View view) {
        Intent i = new Intent( bottomview.this,AddPatient2.class );
        startActivity( i );
    }

    public void kii(View view) {
        Intent i = new Intent( bottomview.this,AprilActivity.class );
        startActivity( i );
    }
}
