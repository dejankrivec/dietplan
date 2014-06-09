package Class;

import java.util.ArrayList;
import java.util.List;

import com.example.dietplan.R;

public class LoseFatMaleFood {
	
	static boolean zenalozeno = false;
	public static List<String> beginfoodLoseFat = new ArrayList<String>();
	public static float kalorije = 2000;
	public static void nalozi()
	{
		if(zenalozeno)
			return;
		setBeginFood();
		setSlike();
		zenalozeno = true;
	}
	public static float getkalorije()
	{
		return kalorije;
	}
	public static void setBeginFood()
	{
		beginfoodLoseFat.add("Meal 1");
		beginfoodLoseFat.add("Egg");
		beginfoodLoseFat.add("Oats");
		beginfoodLoseFat.add("Meal 2");
		beginfoodLoseFat.add("Fruit");;
		beginfoodLoseFat.add("Meal 3");;
		beginfoodLoseFat.add("Fish");
		beginfoodLoseFat.add("Rice");
		beginfoodLoseFat.add("Vegetables");
		beginfoodLoseFat.add("Meal 4: Pre-workout");
		beginfoodLoseFat.add("Nuts");
		beginfoodLoseFat.add("Meal 5: Post-workout");
		beginfoodLoseFat.add("Protein");
		beginfoodLoseFat.add("Milk");
		beginfoodLoseFat.add("Meal 6");
		beginfoodLoseFat.add("Chicken");
		beginfoodLoseFat.add("Rice");
		beginfoodLoseFat.add("Vegetables");
		beginfoodLoseFat.add("Meal 7");
		beginfoodLoseFat.add("Yogurt");
		beginfoodLoseFat.add("Protein");
		beginfoodLoseFat.add("Nuts");
		beginfoodLoseFat.add("Meal 8: Before Bed");
		beginfoodLoseFat.add("Peanut Butter");		
	}
	public static void setSlike()
	{		
		Jedi.map.put("Fruit",new Integer(R.drawable.fruit));
		Jedi.map.put("Nuts",new Integer(R.drawable.nuts));
		Jedi.map.put("Milk",new Integer(R.drawable.milk));
		Jedi.map.put("Yogurt",new Integer(R.drawable.sourcream));
		Jedi.map.put("Peanut Butter",new Integer(R.drawable.peanutbutter));
		
	}
	public static List<String> GetBeginList()
	{
		return beginfoodLoseFat;
	}
	public static void UpdateItem(String jed , Integer s)
	{
		beginfoodLoseFat.set(s, jed);
	}
}
