import java.util.Random;

public class Wuerfel 
{
	private int augenzahl;
	private boolean wirdgehalten;
	
	public Wuerfel()
	{
		wirdgehalten = false;
	}
	
	public void wuerfeln()
	{
		if(!wirdgehalten)
		{
			Random rand = new Random();
			augenzahl = (int) (Math.random() * 6) + 1;
		}
	}
	
	public void halten(boolean reset)
	{
		if(wirdgehalten)
		{
			wirdgehalten = false;
		}
		else
		{
			wirdgehalten = true;
		}
		if(reset)
		{
			wirdgehalten = false;
		}
	}
	
	
	public int gibAugenzahl()
	{
		return augenzahl;
	}
}
