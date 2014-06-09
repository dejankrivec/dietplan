package com.example.dietplan;

import com.example.dietplan.R.drawable;

import android.net.ParseException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Class.Http;

public class Forum extends Activity {

	Context context = this;
	TextView tv;
	  EditText write;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forum);
		
		
		
		final LinearLayout lv = (LinearLayout)findViewById(R.id.forumokno);
		final Button comment = (Button)findViewById(R.id.comment);
		//final Button b = (Button)findViewById(R.id.kk);	
		write = (EditText) findViewById(R.id.writecomment);
		comment.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(!write.getText().toString().equals(""))
				{
					tv = new TextView(context);
					LayoutParams paramsExample = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
				    tv.setTextColor(getResources().getColor(android.R.color.black));
				    tv.setPadding(10, 10, 10, 10);
				    tv.setTextSize(16); 
					tv.setText(write.getText().toString());
					tv.setLayoutParams(paramsExample);
					lv.addView(tv);
					
					try {
						writeToDb();
					} catch (URISyntaxException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		/*b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv = new TextView(context);
				LayoutParams paramsExample = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
			    tv.setTextColor(getResources().getColor(android.R.color.black));
			    tv.setPadding(10, 10, 10, 10);
			    tv.setTextSize(16); 
				tv.setText(tvs.getText().toString());
				tv.setLayoutParams(paramsExample);
				lv.addView(tv);
			}
		});*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.forum, menu);
		return true;
	}

	private void writeToDb() throws URISyntaxException
    {
            String link = "http://ferisrv5.uni-mb.si/~dk0216/wer.php?Data=" + write.getText().toString();
            URI url = new URI(link);
            HttpGetter get = new HttpGetter();
            get.execute(url);
            write.setText("");
    }
	
	private class HttpGetter extends AsyncTask<URI, Void, Void> {
		 
        @Override
        protected Void doInBackground(URI... urls) {
                // TODO Auto-generated method stub
                StringBuilder builder = new StringBuilder();
                HttpClient client = new DefaultHttpClient();
                HttpGet httpGet = new HttpGet(urls[0]);
               
                try {
                        HttpResponse response = client.execute(httpGet);
                        StatusLine statusLine = response.getStatusLine();
                        int statusCode = statusLine.getStatusCode();
                        if (statusCode == 200) {
                                HttpEntity entity = response.getEntity();
                                InputStream content = entity.getContent();
                                BufferedReader reader = new BufferedReader(
                                                new InputStreamReader(content));
                                String line;
                                while ((line = reader.readLine()) != null) {
                                        builder.append(line);
                                }
                                Log.v("Getter", "Your data: " + builder.toString()); //response data
                        } else {
                                Log.e("Getter", "Failed to download file");
                        }
                } catch (ClientProtocolException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }
               
                return null;
        }       
}        
}
