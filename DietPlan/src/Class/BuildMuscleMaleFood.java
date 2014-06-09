package Class;

import java.util.ArrayList;
import java.util.List;

import com.example.dietplan.R;

import android.R.integer;

public class BuildMuscleMaleFood {
	
	static boolean zenalozeno = false;
	public static List<String> beginfoodBuildMuscle = new ArrayList<String>();
	public static float kalorije = 4500;
	public static void nalozi(){
		if(zenalozeno)
			return;
		setbeginfoodBuildMuscle();
		setSlike();
		zenalozeno = true;
	}
	public static float getkalorije()
	{
		return kalorije;
	}
	public static void setbeginfoodBuildMuscle()
	{
		beginfoodBuildMuscle.add("Meal 1");
		beginfoodBuildMuscle.add("Protein");
		beginfoodBuildMuscle.add("Fruit");
		beginfoodBuildMuscle.add("Meal 2");
		beginfoodBuildMuscle.add("Meat");
		beginfoodBuildMuscle.add("Egg");
		beginfoodBuildMuscle.add("Cheese");
		beginfoodBuildMuscle.add("Oats");
		beginfoodBuildMuscle.add("Meal 3");
		beginfoodBuildMuscle.add("Yogurt");
		beginfoodBuildMuscle.add("Fruit");
		beginfoodBuildMuscle.add("Meal 4");
		beginfoodBuildMuscle.add("Meat");
		beginfoodBuildMuscle.add("Rice");
		beginfoodBuildMuscle.add("Vegetables");
		beginfoodBuildMuscle.add("Oil");
		beginfoodBuildMuscle.add("Meal 5");
		beginfoodBuildMuscle.add("Meat");
		beginfoodBuildMuscle.add("Nuts");
		beginfoodBuildMuscle.add("Meal 6");
		beginfoodBuildMuscle.add("Meat");
		beginfoodBuildMuscle.add("Vegetables");
		beginfoodBuildMuscle.add("Oil");
		beginfoodBuildMuscle.add("Cottage Cheese");
		beginfoodBuildMuscle.add("Vegetables");
	}
	public static void setSlike()
	{
		Jedi.map.put("Cheese",new Integer(R.drawable.cheddatcheese));
		Jedi.map.put("Cottage Cheese",new Integer(R.drawable.curd));
	}
	public static List<String> GetBeginList()
	{
		return beginfoodBuildMuscle;
	}
	public static void UpdateItem(String jed , Integer s)
	{
		beginfoodBuildMuscle.set(s, jed);
	}
}
