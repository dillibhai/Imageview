package com.dilli.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private RadioButton rdomessi,rdorock,rdoeverst;
    ImageView imgview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdomessi=findViewById(R.id.rdomessi);
        rdorock=findViewById(R.id.rdorock);
        rdoeverst=findViewById(R.id.rdoeverest);

        imgview=findViewById(R.id.imgview);

        rdomessi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                imgview.setImageResource(R.drawable.messi);
            }
        });
        rdorock.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                imgview.setImageResource(R.drawable.rock);
            }
        });
        rdoeverst.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                imgview.setImageResource(R.drawable.mteverest);
            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}
