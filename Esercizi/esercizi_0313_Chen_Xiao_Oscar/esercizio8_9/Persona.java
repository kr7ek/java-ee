package esercizio8_9;

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
