package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class Notification extends AppCompatActivity {

    TabLayout tablayout7,tablayout8;
    ViewPager viewpager7,viewpager8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_notification );

        getSupportActionBar().hide();

        tablayout7 = findViewById( R.id.tablayout7 );
        viewpager7 = findViewById( R.id.viewpager7 );
        tablayout8 = findViewById( R.id.tablayout8 );
        viewpager8 = findViewById( R.id.viewpager8 );



        ViewPagerAdapter7 adapter = new ViewPagerAdapter7( getSupportFragmentManager() );
        adapter.add( new FragmentRecord7(), "Physio Staff");
        adapter.add( new FragmentSavedRecordings7(), "Received" );
        adapter.add( new FragmentSeven(), "Sent" );
        viewpager7.setAdapter( adapter );
        tablayout7.setupWithViewPager( viewpager7 );

        ViewPagerAdapter8 adapter1 = new ViewPagerAdapter8( getSupportFragmentManager() );
        adapter1.add( new FragmentRecord8(), "Patients");
        adapter1.add( new FragmentSavedRecordings8(), "Received" );
        adapter1.add( new FragmentEight(), "Sent" );
        viewpager8.setAdapter( adapter1 );
        tablayout8.setupWithViewPager( viewpager8 );




    }
}
