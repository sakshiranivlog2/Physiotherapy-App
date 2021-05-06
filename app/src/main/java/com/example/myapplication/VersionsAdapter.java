package com.example.myapplication;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VersionsAdapter extends RecyclerView.Adapter<VersionsAdapter.VersionVH> {

     private List<Versions> versionsList;

   // int previousItem = -1;

    VersionsAdapter(List<Versions> versionsList) {
        this.versionsList = versionsList;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.row,parent,false );
        return new VersionVH( view );
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

        Versions versions = versionsList.get( position );
        holder.codeNameTxt.setImageResource( versions.getCodeName() );
        holder.versionTxt.setText( versions.getVersion() );
        holder.apiLevelTxt.setText( versions.getApiLevel() );
        holder.descriptionTxt.setImageResource( versions.getDescription() );

        boolean isExpandable = versionsList.get( position ).isExpandable();
        holder.expandableLayout.setVisibility( isExpandable ? View.VISIBLE : View.GONE );



    }

    @Override
    public int getItemCount() {
        return versionsList.size();
    }



    class VersionVH extends RecyclerView.ViewHolder {

        TextView versionTxt, apiLevelTxt;
        ImageView codeNameTxt, descriptionTxt;
        LinearLayout linearLayout;
        RelativeLayout expandableLayout;

        VersionVH(@NonNull View itemView) {
            super( itemView );

            codeNameTxt = itemView.findViewById( R.id.code_name );
                 versionTxt   = itemView.findViewById( R.id.version );
                   apiLevelTxt = itemView.findViewById( R.id.api_level );
                 descriptionTxt   = itemView.findViewById( R.id. description);

                 linearLayout = itemView.findViewById( R.id.linear_layout );
                 expandableLayout = itemView.findViewById( R.id.expandable_layout );

                 linearLayout.setOnClickListener( new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Versions versions = versionsList.get( getAdapterPosition());
                         versions.setExpandable(!versions.isExpandable() );
                         notifyItemChanged(getAdapterPosition());

                     }
                 } );

        }
    }
}
