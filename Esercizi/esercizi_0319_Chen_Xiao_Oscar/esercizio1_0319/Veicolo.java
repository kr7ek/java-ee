package esercizio1_0319;

import java.time.Year;
import java.util.Objects;

public abstract class Veicolo {

	private String modello;
	private String targa;
	private int annoImmatricolazione;
	private double costoNoleggioGiornaliero;

	public Veicolo(String modello, String targa, int annoImmatricolazione) {
		setModello(modello);
		setTarga(targa);
		setAnnoImmatricolazione(annoImmatricolazione);
		this.costoNoleggioGiornaliero = 0.0;
	}

	public String getModello() {
		return modello;
	}

	public String getTarga() {
		return targa;
	}

	public int getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}

	public double getCostoNoleggioGiornaliero() {
		return costoNoleggioGiornaliero;
	}

	public void setModello(String modello) {
		if (modello == null || modello.trim().isEmpty()) {
			throw new IllegalArgumentException("Il modello non può essere nullo o vuoto");
		}
		this.modello = modello.trim();
	}

	public void setTarga(String targa) {
		if (targa == null || targa.trim().isEmpty()) {
			throw new IllegalArgumentException("La targa non può essere nulla o vuota");
		}
		this.targa = targa.trim();
	}

	public void setAnnoImmatricolazione(int annoImmatricolazione) {
		int currentYear = Year.now().getValue();
		if (annoImmatricolazione < 1886 || annoImmatricolazione > currentYear) { // prima automobile moderna 1886
			throw new IllegalArgumentException("Anno di immatricolazione non valido: " + annoImmatricolazione);
		}
		this.annoImmatricolazione = annoImmatricolazione;
	}

	public void setCostoNoleggioGiornaliero(double costoNoleggioGiornaliero) {
		if (Double.isNaN(costoNoleggioGiornaliero) || costoNoleggioGiornaliero < 0.0) {
			throw new IllegalArgumentException("Il costo di noleggio giornaliero non può essere negativo");
		}
		this.costoNoleggioGiornaliero = costoNoleggioGiornaliero;
	}
	
	@Override
	public String toString() {
		return String.format("Veicolo[modello=%s, targa=%s, anno=%d, costoNoleggioGiornaliero=%.2f]",
			getModello(), getTarga(), getAnnoImmatricolazione(), getCostoNoleggioGiornaliero());
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Veicolo veicolo = (Veicolo) o;
		// consideriamo la targa come identificatore unico
		return Objects.equals(targa, veicolo.targa);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(targa);
	}
	
}