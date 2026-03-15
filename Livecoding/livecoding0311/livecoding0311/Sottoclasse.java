package livecoding0311;

/*
 * Sottoclasse, classe figlia, classe derivata
 * Animale -> Cane, Gatto. Pinguino
 * Veicolo -> Auto, Aereo, Barca
 * StrumentiMusicali -> Chitarra, Basso, Pinaoforte
 */
public class Sottoclasse extends Superclasse {
	
	/*
	 * Deve rispondere alla domanda è un?
	 * Il pinguino è un animale?
	 * SI, allora la classe Pinguino può essere sottoclasse di Animale
	 * 
	 * Utilizzando la parola chiave extends che serve appunto per definire una classe
	 * che eredita da un'altra, quindi permette l'ereditarietà
	 * 
	 * Superclassi -> generiche
	 * Sottoclassi -> specifiche
	 * 
	 * Ereditano attributi e metodi dalla superclasse
	 */
	
	//attributo specifico della sottoclasse
	private int numeroSottoclasse;
	
	//costruttori
	public Sottoclasse() {
		//super();
	}
	
	public Sottoclasse(int numeroSottoclasse) {
		this.numeroSottoclasse= numeroSottoclasse;
	}
	
	public Sottoclasse(int attributoNumerico, String attributoStringa, int numeroSottoclasse) {
		//Chiama il costruttore della superclasse, evita di duplicare il codice
		super(attributoNumerico, attributoStringa); //sempre la prima istruzione del costruttore
		this.numeroSottoclasse = numeroSottoclasse;
	}
	
	public Sottoclasse(String attributoStringa, int numeroSottoclasse) {
		super(attributoStringa);
		this.numeroSottoclasse = numeroSottoclasse;
	}
	
	
	
	//getter e setter
	public int getNumeroSottoclasse() {
		return numeroSottoclasse;
	}
	
	public void setNumeroSottoclasse(int numeroSottoclasse) {
		this.numeroSottoclasse = numeroSottoclasse;
	}
	
	//Ricrittura del metodo presente nella Superclasse
	//Override del metodo, ridefinizione, cambiando il comportamento
	//Deve avere la stessa firma, stesso tipo di ritorno e non deve essere meno accesssibile
	@Override //ci aiuta a non commette errori, funzione di controllo
	public String metodoSuperclasse() {
		return "Questo metodo è stato sovrascritto nella sottoclasse";
	}
	
	@Override
	public String metodoOverride() {
		//super.metodoOverride() serve a chiamre il metodo presente nella superclasse
		//è utile quando vogliamo riutilizzare il comportamento della superclasse e
		//aggiungiamo qualcosa nella sottoclasse
		return super.metodoOverride() + " sovrascritto";
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + numeroSottoclasse;
	}
	

}
