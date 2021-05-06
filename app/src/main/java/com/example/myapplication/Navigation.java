package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class Navigation extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_navigation );


        drawerLayout = findViewById( R.id.drawer_layout );
    }

    public void ClickMenu(View view){

        openDrawer(drawerLayout);

    }

    static void openDrawer(DrawerLayout drawerLayout) {

        drawerLayout.openDrawer( GravityCompat.START );

    }

    public void ClickLogo(View view){

        closeDrawer(drawerLayout);

    }

    public static void closeDrawer(DrawerLayout drawerLayout) {

        if (drawerLayout.isDrawerOpen( GravityCompat.START )){
            drawerLayout.closeDrawer( GravityCompat.START );

        }

    }


    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer( drawerLayout );
    }
}
