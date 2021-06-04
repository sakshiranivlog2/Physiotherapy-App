package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    List<String> ChildList;
    Map<String, List<String>> ParentListItems;
    ExpandableListView expandableListView;



    List<String> ParentList = new ArrayList<>();
    {
        ParentList.add("CLINIC TODAY");
        ParentList.add("APPOINTMENT MANAGER");
        ParentList.add("CLINIC MANAGER");
        ParentList.add("ACCOUNTS MANAGER");
        ParentList.add("TREATMENT SESSIONS");
        ParentList.add("EHR MANAGER");
        ParentList.add("ANALYTICS & REPORTS");
        ParentList.add("NOTIFICATIONS");
        ParentList.add("PATIENT'S FEEDBACK");
        ParentList.add("SETTINGS");
        ParentList.add("EXIT");
    }
    String[] clinicName = {"Current Status"};
    String[] appointmentName = {"Add Appointment","Appointments List","Approved Appointments","Cancelled Appointments","Video Consultation"};
    String[] clinicmanagerName = {"Physio Staff","Admin Staff and Others"};
    String[] accountsName = {"Bills & Invoices","Expenses","Income","Wallet"};
    String[] treatmentName = {"Add Session","View Session"};
    String[] ehrName = {"Patients List"};
    String[] analyticsName = {"Clinic Health Report","Clinic Financial Report","Physio Performance Report","Marketing Report","Growth Report"};
    String[] notificationsName = {"notifications"};
    String[] patientfeedbackName = {"Feedback"};
    String[] settingsName = {"My Account","Password Change","My Profile","My Clinic details","My Invoice Settings","My Master Lists",
    "My Calendar Settings","Notifications"};
    String[] exitName = {"Logout"};
    String[] defaultName = {"Android Rion"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_navigation );

      getSupportActionBar().hide();

        drawerLayout = findViewById( R.id.drawer_layout );

        ParentListItems = new LinkedHashMap<>(  );
        for(String HoldItem : ParentList) {
            if (HoldItem.equals( "CLINIC TODAY" )) {
                loadChild( clinicName );
           }else if(HoldItem.equals("TREATMENT SESSIONS" )){
                loadChild(treatmentName);
            }else if(HoldItem.equals("APPOINTMENT MANAGER")) {
                loadChild( appointmentName );
            } else if(HoldItem.equals("EHR MANAGER")){
                loadChild(ehrName);
            } else if(HoldItem.equals("CLINIC MANAGER")){
                loadChild(clinicmanagerName);
            } else if(HoldItem.equals("ACCOUNTS MANAGER")){
                loadChild(accountsName);
            } else if(HoldItem.equals("ANALYTICS & REPORTS")){
                loadChild(analyticsName);
            } else if(HoldItem.equals("PATIENT'S FEEDBACK")){
                loadChild(patientfeedbackName);
            } else if(HoldItem.equals("NOTIFICATIONS")){
                loadChild(notificationsName);
            } else if(HoldItem.equals("SETTINGS")) {
                loadChild( settingsName );
            }else if(HoldItem.equals("EXIT")){
                loadChild(exitName);
            }else
                loadChild(defaultName);
            ParentListItems.put(HoldItem, ChildList);
        }
        expandableListView = findViewById( R.id.expandListView );
        final ExpandableListAdapter expandableListAdapter = new ListAdapter(this,ParentList,ParentListItems);
        expandableListView.setAdapter( expandableListAdapter );

        expandableListView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }
        } );


        expandableListView.setOnChildClickListener( new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                final String selected = (String) expandableListAdapter.getChild( groupPosition,childPosition );
                Intent intent;
                switch (selected){


                    case "Add Appointment":
                        intent = new Intent(MainActivity.this,MarsActivity.class);
                        startActivity( intent );
                        break;

                    case "Appointments List":
                        intent = new Intent(MainActivity.this,Appointedlist.class);
                        startActivity( intent );
                        break;
                    case "Approved Appointments":
                        intent = new Intent(MainActivity.this,ApprovePatient.class);
                        startActivity( intent );
                        break;

                    case "Cancelled Appointments":
                        intent = new Intent(MainActivity.this,CancelPage2.class);
                        startActivity( intent );
                        break;

                    case  "Physio Staff":
                        intent = new Intent(MainActivity.this,ClinicManager.class);
                        startActivity( intent );
                        break;


                    case  "Patients List":
                        intent = new Intent(MainActivity.this,patientlist.class);
                        startActivity( intent );
                        break;


                    case  "Bills & Invoices":
                        intent = new Intent(MainActivity.this,Bills.class);
                        startActivity( intent );
                        break;

                    case "Current Status":
                        intent = new Intent(MainActivity.this,JanuaryActivity.class);
                        startActivity( intent );
                        break;
                    case "Feedback":
                        intent = new Intent(MainActivity.this,Feedback.class);
                        startActivity( intent );
                        break;

                    case "Add Session":
                        intent = new Intent(MainActivity.this,TreatmentSess.class);
                        startActivity( intent );
                        break;

                    case "My Account":
                        intent = new Intent(MainActivity.this,Border2.class);
                        startActivity( intent );
                        break;

                    case "Password Change":
                        intent = new Intent(MainActivity.this,Password.class);
                        startActivity( intent );
                        break;

                    case "My Profile":
                        intent = new Intent(MainActivity.this,MyProfile.class);
                        startActivity( intent );
                        break;

                    case "My Clinic details":
                        intent = new Intent(MainActivity.this,MyClinic.class);
                        startActivity( intent );
                        break;
                    case "My Invoice Settings":
                        intent = new Intent(MainActivity.this,MyInvoice.class);
                        startActivity( intent );
                        break;
                    case "My Master Lists":
                        intent = new Intent(MainActivity.this,MyMaster.class);
                        startActivity( intent );
                        break;

                    case "My Calendar Settings":
                        intent = new Intent(MainActivity.this,MyCalender.class);
                        startActivity( intent );
                        break;
                    case  "Clinic Health Report":
                        intent = new Intent(MainActivity.this,HealthReport.class);
                        startActivity( intent );
                        break;
                    case  "Clinic Financial Report":
                        intent = new Intent(MainActivity.this,Financereport.class);
                        startActivity( intent );
                        break;
                    case  "Physio Performance Report":
                        intent = new Intent(MainActivity.this,physioperfm.class);
                        startActivity( intent );
                        break;
                    case  "Marketing Report":
                        intent = new Intent(MainActivity.this,marketingreport.class);
                        startActivity( intent );
                        break;
                    case  "Growth Report":
                        intent = new Intent(MainActivity.this,growthlayout.class);
                        startActivity( intent );
                        break;
                    case "Notifications":
                        intent = new Intent(MainActivity.this,MyNotifications.class);
                        startActivity( intent );
                        break;
                    case  "notifications":
                        intent = new Intent(MainActivity.this,Notification.class);
                        startActivity( intent );
                        break;




                }
                return true;

            }
        } );
    }



    private void loadChild(String[] ParentElementName){
        ChildList = new ArrayList<>(  );
        Collections.addAll( ChildList,ParentElementName );
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
