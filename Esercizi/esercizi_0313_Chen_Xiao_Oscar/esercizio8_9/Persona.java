package esercizio8_9;

/*
 * Realizzare una classe Persona avente gli attributi nome, cognome ed età, 
 * i metodi get/set e l’override del metodo toString(). 
 * Tale classe dovrà essere estesa dalle classi Studente e Insegnante. 
 * In particolare:
 *   • La classe Studente avrà l’attributo mediaVoti, i metodi get/set, 
 *     l’override del metodo toString() di Persona ed un metodo studia() 
 *     (tale metodo può effettuare anche soltanto una stampa a video). 
 *     Inoltre dovrà essere implementato il metodo calcolaMediaVoti() 
 *     il quale riceverà in ingresso un varargs di interi che saranno i voti 
 *     e ne dovrà effettuare il calcolo della media ed assegnarlo alla variabile globale mediaVoti.
 *   • La classe Insegnante avrà l’attributo materia, i metodi get/set, 
 *     l’override del metodo toString() di Persona ed un metodo insegna() 
 *     (tale metodo può effettuare anche soltanto una stampa a video).
*/

public abstract class Persona {

	private String nome;
	private String cognome;
	private int eta;

	// costruttore default
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	// costruttore parametrizzato
	public Persona(String nome, String cognome, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	// getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Questa Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}

}
