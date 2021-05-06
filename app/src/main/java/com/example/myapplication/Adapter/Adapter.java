package com.example.myapplication.Adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.myapplication.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.VersionVH> {

     private List<Versionsaddd> versionsList;
    public Adapter(List<Versionsaddd> versionsList) {
        this.versionsList = versionsList;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.row2,parent,false );
       // VersionVH holder = new VersionVH( view );
        return new VersionVH( view );
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

        Versionsaddd versions = versionsList.get( position );
        holder.codeNameTxt2.setImageResource( versions.getCodeName() );
        holder.versionTxt9.setText( versions.getVersion() );
    //    holder.apiLevelTxt.setText( versions.getApiLevel() );
        holder.descriptionTxt2.setImageResource( versions.getDescription() );

        boolean isExpandable = versionsList.get( position ).isExpandable();
        holder.expandableLayout2.setVisibility( isExpandable ? View.VISIBLE : View.GONE );



    }

    @Override
    public int getItemCount() {
        return versionsList.size();
    }



    class VersionVH extends RecyclerView.ViewHolder {

        TextView versionTxt9;
        ImageView codeNameTxt2, descriptionTxt2;
        LinearLayout linearLayout2;
        RelativeLayout expandableLayout2;

        VersionVH(@NonNull View itemView) {
            super( itemView );

            codeNameTxt2 = itemView.findViewById( R.id.code_name2 );
                 versionTxt9   = itemView.findViewById( R.id.version9 );
                 descriptionTxt2   = itemView.findViewById( R.id. description2);

                 linearLayout2 = itemView.findViewById( R.id.linear_layout2);
                 expandableLayout2 = itemView.findViewById( R.id.expandable_layout2 );

                 linearLayout2.setOnClickListener( new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Versionsaddd versions = versionsList.get( getAdapterPosition());
                         versions.setExpandable(!versions.isExpandable() );
                         notifyItemChanged(getAdapterPosition());

                     }
                 } );

        }
    }
}
