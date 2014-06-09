package Class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.dietplan.R;

public class Jedi {
	
	static boolean zenalozeno = false;
	public static HashMap<String, Integer> map = new HashMap<String, Integer>();
	public static List<String> Fruit = new ArrayList<String>();	
	public static List<String> Meat = new ArrayList<String>();
	public static List<String> Fat = new ArrayList<String>();
	public static List<String> Eggs = new ArrayList<String>();
	public static List<String> Carbohydrates = new ArrayList<String>();
	public static List<String> Vegetables = new ArrayList<String>();
	public static List<String> Protein = new ArrayList<String>();
	public static List<String> Cheese = new ArrayList<String>();
	
	public static void nalozi()
	{
		if(zenalozeno)
			return;
		setCarbohydrates();
		setCheese();
		setEggs();
		setFat();
		setFruit();
		setMeat();
		setProtein();
		setVegetables();
		setSlike();
		zenalozeno = true;
	}
	
	public static void setFruit()
	{
		Fruit.add("Avocado");
		Fruit.add("Blackberries");
		Fruit.add("Blueberries");
		Fruit.add("Cranberri");
		Fruit.add("Lemon");
		Fruit.add("Lime");
		Fruit.add("Raspberri");
		Fruit.add("Strawberries");
	}
	public static void setMeat()
	{
		Meat.add("Chicken");
		Meat.add("Duck");
		Meat.add("Goose");
		Meat.add("Quail");
		Meat.add("Turkey");
		Meat.add("Herring");
		Meat.add("Salmon");
		Meat.add("Sardines");
		Meat.add("Sole");
		Meat.add("Trout");
		Meat.add("Tun");
		Meat.add("Beef");
		Meat.add("Lamb");
		Meat.add("Pork");
		Meat.add("Veal");
		Meat.add("Game meat");
	}
	
	public static void setFat()
	{
		Fat.add("Almon oil");
		Fat.add("Coconut oil");
		Fat.add("Fish oil");
		Fat.add("Hemp oil");
		Fat.add("Linseed oil");
		Fat.add("Olive oil");
		Fat.add("Vegetable oil");
		Fat.add("Almonds");
		Fat.add("Coconut butter");
		Fat.add("Butter");
		Fat.add("Hazelnut");
		Fat.add("Macadamia");
		Fat.add("Peanuts");
		Fat.add("Pistachio");
		Fat.add("Peanutbutter");
		Fat.add("Walnuts");
	}
	public static void setEggs()
	{
		Eggs.add("Chicken egg");
		Eggs.add("Duck egg");
		Eggs.add("Goose egg");
		Eggs.add("Ostrich egg");
	}
	public static void setCarbohydrates()
	{
		Carbohydrates.add("Buckwheat");
		Carbohydrates.add("Pasta");
		Carbohydrates.add("Spelt");
		Carbohydrates.add("Rice");
		Carbohydrates.add("Oats");
	}
	public static void setVegetables()
	{
		Vegetables.add("Asparagus");
		Vegetables.add("Beans");
		Vegetables.add("Broccoli");
		Vegetables.add("Cabbage");
		Vegetables.add("Cauliflower");
		Vegetables.add("Chicori");
		Vegetables.add("Cucumber");
		Vegetables.add("Eggplant");
		Vegetables.add("Lettuce");
		Vegetables.add("Onion");
		Vegetables.add("Parslei");
		Vegetables.add("Radish");
		Vegetables.add("Rhubarb");
		Vegetables.add("Spinach");
		Vegetables.add("Sprouts");
		Vegetables.add("Tomatoes");
		Vegetables.add("Turnip");
		Vegetables.add("Zucchini");
		Vegetables.add("Garlic");		
	}
	
	public static void setProtein()
	{
		Protein.add("Soy protein");
		Protein.add("Whey protein");
		Protein.add("Rice protein");
		Protein.add("Casein");	
	}
	
	public static void setCheese()
	{
		Cheese.add("Cheddat cheese");
		Cheese.add("Curd");
		Cheese.add("Emmental cheese");
		Cheese.add("Feta cheese");
		Cheese.add("Milk");
		Cheese.add("Sourcream");
	}
	public static void setSlike()
	{
		map.put("Avocado",new Integer(R.drawable.avocado));
		map.put("Blackberries",new Integer(R.drawable.blackberries));
		map.put("Blueberries",new Integer(R.drawable.blueberries));
		map.put("Cranberri",new Integer(R.drawable.cranberri));
		map.put("Lemon",new Integer(R.drawable.lemon));
		map.put("Lime",new Integer(R.drawable.lime));
		map.put("Raspberri",new Integer(R.drawable.raspberri));
		map.put("Strawberries",new Integer(R.drawable.strawberries));
		map.put("Duck",new Integer(R.drawable.duck));
		map.put("Goose",new Integer(R.drawable.goose));
		map.put("Quail",new Integer(R.drawable.quail));
		map.put("Turkey",new Integer(R.drawable.turkei));
		map.put("Herring",new Integer(R.drawable.fish));
		map.put("Salmon",new Integer(R.drawable.sole));
		map.put("Sardines",new Integer(R.drawable.sardines));
		map.put("Tun",new Integer(R.drawable.tuna));
		map.put("Trout",new Integer(R.drawable.trout));
		map.put("Beef",new Integer(R.drawable.beef));
		map.put("Lamb",new Integer(R.drawable.lamb));
		map.put("Pork",new Integer(R.drawable.pork));
		map.put("Veal",new Integer(R.drawable.veal));
		map.put("Game meat",new Integer(R.drawable.game));
		map.put("Almond oil",new Integer(R.drawable.almondoil));
		map.put("Coconut oil",new Integer(R.drawable.coconutoil));
		map.put("Fish oil",new Integer(R.drawable.fishoil));
		map.put("Hemp oil",new Integer(R.drawable.hempoil));
		map.put("Linseed oil",new Integer(R.drawable.linseedoil));
		map.put("Olive oil",new Integer(R.drawable.oliveoil));
		map.put("Vegetable oil",new Integer(R.drawable.vegetableoil));
		map.put("Almonds",new Integer(R.drawable.almonds));
		map.put("Coconut butter",new Integer(R.drawable.coconutbutter));
		map.put("Butter",new Integer(R.drawable.butter));
		map.put("Hazelnut",new Integer(R.drawable.hazelnut));
		map.put("Macadamia",new Integer(R.drawable.macadamia));
		map.put("Peanuts",new Integer(R.drawable.peanuts));
		map.put("Pistachio",new Integer(R.drawable.pistachio));
		map.put("Peanutbutter",new Integer(R.drawable.peanutbutter));
		map.put("Walnuts",new Integer(R.drawable.walnuts));
		map.put("Chicken egg",new Integer(R.drawable.chickenegg));
		map.put("Duck egg",new Integer(R.drawable.duckegg));
		map.put("Goose egg",new Integer(R.drawable.gooseegg));
		map.put("Ostrich egg",new Integer(R.drawable.ostrichegg));
		map.put("Buckwheat",new Integer(R.drawable.buckwheat));
		map.put("Pasta",new Integer(R.drawable.pasta));
		map.put("Spelt",new Integer(R.drawable.spelt));
		map.put("Asparagus",new Integer(R.drawable.asparagus));
		map.put("Beans",new Integer(R.drawable.beans));
		map.put("Cabbage",new Integer(R.drawable.cabbage));
		map.put("Broccoli",new Integer(R.drawable.broccoli));
		map.put("Cauliflower",new Integer(R.drawable.cauliflower));
		map.put("Chicori",new Integer(R.drawable.chicori));
		map.put("Cucumber",new Integer(R.drawable.cucumber));
		map.put("Eggplant",new Integer(R.drawable.eggplant));
		map.put("Lettuce",new Integer(R.drawable.lettuce));
		map.put("Onion",new Integer(R.drawable.onion));
		map.put("Parslei",new Integer(R.drawable.parslei));
		map.put("Radish",new Integer(R.drawable.radish));
		map.put("Rhubarb",new Integer(R.drawable.rhubarb));
		map.put("Spinach",new Integer(R.drawable.spinach));
		map.put("Sprouts",new Integer(R.drawable.sprouts));
		map.put("Tomatoes",new Integer(R.drawable.tomatoes));
		map.put("Turnip",new Integer(R.drawable.turnip));
		map.put("Zucchini",new Integer(R.drawable.zucchini));
		map.put("Garlic",new Integer(R.drawable.garlic));
		map.put("Soy protein",new Integer(R.drawable.proteins));
		map.put("Whey protein",new Integer(R.drawable.proteins));
		map.put("Rice protein ",new Integer(R.drawable.proteins));
		map.put("Casein",new Integer(R.drawable.proteins));
		map.put("Cheddat cheese",new Integer(R.drawable.cheddatcheese));
		map.put("Emmental cheese",new Integer(R.drawable.emmentalcheese));
		map.put("Feta cheese",new Integer(R.drawable.fetacheese));
		map.put("Curd",new Integer(R.drawable.curd));
		map.put("Milk",new Integer(R.drawable.milk));
		map.put("Sourcream",new Integer(R.drawable.sourcream));
	}
	public static List<String> getDodatnaLista()
	{
		return Meat;
	}
}
