package Class;

import java.util.ArrayList;
import java.util.List;

import com.example.dietplan.R;

public class TransformFemaleFood {

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
	public static void setbeginfoodTransform()
	{
		beginfoodTransform.add("Meal 1");
		beginfoodTransform.add("Oats");
		beginfoodTransform.add("Egg");
		beginfoodTransform.add("Meal 2");
		beginfoodTransform.add("Protein");;
		beginfoodTransform.add("Meal 3");
		beginfoodTransform.add("Rice");
		beginfoodTransform.add("Vegetables");
		beginfoodTransform.add("Chicken");
		beginfoodTransform.add("Meal 4");
		beginfoodTransform.add("Protein");
		beginfoodTransform.add("Meal 5");
		beginfoodTransform.add("Rice");
		beginfoodTransform.add("Vegetables");
	}
	public static void setSlike()
	{
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
