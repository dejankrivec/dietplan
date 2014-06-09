package Class;

import java.util.List;

import com.example.dietplan.Jedilnik;
import com.example.dietplan.R;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterDialog extends ArrayAdapter<String> {
	
	BuildMuscleMaleFood dodatnejedislike = new BuildMuscleMaleFood();
	private final Context context;
	private final List<String>  values;
	public AdapterDialog(Jedilnik jedilnik, List<String> values) {
	super((Context) jedilnik, R.layout.liststyle, values);
	this.context = (Context) jedilnik;
	this.values = values;
	}
	  
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
		.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.dialog_style, parent, false);		   
		TextView text = (TextView)rowView.findViewById(R.id.prvajed);
		ImageView img = (ImageView)rowView.findViewById(R.id.slika1);
		
		
		
		text.setText(values.get(position));
    	
		
		return rowView;
		}

	
}
