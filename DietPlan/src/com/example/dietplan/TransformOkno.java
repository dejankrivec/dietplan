package com.example.dietplan;

import com.example.dietplan.R.drawable;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class TransformOkno extends Activity {

	String sender;
	Context context = this;
	String lastnik; // uporablajmo za senderja 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transform_okno);
		
		final Button go = (Button) findViewById(R.id.TransfomrgoFood);
		final Button bt1 = (Button) findViewById(R.id.t1);
		final Button bt2 = (Button) findViewById(R.id.t2);
		final Button bt3 = (Button) findViewById(R.id.t3);
		final TextView napis = (TextView) findViewById(R.id.napis);
		final ImageView image = (ImageView) findViewById(R.id.prikaznaslikica); 
		final ImageView graph = (ImageView) findViewById(R.id.graph);
		final ImageView forum = (ImageView)findViewById(R.id.forum);
		
		
		
		Bundle extras = getIntent().getExtras();
		sender = extras.getString("id");
		
		if(sender.equals("Transform"))
		{
			lastnik = "Transform";
			napis.setText("Transform information");
			image.setImageResource(R.drawable.transformeatfood);	
			bt1.setText("Ab Training: 6 Reasons Your Abs Aren't Showing");
			bt2.setText("Massive Motivation!");
			bt3.setText("Summer Shredded: Get A Beach-Ready Body");
			}
		if(sender.equals("LoseFat"))
		{
			lastnik = "LoseFat";
			napis.setText("Lose Fat information");
			image.setImageResource(R.drawable.losefateatfood);
			bt1.setText("Is Fasted Cardio The Best For Burning Fat?");
			bt2.setText("Body Fat Burnout!");
			bt3.setText("Body Fat Meltdown!");
			
		}
		if(sender.equals("BuildMuscle"))
		{
			lastnik = "BuildMuscle";
			napis.setText("Build Muscle information");
			image.setImageResource(R.drawable.muscleeatfood);
			bt1.setText("How To Build Muscle Without Adding Fat");
			bt2.setText("Massive Muscle Expansion");
			bt3.setText("Bigger Muscles, Better Body!");
		}
		if(sender.equals("TransformFemale"))
		{
			lastnik = "TransformFemale";
			napis.setText("Transform information");
			image.setImageResource(R.drawable.transformeatfood);	
			bt1.setText("Ab Training: 6 Reasons Your Abs Aren't Showing");
			bt2.setText("Body Transformation: Focused On Fitness!");
			bt3.setText("Beginner’s Training Guide: 5 Fitness Mistakes Women Make");
			}
		if(sender.equals("LoseFatFemale"))
		{
			lastnik = "LoseFatFemale";
			napis.setText("Lose Fat information");
			image.setImageResource(R.drawable.losefateatfood);
			bt1.setText("Health And Fitness Tips For The Busy Mom");
			bt2.setText("The Girls Guide To Supplements");
			bt3.setText("Competing For Bodybuilding: What You Need To Know To Begin!");
			
		}
		if(sender.equals("BuildMuscleFemale"))
		{
			lastnik = "BuildMuscleFemale";
			napis.setText("Build Muscle information");
			image.setImageResource(R.drawable.muscleeatfood);
			bt1.setText("5 Reasons You Should Support Women’s Bodybuilding");
			bt2.setText("Bodybuilding.com's Women's Guide.");
			bt3.setText("Competing For Bodybuilding: What You Need To Know To Begin!");
		}
		
		go.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent = new Intent(TransformOkno.this,Jedilnik.class);
				if(sender.equals("Transform"))
				{
					myIntent.putExtra("id","MaleTransform");
				}
				if(sender.equals("LoseFat"))
				{
					myIntent.putExtra("id","MaleLoseFat");
				}
				if(sender.equals("BuildMuscle"))
				{
					myIntent.putExtra("id","MaleBuildMuslce");
				}
				if(sender.equals("TransformFemale"))
				{
					myIntent.putExtra("id","FemaleTransform");
				}
				if(sender.equals("LoseFatFemale"))
				{
					myIntent.putExtra("id","FemaleLoseFat");
				}
				if(sender.equals("BuildMuscleFemale"))
				{
					myIntent.putExtra("id","FemaleBuildMuslce");
				}
                startActivity(myIntent);
			}
		});
		
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Dialog dialog = new Dialog(context);
				dialog.setTitle("Articles");
				dialog.setContentView(R.layout.clankidialog);
				if(sender.equals("Transform"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				if(sender.equals("LoseFat"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				if(sender.equals("BuildMuscle"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				if(sender.equals("TransformFemale"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				if(sender.equals("LoseFatFemale"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				if(sender.equals("BuildMuscleFemale"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				dialog.show();
			}
		});
		bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Dialog dialog = new Dialog(context);
				dialog.setTitle("Articles");
				dialog.setContentView(R.layout.clankidialog);
				if(sender.equals("Transform"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				if(sender.equals("LoseFat"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				if(sender.equals("BuildMuscle"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				if(sender.equals("TransformFemale"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				if(sender.equals("LoseFatFemale"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				if(sender.equals("BuildMuscleFemale"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				dialog.show();
			}
		});
		bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Dialog dialog = new Dialog(context);
				dialog.setTitle("Articles");
				dialog.setContentView(R.layout.clankidialog);
				if(sender.equals("Transform"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				if(sender.equals("LoseFat"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				if(sender.equals("BuildMuscle"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				if(sender.equals("TransformFemale"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				if(sender.equals("LoseFatFemale"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				if(sender.equals("BuildMuscleFemale"))
				{
					TextView a = (TextView)dialog.findViewById(R.id.text);
					a.setText(
					"Yesterday, you got a taste of the intensity and speed of the 30 Days Out " +
					"workouts. Today, try to get more comfortable with this programming and learn " +
					"how to push past the fatigue and keep moving. It's sometimes difficult to lift " +
					"with nearly max effort and solid form when your heart rate racing, but if you " +
					"keep practicing, you'll get better at it."+
					"Make sure you watch today's video. In it, you'll get to see me go through the" +
					"movements. If you aren't sure about form, you have some guidance. You'll also" +
					"get to see how cardio works and how best to approach your workouts."+
					"If you haven't read the nutrition overview page, do it right now. Getting" +
					"shredded is, ultimately, about what you eat. You can work as hard as you" + 
					"want in the gym, but if your nutrition isn't seriously perfect, you won't" +
					"uncover that photo-worthy physique."+
					"Use our nutrition calculator to determine exactly how many calories, carbs," +
					"fat, and protein you'll take in per meal. We've done all the hard work for "+
					"you—all you have to do is commit to following the program.");
				}
				dialog.show();
			}
		});
		
		graph.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent myIntent = new Intent(TransformOkno.this,Graph.class);
                myIntent.putExtra("id", lastnik);
                startActivity(myIntent);
			}
		});
		
		forum.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent myIntent = new Intent(TransformOkno.this, Forum.class);
				startActivity(myIntent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.transform_okno, menu);
		return true;
	}

}
