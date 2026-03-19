package esercizio1_0319;

public class Motociclo extends Veicolo {

	private int cilindrata;
	
	public Motociclo(String modello, String targa, int annoImmatricolazione, double costoNoleggioGiornaliero, int cilindrata) {
		super(modello, targa, annoImmatricolazione, costoNoleggioGiornaliero);
		this.cilindrata = cilindrata;
	}
	
	public int getCilindrata() {
		return cilindrata;
	}
	
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
}
