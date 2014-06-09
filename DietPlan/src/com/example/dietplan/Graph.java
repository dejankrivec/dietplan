package com.example.dietplan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.dietplan.R.drawable;
import com.example.dietplan.R.layout;

import Class.BuildMuscleMaleFood;
import Class.InfoHranilneSnovi;
import Class.LoseFatMaleFood;
import Class.TransformMaleFood;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Graph extends Activity {

	float values[] = {600,350,50};
	List<Integer> RED = new ArrayList<Integer>();
	List<Integer> GREEN = new ArrayList<Integer>();
	List<Integer> BLUE = new ArrayList<Integer>();
	int z = 0;
	String sender;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_graph);
		
		
		final TextView pro = (TextView)findViewById(R.id.protset);
		final TextView fat = (TextView)findViewById(R.id.fatset);
		final TextView oh = (TextView)findViewById(R.id.ohset);
		final TextView kcal = (TextView)findViewById(R.id.totalkcalset);
		
		Bundle extras = getIntent().getExtras();
		sender = extras.getString("id");
		
		/*TransformMaleFood.nalozi();
		InfoHranilneSnovi.nalozi();
		List<String> a = new ArrayList<String>();
		a = TransformMaleFood.GetBeginList();*/
		
		/*for(int i = 0; i< a.size();i++)
		{
			String z = InfoHranilneSnovi.Kcal.get(a.get(i));
			if(z != null){
				float b = Float.parseFloat(z);
			
				TransformMaleFood.setkalorije(b);}
		}*/
		//kcal.setText(String.valueOf(TransformMaleFood.getkalorije()));
		if(sender.equals("Transform"))
		{
			pro.setText("60%");
			fat.setText("35%");
			oh.setText("5%");
			TransformMaleFood.nalozi();
			kcal.setText("3300");
			float b = Float.parseFloat(kcal.getText().toString());
			if(b > 3200)
			{
				kcal.setTextColor(Color.RED);
			}
			values[0] = 600;
			values[1] = 350;
			values[2] = 50;
		}
		if(sender.equals("LoseFat"))
		{
			pro.setText("35%");
			fat.setText("60%");
			oh.setText("5%");
			LoseFatMaleFood.nalozi();
			kcal.setText("2000");
			float b = Float.parseFloat(kcal.getText().toString());
			if(b > 2000)
			{
				kcal.setTextColor(Color.RED);
			}
			values[0] = 350;
			values[1] = 600;
			values[2] = 50;
		}
		if(sender.equals("BuildMuscle"))
		{
			pro.setText("50%");
			fat.setText("10%");
			oh.setText("40%");
			BuildMuscleMaleFood.nalozi();
			kcal.setText("4200");
			float b = Float.parseFloat(kcal.getText().toString());
			if(b > 4200)
			{
				kcal.setTextColor(Color.RED);
			}
			values[0] = 500;
			values[1] = 100;
			values[2] = 400;
		}
		if(sender.equals("TransformFemale"))
		{
			pro.setText("60%");
			fat.setText("35%");
			oh.setText("5%");
			BuildMuscleMaleFood.nalozi();
			kcal.setText("4200");
			float b = Float.parseFloat(kcal.getText().toString());
			if(b > 4200)
			{
				kcal.setTextColor(Color.RED);
			}
			values[0] = 600;
			values[1] = 350;
			values[2] = 50;
		}
		if(sender.equals("LoseFatFemale"))
		{
			pro.setText("35%");
			fat.setText("60%");
			oh.setText("5%");
			BuildMuscleMaleFood.nalozi();
			kcal.setText("4200");
			float b = Float.parseFloat(kcal.getText().toString());
			if(b > 4200)
			{
				kcal.setTextColor(Color.RED);
			}
			values[0] = 350;
			values[1] = 600;
			values[2] = 50;
		}
		if(sender.equals("BuildMuscleFemale"))
		{
			pro.setText("50%");
			fat.setText("10%");
			oh.setText("40%");
			BuildMuscleMaleFood.nalozi();
			kcal.setText("4200");
			float b = Float.parseFloat(kcal.getText().toString());
			if(b > 4200)
			{
				kcal.setTextColor(Color.RED);
			}
			values[0] = 500;
			values[1] = 100;
			values[2] = 400;
		}
		
		LinearLayout lv1 = (LinearLayout) findViewById(R.id.graph);
		RED.add(2);RED.add(221);RED.add(0);
		GREEN.add(3);GREEN.add(0);GREEN.add(0);
		BLUE.add(244);BLUE.add(12);BLUE.add(0);
		values = calculateData(values);  
		MyGraphview graphview = new MyGraphview(this, values);  
		graphview.setBackgroundResource(R.drawable.images);		
		lv1.addView(graphview);  
	}

	private float[] calculateData(float[] data) 
	{  
		float total = 0;  
		for (int i = 0; i < data.length; i++) 
		{  
			total += data[i];  
		}  
		for (int i = 0; i < data.length; i++) 
		{  
			data[i] = 360 * (data[i] / total);  
		}  
		return data;  
	}  
	
	public class MyGraphview extends View 
	{  
		private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);  
		private float[] value_degree;  
		RectF rectf = new RectF(120, 120, 380, 380);  
		float temp = 0;  
		
		public MyGraphview(Context context, float[] values) 
		{  
			super(context);  
			value_degree = new float[values.length];  
			for (int i = 0; i < values.length; i++) 
			{  
				value_degree[i] = values[i];  
			}  
		}  
		protected void onDraw(Canvas canvas) 
		{  
			super.onDraw(canvas);  
			Random r;  
			for (int i = 0; i < value_degree.length; i++) 
			{  
				if (i == 0) 
				{  
					r = new Random();  
					int color = Color.argb(100, r.nextInt(256), r.nextInt(256),  
					r.nextInt(256));  
					paint.setColor(Color.rgb(RED.get(z),GREEN.get(z),BLUE.get(z)));  
					z++;
					canvas.drawArc(rectf, 0, value_degree[i], true, paint);  
				} 
				else 
				{  
					temp += value_degree[i - 1];  
					r = new Random();  
					int color = Color.argb(255, r.nextInt(256), r.nextInt(256),  
					r.nextInt(256));  
					paint.setColor(Color.rgb(RED.get(z),GREEN.get(z),BLUE.get(z)));
					z++;
					canvas.drawArc(rectf, temp, value_degree[i], true, paint);  
				}  
			}  
		}    
	}  
		 
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.graph, menu);
		return true;
	}

}
