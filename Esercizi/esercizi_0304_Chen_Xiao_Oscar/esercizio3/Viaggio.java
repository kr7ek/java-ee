package esercizio3;

/*
 * Per gestire un’agenzia di viaggi creare una classe Viaggio, 
 * con gli attributi nome della località, durata viaggio e costo. 
 * Creare un metodo per stampare a video le informazioni sul viaggio 
 * e altri due a piacere.
 */

public class Viaggio {
	
	String destinazione;
	int totGiorni;
	double totCosto;
	
	public Viaggio(String destinazione, int totGiorni, double totCosto) {
		this.destinazione = destinazione;
		this.totGiorni = totGiorni;
		this.totCosto = totCosto;
	}
	
	// Stampa informazione viaggio
	public void stampaInfo() {
		
		System.out.println("Info viaggio:");
		System.out.println("Destinazione: " + destinazione);
		System.out.println("Durata: " + totGiorni + " giorni");
		System.out.println("Prezzo: " + totCosto + " euro");
	}
	
	// Calcolo costo medio al giorno
	public double prezzoMedio() {
		return totCosto/totGiorni;
	}
	
	// Controlla se il viaggio dura piu' di una settimana
	public String settimanaCheck() {
		
		if(totGiorni > 7)
			return "Si";
			
		return "No";
	}

}
