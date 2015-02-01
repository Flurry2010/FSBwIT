
public class Kunde {

	private Bank bank;
	private String name;
	private int kundenNr;
	private String[] adresse;
	private Konto[] konten;
	
	public Kunde(String name, int kundenNr){
		this.name = name;
		this.kundenNr = kundenNr;
	}
	
	
	
	public Kunde(String name, int kundenNr, String[] adresse){
		this(name, kundenNr);
		this.adresse = adresse;
	}
	
	
	
	public Kunde(Bank bank, String name, int kundenNr, String[] adresse, Konto[] konto){
		this(name, kundenNr, adresse);
		this.bank = bank;
		this.name = name;
		this.adresse = adresse;
		this.kundenNr = kundenNr;
		this.konten = konto;
	}

	
	
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public String[] getAdresse() {
		return adresse;
	}

	public void setAdresse(String[] adresse) {
		this.adresse = adresse;
	}

	public int getKundenNr() {
		return kundenNr;
	}

	public Konto[] getKonten() {
		return konten;
	}
	
	
	
	public void addKonto(Konto konto){
		
	}
	
	
	
	public float delKonto(Konto konto){
		
		return  Float.parseFloat(Konto);
	}
	
	
}
