package com.example.myapplication;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Border2 extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_border2 );

        getSupportActionBar().hide();

        t1= findViewById( R.id.t1 );
        t2= findViewById( R.id.t2 );
        t3= findViewById( R.id.t3 );
        t4= findViewById( R.id.t4);
        t5= findViewById( R.id.t5 );
        t6= findViewById( R.id.t6 );
        t7= findViewById( R.id.t7 );
        t8= findViewById( R.id.t8 );
        t9= findViewById( R.id.t9 );
        t10= findViewById( R.id.t10 );
        t11= findViewById( R.id.t11 );
        t12= findViewById( R.id.t12 );


        ColorDrawable leftBorder = new ColorDrawable( Color.parseColor( "#86F1C7" ));
        ColorDrawable topBorder = new ColorDrawable( Color.parseColor( "#86F1C7" ));
        ColorDrawable rightBorder = new ColorDrawable( Color.parseColor( "#86F1C7" ));
        ColorDrawable bottomBorder = new ColorDrawable( Color.parseColor( "#86F1C7" ));
        ColorDrawable background = new ColorDrawable( Color.WHITE);

        Drawable[] layers = new Drawable[]{
                leftBorder,
                topBorder,
                rightBorder,
                bottomBorder,
                background
        };

        LayerDrawable layerDrawable = new LayerDrawable( layers );
        layerDrawable.setLayerInset( 0,0,0,15,0 );
        layerDrawable.setLayerInset( 1,15,0,0,15 );
        layerDrawable.setLayerInset( 2,15,15,0,0 );
        layerDrawable.setLayerInset( 3,15,15,15,0 );
        layerDrawable.setLayerInset( 4,15,15,15,15 );

        t1.setBackground( layerDrawable );
        t2.setBackground( layerDrawable );
        t3.setBackground( layerDrawable );
        t4.setBackground( layerDrawable );
        t5.setBackground( layerDrawable );
        t6.setBackground( layerDrawable );
        t7.setBackground( layerDrawable );
        t8.setBackground( layerDrawable );
        t9.setBackground( layerDrawable );
        t10.setBackground( layerDrawable );
        t11.setBackground( layerDrawable );
        t12.setBackground( layerDrawable );



    }
}
