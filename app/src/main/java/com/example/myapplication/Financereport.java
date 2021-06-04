package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.mikephil.charting.animation.Easing;
import com.google.android.material.tabs.TabLayout;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URISyntaxException;
import java.util.Calendar;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class Financereport extends AppCompatActivity {

    TabLayout tablayout21;
    ViewPager viewpager21;
    Button fh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_financereport );


        getSupportActionBar().hide();

        ActivityCompat.requestPermissions( this,new String[]{WRITE_EXTERNAL_STORAGE,
                READ_EXTERNAL_STORAGE}, PackageManager.PERMISSION_GRANTED );

        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy( builder.build());



        tablayout21 = findViewById( R.id.tablayout21 );

        fh = findViewById( R.id.fh );
        viewpager21 = findViewById( R.id.viewpager21);


        ViewPagerAdapter21 adapter21 = new ViewPagerAdapter21( getSupportFragmentManager() );
        adapter21.add( new FragmentRecord21(), "Calender" );
        adapter21.add( new FragmentSavedRecordings21(), "Total Income" );
        adapter21.add( new FragmentFinalSavedRecordings21(), "Total Expenses" );
        viewpager21.setAdapter( adapter21 );
        tablayout21.setupWithViewPager( viewpager21 );


    }


    public void fhh(View view)  {


        fh.setVisibility( View.GONE );
        ///////////////////////////////////////////////////////////////////////////////
        View view1 = getWindow().getDecorView().getRootView();
        view1.setDrawingCacheEnabled( true );

        Bitmap bitmap = Bitmap.createBitmap(view1.getDrawingCache());
         view1.setDrawingCacheEnabled( true );
//////////////////////////////////////////////////////

        Toast.makeText( Financereport.this,"Download Started...",Toast.LENGTH_SHORT ).show();


        String filePath = Environment.getExternalStorageDirectory()+"/Download/"+ Calendar.getInstance().getTime().toString()
                +".jpg";
        Toast.makeText( Financereport.this,"Download Completed",Toast.LENGTH_SHORT ).show();


        File fileScreenshot = new File(filePath);

        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream( fileScreenshot );
            bitmap.compress( Bitmap.CompressFormat.JPEG,100,fileOutputStream );
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Intent intent = new Intent( Intent.ACTION_GET_CONTENT );

        Intent intent = new Intent( Intent.ACTION_VIEW );
        Uri uri = Uri.fromFile(fileScreenshot);
        intent.setDataAndType( uri, "image/jpeg" );
        intent.addFlags( Intent.FLAG_ACTIVITY_NEW_TASK );
        //  PendingIntent contentIntent = PendingIntent.getActivity(int context, id, intent,
        //     PendingIntent.FLAG_UPDATE_CURRENT);
        this.startActivity( intent );



    }



}