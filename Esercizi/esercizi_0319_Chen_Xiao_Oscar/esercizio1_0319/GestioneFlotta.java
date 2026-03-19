package esercizio1_0319;

import java.util.ArrayList;
import java.util.List;

public class GestioneFlotta {

	private List<Veicolo> catalogo = new ArrayList<>();

	public void aggiungiVeicolo(Veicolo v) {
		catalogo.add(v);
	}

	public void visualizzaVeicolo() {
		if (catalogo.isEmpty()) {
			System.out.println("Catalogo veicoli vuoto!");
			return;
		}

		for (Veicolo v : catalogo) {
			System.out.println(v.toString());
		}
	}

	public double calcolaCostoNoleggio(String modello, int giorni) {
		for (Veicolo v : catalogo) {
			if (v.getModello().equalsIgnoreCase(modello)) {
				return v.getCostoNoleggioGiornaliero() * giorni;
			}
		}
		System.out.println("Veicolo non trovato!");
		return 0.0;
	}

	public void rimuoviVeicolo(String modello) {
		catalogo.removeIf(v -> v.getModello().equalsIgnoreCase(modello));
	}
}
