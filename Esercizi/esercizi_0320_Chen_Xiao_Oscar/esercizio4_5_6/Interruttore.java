package esercizio4_5_6;

/*
 * Scrivere la classe Interruttore i cui oggetti rappresentano degli interruttori. 
 * Ogni interruttore è collegato a una lampadina (oggetto della classe Lampadina) e ne regola l’accensione e spegnimento. 
 * La classe deve contenere tutte le variabili d’istanza i costruttori e i metodi ritenuti opportuni.
 * Per testare la classe, scrivere un programma TestInterruttore che crea due interruttori 
 * (oggetti della classe Interruttore) entrambi collegati alla stessa lampadina (uno stesso oggetto della classe Lampadina) 
 * e poi, in maniera iterativa, offre all’utente la possibilità di agire su uno dei due interruttori 
 * (visualizzando l'esito dell’operazione) o di terminare l'esecuzione.
 */

public class Interruttore {
	
	private Lampadina lampadina;
	
	public Interruttore(Lampadina lampadina) {
		this.lampadina = lampadina;
	}
	
	public void aziona() {
		this.lampadina.click();
	}
	
	public String statoLampadina() {
		return this.lampadina.getStato();
	}

}
