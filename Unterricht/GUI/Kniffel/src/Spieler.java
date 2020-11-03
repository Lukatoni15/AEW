
public class Spieler 
{
	private String name;
	private Wuerfelbecher becher;
	
	public Spieler(String pName, Wuerfelbecher pWuerfelbecher)
	{
		name 	= pName;
		becher 	= pWuerfelbecher;
	}
	
	public String gibName()
	{
		return name;
	}

	public Wuerfelbecher getWuerfelbecher()
	{
		return becher;
	}
}
