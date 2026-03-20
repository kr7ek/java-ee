package esercizio1_0319;

/**
 * Rappresenta un motociclo come specializzazione di {@link Veicolo}.
 * Applica validazioni sulla cilindrata e un costo di noleggio predefinito.
 */
public class Motociclo extends Veicolo {

	public static final double DEFAULT_COSTO_NOLEGGIO = 20.0;

	private int cilindrata;

	public Motociclo(String modello, String targa, int annoImmatricolazione, int cilindrata) {
		super(modello, targa, annoImmatricolazione);
		setCilindrata(cilindrata);
		this.setCostoNoleggioGiornaliero(DEFAULT_COSTO_NOLEGGIO); // Imposta un costo di noleggio giornaliero predefinito per i motocicli
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		if (cilindrata <= 0) {
			throw new IllegalArgumentException("La cilindrata deve essere maggiore di zero");
		}
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		return super.toString().replaceFirst("Veicolo", "Motociclo")
			+ String.format(" [cilindrata=%d]", cilindrata);
	}
}