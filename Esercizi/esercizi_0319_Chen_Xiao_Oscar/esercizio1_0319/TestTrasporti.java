package esercizio1_0319;

/*
 * Una ditta di trasporti che offre veicoli a noleggio desidera ottimizzare la gestione della propria flotta. 
 * I mezzi a disposizione comprendono automobili, furgoni e motocicli, ognuno con caratteristiche specifiche. 
 * Ogni veicolo possiede informazioni comuni come il modello, la targa,
 * l'anno di immatricolazione e il costo del noleggio giornaliero. 
 * Tuttavia, esistono delle differenze tra le varie tipologie: le automobili sono caratterizzate dal numero di posti disponibili, 
 * i furgoni hanno una capacità di carico espressa in chilogrammi, mentre i motocicli si distinguono per la cilindrata.
 * L'obiettivo è realizzare un sistema che consenta di gestire l'intera flotta in modo efficiente. 
 * Il programma deve permettere di aggiungere nuovi veicoli e fornire la possibilità di visualizzare 
 * l'elenco completo di quelli disponibili, mostrando per ciascuno tutte le informazioni rilevanti.
 * Inoltre, deve essere implementata una funzione che calcoli il costo totale del noleggio per un determinato numero di giorni, 
 * a partire dal modello scelto dal cliente. Per rendere il sistema più completo, 
 * si può anche prevedere la possibilità di rimuovere un veicolo dall'archivio nel momento in cui viene venduto 
 * e la possibilità di renderlo non disponibile qualora venisse noleggiato.
 */

public class TestTrasporti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestioneFlotta gestioneFlotta = new GestioneFlotta();

		Automobile auto1 = new Automobile("Fiat Panda", "AB123CD", 2015, 5);
		Furgone furgone1 = new Furgone("Iveco Daily", "EF456GH", 2018, 100.0);
		Motociclo moto1 = new Motociclo("Yamaha MT-07", "IJ789KL", 2020, 689);

		gestioneFlotta.aggiungiVeicolo(auto1);
		gestioneFlotta.aggiungiVeicolo(furgone1);
		gestioneFlotta.aggiungiVeicolo(moto1);

		System.out.println("Catalogo veicoli:");
		gestioneFlotta.visualizzaVeicolo();
		String modelloNoleggio = "Fiat Panda";
		int giorniNoleggio = 3;
		double costoTotale = gestioneFlotta.calcolaCostoNoleggio(modelloNoleggio, giorniNoleggio);
		System.out.println("Costo totale del noleggio per " + giorniNoleggio + " giorni di " + modelloNoleggio + ": "
				+ costoTotale);

		String modelloRimozione = "Iveco Daily";
		gestioneFlotta.rimuoviVeicolo(modelloRimozione);
		System.out.println("Catalogo veicoli dopo la rimozione di " + modelloRimozione + ":");
		gestioneFlotta.visualizzaVeicolo();
	}

}
