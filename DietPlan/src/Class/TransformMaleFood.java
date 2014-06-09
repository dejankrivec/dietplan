package Class;

import java.util.ArrayList;
import java.util.List;

import com.example.dietplan.R;

import android.R.bool;
import android.R.string;

public class TransformMaleFood {

	static boolean zenalozeno = false;
	public static List<String> beginfoodTransform = new ArrayList<String>();
	public static float kalorije = 3200;
	public static void nalozi(){
		if(zenalozeno)
			return;
		setbeginfoodTransform();
		setSlike();
		zenalozeno = true;
	}
	public static void setkalorije(float sestevek)
	{
		kalorije = kalorije + sestevek;
	}
	public static float getkalorije()
	{
		return kalorije;
	}
	public static void setbeginfoodTransform()
	{
		beginfoodTransform.add("Meal 1");
		beginfoodTransform.add("Oats");
		beginfoodTransform.add("Meal 2");
		beginfoodTransform.add("Pasta");
		beginfoodTransform.add("Fish");
		beginfoodTransform.add("Egg");
		beginfoodTransform.add("Meal 3");
		beginfoodTransform.add("Gainer");
		beginfoodTransform.add("Meal 4");
		beginfoodTransform.add("Pasta");
		beginfoodTransform.add("Chicken");
		beginfoodTransform.add("Meal 5");
		beginfoodTransform.add("Meat");
		beginfoodTransform.add("Rice");
		beginfoodTransform.add("Vegetables");
		beginfoodTransform.add("Meal 6");
		beginfoodTransform.add("Gainer");
		beginfoodTransform.add("Meal 7");
		beginfoodTransform.add("Protein");
		beginfoodTransform.add("Meal 8");
		beginfoodTransform.add("Fish");
		beginfoodTransform.add("Chicken");
		beginfoodTransform.add("Oil");
		beginfoodTransform.add("Meal 9");
		beginfoodTransform.add("Protein");
	}
	public static void setSlike()
	{
		Jedi.map.put("Oats",new Integer(R.drawable.oats));
		Jedi.map.put("Pasta",new Integer(R.drawable.pasta));
		Jedi.map.put("Fish",new Integer(R.drawable.fish));
		Jedi.map.put("Egg",new Integer(R.drawable.duckegg));
		Jedi.map.put("Gainer",new Integer(R.drawable.gainer));
		Jedi.map.put("Chicken",new Integer(R.drawable.chicken));
		Jedi.map.put("Meat",new Integer(R.drawable.pork));
		Jedi.map.put("Rice",new Integer(R.drawable.rice));
		Jedi.map.put("Vegetables",new Integer(R.drawable.vegetables));
		Jedi.map.put("Protein",new Integer(R.drawable.proteins));
		Jedi.map.put("Oil",new Integer(R.drawable.almondoil));	
	}
	public static List<String> GetBeginList()
	{
		return beginfoodTransform;
	}
	public static void UpdateItem(String jed , Integer s)
	{
		beginfoodTransform.set(s, jed);
	}
}
