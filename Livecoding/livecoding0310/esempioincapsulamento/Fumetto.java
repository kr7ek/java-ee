package esempioincapsulamento;

public class Fumetto {

	// Attributi dichiarati privati per ottenere l'incapsulamento
	private String autore;
	private String titolo;
	private int numeroPagine;

	// Costruttore vuoto
	public Fumetto() {

	}

	// Costruttore parametrizzato
	public Fumetto(String autore, String titolo, int numeroPagine) {
		this.autore = autore;
		this.titolo = titolo;
		//this.numeroPagine = numeroPagine;
		/*
		if (numeroPagine <= 0 || numeroPagine > 1000) {
			System.out.println("Il numero delle pagine non può essere meno di zero o più di 1000");
		} else {
			this.numeroPagine = numeroPagine;
		}
		*/
		setNumeroPagine(numeroPagine); //chiamo il metodo set all'interno del costruttore
	}

	// Costruttore con un unico parametro
	public Fumetto(String titolo) {
		this.titolo = titolo;
	}

	// Lista dei metodi GET e SET indispensabili per gestire l'incapsulamento

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		//OR corrisponde a ||, almeno una delle due condizioni deve essere vera
		if (numeroPagine <= 0 || numeroPagine > 1000) {
			System.out.println("Il numero delle pagine non può essere meno di zero o più di 1000");
		} else {
			this.numeroPagine = numeroPagine;
		}
	}

}
