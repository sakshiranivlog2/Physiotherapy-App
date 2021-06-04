package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;

import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class clinictoday extends AppCompatActivity  implements DatePickerDialog.OnDateSetListener {

    ImageButton gmail,whatsapp,print,delete;
    Button b1;
    //ImageView b2;
    EditText et6;
    CardView kk;
    EditText mDisplayDate;
    private static final  String TAG = "MainActivity";
    Intent intent = null, chooser = null;
    RelativeLayout clinicall;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_clinictoday );

        getSupportActionBar().hide();

        ActivityCompat.requestPermissions( this,new String[]{WRITE_EXTERNAL_STORAGE,
                READ_EXTERNAL_STORAGE}, PackageManager.PERMISSION_GRANTED );

        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy( builder.build());

           kk= findViewById( R.id.kk);
        et6 = findViewById( R.id.et6 );
        mDisplayDate = findViewById( R.id.mDisplayDate );
        clinicall = findViewById( R.id.clinicall );
        gmail = findViewById( R.id.gmail );
        b1= findViewById( R.id.b1 );
       // b2 = findViewById( R.id.b2 );
        whatsapp = findViewById( R.id.whatsapp );
       print = findViewById( R.id.print );
        delete= findViewById( R.id.delete );

        mDisplayDate.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get( Calendar.YEAR );
                int month = cal.get( Calendar.MONTH );
                int day = cal.get( Calendar.DAY_OF_MONTH );


                DatePickerDialog dialog = new DatePickerDialog(
                        clinictoday.this,
                        android.R.style.Theme_Holo_Dialog_MinWidth,
                        mDateSetListener,
                        year, month, day );
                dialog.getWindow().setBackgroundDrawable( new ColorDrawable( Color.TRANSPARENT ) );
                dialog.show();


            }
        } );

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDateSet: dd/mm/yyy: " + day + "/" + month + "/" +year);
                String date = day + "/" + month + "/" + year;
                mDisplayDate.setText( date );
            }
        };



        et6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        } );

    }


    private void showDatePickerDialog(){

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
        );

        datePickerDialog.show();


    }




    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date = + dayOfMonth + "/" + (month + 1) + "/" + year;
        et6.setText( date );

    }




    public void delete1(View view) {


        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle( "Delete Document" );
        builder.setMessage( "Are you sure you want to delete the document ?" );
        builder.setPositiveButton( "YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                clinicall.setVisibility( View.GONE );
                Toast.makeText( clinictoday.this,"Document deleted Successfully",Toast.LENGTH_SHORT ).show();
             Intent intent = new Intent( clinictoday.this, deleteact.class );
                startActivity( intent );
            }
        } );

        builder.setNegativeButton( "No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        } );
        builder.show();



    }

    public void gmail1(View view) {
        intent = new Intent( Intent.ACTION_SEND );
        intent.setData( Uri.parse( "mailto:" ) );
        String[] to = {"physiomatica@gmail.com"};
        intent.putExtra( Intent.EXTRA_EMAIL, to);
        intent.putExtra( Intent.EXTRA_SUBJECT, "Sharing Digital Prescription \n" );
        intent.putExtra( Intent.EXTRA_TEXT,    "Dear Customer,\n" +
                "Kindly go through your digital prescription reports\n\n " +
                "Thank you");
        intent.setType( "message/rfc822" );
        chooser = Intent.createChooser( intent,"Send Email" );
        startActivity( chooser );

    }

    public void whatsapp1(View view) {

        intent = getPackageManager().getLaunchIntentForPackage( "com.whatsapp" );
        chooser = Intent.createChooser( intent,"launch Whatsapp" );
        startActivity( chooser );
    }

    public void print1(View view) {

        gmail.setVisibility( View.GONE );
       whatsapp .setVisibility( View.GONE );
        print.setVisibility( View.GONE );
        delete.setVisibility( View.GONE );
        b1.setVisibility( View.GONE );
        kk.setVisibility( View.GONE );
        //b2.setVisibility( View.GONE );
        ///////////////////////////////////////////////////////////////////////////////
        View view1 = getWindow().getDecorView().getRootView();
        view1.setDrawingCacheEnabled( true );

        Bitmap bitmap = Bitmap.createBitmap(view1.getDrawingCache());
        // view1.setDrawingCacheEnabled( true );
//////////////////////////////////////////////////////

        Toast.makeText( clinictoday.this,"Download Started...",Toast.LENGTH_SHORT ).show();


        String filePath = Environment.getExternalStorageDirectory()+"/Download/"+ Calendar.getInstance().getTime().toString()
                +".jpg";
        Toast.makeText( clinictoday.this,"Download Completed",Toast.LENGTH_SHORT ).show();


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
