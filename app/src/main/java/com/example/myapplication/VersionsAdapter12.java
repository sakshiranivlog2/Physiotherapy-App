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

public class VersionsAdapter12 extends RecyclerView.Adapter<VersionsAdapter12.VersionVH> {

     private List<Versions12> versionsList12;


    public VersionsAdapter12(List<Versions12> versionsList12) {
        this.versionsList12 = versionsList12;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext()).inflate( R.layout.row12,parent,false );
        return new VersionVH( view );
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

        Versions12 versions = versionsList12.get( position );
       // holder.codeNameTxt.setImageResource( versions.getCodeName() );
        holder.versionTxt12.setText( versions.getVersion() );
     //   holder.apiLevelTxt.setText( versions.getApiLevel() );
        holder.descriptionTxt12.setImageResource( versions.getDescription() );

        boolean isExpandable = versionsList12.get( position ).isExpandable();
        holder.expandableLayout12.setVisibility( isExpandable ? View.VISIBLE : View.GONE );



    }

    @Override
    public int getItemCount() {
        return versionsList12.size();
    }



    class VersionVH extends RecyclerView.ViewHolder {

        TextView  versionTxt12;
        ImageView  descriptionTxt12;
        LinearLayout linearLayout12;
        RelativeLayout expandableLayout12;

        VersionVH(@NonNull View itemView) {
            super( itemView );

           // codeNameTxt = itemView.findViewById( R.id.code_name );
                 versionTxt12   = itemView.findViewById( R.id.version12 );
           //        apiLevelTxt = itemView.findViewById( R.id.api_level );
                 descriptionTxt12   = itemView.findViewById( R.id. description12);

                 linearLayout12 = itemView.findViewById( R.id.linear_layout12);
                 expandableLayout12 = itemView.findViewById( R.id.expandable_layout12 );

                 linearLayout12.setOnClickListener( new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Versions12 versions = versionsList12.get( getAdapterPosition());
                         versions.setExpandable(!versions.isExpandable() );
                         notifyItemChanged(getAdapterPosition());

                     }
                 } );

        }
    }
}
