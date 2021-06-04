package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;

public class MyCalender extends AppCompatActivity {

    TextView selectedTvp,selectedTv1,selectedTv2,selectedTv6,selectedTv7,selectedTv8,selectedTv19,selectedTv5,
            selectedTv9,selectedTv0,selectedTv29,selectedTv16,selectedTv32,selectedTv33,selectedTv31;
    ImageButton showMenuBtnp,showMenuBtn1,showMenuBtn2,showMenuBtn6,showMenuBtn7,showMenuBtn8,showMenuBtn19,showMenuBtni
            ,showMenuBtn9,showMenuBtn0,showMenuBtn29,showMenuBtn16,showMenuBtn32,showMenuBtn33,showMenuBtn31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_my_calender );

        getSupportActionBar().hide();

        selectedTv31 = findViewById( R.id.selectedTv31 );
        showMenuBtn31 = findViewById( R.id.showMenuBtn31 );
        selectedTvp = findViewById( R.id.selectedTvp );
        selectedTv2 = findViewById( R.id.selectedTv2 );
        selectedTv6 = findViewById( R.id.selectedTv6 );
        showMenuBtnp = findViewById( R.id.showMenuBtnp );
        showMenuBtn1 = findViewById( R.id.showMenuBtn1 );
        showMenuBtn2 = findViewById( R.id.showMenuBtn2 );
        selectedTv1 = findViewById( R.id.selectedTv1 );
        showMenuBtn6 = findViewById( R.id.showMenuBtn6 );
        selectedTv7 = findViewById( R.id.selectedTv7);
        showMenuBtn7 = findViewById( R.id.showMenuBtn7 );
        selectedTv8 = findViewById( R.id.selectedTv8);
        showMenuBtn8 = findViewById( R.id.showMenuBtn8 );
        selectedTv19 = findViewById( R.id.selectedTv19);
        showMenuBtn19 = findViewById( R.id.showMenuBtn19 );
        selectedTv5 = findViewById( R.id.selectedTv5);
        showMenuBtni= findViewById( R.id.showMenuBtni );
        selectedTv9 = findViewById( R.id.selectedTv9);
        showMenuBtn9= findViewById( R.id.showMenuBtn9 );
        selectedTv0 = findViewById( R.id.selectedTv0);
        showMenuBtn0= findViewById( R.id.showMenuBtn0);
        selectedTv29= findViewById( R.id.selectedTv29);
        showMenuBtn29= findViewById( R.id.showMenuBtn29);
        selectedTv16 = findViewById( R.id.selectedTv16);
        showMenuBtn16 = findViewById( R.id.showMenuBtn16 );
        selectedTv32 = findViewById( R.id.selectedTv32);
        showMenuBtn32 = findViewById( R.id.showMenuBtn32 );
        selectedTv33 = findViewById( R.id.selectedTv33 );
        showMenuBtn33 = findViewById( R.id.showMenuBtn33 );






        final PopupMenu popupMenu = new PopupMenu( this, showMenuBtnp );

        popupMenu.getMenuInflater().inflate( R.menu.menu_popup, popupMenu.getMenu() );
        popupMenu.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id ==R.id.menu_copy){

                    selectedTvp.setText( "10 min" );


                }
                else if (id ==R.id.menu_copy2){
                    selectedTvp.setText( "20 min" );


                }
                else if (id ==R.id.menu_copy3){
                    selectedTvp.setText( "30 min" );


                }
               else  if (id ==R.id.menu_copy4){
                    selectedTvp.setText( "40 min" );


                }
                else if (id ==R.id.menu_copy5){
                    selectedTvp.setText( "50 min" );


                }
                else if (id ==R.id.menu_copy6){
                    selectedTvp.setText( "60 min" );


                }


                return false;
            }
        } );



        showMenuBtnp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu.show();




            }
        } );

//////////////////////////////////////////////////////////////

        final PopupMenu popupMenu2 = new PopupMenu( this, showMenuBtn1 );

        popupMenu2.getMenuInflater().inflate( R.menu.monday, popupMenu2.getMenu() );
        popupMenu2.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id ==R.id.m1){

                    selectedTv1.setText( "1 am" );


                }
                else if (id ==R.id.m2){
                    selectedTv1.setText( "2 am" );


                }
                else if (id ==R.id.m3){
                    selectedTv1.setText( "3 am" );


                }
                else  if (id ==R.id.m4){
                    selectedTv1.setText( "4 am" );


                }
                else if (id ==R.id.m5){
                    selectedTv1.setText( "5 am" );


                }
                else if (id ==R.id.m6){
                    selectedTv1.setText( "6 am" );


                }
                if (id ==R.id.m7){

                    selectedTv1.setText( "7 am" );


                }
                else if (id ==R.id.m8){
                    selectedTv1.setText( "8 am" );


                }
                else if (id ==R.id.m9){
                    selectedTv1.setText( "9 am" );


                }
                else  if (id ==R.id.m10){
                    selectedTv1.setText( "10 am" );


                }
                else if (id ==R.id.m11){
                    selectedTv1.setText( "11 am" );


                }
                else if (id ==R.id.m12){
                    selectedTv1.setText( "12 am" );


                }

                if (id ==R.id.m13){

                    selectedTv1.setText( "1 pm" );


                }
                else if (id ==R.id.m14){
                    selectedTv1.setText( "2 pm" );


                }
                else if (id ==R.id.m15){
                    selectedTv1.setText( "3 pm" );


                }
                else  if (id ==R.id.m16){
                    selectedTv1.setText( "4 pm" );


                }
                else if (id ==R.id.m17){
                    selectedTv1.setText( "5 pm" );


                }
                else if (id ==R.id.m18){
                    selectedTv1.setText( "6 pm" );


                }
                if (id ==R.id.m19){

                    selectedTv1.setText( "7 pm" );


                }
                else if (id ==R.id.m20){
                    selectedTv1.setText( "8 pm" );


                }
                else if (id ==R.id.m21){
                    selectedTv1.setText( "9 pm" );


                }
                else  if (id ==R.id.m22){
                    selectedTv1.setText( "10 pm" );


                }
                else if (id ==R.id.m23){
                    selectedTv1.setText( "11 pm" );


                }
                else if (id ==R.id.m24){
                    selectedTv1.setText( "12 pm" );


                }


                return false;
            }
        } );



        showMenuBtn1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu2.show();




            }
        } );

////////////////////////////////////////////////////////////////////////////////////////////

        final PopupMenu popupMenu3 = new PopupMenu( this, showMenuBtn2 );

        popupMenu3.getMenuInflater().inflate( R.menu.monday, popupMenu3.getMenu() );
        popupMenu3.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id ==R.id.m1){

                    selectedTv2.setText( "1 am" );


                }
                else if (id ==R.id.m2){
                    selectedTv2.setText( "2 am" );


                }
                else if (id ==R.id.m3){
                    selectedTv2.setText( "3 am" );


                }
                else  if (id ==R.id.m4){
                    selectedTv2.setText( "4 am" );


                }
                else if (id ==R.id.m5){
                    selectedTv2.setText( "5 am" );


                }
                else if (id ==R.id.m6){
                    selectedTv2.setText( "6 am" );


                }
                if (id ==R.id.m7){

                    selectedTv2.setText( "7 am" );


                }
                else if (id ==R.id.m8){
                    selectedTv2.setText( "8 am" );


                }
                else if (id ==R.id.m9){
                    selectedTv2.setText( "9 am" );


                }
                else  if (id ==R.id.m10){
                    selectedTv2.setText( "10 am" );


                }
                else if (id ==R.id.m11){
                    selectedTv2.setText( "11 am" );


                }
                else if (id ==R.id.m12){
                    selectedTv2.setText( "12 am" );


                }

                if (id ==R.id.m13){

                    selectedTv2.setText( "1 pm" );


                }
                else if (id ==R.id.m14){
                    selectedTv2.setText( "2 pm" );


                }
                else if (id ==R.id.m15){
                    selectedTv2.setText( "3 pm" );


                }
                else  if (id ==R.id.m16){
                    selectedTv2.setText( "4 pm" );


                }
                else if (id ==R.id.m17){
                    selectedTv2.setText( "5 pm" );


                }
                else if (id ==R.id.m18){
                    selectedTv2.setText( "6 pm" );


                }
                if (id ==R.id.m19){

                    selectedTv2.setText( "7 pm" );


                }
                else if (id ==R.id.m20){
                    selectedTv2.setText( "8 pm" );


                }
                else if (id ==R.id.m21){
                    selectedTv2.setText( "9 pm" );


                }
                else  if (id ==R.id.m22){
                    selectedTv2.setText( "10 pm" );


                }
                else if (id ==R.id.m23){
                    selectedTv2.setText( "11 pm" );


                }
                else if (id ==R.id.m24){
                    selectedTv2.setText( "12 pm" );


                }


                return false;
            }
        } );



        showMenuBtn2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu3.show();




            }
        } );

        ////////////////////////////////////////////////////////////////////////////////


        final PopupMenu popupMenu4 = new PopupMenu( this, showMenuBtn6);

        popupMenu4.getMenuInflater().inflate( R.menu.monday, popupMenu4.getMenu() );
        popupMenu4.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id ==R.id.m1){

                    selectedTv6.setText( "1 am" );


                }
                else if (id ==R.id.m2){
                    selectedTv6.setText( "2 am" );


                }
                else if (id ==R.id.m3){
                    selectedTv6.setText( "3 am" );


                }
                else  if (id ==R.id.m4){
                    selectedTv6.setText( "4 am" );


                }
                else if (id ==R.id.m5){
                    selectedTv6.setText( "5 am" );


                }
                else if (id ==R.id.m6){
                    selectedTv6.setText( "6 am" );


                }
                if (id ==R.id.m7){

                    selectedTv6.setText( "7 am" );


                }
                else if (id ==R.id.m8){
                    selectedTv6.setText( "8 am" );


                }
                else if (id ==R.id.m9){
                    selectedTv6.setText( "9 am" );


                }
                else  if (id ==R.id.m10){
                    selectedTv6.setText( "10 am" );


                }
                else if (id ==R.id.m11){
                    selectedTv6.setText( "11 am" );


                }
                else if (id ==R.id.m12){
                    selectedTv6.setText( "12 am" );


                }

                if (id ==R.id.m13){

                    selectedTv6.setText( "1 pm" );


                }
                else if (id ==R.id.m14){
                    selectedTv6.setText( "2 pm" );


                }
                else if (id ==R.id.m15){
                    selectedTv6.setText( "3 pm" );


                }
                else  if (id ==R.id.m16){
                    selectedTv6.setText( "4 pm" );


                }
                else if (id ==R.id.m17){
                    selectedTv6.setText( "5 pm" );


                }
                else if (id ==R.id.m18){
                    selectedTv6.setText( "6 pm" );


                }
                if (id ==R.id.m19){

                    selectedTv6.setText( "7 pm" );


                }
                else if (id ==R.id.m20){
                    selectedTv6.setText( "8 pm" );


                }
                else if (id ==R.id.m21){
                    selectedTv6.setText( "9 pm" );


                }
                else  if (id ==R.id.m22){
                    selectedTv6.setText( "10 pm" );


                }
                else if (id ==R.id.m23){
                    selectedTv6.setText( "11 pm" );


                }
                else if (id ==R.id.m24){
                    selectedTv6.setText( "12 pm" );


                }


                return false;
            }
        } );



        showMenuBtn6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu4.show();




            }
        } );
//////////////////////////////////////////////////////////////////////////////////////////////////////////


        final PopupMenu popupMenu5 = new PopupMenu( this, showMenuBtn7);

        popupMenu5.getMenuInflater().inflate( R.menu.monday, popupMenu5.getMenu() );
        popupMenu5.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id ==R.id.m1){

                    selectedTv7.setText( "1 am" );


                }
                else if (id ==R.id.m2){
                    selectedTv7.setText( "2 am" );


                }
                else if (id ==R.id.m3){
                    selectedTv7.setText( "3 am" );


                }
                else  if (id ==R.id.m4){
                    selectedTv7.setText( "4 am" );


                }
                else if (id ==R.id.m5){
                    selectedTv7.setText( "5 am" );


                }
                else if (id ==R.id.m6){
                    selectedTv7.setText( "6 am" );


                }
                if (id ==R.id.m7){

                    selectedTv7.setText( "7 am" );


                }
                else if (id ==R.id.m8){
                    selectedTv7.setText( "8 am" );


                }
                else if (id ==R.id.m9){
                    selectedTv7.setText( "9 am" );


                }
                else  if (id ==R.id.m10){
                    selectedTv7.setText( "10 am" );


                }
                else if (id ==R.id.m11){
                    selectedTv7.setText( "11 am" );


                }
                else if (id ==R.id.m12){
                    selectedTv7.setText( "12 am" );


                }

                if (id ==R.id.m13){

                    selectedTv7.setText( "1 pm" );


                }
                else if (id ==R.id.m14){
                    selectedTv7.setText( "2 pm" );


                }
                else if (id ==R.id.m15){
                    selectedTv7.setText( "3 pm" );


                }
                else  if (id ==R.id.m16){
                    selectedTv7.setText( "4 pm" );


                }
                else if (id ==R.id.m17){
                    selectedTv7.setText( "5 pm" );


                }
                else if (id ==R.id.m18){
                    selectedTv7.setText( "6 pm" );


                }
                if (id ==R.id.m19){

                    selectedTv7.setText( "7 pm" );


                }
                else if (id ==R.id.m20){
                    selectedTv7.setText( "8 pm" );


                }
                else if (id ==R.id.m21){
                    selectedTv7.setText( "9 pm" );


                }
                else  if (id ==R.id.m22){
                    selectedTv7.setText( "10 pm" );


                }
                else if (id ==R.id.m23){
                    selectedTv7.setText( "11 pm" );


                }
                else if (id ==R.id.m24){
                    selectedTv7.setText( "12 pm" );


                }


                return false;
            }
        } );



        showMenuBtn7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu5.show();




            }
        } );

//////////////////////////////////////////////////////////////////////////////////////////////////////////


        final PopupMenu popupMenu6 = new PopupMenu( this, showMenuBtn8);

        popupMenu6.getMenuInflater().inflate( R.menu.monday, popupMenu6.getMenu() );
        popupMenu6.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id ==R.id.m1){

                    selectedTv8.setText( "1 am" );


                }
                else if (id ==R.id.m2){
                    selectedTv8.setText( "2 am" );


                }
                else if (id ==R.id.m3){
                    selectedTv8.setText( "3 am" );


                }
                else  if (id ==R.id.m4){
                    selectedTv8.setText( "4 am" );


                }
                else if (id ==R.id.m5){
                    selectedTv8.setText( "5 am" );


                }
                else if (id ==R.id.m6){
                    selectedTv8.setText( "6 am" );


                }
                if (id ==R.id.m7){

                    selectedTv8.setText( "7 am" );


                }
                else if (id ==R.id.m8){
                    selectedTv8.setText( "8 am" );


                }
                else if (id ==R.id.m9){
                    selectedTv8.setText( "9 am" );


                }
                else  if (id ==R.id.m10){
                    selectedTv8.setText( "10 am" );


                }
                else if (id ==R.id.m11){
                    selectedTv8.setText( "11 am" );


                }
                else if (id ==R.id.m12){
                    selectedTv8.setText( "12 am" );


                }

                if (id ==R.id.m13){

                    selectedTv8.setText( "1 pm" );


                }
                else if (id ==R.id.m14){
                    selectedTv8.setText( "2 pm" );


                }
                else if (id ==R.id.m15){
                    selectedTv8.setText( "3 pm" );


                }
                else  if (id ==R.id.m16){
                    selectedTv8.setText( "4 pm" );


                }
                else if (id ==R.id.m17){
                    selectedTv8.setText( "5 pm" );


                }
                else if (id ==R.id.m18){
                    selectedTv8.setText( "6 pm" );


                }
                if (id ==R.id.m19){

                    selectedTv8.setText( "7 pm" );


                }
                else if (id ==R.id.m20){
                    selectedTv8.setText( "8 pm" );


                }
                else if (id ==R.id.m21){
                    selectedTv8.setText( "9 pm" );


                }
                else  if (id ==R.id.m22){
                    selectedTv8.setText( "10 pm" );


                }
                else if (id ==R.id.m23){
                    selectedTv8.setText( "11 pm" );


                }
                else if (id ==R.id.m24){
                    selectedTv8.setText( "12 pm" );


                }


                return false;
            }
        } );



        showMenuBtn8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu6.show();




            }
        } );
//////////////////////////////////////////////////////////////////////////////////////////////


        final PopupMenu popupMenu7 = new PopupMenu( this, showMenuBtn19);

        popupMenu7.getMenuInflater().inflate( R.menu.monday, popupMenu7.getMenu() );
        popupMenu7.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id ==R.id.m1){

                    selectedTv19.setText( "1 am" );


                }
                else if (id ==R.id.m2){
                    selectedTv19.setText( "2 am" );


                }
                else if (id ==R.id.m3){
                    selectedTv19.setText( "3 am" );


                }
                else  if (id ==R.id.m4){
                    selectedTv19.setText( "4 am" );


                }
                else if (id ==R.id.m5){
                    selectedTv19.setText( "5 am" );


                }
                else if (id ==R.id.m6){
                    selectedTv19.setText( "6 am" );


                }
                if (id ==R.id.m7){

                    selectedTv19.setText( "7 am" );


                }
                else if (id ==R.id.m8){
                    selectedTv19.setText( "8 am" );


                }
                else if (id ==R.id.m9){
                    selectedTv19.setText( "9 am" );


                }
                else  if (id ==R.id.m10){
                    selectedTv19.setText( "10 am" );


                }
                else if (id ==R.id.m11){
                    selectedTv19.setText( "11 am" );


                }
                else if (id ==R.id.m12){
                    selectedTv19.setText( "12 am" );


                }

                if (id ==R.id.m13){

                    selectedTv19.setText( "1 pm" );


                }
                else if (id ==R.id.m14){
                    selectedTv19.setText( "2 pm" );


                }
                else if (id ==R.id.m15){
                    selectedTv19.setText( "3 pm" );


                }
                else  if (id ==R.id.m16){
                    selectedTv19.setText( "4 pm" );


                }
                else if (id ==R.id.m17){
                    selectedTv19.setText( "5 pm" );


                }
                else if (id ==R.id.m18){
                    selectedTv19.setText( "6 pm" );


                }
                if (id ==R.id.m19){

                    selectedTv19.setText( "7 pm" );


                }
                else if (id ==R.id.m20){
                    selectedTv19.setText( "8 pm" );


                }
                else if (id ==R.id.m21){
                    selectedTv19.setText( "9 pm" );


                }
                else  if (id ==R.id.m22){
                    selectedTv19.setText( "10 pm" );


                }
                else if (id ==R.id.m23){
                    selectedTv19.setText( "11 pm" );


                }
                else if (id ==R.id.m24){
                    selectedTv19.setText( "12 pm" );


                }


                return false;
            }
        } );



        showMenuBtn19.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu7.show();




            }
        } );

/////////////////////////////////////////////////////////////////////////////////////////


        final PopupMenu popupMenu8 = new PopupMenu( this, showMenuBtni);

        popupMenu8.getMenuInflater().inflate( R.menu.monday, popupMenu8.getMenu() );
        popupMenu8.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id ==R.id.m1){

                    selectedTv5.setText( "1 am" );


                }
                else if (id ==R.id.m2){
                    selectedTv5.setText( "2 am" );


                }
                else if (id ==R.id.m3){
                    selectedTv5.setText( "3 am" );


                }
                else  if (id ==R.id.m4){
                    selectedTv5.setText( "4 am" );


                }
                else if (id ==R.id.m5){
                    selectedTv5.setText( "5 am" );


                }
                else if (id ==R.id.m6){
                    selectedTv5.setText( "6 am" );


                }
                if (id ==R.id.m7){

                    selectedTv5.setText( "7 am" );


                }
                else if (id ==R.id.m8){
                    selectedTv5.setText( "8 am" );


                }
                else if (id ==R.id.m9){
                    selectedTv5.setText( "9 am" );


                }
                else  if (id ==R.id.m10){
                    selectedTv5.setText( "10 am" );


                }
                else if (id ==R.id.m11){
                    selectedTv5.setText( "11 am" );


                }
                else if (id ==R.id.m12){
                    selectedTv5.setText( "12 am" );


                }

                if (id ==R.id.m13){

                    selectedTv5.setText( "1 pm" );


                }
                else if (id ==R.id.m14){
                    selectedTv5.setText( "2 pm" );


                }
                else if (id ==R.id.m15){
                    selectedTv5.setText( "3 pm" );


                }
                else  if (id ==R.id.m16){
                    selectedTv5.setText( "4 pm" );


                }
                else if (id ==R.id.m17){
                    selectedTv5.setText( "5 pm" );


                }
                else if (id ==R.id.m18){
                    selectedTv5.setText( "6 pm" );


                }
                if (id ==R.id.m19){

                    selectedTv5.setText( "7 pm" );


                }
                else if (id ==R.id.m20){
                    selectedTv5.setText( "8 pm" );


                }
                else if (id ==R.id.m21){
                    selectedTv5.setText( "9 pm" );


                }
                else  if (id ==R.id.m22){
                    selectedTv5.setText( "10 pm" );


                }
                else if (id ==R.id.m23){
                    selectedTv5.setText( "11 pm" );


                }
                else if (id ==R.id.m24){
                    selectedTv5.setText( "12 pm" );


                }


                return false;
            }
        } );



        showMenuBtni.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu8.show();




            }
        } );

///////////////////////////////////////////////////////////////////////////////////////////////////


        final PopupMenu popupMenu9 = new PopupMenu( this, showMenuBtn9);

        popupMenu9.getMenuInflater().inflate( R.menu.monday, popupMenu9.getMenu() );
        popupMenu9.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id ==R.id.m1){

                    selectedTv9.setText( "1 am" );


                }
                else if (id ==R.id.m2){
                    selectedTv9.setText( "2 am" );


                }
                else if (id ==R.id.m3){
                    selectedTv9.setText( "3 am" );


                }
                else  if (id ==R.id.m4){
                    selectedTv9.setText( "4 am" );


                }
                else if (id ==R.id.m5){
                    selectedTv9.setText( "5 am" );


                }
                else if (id ==R.id.m6){
                    selectedTv9.setText( "6 am" );


                }
                if (id ==R.id.m7){

                    selectedTv9.setText( "7 am" );


                }
                else if (id ==R.id.m8){
                    selectedTv9.setText( "8 am" );


                }
                else if (id ==R.id.m9){
                    selectedTv9.setText( "9 am" );


                }
                else  if (id ==R.id.m10){
                    selectedTv9.setText( "10 am" );


                }
                else if (id ==R.id.m11){
                    selectedTv9.setText( "11 am" );


                }
                else if (id ==R.id.m12){
                    selectedTv9.setText( "12 am" );


                }

                if (id ==R.id.m13){

                    selectedTv9.setText( "1 pm" );


                }
                else if (id ==R.id.m14){
                    selectedTv9.setText( "2 pm" );


                }
                else if (id ==R.id.m15){
                    selectedTv9.setText( "3 pm" );


                }
                else  if (id ==R.id.m16){
                    selectedTv9.setText( "4 pm" );


                }
                else if (id ==R.id.m17){
                    selectedTv9.setText( "5 pm" );


                }
                else if (id ==R.id.m18){
                    selectedTv9.setText( "6 pm" );


                }
                if (id ==R.id.m19){

                    selectedTv9.setText( "7 pm" );


                }
                else if (id ==R.id.m20){
                    selectedTv9.setText( "8 pm" );


                }
                else if (id ==R.id.m21){
                    selectedTv9.setText( "9 pm" );


                }
                else  if (id ==R.id.m22){
                    selectedTv9.setText( "10 pm" );


                }
                else if (id ==R.id.m23){
                    selectedTv9.setText( "11 pm" );


                }
                else if (id ==R.id.m24){
                    selectedTv9.setText( "12 pm" );


                }


                return false;
            }
        } );



        showMenuBtn9.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu9.show();




            }
        } );
/////////////////////////////////////////////////////////////////////////////////////////////


        final PopupMenu popupMenu10 = new PopupMenu( this, showMenuBtn0);

        popupMenu10.getMenuInflater().inflate( R.menu.monday, popupMenu10.getMenu() );
        popupMenu10.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id ==R.id.m1){

                    selectedTv0.setText( "1 am" );


                }
                else if (id ==R.id.m2){
                    selectedTv0.setText( "2 am" );


                }
                else if (id ==R.id.m3){
                    selectedTv0.setText( "3 am" );


                }
                else  if (id ==R.id.m4){
                    selectedTv0.setText( "4 am" );


                }
                else if (id ==R.id.m5){
                    selectedTv0.setText( "5 am" );


                }
                else if (id ==R.id.m6){
                    selectedTv0.setText( "6 am" );


                }
                if (id ==R.id.m7){

                    selectedTv0.setText( "7 am" );


                }
                else if (id ==R.id.m8){
                    selectedTv0.setText( "8 am" );


                }
                else if (id ==R.id.m9){
                    selectedTv0.setText( "9 am" );


                }
                else  if (id ==R.id.m10){
                    selectedTv0.setText( "10 am" );


                }
                else if (id ==R.id.m11){
                    selectedTv0.setText( "11 am" );


                }
                else if (id ==R.id.m12){
                    selectedTv0.setText( "12 am" );


                }

                if (id ==R.id.m13){

                    selectedTv0.setText( "1 pm" );


                }
                else if (id ==R.id.m14){
                    selectedTv0.setText( "2 pm" );


                }
                else if (id ==R.id.m15){
                    selectedTv0.setText( "3 pm" );


                }
                else  if (id ==R.id.m16){
                    selectedTv0.setText( "4 pm" );


                }
                else if (id ==R.id.m17){
                    selectedTv0.setText( "5 pm" );


                }
                else if (id ==R.id.m18){
                    selectedTv0.setText( "6 pm" );


                }
                if (id ==R.id.m19){

                    selectedTv0.setText( "7 pm" );


                }
                else if (id ==R.id.m20){
                    selectedTv0.setText( "8 pm" );


                }
                else if (id ==R.id.m21){
                    selectedTv0.setText( "9 pm" );


                }
                else  if (id ==R.id.m22){
                    selectedTv0.setText( "10 pm" );


                }
                else if (id ==R.id.m23){
                    selectedTv0.setText( "11 pm" );


                }
                else if (id ==R.id.m24){
                    selectedTv0.setText( "12 pm" );


                }


                return false;
            }
        } );



        showMenuBtn0.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu10.show();




            }
        } );

////////////////////////////////////////////////////////////////

        final PopupMenu popupMenu11 = new PopupMenu( this, showMenuBtn29);

        popupMenu11.getMenuInflater().inflate( R.menu.monday, popupMenu11.getMenu() );
        popupMenu11.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id ==R.id.m1){

                    selectedTv29.setText( "1 am" );


                }
                else if (id ==R.id.m2){
                    selectedTv29.setText( "2 am" );


                }
                else if (id ==R.id.m3){
                    selectedTv29.setText( "3 am" );


                }
                else  if (id ==R.id.m4){
                    selectedTv29.setText( "4 am" );


                }
                else if (id ==R.id.m5){
                    selectedTv29.setText( "5 am" );


                }
                else if (id ==R.id.m6){
                    selectedTv29.setText( "6 am" );


                }
                if (id ==R.id.m7){

                    selectedTv29.setText( "7 am" );


                }
                else if (id ==R.id.m8){
                    selectedTv29.setText( "8 am" );


                }
                else if (id ==R.id.m9){
                    selectedTv29.setText( "9 am" );


                }
                else  if (id ==R.id.m10){
                    selectedTv29.setText( "10 am" );


                }
                else if (id ==R.id.m11){
                    selectedTv29.setText( "11 am" );


                }
                else if (id ==R.id.m12){
                    selectedTv29.setText( "12 am" );


                }

                if (id ==R.id.m13){

                    selectedTv29.setText( "1 pm" );


                }
                else if (id ==R.id.m14){
                    selectedTv29.setText( "2 pm" );


                }
                else if (id ==R.id.m15){
                    selectedTv29.setText( "3 pm" );


                }
                else  if (id ==R.id.m16){
                    selectedTv29.setText( "4 pm" );


                }
                else if (id ==R.id.m17){
                    selectedTv29.setText( "5 pm" );


                }
                else if (id ==R.id.m18){
                    selectedTv29.setText( "6 pm" );


                }
                if (id ==R.id.m19){

                    selectedTv29.setText( "7 pm" );


                }
                else if (id ==R.id.m20){
                    selectedTv29.setText( "8 pm" );


                }
                else if (id ==R.id.m21){
                    selectedTv29.setText( "9 pm" );


                }
                else  if (id ==R.id.m22){
                    selectedTv29.setText( "10 pm" );


                }
                else if (id ==R.id.m23){
                    selectedTv29.setText( "11 pm" );


                }
                else if (id ==R.id.m24){
                    selectedTv29.setText( "12 pm" );


                }


                return false;
            }
        } );



        showMenuBtn29.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu11.show();




            }
        } );

/////////////////////////////////////////////////////////////////////////////////////////////

        final PopupMenu popupMenu12 = new PopupMenu( this, showMenuBtn16);

        popupMenu12.getMenuInflater().inflate( R.menu.monday, popupMenu12.getMenu() );
        popupMenu12.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id ==R.id.m1){

                    selectedTv16.setText( "1 am" );


                }
                else if (id ==R.id.m2){
                    selectedTv16.setText( "2 am" );


                }
                else if (id ==R.id.m3){
                    selectedTv16.setText( "3 am" );


                }
                else  if (id ==R.id.m4){
                    selectedTv16.setText( "4 am" );


                }
                else if (id ==R.id.m5){
                    selectedTv16.setText( "5 am" );


                }
                else if (id ==R.id.m6){
                    selectedTv16.setText( "6 am" );


                }
                if (id ==R.id.m7){

                    selectedTv16.setText( "7 am" );


                }
                else if (id ==R.id.m8){
                    selectedTv16.setText( "8 am" );


                }
                else if (id ==R.id.m9){
                    selectedTv16.setText( "9 am" );


                }
                else  if (id ==R.id.m10){
                    selectedTv16.setText( "10 am" );


                }
                else if (id ==R.id.m11){
                    selectedTv16.setText( "11 am" );


                }
                else if (id ==R.id.m12){
                    selectedTv16.setText( "12 am" );


                }

                if (id ==R.id.m13){

                    selectedTv16.setText( "1 pm" );


                }
                else if (id ==R.id.m14){
                    selectedTv16.setText( "2 pm" );


                }
                else if (id ==R.id.m15){
                    selectedTv16.setText( "3 pm" );


                }
                else  if (id ==R.id.m16){
                    selectedTv16.setText( "4 pm" );


                }
                else if (id ==R.id.m17){
                    selectedTv16.setText( "5 pm" );


                }
                else if (id ==R.id.m18){
                    selectedTv16.setText( "6 pm" );


                }
                if (id ==R.id.m19){

                    selectedTv16.setText( "7 pm" );


                }
                else if (id ==R.id.m20){
                    selectedTv16.setText( "8 pm" );


                }
                else if (id ==R.id.m21){
                    selectedTv16.setText( "9 pm" );


                }
                else  if (id ==R.id.m22){
                    selectedTv16.setText( "10 pm" );


                }
                else if (id ==R.id.m23){
                    selectedTv16.setText( "11 pm" );


                }
                else if (id ==R.id.m24){
                    selectedTv16.setText( "12 pm" );


                }


                return false;
            }
        } );



        showMenuBtn16.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu12.show();




            }
        } );
///////////////////////////////////////////////////////////////////////////////////////////////////


        final PopupMenu popupMenu13 = new PopupMenu( this, showMenuBtn31);

        popupMenu13.getMenuInflater().inflate( R.menu.monday, popupMenu13.getMenu() );
        popupMenu13.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id ==R.id.m1){

                    selectedTv31.setText( "1 am" );


                }
                else if (id ==R.id.m2){
                    selectedTv31.setText( "2 am" );


                }
                else if (id ==R.id.m3){
                    selectedTv31.setText( "3 am" );


                }
                else  if (id ==R.id.m4){
                    selectedTv31.setText( "4 am" );


                }
                else if (id ==R.id.m5){
                    selectedTv31.setText( "5 am" );


                }
                else if (id ==R.id.m6){
                    selectedTv31.setText( "6 am" );


                }
                if (id ==R.id.m7){

                    selectedTv31.setText( "7 am" );


                }
                else if (id ==R.id.m8){
                    selectedTv31.setText( "8 am" );


                }
                else if (id ==R.id.m9){
                    selectedTv31.setText( "9 am" );


                }
                else  if (id ==R.id.m10){
                    selectedTv31.setText( "10 am" );


                }
                else if (id ==R.id.m11){
                    selectedTv31.setText( "11 am" );


                }
                else if (id ==R.id.m12){
                    selectedTv31.setText( "12 am" );


                }

                if (id ==R.id.m13){

                    selectedTv31.setText( "1 pm" );


                }
                else if (id ==R.id.m14){
                    selectedTv31.setText( "2 pm" );


                }
                else if (id ==R.id.m15){
                    selectedTv31.setText( "3 pm" );


                }
                else  if (id ==R.id.m16){
                    selectedTv31.setText( "4 pm" );


                }
                else if (id ==R.id.m17){
                    selectedTv31.setText( "5 pm" );


                }
                else if (id ==R.id.m18){
                    selectedTv31.setText( "6 pm" );


                }
                if (id ==R.id.m19){

                    selectedTv31.setText( "7 pm" );


                }
                else if (id ==R.id.m20){
                    selectedTv31.setText( "8 pm" );


                }
                else if (id ==R.id.m21){
                    selectedTv31.setText( "9 pm" );


                }
                else  if (id ==R.id.m22){
                    selectedTv31.setText( "10 pm" );


                }
                else if (id ==R.id.m23){
                    selectedTv31.setText( "11 pm" );


                }
                else if (id ==R.id.m24){
                    selectedTv31.setText( "12 pm" );


                }


                return false;
            }
        } );



        showMenuBtn31.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu13.show();




            }
        } );

//////////////////////////////////////////////////////////////////////////////////////////////


        final PopupMenu popupMenu14 = new PopupMenu( this, showMenuBtn32);

        popupMenu14.getMenuInflater().inflate( R.menu.monday, popupMenu14.getMenu() );
        popupMenu14.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id ==R.id.m1){

                    selectedTv32.setText( "1 am" );


                }
                else if (id ==R.id.m2){
                    selectedTv32.setText( "2 am" );


                }
                else if (id ==R.id.m3){
                    selectedTv32.setText( "3 am" );


                }
                else  if (id ==R.id.m4){
                    selectedTv32.setText( "4 am" );


                }
                else if (id ==R.id.m5){
                    selectedTv32.setText( "5 am" );


                }
                else if (id ==R.id.m6){
                    selectedTv32.setText( "6 am" );


                }
                if (id ==R.id.m7){

                    selectedTv32.setText( "7 am" );


                }
                else if (id ==R.id.m8){
                    selectedTv32.setText( "8 am" );


                }
                else if (id ==R.id.m9){
                    selectedTv32.setText( "9 am" );


                }
                else  if (id ==R.id.m10){
                    selectedTv32.setText( "10 am" );


                }
                else if (id ==R.id.m11){
                    selectedTv32.setText( "11 am" );


                }
                else if (id ==R.id.m12){
                    selectedTv32.setText( "12 am" );


                }

                if (id ==R.id.m13){

                    selectedTv32.setText( "1 pm" );


                }
                else if (id ==R.id.m14){
                    selectedTv32.setText( "2 pm" );


                }
                else if (id ==R.id.m15){
                    selectedTv32.setText( "3 pm" );


                }
                else  if (id ==R.id.m16){
                    selectedTv32.setText( "4 pm" );


                }
                else if (id ==R.id.m17){
                    selectedTv32.setText( "5 pm" );


                }
                else if (id ==R.id.m18){
                    selectedTv32.setText( "6 pm" );


                }
                if (id ==R.id.m19){

                    selectedTv32.setText( "7 pm" );


                }
                else if (id ==R.id.m20){
                    selectedTv32.setText( "8 pm" );


                }
                else if (id ==R.id.m21){
                    selectedTv32.setText( "9 pm" );


                }
                else  if (id ==R.id.m22){
                    selectedTv32.setText( "10 pm" );


                }
                else if (id ==R.id.m23){
                    selectedTv32.setText( "11 pm" );


                }
                else if (id ==R.id.m24){
                    selectedTv32.setText( "12 pm" );


                }


                return false;
            }
        } );



        showMenuBtn32.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu14.show();




            }
        } );

/////////////////////////////////////////////////////////////////////////////////////////////


        final PopupMenu popupMenu15 = new PopupMenu( this, showMenuBtn33);

        popupMenu15.getMenuInflater().inflate( R.menu.monday, popupMenu15.getMenu() );
        popupMenu15.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id ==R.id.m1){

                    selectedTv33.setText( "1 am" );


                }
                else if (id ==R.id.m2){
                    selectedTv33.setText( "2 am" );


                }
                else if (id ==R.id.m3){
                    selectedTv33.setText( "3 am" );


                }
                else  if (id ==R.id.m4){
                    selectedTv33.setText( "4 am" );


                }
                else if (id ==R.id.m5){
                    selectedTv33.setText( "5 am" );


                }
                else if (id ==R.id.m6){
                    selectedTv33.setText( "6 am" );


                }
                if (id ==R.id.m7){

                    selectedTv33.setText( "7 am" );


                }
                else if (id ==R.id.m8){
                    selectedTv33.setText( "8 am" );


                }
                else if (id ==R.id.m9){
                    selectedTv33.setText( "9 am" );


                }
                else  if (id ==R.id.m10){
                    selectedTv33.setText( "10 am" );


                }
                else if (id ==R.id.m11){
                    selectedTv33.setText( "11 am" );


                }
                else if (id ==R.id.m12){
                    selectedTv33.setText( "12 am" );


                }

                if (id ==R.id.m13){

                    selectedTv33.setText( "1 pm" );


                }
                else if (id ==R.id.m14){
                    selectedTv33.setText( "2 pm" );


                }
                else if (id ==R.id.m15){
                    selectedTv33.setText( "3 pm" );


                }
                else  if (id ==R.id.m16){
                    selectedTv33.setText( "4 pm" );


                }
                else if (id ==R.id.m17){
                    selectedTv33.setText( "5 pm" );


                }
                else if (id ==R.id.m18){
                    selectedTv33.setText( "6 pm" );


                }
                if (id ==R.id.m19){

                    selectedTv33.setText( "7 pm" );


                }
                else if (id ==R.id.m20){
                    selectedTv33.setText( "8 pm" );


                }
                else if (id ==R.id.m21){
                    selectedTv33.setText( "9 pm" );


                }
                else  if (id ==R.id.m22){
                    selectedTv33.setText( "10 pm" );


                }
                else if (id ==R.id.m23){
                    selectedTv33.setText( "11 pm" );


                }
                else if (id ==R.id.m24){
                    selectedTv33.setText( "12 pm" );


                }


                return false;
            }
        } );



        showMenuBtn33.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                popupMenu15.show();




            }
        } );




    }
}
