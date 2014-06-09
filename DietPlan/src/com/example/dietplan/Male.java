package com.example.dietplan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.dietplan.R;

public class Male extends Activity {
	
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pogled1);
        
        final Button transform = (Button)findViewById(R.id.transform);
        final Button losefat = (Button)findViewById(R.id.losefat);
        final Button buildmuscle = (Button)findViewById(R.id.buildmuscle);
        
        transform.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				int u = v.getId();
				
				Intent myIntent = new Intent(Male.this,TransformOkno.class);
                myIntent.putExtra("id", "Transform");
                startActivity(myIntent);
			}
		});
        
        losefat.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent = new Intent(Male.this, TransformOkno.class);
				myintent.putExtra("id", "LoseFat");
                startActivity(myintent);
			}
		});
        
        buildmuscle.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myintent = new Intent(Male.this, TransformOkno.class);
				myintent.putExtra("id", "BuildMuscle");
                startActivity(myintent);
			}
		});

        
        
    }
    
    
}
