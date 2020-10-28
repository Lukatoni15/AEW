
public class BerechneProdukt 
{
	private int produkt;
	
	public BerechneProdukt()
	{
		produkt = 0;
	}
	
	public void berechne(Object object, Object object2)
	{
		produkt = (int) object * (int) object2;
	}
	
	public int getProdukt()
	{
		return produkt;
	}
}
