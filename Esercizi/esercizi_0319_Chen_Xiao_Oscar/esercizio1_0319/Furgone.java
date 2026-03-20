package esercizio1_0319;

/**
 * Rappresenta un furgone come specializzazione di {@link Veicolo}.
 * Applica validazioni sulla capacità di carico e un costo di noleggio predefinito.
 */
public class Furgone extends Veicolo {

	public static final double DEFAULT_COSTO_NOLEGGIO = 100.0;

	private double capacitaCarico;

	public Furgone(String modello, String targa, int annoImmatricolazione, double capacitaCarico) {
		super(modello, targa, annoImmatricolazione);
		setCapacitaCarico(capacitaCarico);
		this.setCostoNoleggioGiornaliero(DEFAULT_COSTO_NOLEGGIO); // Imposta un costo di noleggio giornaliero predefinito per i furgoni
	}

	public double getCapacitaCarico() {
		return capacitaCarico;
	}

	public void setCapacitaCarico(double capacitaCarico) {
		if (Double.isNaN(capacitaCarico) || capacitaCarico < 0.0) {
			throw new IllegalArgumentException("La capacità di carico non può essere negativa");
		}
		this.capacitaCarico = capacitaCarico;
	}

	@Override
	public String toString() {
		return super.toString().replaceFirst("Veicolo", "Furgone")
			+ String.format(" [capacitaCarico=%.2f]", capacitaCarico);
	}

}