package livecoding0304;

//I nomi delle classi vanno sempre in maiuscolo e al singolare
public class Studente {
	
	/*
	 * Attributi della classe che servono a descrivere gli studenti
	 * iniziano con la lettera minuscola e se ci sono più parole queste cominciano con la 
	 * prima lettera in maiuscolo
	 * 
	 * Variabili d'istanza, proprietà uniche di ogni istanza (di ogni oggetto)
	 * cambiano il loro valore da oggetto a oggetto
	 */
	String nome;
	String cognome;
	String codiceFiscale;
	int eta;
	
	/*
	 * Variabili di classe, variabili statiche
	 * valore condiviso da tutte le istanze (da tutti gli oggetti)
	 * un unico valare per tutta la classe, ciascun oggetto Studente avrà lo stesso valore
	 */
	public static int numeroDiOre = 240;
	public static int numeroDiPostiDisponibili = 15;
	
	//INIZIALIZZATORI
	//un blocco di codice che permette di eseguire delle istruzioni
	
	//inizializzatore statico
	//il blocco di codice viene eseguito una sola volta, al momento del caricamento della classe
	//viene eseguito quindi quando si utilizza la classe per la prima volta
	static {
		System.out.println("Chiama l'inizializzatore statico, della classe");
		System.out.println("Numero di posti "  + numeroDiPostiDisponibili);
	}
	
	
	//inizializzatore istanza
	//il blocco di codice viene eseguito ogni volta che un oggetto Studente viene creato
	{
		System.out.println("Chiama l'inizializzatore di istanza");
		System.out.println("Il numero di posti disponibili scende di uno");
		numeroDiPostiDisponibili = numeroDiPostiDisponibili -1;
	}
	
	
	//Costruttore vuoto
	public Studente() {
		
	}
	
	//Costruttore parametrizzato
	public Studente(String nome, String cognome, String codiceFiscale, int eta) {
		this.nome = nome;
		this.cognome= cognome;
		this.codiceFiscale = codiceFiscale;
		this.eta = eta;
	}
	
	/*
	 * public specifica il tipo di accesso
	 * void il tipo di ritorno
	 * presentati è il nome del metodo
	 * all'interno delle parentesi tonde possiamo inserire dei parametri
	 */
	public void presentati() {
		System.out.println("Ciao, sono " + this.nome + " e ho "+ this.eta + " anni");
	}
	
	//restituisce una stringa
	public String salutare(String saluto) {
		return saluto + " mi chiamo " + this.nome + " e ho " + this.eta + " anni";
	}
	
	//DUE SOLUZIONI per calcolare la differenza di età
	//metodo statico, appartiene alla classe
	//calcola la differenza tra due numeri interi, restituisce un intero e prende in ingresso
	//due parametri interi
	public static int differenzaEta(int x, int y) {
		return x-y;
	}
	
	//metodo di istanza
	//restituisce un intero e calcola la differenza di eta tra due studenti
	//accetta quindi un oggetto di tipo studente come parametro in ingresso
	//due istanza -> una è l'istanza sulla quale chiamiamo il metodo e l'altra è lo studente
	//					che passiamo come parametro
	public int differenzaEta(Studente studente) {
		//Math è una classe del package java.lang fornisce metodi per le operazioni matematiche
		//abs() metodo che restituisce il valore assoluto
		return Math.abs(this.eta - studente.eta);
	}
	
	
	
}

