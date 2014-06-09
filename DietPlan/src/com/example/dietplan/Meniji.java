package com.example.dietplan;

import org.apache.http.entity.StringEntity;
import org.w3c.dom.Text;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import Class.TezaPodatki;

public class Meniji extends Activity {
	
	TezaPodatki podatkiteza = new TezaPodatki();
	double trenutnateza;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meniji);
        
        
        final EditText vnos = (EditText)findViewById(R.id.vnosteze);
        final TextView beljakovine = (TextView)findViewById(R.id.vnosbeljakovine);
        final TextView mascobe = (TextView)findViewById(R.id.vnosmascobe);
        final TextView ohaji = (TextView)findViewById(R.id.vnosohaji);
        final TextView belkcal = (TextView)findViewById(R.id.belkcal);
        final TextView maskcal = (TextView)findViewById(R.id.maskcal);
        final TextView ohkcal = (TextView)findViewById(R.id.ohkcal);
        final TextView skupnekalorije = (TextView)findViewById(R.id.skupnekalorije);
        final TextView odprimeni = (TextView)findViewById(R.id.pojdinameni);
        
        
       
        // shranjevanje podatkov
        
        /*save.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				podatkiteza.zapisi(Double.parseDouble( beljakovine.getText().toString()));
				getPreferences(MODE_PRIVATE).edit().putString("Name of variable",String.valueOf(trenutnateza)).commit();
				getPreferences(MODE_PRIVATE).edit().putString("Beljakovine",String.valueOf(beljakovine.getText().toString())).commit();
			}
		});
        
        load.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a = getPreferences(MODE_PRIVATE).getString("Name of variable",String.valueOf(trenutnateza));
				String as = getPreferences(MODE_PRIVATE).getString("Beljakovine",String.valueOf(trenutnateza));
				beljakovine.setText(a);
				mascobe.setText(as);
			}
		});*/
        
        vnos.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				
				double rezbeljakovine,rezmascobe,rezohaji,rezbelkcal,rezmaskcal,rezohkcal,skupnokcal;
				String ss = vnos.getText().toString().trim();
				if( ss.matches(""))
				{
					trenutnateza = 0;
					rezbeljakovine = 0;
					rezmascobe = 0;
					rezohaji = 0;
					rezbelkcal = 0;
					rezmaskcal = 0;
					rezohkcal = 0;
					skupnokcal = 0;
				}
				else
				{
					//pridobitev indexsov za izraèun vnosa dodatkov
				double indexB = podatkiteza.getIndexTMale();
				double indexM = podatkiteza.getIndexLMale();
				double indexO = podatkiteza.getIndexBMale();
					//pridobitev indexsov za izraèun vnosa kalorij
				double Bkcal = podatkiteza.getbelkcal();
				double Mkcal = podatkiteza.getmaskcal();
				double OHkcal = podatkiteza.getohkcal();
				
				trenutnateza = Double.parseDouble(vnos.getText().toString());
				rezbeljakovine = indexB * trenutnateza;
				rezmascobe = indexM * trenutnateza;
				rezohaji = indexO * trenutnateza;
				rezbelkcal = rezbeljakovine * Bkcal;
				rezmaskcal = rezmascobe * Mkcal;
				rezohkcal = rezohaji * OHkcal;
				skupnokcal = rezbelkcal + rezmaskcal + rezohkcal ;
				}
				beljakovine.setText(String.valueOf((int)rezbeljakovine));
				mascobe.setText(String.valueOf((int)rezmascobe));
				ohaji.setText(String.valueOf((int)rezohaji));
				belkcal.setText(String.valueOf((int)rezbelkcal));
				maskcal.setText(String.valueOf((int)rezmaskcal));
				ohkcal.setText(String.valueOf((int)rezohkcal));
				skupnekalorije.setText(String.valueOf((int)skupnokcal));
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				

			}
		});
        
        odprimeni.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(Meniji.this,Jedilnik.class);
                startActivity(myIntent);
			}
		});
        
        
    }
}
