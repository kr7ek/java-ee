package esercizio1_0319;

public class Automobile extends Veicolo {

	private int numeroPosti;
	
	public Automobile(String modello, String targa, int annoImmatricolazione, double costoNoleggioGiornaliero, int numeroPosti) {
		super(modello, targa, annoImmatricolazione, costoNoleggioGiornaliero);
		this.numeroPosti = numeroPosti;
	}
	
	public int getNumeroPosti() {
		return numeroPosti;
	}
	
	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

}
