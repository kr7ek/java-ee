package esercizio4;

public class Studente {

	private String nome;
	private String cognome;
	private int isee;
	private int annoCorso;

	public Studente() {

	}

	public Studente(String nome, String cognome, int isee, int annoCorso) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.isee = isee;
		this.annoCorso = annoCorso;
	}

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

	public double getIsee() {
		return isee;
	}

	public void setIsee(int isee) {
		this.isee = isee;
	}

	public int getAnnoCorso() {
		return annoCorso;
	}

	public void setAnnoCorso(int annoCorso) {
		this.annoCorso = annoCorso;
	}

}
