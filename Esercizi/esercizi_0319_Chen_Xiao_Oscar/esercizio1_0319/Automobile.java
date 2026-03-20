package esercizio1_0319;

/**
 * Rappresenta un'automobile come specializzazione di {@link Veicolo}.
 * Fornisce validazioni sui parametri e una costante di default per il costo di noleggio.
 */
public class Automobile extends Veicolo {

	public static final double DEFAULT_COSTO_NOLEGGIO = 50.0;

	private int numeroPosti;

	public Automobile(String modello, String targa, int annoImmatricolazione, int numeroPosti) {
		super(modello, targa, annoImmatricolazione);
		setNumeroPosti(numeroPosti);
		this.setCostoNoleggioGiornaliero(DEFAULT_COSTO_NOLEGGIO);
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		if (numeroPosti <= 0) {
			throw new IllegalArgumentException("Il numero di posti deve essere almeno 1");
		}
		this.numeroPosti = numeroPosti;
	}

	@Override
	public String toString() {
		return super.toString().replaceFirst("Veicolo", "Automobile")
			+ String.format(" [numeroPosti=%d]", numeroPosti);
	}

}