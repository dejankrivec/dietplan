package Class;

import java.util.ArrayList;
import java.util.List;

import com.example.dietplan.R;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import Class.BuildMuscleMaleFood;
import android.view.View.OnClickListener;

public class AdapterList extends ArrayAdapter<String> {

	  private final Context context;
	  private final List<String>  values;
	  public AdapterList(Context context, List<String> values) {
	    super(context, R.layout.liststyle, values);
	    this.context = context;
	    this.values = values;
	  }
	  public View getView(final int position, View convertView, ViewGroup parent) {
		    LayoutInflater inflater = (LayoutInflater) context
		        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		    View rowView = inflater.inflate(R.layout.liststyle, parent, false);
		    View rowView1 = inflater.inflate(R.layout.liststyleheader, parent, false);
		   
		    if(values.get(position) == "Meal 1" || values.get(position) == "Meal 2" ||
		    		values.get(position) == "Meal 3" || values.get(position) == "Meal 4" ||
		    		values.get(position) == "Meal 5" || values.get(position) == "Meal 6" ||
		    		values.get(position) == "Meal 7" || values.get(position) == "Meal 8" ||
		    		values.get(position) == "Meal 9" || values.get(position) == "Meal 4: Pre-workout" ||
		    		values.get(position) == "Meal 5: Post-workout" || values.get(position) == "Meal 8: Before Bed")
		    {
		    	TextView text1 = (TextView) rowView1.findViewById(R.id.prvajed);
		    	text1.setText(values.get(position));
		    	return rowView1;
		    }
		    else
		    {
		    	TextView text1 = (TextView) rowView.findViewById(R.id.prvajed);
		    	text1.setText(values.get(position));
		    	ImageView img1 = (ImageView) rowView.findViewById(R.id.slika1);
		    	img1.setImageResource(Jedi.map.get(values.get(position)));
		    	ImageView more = (ImageView) rowView.findViewById(R.id.more);
		    	more.setBackgroundResource(R.drawable.more);
		    	
		    	more.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						InfoHranilneSnovi.nalozi();
						Dialog dialog = new Dialog(context);
						dialog.setContentView(R.layout.hranilne_vrednosti);
						TextView kcal = (TextView)dialog.findViewById(R.id.kcalserving);
						TextView prot = (TextView)dialog.findViewById(R.id.proteinserving);
						TextView fat = (TextView)dialog.findViewById(R.id.fatserving);
						TextView oh = (TextView)dialog.findViewById(R.id.Ohserving);
						kcal.setText(InfoHranilneSnovi.Kcal.get(values.get(position)) +" g");
						prot.setText(InfoHranilneSnovi.Beljakovine.get(values.get(position)) +" g");
						fat.setText(InfoHranilneSnovi.Mascobe.get(values.get(position)) +" g");
						oh.setText(InfoHranilneSnovi.Ohaji.get(values.get(position)) +" g");
						dialog.show();
					}
				});
		    	/*String s = InfoHranilneSnovi.Kcal.get(values.get(position));
		    	TransformMaleFood.setkalorije(22);*/
		    }	
		    
		    return rowView;
		  }
}
