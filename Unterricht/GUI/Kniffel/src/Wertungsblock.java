
public class Wertungsblock 
{
	private int Einer 		= -1;
	private int Zweier 		= -1;
	private int Dreier 		= -1;
	private int Vierer		= -1;
	private int Fuenfer		= -1;
	private int sechser		= -1;
	private int summe		= -1;
	private boolean bonus	= false;
	private int summeOben	= -1;
	
	private int Dreierpasch			= -1;
	private int Viererpasch			= -1;
	private boolean fullHouse		= false;
	private boolean kleineStrasse	= false;
	private boolean grosseStrasse	= false;
	private boolean kniffel			= false;
	private int chance				= -1;
	
	private int summeUnten	= -1;
	private int summeGesamt = -1;
	
	public String writeWertungsblock()
	{
		String r = "";
		r += "Einer:	" + ((Einer < 0)?"--":Einer) + "\n";
		r += "Zweier:	" + ((Zweier < 0)?"--":Zweier)+ "\n";
		r += "Dreier:  	" + ((Dreier < 0)?"--":Dreier)+ "\n";
		r += "Vierer:  	" + ((Vierer < 0)?"--":Vierer)+ "\n";
		r += "Fünfer:  	" + ((Fuenfer < 0)?"--":Fuenfer)+ "\n";
		r += "Sechser: 	" + ((sechser < 0)?"--":sechser)+ "\n";
		r += "Summe:   	" + ((summe < 0)?"--":summe)+ "\n";
		r += "Bonus:   	" + ((!bonus)?"--":35)+ "\n";
		r += "Gesamt:  	" + ((summeOben < 0)?"--":summeOben)+ "\n";
		r += "\n";
		r += "Dreierpasch:	" + ((Einer < 0)?"--":Einer) + "\n";
		r += "Viererpasch:	" + ((Zweier < 0)?"--":Einer)+ "\n";
		r += "Full House:  	" + ((Dreier < 0)?"--":Einer)+ "\n";
		r += "kleine Straße:  	" + ((Vierer < 0)?"--":Einer)+ "\n";
		r += "große Straße:  	" + ((Fuenfer < 0)?"--":Einer)+ "\n";
		r += "Kniffel: 	" + ((sechser < 0)?"--":Einer)+ "\n";
		r += "Chance:	" + ((sechser < 0)?"--":Einer)+ "\n";
		r += "Summe unten:	" + ((summe < 0)?"--":Einer)+ "\n";
		r += "Summe oben:	" + ((summeOben < 0)?"--":summeOben)+ "\n";
		r += "Gesamt:	" + ((summeOben < 0)?"--":Einer)+ "\n";
		return r;
	}
	
	public int getEiner() 
	{
		return Einer;
	}
	public void setEiner(int einer) 
	{
		Einer = einer;
	}
	public int getZweier() 
	{
		return Zweier;
	}
	public void setZweier(int zweier) 
	{
		Zweier = zweier;
	}
	public int getDreier() {
		return Dreier;
	}
	public void setDreier(int dreier) {
		Dreier = dreier;
	}
	public int getVierer() {
		return Vierer;
	}
	public void setVierer(int vierer) {
		Vierer = vierer;
	}
	public int getFuenfer() {
		return Fuenfer;
	}
	public void setFuenfer(int fuenfer) {
		Fuenfer = fuenfer;
	}
	public int getSechser() {
		return sechser;
	}
	public void setSechser(int sechser) {
		this.sechser = sechser;
	}
	public int getSumme() {
		return summe;
	}
	public void setSumme(int summe) {
		this.summe = summe;
	}
	public boolean isBonus() {
		return bonus;
	}
	public void setBonus(boolean bonus) {
		this.bonus = bonus;
	}
	public int getSummeOben() {
		return summeOben;
	}
	public void setSummeOben() {
		this.summeOben = Einer + Zweier + Dreier + Vierer + Fuenfer + sechser + ((bonus) ? 35 : 0);
	}
	public int getDreierpasch() {
		return Dreierpasch;
	}
	public void setDreierpasch(int dreierpasch) {
		Dreierpasch = dreierpasch;
	}
	public int getViererpasch() {
		return Viererpasch;
	}
	public void setViererpasch(int viererpasch) {
		Viererpasch = viererpasch;
	}
	public boolean isFullHouse() {
		return fullHouse;
	}
	public void setFullHouse(boolean fullHouse) {
		this.fullHouse = fullHouse;
	}
	public boolean isKleineStrasse() {
		return kleineStrasse;
	}
	public void setKleineStrasse(boolean kleineStrasse) {
		this.kleineStrasse = kleineStrasse;
	}
	public boolean isGrosseStrasse() {
		return grosseStrasse;
	}
	public void setGrosseStrasse(boolean grosseStrasse) {
		this.grosseStrasse = grosseStrasse;
	}
	public boolean isKniffel() {
		return kniffel;
	}
	public void setKniffel(boolean kniffel) {
		this.kniffel = kniffel;
	}
	public int getChance() {
		return chance;
	}
	public void setChance(int chance) {
		this.chance = chance;
	}
	public int getSummeUnten() {
		return summeUnten;
	}
	public void setSummeUnten() 
	{
		int FullHouse = (fullHouse) ? 25 : 0;
		int KleineStrasse = (kleineStrasse) ? 30 : 0;
		int GrosseStrasse = (grosseStrasse) ? 40 : 0;
		int Kniffel = (kniffel) ? 50 : 0;
		this.summeUnten = Dreierpasch + Viererpasch + chance + FullHouse + KleineStrasse + GrosseStrasse + Kniffel;
	}
	public int getSummeGesamt() {
		return summeGesamt;
	}
	public void setSummeGesamt(int summeGesamt) {
		this.summeGesamt = summeOben + summeUnten;
	}
}
