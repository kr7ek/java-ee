package livecoding0303;

/*
 * Una classe fornisce la struttura e le funzioni
 * Attributi + Metodi -> Membri della classe
 * 
 * Il nome della classe per convenzione si scrive con la lettera maiuscola
 * Il nome del file .java avrà il nome della classe
 */
public class Gatto {
	
	//lista degli attributi che servono per descrivere gli oggetti di tipo Gatto
	//variabili d'istanza
	public String nome;
	public int eta;
	public String razza;
	public String particolare;
	public boolean vaccino;
	
	/*
	 * Il Costruttore serve per istanziare gli oggetto, è l'unico metodo che ha lo stesso 
	 * nome della classe
	 */
	
	//Costruttore vuoto
	public Gatto() {
		
	}
	
	//Costruttore parametrizzato
	//andiamo ad inserire una lista di parametri al suo interno
	//this -> parola chiave serve per evitare problemi di ambiguità
	public Gatto(String nome, int eta, String razza, String particolare, boolean vaccino) {
		this.nome = nome;
		this.eta = eta;
		this.razza = razza;
		this.particolare = particolare;
		this.vaccino = vaccino;
	}
	
	//Costruttore con un solo parametro
	public Gatto(String nome) {
		this.nome = nome;
	}
	
	//Metodi d'istanza
	//void -> metodo senza ritorno
	public void miagola() {
		//istruzioni
		System.out.println(" sta miagolando");
	}
	
	//metodo che mi restituisce un valore, una stringa
	public String cammina() {
		//istruzioni
		return " sta camminando";
	}
	
	//metodo che restituisce un numero intero
	public int numeroZampe() {
		return 4;
	}

}
