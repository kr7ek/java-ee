package esercizio1_0319;

public class Furgone extends Veicolo {

	private double capacitaCarico;

	public Furgone(String modello, String targa, int annoImmatricolazione, double capacitaCarico) {
		super(modello, targa, annoImmatricolazione);
		this.capacitaCarico = capacitaCarico;
		this.setCostoNoleggioGiornaliero(100.0); // Imposta un costo di noleggio giornaliero predefinito per i furgoni
	}

	public double getCapacitaCarico() {
		return capacitaCarico;
	}

	public void setCapacitaCarico(double capacitaCarico) {
		this.capacitaCarico = capacitaCarico;
	}

	@Override
	public String toString() {
		return super.toString() + "Tipo Veicolo: Furgone [modello=" + getModello() + ", targa=" + getTarga()
				+ ", annoImmatricolazione=" + getAnnoImmatricolazione() + ", costoNoleggioGiornaliero="
				+ getCostoNoleggioGiornaliero() + ", capacitaCarico=" + capacitaCarico + "]";
	}

}
