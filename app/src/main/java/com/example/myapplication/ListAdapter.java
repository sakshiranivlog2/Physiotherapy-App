package com.example.myapplication;

import android.app.Activity;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ListAdapter extends BaseExpandableListAdapter {

    private Activity context;
    private Map<String, List<String>> ParentListItems;
    private List<String> Items;

    ListAdapter(Activity context, List<String> Items, Map<String,List<String>> ParentListItems)
    {
        this.context = context;
        this.ParentListItems = ParentListItems;
        this.Items = Items;
    }

    @Override
    public int getGroupCount() {
        return Items.size();
    }




    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String string = (String) getGroup( groupPosition );
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            assert layoutInflater != null;
            convertView = layoutInflater.inflate( R.layout.parent_item,null );
        }
        TextView item = convertView.findViewById(R.id.textParent);
        ImageView img = convertView.findViewById( R.id.imageView1 );

        item.setText( string );

        if(string=="CLINIC TODAY")
        {
            img.setImageResource( R.drawable.ct);

        }
        else
        if(string=="TREATMENT SESSIONS")
        {
            img.setImageResource( R.drawable.treat );
        }
        else
        if(string=="APPOINTMENT MANAGER")
        {
            img.setImageResource( R.drawable.appointment );
        }
        else
        if(string=="EHR MANAGER")
        {
            img.setImageResource( R.drawable.ehrff);
        }
        else
        if(string=="CLINIC MANAGER")
        {
            img.setImageResource( R.drawable.cm );
        }
        else
        if(string=="ACCOUNTS MANAGER")
        {
            img.setImageResource( R.drawable.accounts);
        }
        else
        if(string=="ANALYTICS & REPORTS")
        {
            img.setImageResource( R.drawable.analytics);
        }
        else
        if(string=="PATIENT'S FEEDBACK")
        {
            img.setImageResource( R.drawable.feedback );
        }
        else
        if(string=="NOTIFICATIONS")
        {
            img.setImageResource( R.drawable.notifications );
        }
        else
        if(string=="SETTINGS")
        {
            img.setImageResource( R.drawable.ic_settings );
        }
        else
        if(string=="EXIT")
        {
            img.setImageResource( R.drawable.exitff );
        }
        return convertView;
    }


    @Override
    public int getChildrenCount(int groupPosition) {
        return Objects.requireNonNull( ParentListItems.get( Items.get(groupPosition) ) ).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return Items.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return Objects.requireNonNull( ParentListItems.get( Items.get(groupPosition) ) ).get( childPosition );
    }
    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String childName = (String) getChild( groupPosition , childPosition);
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView == null){
            convertView = inflater.inflate( R.layout.child_item,null );
        }
        TextView item =convertView.findViewById(R.id.textChild);
       // item.setText( childName );
        ImageView img = convertView.findViewById( R.id.imageView2 );

        item.setText( childName );

        if(childName=="Add Session")
        {
            img.setImageResource( R.drawable.sessiona);

        }
        else
        if(childName=="View Session")
        {
            img.setImageResource( R.drawable.session);
        }
        else
        if(childName=="Add Appointment")
        {
            img.setImageResource( R.drawable.appointa );
        }
        else
        if(childName=="Appointments List")
        {
            img.setImageResource( R.drawable.appointl);
        }
        else
        if(childName=="Approved Appointments")
        {
            img.setImageResource( R.drawable.approve );
        }
        else
        if(childName=="Cancelled Appointments")
        {
            img.setImageResource( R.drawable.cancel);
        }
        else
        if(childName=="Video Consultation")
        {
            img.setImageResource( R.drawable.video );
        }
        else
        if(childName=="Patients List")
        {
            img.setImageResource( R.drawable.list);
        }
        else
        if(childName=="Digital Exercises")
        {
            img.setImageResource( R.drawable.exercise );
        }
        else
        if(childName=="Digital Prescription")
        {
            img.setImageResource( R.drawable.pres);
        }
        else
        if(childName=="Physio Staff")
        {
            img.setImageResource( R.drawable.staff);
        }
        else
        if(childName=="Admin Staff and Others")
        {
            img.setImageResource( R.drawable.admin);
        }
        else
        if(childName=="Bills & Invoices")
        {
            img.setImageResource( R.drawable.bill );
        }
        else
        if(childName=="Expenses")
        {
            img.setImageResource( R.drawable.exp);
        }
        else
        if(childName=="Income")
        {
            img.setImageResource( R.drawable.inc);
        }
        else
        if(childName=="Wallet")
        {
            img.setImageResource( R.drawable.wallet);
        }
        else
        if(childName=="Financial Reports")
        {
            img.setImageResource( R.drawable.finance);
        }
        else
        if(childName=="Physio Performance Index")
        {
            img.setImageResource( R.drawable.physio);
        }
        else
        if(childName=="Marketing Reports")
        {
            img.setImageResource( R.drawable.market);
        }
        else
        if(childName=="Patients List")
        {
            img.setImageResource( R.drawable.list);
        }
        if(childName=="Others")
        {
            img.setImageResource( R.drawable.other);
        }
        else
        if(childName=="Current Status")
        {
            img.setImageResource( R.drawable.cs);
        }
        else
        if(childName=="Feedback")
        {
            img.setImageResource( R.drawable.feedbackp);
        }
        else
        if(childName=="Logout")
        {
            img.setImageResource( R.drawable.logout);
        }

        return convertView;
    }




    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

}
