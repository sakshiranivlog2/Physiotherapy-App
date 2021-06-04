package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MyMaster extends AppCompatActivity {

    ImageButton i1,i2,i3,i4,i5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_my_master );

        getSupportActionBar().hide();

        i1 = findViewById( R.id.i1 );
        i2  = findViewById( R.id.i2 );
        i3 = findViewById( R.id.i3 );
        i4 = findViewById( R.id.i4);
        i5 = findViewById( R.id.i5);

    }

    public void ii(View view) {
        Intent i = new Intent(MyMaster.this,newActivity.class);
        startActivity( i );
    }

    public void n2(View view) {
        Intent i = new Intent(MyMaster.this,newActivity2.class);
        startActivity( i );
    }

    public void n3(View view) {
        Intent i = new Intent(MyMaster.this,newActivity3.class);
        startActivity( i );
    }

    public void n4(View view) {
        Intent i = new Intent(MyMaster.this,newActivity4.class);
        startActivity( i );
    }

    public void n5(View view) {
        Intent i = new Intent(MyMaster.this,newActivity5.class);
        startActivity( i );
    }










}
