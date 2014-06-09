package com.example.dietplan;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import android.view.View.OnClickListener;;

public class GlavnoOkno extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glavno_okno);
        
        // zgodile so se spremembe
        final TabHost tabHost = getTabHost();
        // Tab for Photos
        TabSpec photospec = tabHost.newTabSpec("Male");
        // setting Title and Icon for the Tab
        photospec.setIndicator("Male", getResources().getDrawable(R.drawable.prvi));
        Intent photosIntent = new Intent(this, Male.class);
        photospec.setContent(photosIntent);
        
         
        // Tab for Songs
        TabSpec songspec = tabHost.newTabSpec("Female");       
        songspec.setIndicator("Female", getResources().getDrawable(R.drawable.prvi));
        Intent songsIntent = new Intent(this, Female.class);
        songspec.setContent(songsIntent);
                  
        // Adding all TabSpec to TabHost
        tabHost.addTab(photospec); // Adding photos tab
        tabHost.addTab(songspec); // Adding songs tab
        
        //vsem tabom nastavimo barvo in velikost texta
        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
			 TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
			 tv.setTextColor(Color.parseColor("#FFFFFF"));
			 tv.setTextSize(16);
			
        }
        // nastavimo zacetne slike tabom
        tabHost.getTabWidget().getChildAt(0).setBackgroundResource(R.drawable.select); // selected
        tabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.unselect); // unselected
        tabHost.setOnTabChangedListener(new OnTabChangeListener() {
			
			@Override
			public void onTabChanged(String tabId) {
				// TODO Auto-generated method stub
				for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
					tabHost.getTabWidget().getChildAt(i)
	                        .setBackgroundResource(R.drawable.unselect); // unselected
					
					
	            }
				tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab())
	                    .setBackgroundResource(R.drawable.select);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.glavno_okno, menu);
        return true;
    }
    
}
