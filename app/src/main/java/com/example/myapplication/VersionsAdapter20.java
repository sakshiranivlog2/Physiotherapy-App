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

public class VersionsAdapter20 extends RecyclerView.Adapter<VersionsAdapter20.VersionVH> {

     private List<Versions20> versionsList20;


    public VersionsAdapter20(List<Versions20> versionsList20) {
        this.versionsList20 = versionsList20;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.row20,parent,false );
        return new VersionVH( view );
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

        Versions20 versions = versionsList20.get( position );
       // holder.codeNameTxt.setImageResource( versions.getCodeName() );
        holder.versionTxt20.setText( versions.getVersion() );
     //   holder.apiLevelTxt.setText( versions.getApiLevel() );
        holder.descriptionTxt20.setImageResource( versions.getDescription() );

        boolean isExpandable = versionsList20.get( position ).isExpandable();
        holder.expandableLayout20.setVisibility( isExpandable ? View.VISIBLE : View.GONE );



    }

    @Override
    public int getItemCount() {
        return versionsList20.size();
    }



    class VersionVH extends RecyclerView.ViewHolder {

        TextView  versionTxt20;
        ImageView  descriptionTxt20;
        LinearLayout linearLayout20;
        RelativeLayout expandableLayout20;

        VersionVH(@NonNull View itemView) {
            super( itemView );

           // codeNameTxt = itemView.findViewById( R.id.code_name );
                 versionTxt20   = itemView.findViewById( R.id.version20 );
           //        apiLevelTxt = itemView.findViewById( R.id.api_level );
                 descriptionTxt20   = itemView.findViewById( R.id. description20);

                 linearLayout20 = itemView.findViewById( R.id.linear_layout20);
                 expandableLayout20 = itemView.findViewById( R.id.expandable_layout20);

                 linearLayout20.setOnClickListener( new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Versions20 versions = versionsList20.get( getAdapterPosition());
                         versions.setExpandable(!versions.isExpandable() );
                         notifyItemChanged(getAdapterPosition());

                     }
                 } );

        }
    }
}
