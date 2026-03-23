package esercizio4_5_6;

/*
 * Scrivere la classe Lampadina i cui oggetti rappresentano delle lampadine elettriche. 
 * Una lampadina può essere accesa, spenta o rotta, e mette a disposizione due sole operazioni: 
 * stato() che restituisce una stringa che indica lo stato corrente della lampadina e 
 * click() che ne cambia lo stato da accesa a spenta o da spenta a accesa o la rompe. 
 * Una lampadina si rompe dopo un certo numero di click definito dal fabbricante. 
 * La classe deve contenere:
 *   a. Una o più variabili di istanza che descrivano opportunamente lo stato della lampadina.
 *   b. Un opportuno costruttore.
 *   c. I metodi sopra citati.
 * Per testare la classe, scrivere un programma TestLampadina che crea un oggetto della classe Lampadina 
 * che ammetta un numero massimo di click deciso dall’utente e poi iterativamente offre all'utente 
 * la possibilità di invocare una delle due funzionalità (visualizzando l’esito dell’operazione, 
 * nel caso di stato()) 0 di terminare 'esecuzione.
 */

public class Lampadina {

	private int clickMax;
	private int clickCount;
	private String stato;
	private boolean correnteElettrica; // Variabile per condividere lo stato della corrente elettrica

	public Lampadina(int clickMax) {
		this.clickMax = clickMax;
		this.clickCount = 0;
		this.stato = "spenta";
		correnteElettrica = true; // Inizialmente c'è corrente elettrica
	}

	public String getStato() {
		return this.stato;
	}

	public void staccaCorrente() {
		this.correnteElettrica = false;
		this.stato = "spenta"; // Se la corrente è staccata, la lampadina è spenta
		System.out.println("La corrente elettrica è stata staccata.");
	}

	public void riattivaCorrente() {
		this.correnteElettrica = true;
		if (this.stato.equals("spenta")) {
			this.stato = "accesa"; // Se la corrente è riattivata e la lampadina era spenta, ora è accesa
			System.out.println("La lampadina è ora accesa.");
		}

		System.out.println("La corrente elettrica è stata riattivata.");
	}

	public void click() {

		if (this.stato.equals("rotta")) {
			System.out.println("La lampadina è rotta, non puoi cliccarla.");
			return;
		}

		// Controlla se c'è corrente elettrica
		if (!correnteElettrica) {
			System.out.println("Non c'è corrente elettrica, la lampadina non può essere cliccata.");
			return;
		}

		this.clickCount++;

		// Controlla se la lampadina si è rotta dopo il click
		if (this.clickCount > this.clickMax) {
			this.stato = "rotta";
			System.out.println("La lampadina si è rotta dopo " + this.clickCount + " click.");
		} else if (this.stato.equals("spenta")) {
			this.stato = "accesa";
			System.out.println("La lampadina è ora accesa.");
		} else if (this.stato.equals("accesa")) {
			this.stato = "spenta";
			System.out.println("La lampadina è ora spenta.");
		}
	}

}
