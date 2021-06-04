package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class emailactivity extends AppCompatActivity {


  Intent intent = null, chooser = null;
  Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_emailactivity );


        button = findViewById( R.id.launch_email );


        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent( Intent.ACTION_SEND );
                intent.setData( Uri.parse( "mailto:" ) );
                String[] to = {"sakshirani181@gmail.com"};
                intent.putExtra( Intent.EXTRA_EMAIL, to);
                intent.putExtra( Intent.EXTRA_SUBJECT, "Request for Clinic Marketing Report \n" );
                intent.putExtra( Intent.EXTRA_TEXT,    "Dear Physiomatica,\n" +
                        "Kindly generate my personal clinic marketing reports\n\n " +
                        "Thank you");
                intent.setType( "message/rfc822" );
                chooser = Intent.createChooser( intent,"Send Email" );
                startActivity( chooser );

            }
        } );

    }





}
