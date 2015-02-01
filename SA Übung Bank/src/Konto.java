
public class Konto {

	private Bank bank;
	private Kunde besitzer;
	private int ktoNr;
	private double kontoStand;
	
	
	public Konto(Bank bank, Kunde besitzer, int ktoNr, double kontoStand){
		this.bank = bank;
		this.besitzer = besitzer;
		this.ktoNr = ktoNr;
		this.kontoStand = kontoStand;
	}
	
	
	
	public double getKontoStand() {
		return kontoStand;
	}
	
	
	
	public void einzahlen(double geld){
		this.kontoStand += geld;
	}
	
	
	
	public double abheben(double geld){
		this.kontoStand = kontoStand - geld;
		return getKontoStand();
	}
	
}
