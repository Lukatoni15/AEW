
public class Wuerfelbecher 
{
	private Wuerfel[] becher = new Wuerfel[5];
	
	public Wuerfelbecher()
	{
		becher[0] = new Wuerfel();
		becher[1] = new Wuerfel();
		becher[2] = new Wuerfel();
		becher[3] = new Wuerfel();
		becher[4] = new Wuerfel();
	}
	
	public int[] gibAugenzahlen()
	{
		int[] augenzahlen = new int[5];
		for(int i = 0; i < becher.length; i++)
		{
			augenzahlen[i] = becher[i].gibAugenzahl();
		}
		return augenzahlen;
	}
	
	public int gibAugenzahl(int index)
	{
		return becher[index].gibAugenzahl();
	}

	public int gibAugensumme()
	{
		int augensumme = 0;
		for(int i = 0; i < becher.length; i++)
		{
			augensumme += becher[i].gibAugenzahl();
		}
		return augensumme;
	}
	
	public int gibAugensumme(int augenzahl)
	{
		int augensumme = 0;
		for(int i = 0; i < becher.length; i++)
		{
			int currentAugenzahl  = becher[i].gibAugenzahl();
			if(currentAugenzahl == augenzahl)
			{
				augensumme += currentAugenzahl;
			}
		}
		return augensumme;
	}
	
	public void schuetteln()
	{
		for(int i = 0; i < becher.length; i++)
		{
			becher[i].wuerfeln();
		}
	}
	
	public boolean wuerfelSindAnzahl(int pAnzahl)
	{
		for(int j = 1; j <= 6; j++)
		{
			int count = 0;
			for(int i = 0; i < becher.length; i++)
			{
				if(becher[i].gibAugenzahl() == j)
				{
					count++;
				}
			}
			if(count == pAnzahl)
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean wuerfelSindPasch(int pAnzahl)
	{
		for(int j = 1; j <= 6; j++)
		{
			int count = 0;
			for(int i = 0; i < becher.length; i++)
			{
				if(becher[i].gibAugenzahl() == j)
				{
					count++;
				}
			}
			if(count >= pAnzahl)
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean wuerfelSindKleineStrasse()
	{
		if(indexOf(3) != -1 && indexOf(4) != -1)
		{
			if(indexOf(2) != -1)
			{
				if(indexOf(5) != -1 || indexOf(1) != -1)
				{
					return true;
				}
			}
			else
			{
				if(indexOf(5) != -1 && indexOf(6) != -1)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean wuerfelSindGrosseStrasse()
	{
		if(indexOf(2) != -1 && indexOf(3) != -1 && indexOf(4) != -1 && indexOf(5) != -1)
		{
			if(indexOf(1) != -1 || indexOf(6) != -1)
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean wuerfelSindFullHouse()
	{
		if(wuerfelSindAnzahl(3) && wuerfelSindAnzahl(2))
		{
			return true;
		}
		return false;
	} 
	
	public int indexOf(int augenzahl)
	{
		for(int i = 0; i < becher.length; i++)
		{
			if(becher[i].gibAugenzahl() == augenzahl)
			{
				return i;
			}
		}
		return -1;
	}
	
	public void halten(int index)
	{
		becher[index].halten(false);
	}
	
	
	public void resetHalten()
	{
		for(int i = 0; i < becher.length; i++)
		{
			becher[i].halten(true);
		}
	}
}
