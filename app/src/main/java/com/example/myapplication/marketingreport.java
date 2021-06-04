package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class marketingreport extends AppCompatActivity {


    Intent intent = null, chooser = null;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_marketingreport );

        getSupportActionBar().hide();

        button = findViewById( R.id.launch_email );


        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( marketingreport.this,"Making request....",Toast.LENGTH_SHORT ).show();
                intent = new Intent( Intent.ACTION_SEND );
                intent.setData( Uri.parse( "mailto:" ) );
               String[] to = {"physiomatica@gmail.com"};
               // String[] to = {"sakshirani181@gmail.com"};
                intent.putExtra( Intent.EXTRA_EMAIL, to);
                intent.putExtra( Intent.EXTRA_SUBJECT, "Request for Clinic Marketing Report " );
                intent.putExtra( Intent.EXTRA_TEXT,    "Dear Physiomatica,\n\n" +
                        "Kindly generate my personal clinic marketing reports\n\n " +
                        "Thank you");
                intent.setType( "message/rfc822" );
                chooser = Intent.createChooser( intent,"Send Email" );
                startActivity( chooser );
              //  Toast.makeText( marketingreport.this,"Request Sucess!",Toast.LENGTH_SHORT ).show();

            }
        } );

    }





}
