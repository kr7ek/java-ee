package esercizio2;

public class Quadrato {
	
	int lato;
	
	// Costruttore parametrizzato
	public Quadrato(int lato) {
		this.lato = lato;
	}
	
	// Calcolo perimetro quadrato
	public int perimetro() {
		return 4 * lato;
	}
	
	// Calcolo area quadrato
	public int area() {
		return lato * lato;
	}
}
