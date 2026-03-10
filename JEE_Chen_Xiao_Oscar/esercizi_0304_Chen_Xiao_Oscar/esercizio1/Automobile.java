package esercizio1;

public class Automobile {

	// Attributi
	public float prezzo;
	public String alimentazione;
	public String colore;
	
	// Costruttore vuoto
	public Automobile() {}
	
	// Costruttore parametrizzato
	public Automobile(float prezzo, String alimentazione, String colore) {
		this.prezzo = prezzo;
		this.alimentazione = alimentazione;
		this.colore = colore;
		}
}
