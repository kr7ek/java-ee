package esercizio1_0319;

public class Automobile extends Veicolo {

	private int numeroPosti;

	public Automobile(String modello, String targa, int annoImmatricolazione, int numeroPosti) {
		super(modello, targa, annoImmatricolazione);
		this.numeroPosti = numeroPosti;
		this.setCostoNoleggioGiornaliero(50.0); // Imposta un costo di noleggio giornaliero predefinito per le
												// automobili
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	@Override
	public String toString() {
		return super.toString() + "Tipo Veicolo: Automobile [modello=" + getModello() + ", targa=" + getTarga()
				+ ", annoImmatricolazione=" + getAnnoImmatricolazione() + ", costoNoleggioGiornaliero="
				+ getCostoNoleggioGiornaliero() + ", numeroPosti=" + numeroPosti + "]";
	}

}
