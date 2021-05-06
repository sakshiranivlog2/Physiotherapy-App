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

public class VersionsAdapter18 extends RecyclerView.Adapter<VersionsAdapter18.VersionVH> {

     private List<Versions18> versionsList18;


    public VersionsAdapter18(List<Versions18> versionsList) {
        this.versionsList18 = versionsList;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.row18,parent,false );
        return new VersionVH( view );
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

        Versions18 versions = versionsList18.get( position );
        holder.codeNameTxt18.setImageResource( versions.getCodeName() );
        holder.versionTxt18.setText( versions.getVersion() );
     //   holder.apiLevelTxt.setText( versions.getApiLevel() );
        holder.descriptionTxt18.setImageResource( versions.getDescription() );

        boolean isExpandable = versionsList18.get( position ).isExpandable();
        holder.expandableLayout18.setVisibility( isExpandable ? View.VISIBLE : View.GONE );



    }

    @Override
    public int getItemCount() {
        return versionsList18.size();
    }



    class VersionVH extends RecyclerView.ViewHolder {

        TextView  versionTxt18;
        ImageView  codeNameTxt18,descriptionTxt18;
        LinearLayout linearLayout18;
        RelativeLayout expandableLayout18;

        VersionVH(@NonNull View itemView) {
            super( itemView );

            codeNameTxt18 = itemView.findViewById( R.id.code_name18 );
                 versionTxt18   = itemView.findViewById( R.id.version18 );
           //        apiLevelTxt = itemView.findViewById( R.id.api_level );
                 descriptionTxt18   = itemView.findViewById( R.id. description18);

                 linearLayout18 = itemView.findViewById( R.id.linear_layout18 );
                 expandableLayout18 = itemView.findViewById( R.id.expandable_layout18 );

                 linearLayout18.setOnClickListener( new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Versions18 versions = versionsList18.get( getAdapterPosition());
                         versions.setExpandable(!versions.isExpandable() );
                         notifyItemChanged(getAdapterPosition());

                     }
                 } );

        }
    }
}
