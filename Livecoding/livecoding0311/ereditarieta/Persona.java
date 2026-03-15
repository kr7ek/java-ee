package ereditarieta;

//Superclasse
public class Persona { // sottoclasse di Object

	public String nome;
	public String cognome;
	private int eta;
	private double stipendio;

	public Persona() {

	}

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	// Uso di this() all'interno del costruttore, riutilizzo del codice evita di
	//scrivere più volte le stesse istruzioni
	public Persona(String nome, String cognome, int eta, double stipendio) {
		//deve sempre essere la prima istruzione
		this(nome, cognome); // fa una chiamata al costrutture della stessa classe (rigo 15)
//		this.nome = nome;
//		this.cognome = cognome;
		this.eta = eta;
		this.stipendio = stipendio;
	}
	
	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public double getStipendio() {
		return stipendio;
	}
	
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	public String saluta() {
		return this.nome + " sta salutando";
	}
	
	public final String metodoNonSovrascrivibile() {
		return "Metodo final, non può essere sovrascritto";
	}
	
	//Viene ereditato dall supeclasse Object
	//Serve a rappresentare un oggetto in modo testuale, come stringa
	@Override
	public String toString() {
		return this.nome + " " + this.cognome + " " + this.eta + " " + this.stipendio;
	}
	
	
	
}
