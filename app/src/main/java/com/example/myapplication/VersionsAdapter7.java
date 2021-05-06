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

public class VersionsAdapter7 extends RecyclerView.Adapter<VersionsAdapter7.VersionVH> {

     private List<Versions7> versionsList7;


    public VersionsAdapter7(List<Versions7> versionsList) {
        this.versionsList7 = versionsList;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.row7,parent,false );
        return new VersionVH( view );
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

        Versions7 versions = versionsList7.get( position );
       // holder.codeNameTxt.setImageResource( versions.getCodeName() );
        holder.versionTxt7.setText( versions.getVersion() );
     //   holder.apiLevelTxt.setText( versions.getApiLevel() );
        holder.descriptionTxt7.setImageResource( versions.getDescription() );

        boolean isExpandable = versionsList7.get( position ).isExpandable();
        holder.expandableLayout7.setVisibility( isExpandable ? View.VISIBLE : View.GONE );



    }

    @Override
    public int getItemCount() {
        return versionsList7.size();
    }



    class VersionVH extends RecyclerView.ViewHolder {

        TextView  versionTxt7;
        ImageView  descriptionTxt7;
        LinearLayout linearLayout7;
        RelativeLayout expandableLayout7;

        VersionVH(@NonNull View itemView) {
            super( itemView );

           // codeNameTxt = itemView.findViewById( R.id.code_name );
                 versionTxt7   = itemView.findViewById( R.id.version7 );
           //        apiLevelTxt = itemView.findViewById( R.id.api_level );
                 descriptionTxt7   = itemView.findViewById( R.id. description7);

                 linearLayout7 = itemView.findViewById( R.id.linear_layout7);
                 expandableLayout7 = itemView.findViewById( R.id.expandable_layout7 );

                 linearLayout7.setOnClickListener( new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Versions7 versions = versionsList7.get( getAdapterPosition());
                         versions.setExpandable(!versions.isExpandable() );
                         notifyItemChanged(getAdapterPosition());

                     }
                 } );

        }
    }
}
