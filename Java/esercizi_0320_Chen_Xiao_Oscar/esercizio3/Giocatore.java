package esercizio3;

public class Giocatore {

	// Attributi
	private String nome;
	private double prezzo;

	// Costruttore
	public Giocatore(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		return prezzo;
	}
}
