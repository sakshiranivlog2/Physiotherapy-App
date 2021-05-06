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

public class VersionsAdapter14 extends RecyclerView.Adapter<VersionsAdapter14.VersionVH> {

     private List<Versions14> versionsList14;


    public VersionsAdapter14(List<Versions14> versionsList14) {
        this.versionsList14 = versionsList14;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.row14,parent,false );
        return new VersionVH( view );
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

        Versions14 versions = versionsList14.get( position );
       // holder.codeNameTxt.setImageResource( versions.getCodeName() );
        holder.versionTxt14.setText( versions.getVersion() );
     //   holder.apiLevelTxt.setText( versions.getApiLevel() );
        holder.descriptionTxt14.setImageResource( versions.getDescription() );

        boolean isExpandable = versionsList14.get( position ).isExpandable();
        holder.expandableLayout14.setVisibility( isExpandable ? View.VISIBLE : View.GONE );



    }

    @Override
    public int getItemCount() {
        return versionsList14.size();
    }



    class VersionVH extends RecyclerView.ViewHolder {

        TextView  versionTxt14;
        ImageView  descriptionTxt14;
        LinearLayout linearLayout14;
        RelativeLayout expandableLayout14;

        VersionVH(@NonNull View itemView) {
            super( itemView );

           // codeNameTxt = itemView.findViewById( R.id.code_name );
                 versionTxt14   = itemView.findViewById( R.id.version14 );
           //        apiLevelTxt = itemView.findViewById( R.id.api_level );
                 descriptionTxt14   = itemView.findViewById( R.id. description14);

                 linearLayout14 = itemView.findViewById( R.id.linear_layout14);
                 expandableLayout14 = itemView.findViewById( R.id.expandable_layout14 );

                 linearLayout14.setOnClickListener( new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Versions14 versions = versionsList14.get( getAdapterPosition());
                         versions.setExpandable(!versions.isExpandable() );
                         notifyItemChanged(getAdapterPosition());

                     }
                 } );

        }
    }
}
