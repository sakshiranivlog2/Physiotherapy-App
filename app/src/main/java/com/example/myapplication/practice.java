package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class practice extends AppCompatActivity {

   private TextView mSum;
   private EditText mNumberOne, mNumberTwo;
   private Button mBtnAdd,mBtnView,mBtnShare;
   private  int mFirstNumber, mSecondNumber, mTotalSum;
   private LinearLayout mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_practice );


        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(  );
        StrictMode.setVmPolicy( builder.build() );
        builder.detectFileUriExposure();

        mSum = findViewById( R.id.sum_textview );
        mNumberOne= findViewById( R.id.number_one);
        mNumberTwo= findViewById( R.id.number_two );
        mBtnAdd= findViewById( R.id.btn_add );
        mBtnView= findViewById( R.id.btn_view );
        mLinearLayout = findViewById( R.id.btn_layout );

        mBtnAdd.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFirstNumber = Integer.parseInt( mNumberOne.getText().toString() );
               mSecondNumber = Integer.parseInt( mNumberTwo.getText().toString() );
               mTotalSum = mFirstNumber + mSecondNumber;
               mSum.setText( "Sum:"+mTotalSum );
               convertToPDF();


            }
        } );

        mBtnView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view = new Intent(practice.this, ViewPdfActivity.class );
                startActivity( view );
            }
        } );

        mBtnShare.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onsharePDF();
            }
        } );

    }

    private void onsharePDF() {
        String path = getExternalFilesDir( null ).getAbsolutePath().toString()+"/users.pdf";
        File file = new File( path );

        if(!file.exists()){
            Intent share = new Intent( );
            share.setAction( Intent.ACTION_SEND);
            share.putExtra( Intent.EXTRA_STREAM, Uri.fromFile(file) );
            share.setType( "application/pdf" );
            startActivity( share );


        }





    }

    private void convertToPDF() {
        String path = getExternalFilesDir( null ).getAbsolutePath().toString()+"/users.pdf";
        File file = new File( path );

        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }

        }

        Document document = new Document( PageSize.A4 );
        try{
            PdfWriter.getInstance(document, new FileOutputStream( file.getAbsoluteFile() ) );
        } catch (DocumentException | FileNotFoundException e){
            e.printStackTrace();
        }

        document.open();

        Font font = new Font( Font.FontFamily.COURIER,24);

        Paragraph paragraph = new Paragraph(  );
        paragraph.add(new Paragraph( "Sum: "+mTotalSum,font ));
        paragraph.add(new Paragraph( "\n" ));
        paragraph.add(new Paragraph( "First Number: "+mFirstNumber,font ));
        paragraph.add(new Paragraph( "\n" ));
        paragraph.add(new Paragraph( "Second Number: "+mSecondNumber,font ));


        try{

            document.add(paragraph);
        }catch (DocumentException e){
            e.printStackTrace();
        }

        document.close();
        Toast.makeText( practice.this,"PDF Document has been created",Toast.LENGTH_SHORT ).show();

    }


}
