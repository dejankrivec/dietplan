package com.example.dietplan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.provider.Telephony.Sms.Conversations;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import Class.AdapterDialog;
import Class.AdapterList;
import Class.BuildMuscleFemaleFood;
import Class.Jedi;
import Class.BuildMuscleMaleFood;
import Class.LoseFatFemaleFood;
import Class.LoseFatMaleFood;
import Class.TransformFemaleFood;
import Class.TransformMaleFood;

public class Jedilnik extends Activity {

	ListView lv;
	ListView lista;
	String imejedi;
	int item;
	String sender;
	AdapterList adapter;
	List<String> pomoznalista = new ArrayList<String>();
	final Context context = this;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jedilnik);
			
			
		 lista = (ListView) findViewById(R.id.listajedi);
		 TransformMaleFood.nalozi();
		 LoseFatMaleFood.nalozi();
		 BuildMuscleMaleFood.nalozi();
		 TransformFemaleFood.nalozi();
		 LoseFatFemaleFood.nalozi();
		 BuildMuscleFemaleFood.nalozi();
		 Jedi.nalozi();
		 // pridobimo senderja
		 Bundle extras = getIntent().getExtras(); 
		 sender = extras.getString("id");
		 if(sender.equals("MaleTransform"))
	 		{
			 	adapter = new AdapterList(this,TransformMaleFood.GetBeginList());
				lista.setAdapter(adapter);	
			}
	 		if(sender.equals("MaleLoseFat"))
	 		{		
	 			adapter = new AdapterList(this,LoseFatMaleFood.GetBeginList());
				lista.setAdapter(adapter);
			}
	 		if(sender.equals("MaleBuildMuslce"))
	 		{
	 			adapter = new AdapterList(this,BuildMuscleMaleFood.GetBeginList());
				lista.setAdapter(adapter);
			}
	 		if(sender.equals("FemaleTransform"))
	 		{
			 	adapter = new AdapterList(this,TransformFemaleFood.GetBeginList());
				lista.setAdapter(adapter);	
			}
	 		if(sender.equals("FemaleLoseFat"))
	 		{		
	 			adapter = new AdapterList(this,LoseFatFemaleFood.GetBeginList());
				lista.setAdapter(adapter);
			}
	 		if(sender.equals("FemaleBuildMuslce"))
	 		{
	 			adapter = new AdapterList(this,BuildMuscleFemaleFood.GetBeginList());
				lista.setAdapter(adapter);
			}
		 
	 	 final AdapterDialog dialogadapter = new AdapterDialog(this,Jedi.getDodatnaLista());
		 
		 lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		      @Override
		      public void onItemClick(final AdapterView<?> parent, final View view,
		          final int position, long id) {
		    	  
		    	  String a = (String) parent.getItemAtPosition(position);
		    	  //String selected = ((ImageView) view.findViewById(R.id.more)).getContext().toString();
   	  
		    	if(!a.equals("Meal 1") && !a.equals("Meal 2") && !a.equals("Meal 3") && !a.equals("Meal 4") && !a.equals("Meal 5") &&
		    			!a.equals("Meal 6") && !a.equals("Meal 7") && !a.equals("Meal 8") && !a.equals("Meal 9") && !a.equals("Meal 4: Pre-workout") &&
		    			!a.equals("Meal 5: Post-workout") && !a.equals("Meal 8: Before Bed"))
		    	{
			        final Dialog dialog = new Dialog(context);
					dialog.setContentView(R.layout.dialoglistitem);
					lv = (ListView ) dialog.findViewById(R.id.dodatnejedi);
			 		lv.setAdapter(dialogadapter);
			 		//Toast.makeText(getApplicationContext(), sender, Toast.LENGTH_SHORT).show();
			 		if(sender.equals("MaleTransform"))
			 		{
			 			dialog.setTitle("MaleTransform");
			 			dialog.show();
			 			lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	
							@Override
							public void onItemClick(AdapterView<?> arg0, View arg1,
									int arg2, long arg3) {
								// TODO Auto-generated method stub
								imejedi = (String) lv.getItemAtPosition(arg2);
								TransformMaleFood.UpdateItem(imejedi,position);
								PonovnoNaloziListView(); // ponovno nalozimo listview ko updatemo listo jedi
								dialog.dismiss();

							}
							
						});
					}
			 		if(sender.equals("MaleLoseFat"))
			 		{
			 			dialog.setTitle("MaleLoseFat");
			 			dialog.show();
			 			lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	
							@Override
							public void onItemClick(AdapterView<?> arg0, View arg1,
									int arg2, long arg3) {
								// TODO Auto-generated method stub
								imejedi = (String) lv.getItemAtPosition(arg2);
								LoseFatMaleFood.UpdateItem(imejedi,position);
								PonovnoNaloziListView();
								dialog.dismiss();
							}
							
						});
					}
			 		if(sender.equals("MaleBuildMuslce"))
			 		{
			 			dialog.setTitle("MaleBuildMuslce");
			 			dialog.show();
			 			lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	
							@Override
							public void onItemClick(AdapterView<?> arg0, View arg1,
									int arg2, long arg3) {
								// TODO Auto-generated method stub
								imejedi = (String) lv.getItemAtPosition(arg2);
								BuildMuscleMaleFood.UpdateItem(imejedi,position);
								PonovnoNaloziListView();
								dialog.dismiss();
								;
							}
							
						});
					}
			 		if(sender.equals("FemaleTransform"))
			 		{
			 			dialog.setTitle("FemaleTransform");
			 			dialog.show();
			 			lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	
							@Override
							public void onItemClick(AdapterView<?> arg0, View arg1,
									int arg2, long arg3) {
								// TODO Auto-generated method stub
								imejedi = (String) lv.getItemAtPosition(arg2);
								TransformFemaleFood.UpdateItem(imejedi,position);
								PonovnoNaloziListView();
								dialog.dismiss();
								;
							}
							
						});
					}
			 		if(sender.equals("FemaleLoseFat"))
			 		{
			 			dialog.setTitle("FemaleLoseFat");
			 			dialog.show();
			 			lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	
							@Override
							public void onItemClick(AdapterView<?> arg0, View arg1,
									int arg2, long arg3) {
								// TODO Auto-generated method stub
								imejedi = (String) lv.getItemAtPosition(arg2);
								LoseFatFemaleFood.UpdateItem(imejedi,position);
								PonovnoNaloziListView();
								dialog.dismiss();
								;
							}
							
						});
					}
			 		if(sender.equals("FemaleBuildMuslce"))
			 		{
			 			dialog.setTitle("FemaleBuildMuslce");
			 			dialog.show();
			 			lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	
							@Override
							public void onItemClick(AdapterView<?> arg0, View arg1,
									int arg2, long arg3) {
								// TODO Auto-generated method stub
								imejedi = (String) lv.getItemAtPosition(arg2);
								BuildMuscleFemaleFood.UpdateItem(imejedi,position);
								PonovnoNaloziListView();
								dialog.dismiss();
								;
							}
							
						});
					}
		 		
				}
		      }
		    });
		  }
	
	public void PonovnoNaloziListView()
	{
		if(sender.equals("MaleTransform"))
 		{
			adapter = new AdapterList(this,TransformMaleFood.GetBeginList());
			lista.setAdapter(adapter);
 		}
		if(sender.equals("MaleLoseFat"))
 		{
			adapter = new AdapterList(this,LoseFatMaleFood.GetBeginList());
			lista.setAdapter(adapter);
 		}
		if(sender.equals("MaleBuildMuslce"))
 		{
			adapter = new AdapterList(this,BuildMuscleMaleFood.GetBeginList());
			lista.setAdapter(adapter);
 		}
		if(sender.equals("FemaleTransform"))
 		{
			adapter = new AdapterList(this,TransformFemaleFood.GetBeginList());
			lista.setAdapter(adapter);
 		}	
		if(sender.equals("FemaleLoseFat"))
 		{
			adapter = new AdapterList(this,LoseFatFemaleFood.GetBeginList());
			lista.setAdapter(adapter);
 		}	
		if(sender.equals("FemaleBuildMuslce"))
 		{
			adapter = new AdapterList(this,BuildMuscleFemaleFood.GetBeginList());
			lista.setAdapter(adapter);
 		}	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jedilnik, menu);
		return true;
	}

}
