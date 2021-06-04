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

public class VersionsAdapter19 extends RecyclerView.Adapter<VersionsAdapter19.VersionVH> {

     private List<Versions19> versionsList19;


    VersionsAdapter19(List<Versions19> versionsList) {
        this.versionsList19 = versionsList;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.row19,parent,false );
        return new VersionVH( view );
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

        Versions19 versions = versionsList19.get( position );
        // holder.codeNameTxt.setImageResource( versions.getCodeName() );
        holder.versionTxt19.setText( versions.getVersion() );
        //   holder.apiLevelTxt.setText( versions.getApiLevel() );
        holder.descriptionTxt19.setImageResource( versions.getDescription() );

        boolean isExpandable = versionsList19.get( position ).isExpandable();
        holder.expandableLayout19.setVisibility( isExpandable ? View.VISIBLE : View.GONE );



    }

    @Override
    public int getItemCount() {
       // return versionsList11.size();
        return null!=versionsList19?versionsList19.size():0;
    }


    class VersionVH extends RecyclerView.ViewHolder {

        TextView  versionTxt19;
        ImageView  descriptionTxt19;
        LinearLayout linearLayout19;
        RelativeLayout expandableLayout19;

        VersionVH(@NonNull View itemView) {
            super( itemView );

            // codeNameTxt = itemView.findViewById( R.id.code_name );
            versionTxt19   = itemView.findViewById( R.id.version19 );
            //        apiLevelTxt = itemView.findViewById( R.id.api_level );
            descriptionTxt19   = itemView.findViewById( R.id. description19);

            linearLayout19 = itemView.findViewById( R.id.linear_layout19);
            expandableLayout19 = itemView.findViewById( R.id.expandable_layout19 );

            linearLayout19.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Versions19 versions = versionsList19.get( getAdapterPosition());
                    versions.setExpandable(!versions.isExpandable() );
                    notifyItemChanged(getAdapterPosition());

                }
            } );

        }
    }
}
