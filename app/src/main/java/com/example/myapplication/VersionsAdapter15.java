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

public class VersionsAdapter15 extends RecyclerView.Adapter<VersionsAdapter15.VersionVH> {

     private List<Versions15> versionsList15;


    public VersionsAdapter15(List<Versions15> versionsList15) {
        this.versionsList15 = versionsList15;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.row15,parent,false );
        return new VersionVH( view );
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

        Versions15 versions = versionsList15.get( position );
       // holder.codeNameTxt.setImageResource( versions.getCodeName() );
        holder.versionTxt15.setText( versions.getVersion() );
     //   holder.apiLevelTxt.setText( versions.getApiLevel() );
        holder.descriptionTxt15.setImageResource( versions.getDescription() );

        boolean isExpandable = versionsList15.get( position ).isExpandable();
        holder.expandableLayout15.setVisibility( isExpandable ? View.VISIBLE : View.GONE );



    }

    @Override
    public int getItemCount() {
        return versionsList15.size();
    }



    class VersionVH extends RecyclerView.ViewHolder {

        TextView  versionTxt15;
        ImageView  descriptionTxt15;
        LinearLayout linearLayout15;
        RelativeLayout expandableLayout15;

        VersionVH(@NonNull View itemView) {
            super( itemView );

           // codeNameTxt = itemView.findViewById( R.id.code_name );
                 versionTxt15   = itemView.findViewById( R.id.version15 );
           //        apiLevelTxt = itemView.findViewById( R.id.api_level );
                 descriptionTxt15   = itemView.findViewById( R.id. description15);

                 linearLayout15 = itemView.findViewById( R.id.linear_layout15);
                 expandableLayout15 = itemView.findViewById( R.id.expandable_layout15 );

                 linearLayout15.setOnClickListener( new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Versions15 versions = versionsList15.get( getAdapterPosition());
                         versions.setExpandable(!versions.isExpandable() );
                         notifyItemChanged(getAdapterPosition());

                     }
                 } );

        }
    }
}
