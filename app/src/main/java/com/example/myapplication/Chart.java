package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chart extends AppCompatActivity {

    Button b1,p1,l1,s1,h1,ha,hb,pp,mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_chart );

        b1 = findViewById( R.id.b1 );
        p1= findViewById( R.id.p1 );
        l1= findViewById( R.id.l1 );
        s1= findViewById( R.id.s1 );
        h1= findViewById( R.id.h1 );
        ha= findViewById( R.id.ha);
        hb= findViewById( R.id.hb );
        pp= findViewById( R.id.pp);
        mp= findViewById( R.id.mp );
    }

    public void b11(View view) {
        Intent i = new Intent( Chart.this,barchart2.class );
        startActivity( i );
    }

    public void p11(View view) {
        Intent i = new Intent( Chart.this,piechart.class );
        startActivity( i );
    }

    public void l11(View view) {
        Intent i = new Intent( Chart.this,linechart.class );
        startActivity( i );
    }

    public void s11(View view) {
        Intent i = new Intent( Chart.this,stackedchart.class );
        startActivity( i );
    }

    public void h11(View view) {
        Intent i = new Intent( Chart.this,semipie.class );
        startActivity( i );
    }

    public void haa(View view) {
        Intent i = new Intent( Chart.this,HealthReport.class );
        startActivity( i );
    }

    public void hbb(View view) {
        Intent i = new Intent( Chart.this,Financereport.class );
        startActivity( i );
    }

    public void ppc(View view)  {
        Intent i = new Intent( Chart.this,physioperfm.class );
    startActivity( i );
}

    public void mpc(View view) {
        Intent i = new Intent( Chart.this,marketingreport.class );
        startActivity( i );
        }
}
