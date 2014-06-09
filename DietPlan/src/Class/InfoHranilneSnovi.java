package Class;

import java.util.HashMap;

public class InfoHranilneSnovi {
	
	static boolean zenalozeno = false;
	public static HashMap<String, String> Beljakovine = new HashMap<String, String>();
	public static HashMap<String, String> Ohaji = new HashMap<String, String>();
	public static HashMap<String, String> Mascobe = new HashMap<String, String>();
	public static HashMap<String, String> Kcal = new HashMap<String, String>();
	
	public static void nalozi()
	{
		if(zenalozeno)
			return;
		setBeljakovine();
		setMascobe();
		setOhaji();
		setKcal();
				
	}
	public static void setBeljakovine()
	{
		Beljakovine.put("Oats", "15.5");
		Beljakovine.put("Pasta", "5" );
		Beljakovine.put("Fish", "30" );
		Beljakovine.put("Egg", "70" );
		Beljakovine.put("Gainer", "2" );
		Beljakovine.put("Chicken", "30" );
		Beljakovine.put("Meat", "5" );
		Beljakovine.put("Rice", "3" );
		Beljakovine.put("Vegetables", "2" );
		Beljakovine.put("Protein", "80" );
		Beljakovine.put("Oil", "20" );
	}
	public static void setOhaji()
	{
		Mascobe.put("Oats", "5.5" );
		Mascobe.put("Pasta", "12" );
		Mascobe.put("Fish", "15" );
		Mascobe.put("Egg", "20" );
		Mascobe.put("Gainer", "2" );
		Mascobe.put("Chicken", "20" );
		Mascobe.put("Meat", "54" );
		Mascobe.put("Rice", "13" );
		Mascobe.put("Vegetables", "1.2" );
		Mascobe.put("Protein", "1.2" );
		Mascobe.put("Oil", "70" );
	}
	public static void setMascobe()
	{
		Ohaji.put("Oats", "70" );
		Ohaji.put("Pasta", "60" );
		Ohaji.put("Fish", "10" );
		Ohaji.put("Egg", "10" );
		Ohaji.put("Gainer", "90" );
		Ohaji.put("Chicken", "6" );
		Ohaji.put("Meat", "6" );
		Ohaji.put("Rice", "70" );
		Ohaji.put("Vegetables", "45" );
		Ohaji.put("Protein", "5" );
		Ohaji.put("Oil", "2" );
	}
	public static void setKcal()
	{
		Kcal.put("Oats",new String("250"));
		Kcal.put("Pasta", new String("140") );
		Kcal.put("Fish", new String("145") );
		Kcal.put("Egg", new String("40") );
		Kcal.put("Gainer", new String("250") );
		Kcal.put("Chicken", new String("190" ));
		Kcal.put("Meat", new String("100") );
		Kcal.put("Rice", new String("40") );
		Kcal.put("Vegetables", new String("45") );
		Kcal.put("Protein", new String("100") );
		Kcal.put("Oil", new String("240") );
	}
}
