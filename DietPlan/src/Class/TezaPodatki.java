package Class;

import java.util.ArrayList;
import java.util.List;



public class TezaPodatki {
	List<Double> Teza = new ArrayList<Double>();
	double indexbeljakovinTMale = 1.5;
	double indexmascobTMale = 2;
	double indexohajevTMale = 0.5;
	double beljakovinekcal = 4;
	double mascobekcal = 9;
	double ohajikcal = 4;
	
	public void VnosTeze(double teza)
	{
		Teza.add(teza);
	}
	
	public double getIndexTMale()
	{
		return indexbeljakovinTMale;
	}
	public double getIndexLMale()
	{
		return indexmascobTMale;
	}
	public double getIndexBMale()
	{
		return indexohajevTMale;
	}
	public double getbelkcal()
	{
		return beljakovinekcal;
	}
	public double getmaskcal()
	{
		return mascobekcal;
	}
	public double getohkcal()
	{
		return ohajikcal;
	}
	public void zapisi(double podatek)
	{
		Teza.add(podatek);
	}
	
	public double vrniTezo()
	{
		return Teza.get(0);
	}
}
