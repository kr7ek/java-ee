package esempioarray;

public class Persona {

	public String nome;
	public String cognome;
	public int eta;

	//Più costruttori nella stessa classe con paramtri diversi
	//posso creare un oggetto persona in più modi
	//Senza dati
	//Conoscendo nome, cognome e età
	//Conoscendo solo cognome e nome
	public Persona() {

	}

	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public Persona(String cognome, String nome) {
		this.nome = nome;
		this.cognome = cognome;
	}

}
