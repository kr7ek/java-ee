package esercizio1;

public class Albero {

	// Attributi
	public String tipo;
	public int altezza;
	public int eta;
	
	// Costruttore vuoto
	public Albero() {}
	
	// Costruttore parametrizzato
	public Albero(String tipo, int altezza, int eta) {
		this.tipo = tipo;
		this.altezza = altezza;
		this.eta = eta;
		}
}
