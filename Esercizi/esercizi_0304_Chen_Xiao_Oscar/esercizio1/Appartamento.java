package esercizio1;

public class Appartamento {
	
	// Attributi
	public String tipo;
	public String indirizzo;
	public float prezzo;
	
	// Costruttore vuoto
	public Appartamento() {}
	
	// Costruttore parametrizzato
	public Appartamento(String tipo, String indirizzo, float prezzo) {
		this.tipo = tipo;
		this.indirizzo = indirizzo;
		this.prezzo = prezzo;
		}
	}
