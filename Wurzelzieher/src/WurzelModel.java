public class WurzelModel 
{
	double wurzel;
    public WurzelModel()
    { 
        wurzel = 0;
    }
    public void berechnen(double radikand)
    {
        if (radikand>=0)
        {
	        wurzel = Math.sqrt(radikand);
	    }
	}
    public double getWurzel()
    {
	    return wurzel;
	}
}