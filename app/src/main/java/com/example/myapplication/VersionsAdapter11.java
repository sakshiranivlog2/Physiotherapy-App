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

public class VersionsAdapter11 extends RecyclerView.Adapter<VersionsAdapter11.VersionVH> {

     private List<Versions11> versionsList11;


    VersionsAdapter11(List<Versions11> versionsList) {
        this.versionsList11 = versionsList;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.row11,parent,false );
        return new VersionVH( view );
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

        Versions11 versions = versionsList11.get( position );
        // holder.codeNameTxt.setImageResource( versions.getCodeName() );
        holder.versionTxt11.setText( versions.getVersion() );
        //   holder.apiLevelTxt.setText( versions.getApiLevel() );
        holder.descriptionTxt11.setImageResource( versions.getDescription() );

        boolean isExpandable = versionsList11.get( position ).isExpandable();
        holder.expandableLayout11.setVisibility( isExpandable ? View.VISIBLE : View.GONE );



    }

    @Override
    public int getItemCount() {
       // return versionsList11.size();
        return null!=versionsList11?versionsList11.size():0;
    }


    class VersionVH extends RecyclerView.ViewHolder {

        TextView  versionTxt11;
        ImageView  descriptionTxt11;
        LinearLayout linearLayout11;
        RelativeLayout expandableLayout11;

        VersionVH(@NonNull View itemView) {
            super( itemView );

            // codeNameTxt = itemView.findViewById( R.id.code_name );
            versionTxt11   = itemView.findViewById( R.id.version11 );
            //        apiLevelTxt = itemView.findViewById( R.id.api_level );
            descriptionTxt11   = itemView.findViewById( R.id. description11);

            linearLayout11 = itemView.findViewById( R.id.linear_layout11);
            expandableLayout11 = itemView.findViewById( R.id.expandable_layout11 );

            linearLayout11.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Versions11 versions = versionsList11.get( getAdapterPosition());
                    versions.setExpandable(!versions.isExpandable() );
                    notifyItemChanged(getAdapterPosition());

                }
            } );

        }
    }
}
