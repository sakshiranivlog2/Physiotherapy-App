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

public class VersionsAdapter17 extends RecyclerView.Adapter<VersionsAdapter17.VersionVH> {

     private List<Versions17> versionsList17;


    public VersionsAdapter17(List<Versions17> versionsList) {
        this.versionsList17 = versionsList;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.row17,parent,false );
        return new VersionVH( view );
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

        Versions17 versions = versionsList17.get( position );
        holder.codeNameTxt17.setImageResource( versions.getCodeName() );
        holder.versionTxt17.setText( versions.getVersion() );
     //   holder.apiLevelTxt.setText( versions.getApiLevel() );
        holder.descriptionTxt17.setImageResource( versions.getDescription() );

        boolean isExpandable = versionsList17.get( position ).isExpandable();
        holder.expandableLayout17.setVisibility( isExpandable ? View.VISIBLE : View.GONE );



    }

    @Override
    public int getItemCount() {
        return versionsList17.size();
    }



    class VersionVH extends RecyclerView.ViewHolder {

        TextView  versionTxt17;
        ImageView  codeNameTxt17,descriptionTxt17;
        LinearLayout linearLayout17;
        RelativeLayout expandableLayout17;

        VersionVH(@NonNull View itemView) {
            super( itemView );

           codeNameTxt17 = itemView.findViewById( R.id.code_name17 );
                 versionTxt17  = itemView.findViewById( R.id.version17 );
           //        apiLevelTxt = itemView.findViewById( R.id.api_level );
                 descriptionTxt17   = itemView.findViewById( R.id. description17);

                 linearLayout17 = itemView.findViewById( R.id.linear_layout17 );
                 expandableLayout17 = itemView.findViewById( R.id.expandable_layout17 );

                 linearLayout17.setOnClickListener( new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Versions17 versions = versionsList17.get( getAdapterPosition());
                         versions.setExpandable(!versions.isExpandable() );
                         notifyItemChanged(getAdapterPosition());

                     }
                 } );

        }
    }
}
