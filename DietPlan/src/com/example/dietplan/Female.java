package com.example.dietplan;


import com.example.dietplan.R;

import android.app.Activity;
import android.content.Intent;
import android.media.JetPlayer;
import android.net.MailTo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Female extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pogled2);
        
        final Button transform = (Button)findViewById(R.id.transform);
        final Button losefat = (Button)findViewById(R.id.LoseFat);
        final Button buildmuscle = (Button)findViewById(R.id.BuildMuscle);
        
        transform.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				int u = v.getId();
				
				Intent myIntent = new Intent(Female.this,TransformOkno.class);
                myIntent.putExtra("id", "TransformFemale");
                startActivity(myIntent);
			}
		});
        
        losefat.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent = new Intent(Female.this, TransformOkno.class);
				myintent.putExtra("id", "LoseFatFemale");
                startActivity(myintent);
			}
		});
        
        buildmuscle.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent = new Intent(Female.this, TransformOkno.class);
				myintent.putExtra("id", "BuildMuscleFemale");
                startActivity(myintent);
			}
		});
        
    }
}
