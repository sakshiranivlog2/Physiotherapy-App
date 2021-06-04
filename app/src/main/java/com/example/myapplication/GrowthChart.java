package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.viewpager.widget.ViewPager;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class GrowthChart extends AppCompatActivity {

    TabLayout tablayout25;
    ViewPager viewpager25;
    TextView selectedTvp;
    ImageButton showMenuBtnp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_growth_chart );


        getSupportActionBar().hide();

        tablayout25 = findViewById( R.id.tablayout25 );
        viewpager25 = findViewById( R.id.viewpager25 );
        selectedTvp = findViewById( R.id.selectedTvp );
        showMenuBtnp = findViewById( R.id.showMenuBtnp );


        final PopupMenu popupMenu90 = new PopupMenu( this, showMenuBtnp );

        popupMenu90.getMenuInflater().inflate( R.menu.growth_popup, popupMenu90.getMenu() );
        popupMenu90.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id == R.id.copy1) {

                    selectedTvp.setText( "1 month" );


                } else if (id == R.id.copy2) {
                    selectedTvp.setText( "3 months" );


                } else if (id == R.id.copy3) {
                    selectedTvp.setText( "6 months" );


                } else if (id == R.id.copy4) {
                    selectedTvp.setText( "9 months" );


                } else if (id == R.id.copy5) {
                    selectedTvp.setText( "12 months" );


                }
                return false;
            }
        } );


        showMenuBtnp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu90.show();


            }
        } );



        ViewPagerAdapter25 adapter25 = new ViewPagerAdapter25( getSupportFragmentManager() );
        adapter25.add( new FragmentRecord25(), "Patient" );
        adapter25.add( new FragmentFinalSavedRecordings25(), "Growth" );
        adapter25.add( new FragmentSavedRecordings25(), "Revenue" );
        viewpager25.setAdapter( adapter25 );
        tablayout25.setupWithViewPager( viewpager25 );

    }
}