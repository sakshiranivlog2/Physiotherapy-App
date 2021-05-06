package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Bills extends AppCompatActivity  {


    EditText et8;
    ImageButton ib8;
    TabLayout tablayout;
    ViewPager viewpager;
    Calendar c;
    DatePickerDialog dpd;
    RecyclerView recyclerView15;
    List<Versions15> versionsList15;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_bills );

        getSupportActionBar().hide();

        recyclerView15 = findViewById( R.id.recyclerView15);
        initData15();
        setRecyclerView15();


        et8 = findViewById( R.id.et8);
        ib8 = findViewById( R.id.ib8 );


        tablayout = findViewById( R.id.tablayout );
        viewpager = findViewById( R.id.viewpager );


        ViewPagerAdapter6 adapter = new ViewPagerAdapter6( getSupportFragmentManager() );
        adapter.add( new FragmentRecord6(), "OPD Patients");
        adapter.add( new FragmentSavedRecordings6(), "Home Patients" );
        viewpager.setAdapter( adapter );
        tablayout.setupWithViewPager( viewpager );




        ib8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c = Calendar.getInstance();
                int day = c.get( Calendar.DAY_OF_MONTH );
                int month = c.get( Calendar.MONTH );
                int year = c.get( Calendar.YEAR );

                dpd = new DatePickerDialog( Bills.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int mYear, int mMonth, int mDay) {
                        et8.setText( mDay + "/" + (mMonth+1) + "/" + mYear );

                    }
                } , day, month, year);
                dpd.show();

            }
        } );

        et8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c = Calendar.getInstance();
                int day = c.get( Calendar.DAY_OF_MONTH );
                int month = c.get( Calendar.MONTH );
                int year = c.get( Calendar.YEAR );

                dpd = new DatePickerDialog( Bills.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int mYear, int mMonth, int mDay) {
                        et8.setText( mDay + "/" + (mMonth+1) + "/" + mYear );

                    }
                } , day, month, year);
                dpd.show();

            }
        } );






    }

    private void setRecyclerView15() {
        VersionsAdapter15 versionsAdapter15 = new VersionsAdapter15(versionsList15);
        recyclerView15.setAdapter( versionsAdapter15);
        recyclerView15.setHasFixedSize( true );
    }

    private void initData15() {
        versionsList15 = new ArrayList<>();
        versionsList15.add( new Versions15( "Expense",R.drawable.ic_arrow_drop ));
        versionsList15.add( new Versions15( "Income",R.drawable.ic_arrow_drop ));

    }





}
