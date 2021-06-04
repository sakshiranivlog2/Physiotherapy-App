package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabLayout;

public class newActivity5 extends AppCompatActivity {


    TabLayout tablayout5;
    ViewPager viewpager5;
    ImageButton i11,i1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_new5 );

        getSupportActionBar().hide();


        tablayout5 = findViewById( R.id.tablayout5 );
        viewpager5 = findViewById( R.id.viewpager5 );
        i11 = findViewById( R.id.i11 );
        i1= findViewById( R.id.i1 );

        ViewPagerAdapter5 adapter5 = new ViewPagerAdapter5( getSupportFragmentManager() );
        adapter5.add( new FragmentRecord(), "EXPENSE ITEMS");
        adapter5.add( new FragmentSavedRecordings(), "TREATMENT ITEMS" );
        viewpager5.setAdapter( adapter5 );
        tablayout5.setupWithViewPager( viewpager5 );

    }


    public void ik(View view) {
        Intent i = new Intent( newActivity5.this,ExpenseItem.class );
        startActivity( i );
    }

    public void io(View view) {
        Intent i = new Intent( newActivity5.this,TreatmentItem.class );
        startActivity( i );
    }

}
