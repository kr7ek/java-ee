package esercizio1_0319;

import java.util.ArrayList;
import java.util.List;

public class GestioneFlotta {

	private List<Veicolo> catalogo = new ArrayList<>();

	public void aggiungiVeicolo(Veicolo v) {
		if (v == null) {
			throw new IllegalArgumentException("Il veicolo non può essere nullo");
		}
		// Evita duplicati basati sulla targa
		for (Veicolo exist : catalogo) {
			if (exist.getTarga().equalsIgnoreCase(v.getTarga())) {
				System.out.println(
						"Veicolo con targa " + v.getTarga() + " già presente nel catalogo. Aggiunta ignorata.");
				return;
			}
		}
		catalogo.add(v);
	}

	public void visualizzaVeicolo() {
		if (catalogo.isEmpty()) {
			System.out.println("Catalogo veicoli vuoto!");
			return;
		}

		System.out.println("Catalogo veicoli (totale: " + catalogo.size() + "):");
		for (Veicolo v : catalogo) {
			System.out.println(" - " + v.toString());
		}
	}

	public double calcolaCostoNoleggio(String modello, int giorni) {
		if (modello == null || modello.trim().isEmpty()) {
			throw new IllegalArgumentException("Il modello non può essere nullo o vuoto");
		}
		if (giorni <= 0) {
			throw new IllegalArgumentException("Il numero di giorni deve essere maggiore di zero");
		}
		for (Veicolo v : catalogo) {
			if (v.getModello().equalsIgnoreCase(modello)) {
				return v.getCostoNoleggioGiornaliero() * giorni;
			}
		}
		System.out.println("Veicolo non trovato!");
		return 0.0;
	}

	// Rimuove tutti i veicoli con il modello specificato.
	public boolean rimuoviVeicolo(String modello) {
		if (modello == null || modello.trim().isEmpty()) {
			throw new IllegalArgumentException("Il modello non può essere nullo o vuoto");
		}
		return catalogo.removeIf(v -> v.getModello().equalsIgnoreCase(modello));
	}
}