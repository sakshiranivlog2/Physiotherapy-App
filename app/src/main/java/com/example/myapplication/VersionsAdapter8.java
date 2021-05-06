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

public class VersionsAdapter8 extends RecyclerView.Adapter<VersionsAdapter8.VersionVH> {

     private List<Versions8> versionsList8;


    public VersionsAdapter8(List<Versions8> versionsList) {
        this.versionsList8 = versionsList;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.row8,parent,false );
        return new VersionVH( view );
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

        Versions8 versions = versionsList8.get( position );
       // holder.codeNameTxt.setImageResource( versions.getCodeName() );
        holder.versionTxt8.setText( versions.getVersion() );
     //   holder.apiLevelTxt.setText( versions.getApiLevel() );
        holder.descriptionTxt8.setImageResource( versions.getDescription() );

        boolean isExpandable = versionsList8.get( position ).isExpandable();
        holder.expandableLayout8.setVisibility( isExpandable ? View.VISIBLE : View.GONE );



    }

    @Override
    public int getItemCount() {
        return versionsList8.size();
    }



    class VersionVH extends RecyclerView.ViewHolder {

        TextView  versionTxt8;
        ImageView  descriptionTxt8;
        LinearLayout linearLayout8;
        RelativeLayout expandableLayout8;

        VersionVH(@NonNull View itemView) {
            super( itemView );

           // codeNameTxt = itemView.findViewById( R.id.code_name );
                 versionTxt8   = itemView.findViewById( R.id.version8 );
           //        apiLevelTxt = itemView.findViewById( R.id.api_level );
                 descriptionTxt8   = itemView.findViewById( R.id. description8);

                 linearLayout8 = itemView.findViewById( R.id.linear_layout8 );
                 expandableLayout8 = itemView.findViewById( R.id.expandable_layout8 );

                 linearLayout8.setOnClickListener( new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Versions8 versions = versionsList8.get( getAdapterPosition());
                         versions.setExpandable(!versions.isExpandable() );
                         notifyItemChanged(getAdapterPosition());

                     }
                 } );

        }
    }
}
