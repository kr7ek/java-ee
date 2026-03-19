package esercizio1_0319;

public class Motociclo extends Veicolo {

	private int cilindrata;

	public Motociclo(String modello, String targa, int annoImmatricolazione, int cilindrata) {
		super(modello, targa, annoImmatricolazione);
		this.cilindrata = cilindrata;
		this.setCostoNoleggioGiornaliero(20.0); // Imposta un costo di noleggio giornaliero predefinito per i motocicli
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		return super.toString() + "Tipo Veicolo: Motociclo [modello=" + getModello() + ", targa=" + getTarga()
				+ ", annoImmatricolazione=" + getAnnoImmatricolazione() + ", costoNoleggioGiornaliero="
				+ getCostoNoleggioGiornaliero() + ", cilindrata=" + cilindrata + "]";
	}
}
