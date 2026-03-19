package esercizio1_0319;

public class Furgone extends Veicolo {

	private double capacitaCarico;
	
	public Furgone(String modello, String targa, int annoImmatricolazione, double costoNoleggioGiornaliero, double capacitaCarico) {
		super(modello, targa, annoImmatricolazione, costoNoleggioGiornaliero);
		this.capacitaCarico = capacitaCarico;
	}
	
	public double getCapacitaCarico() {
		return capacitaCarico;
	}
	
	public void setCapacitaCarico(double capacitaCarico) {
		this.capacitaCarico = capacitaCarico;
	}

}
