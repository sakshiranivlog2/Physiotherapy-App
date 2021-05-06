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

public class VersionsAdapter9 extends RecyclerView.Adapter<VersionsAdapter9.VersionVH> {

     private List<Versions9> versionsList9;


    public VersionsAdapter9(List<Versions9> versionsList9) {
        this.versionsList9 = versionsList9;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.row9,parent,false );
        return new VersionVH( view );
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

        Versions9 versions = versionsList9.get( position );
       // holder.codeNameTxt.setImageResource( versions.getCodeName() );
        holder.versionTxt9.setText( versions.getVersion() );
     //   holder.apiLevelTxt.setText( versions.getApiLevel() );
        holder.descriptionTxt9.setImageResource( versions.getDescription() );

        boolean isExpandable = versionsList9.get( position ).isExpandable();
        holder.expandableLayout9.setVisibility( isExpandable ? View.VISIBLE : View.GONE );



    }

    @Override
    public int getItemCount() {
        return versionsList9.size();
    }



    class VersionVH extends RecyclerView.ViewHolder {

        TextView  versionTxt9;
        ImageView  descriptionTxt9;
        LinearLayout linearLayout9;
        RelativeLayout expandableLayout9;

        VersionVH(@NonNull View itemView) {
            super( itemView );

           // codeNameTxt = itemView.findViewById( R.id.code_name );
                 versionTxt9   = itemView.findViewById( R.id.version9 );
           //        apiLevelTxt = itemView.findViewById( R.id.api_level );
                 descriptionTxt9   = itemView.findViewById( R.id. description9);

                 linearLayout9 = itemView.findViewById( R.id.linear_layout9);
                 expandableLayout9 = itemView.findViewById( R.id.expandable_layout9 );

                 linearLayout9.setOnClickListener( new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Versions9 versions = versionsList9.get( getAdapterPosition());
                         versions.setExpandable(!versions.isExpandable() );
                         notifyItemChanged(getAdapterPosition());

                     }
                 } );

        }
    }
}
