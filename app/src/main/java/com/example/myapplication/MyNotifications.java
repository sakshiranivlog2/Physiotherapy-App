package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MyNotifications extends AppCompatActivity {

    Switch SwitchDemo,SwitchDemo2,SwitchDemo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_my_notifications );

        getSupportActionBar().hide();

        SwitchDemo = findViewById( R.id.SwitchDemo );
        SwitchDemo2 = findViewById( R.id.SwitchDemo2 );
        SwitchDemo3 = findViewById( R.id.SwitchDemo3 );

        SwitchDemo.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){
                    Toast.makeText(getBaseContext(), "For Physios enabled",Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getBaseContext(), "For Physios disabled",Toast.LENGTH_SHORT).show();
                }
            }
        } );

        SwitchDemo2.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){
                    Toast.makeText(getBaseContext(), "For Patients enabled",Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getBaseContext(), "For Patients disabled",Toast.LENGTH_SHORT).show();
                }
            }
        } );

        SwitchDemo3.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){
                    Toast.makeText(getBaseContext(), "Yes",Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getBaseContext(), "No",Toast.LENGTH_SHORT).show();
                }
            }
        } );


    }
}
