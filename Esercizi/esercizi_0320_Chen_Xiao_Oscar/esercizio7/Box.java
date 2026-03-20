package esercizio7;

/*
 * Realizzare una classe Box, che rappresenta una scatola, 
 * avente gli attributi altezza, lunghezza e profondita che caratterizzano le dimensioni della scatola. 
 * Tale classe avrà, oltre ai vari metodi get/set, un metodo isContenuto() che restituisce un booleano e riceve in ingresso un oggetto Box. 
 * Il costruttore della classe Box deve essere implementato in modo tale che 
 * se si inseriscono per altezza, lunghezza e profondità valori minori di 0 
 * sollevi un’eccezione personalizzata UndiscoveredDimensionException. 
 * Istanziare nel main() due scatole e verificare se le due scatole sono uguali, 
 * considerando che le due scatole sono uguali se e solo se hanno le stesse dimensioni. 
 * Verificare inoltre se una scatola può essere contenuta nell’altra.
 */

public class Box {

	private double altezza;
	private double lunghezza;
	private double profondita;

	// Costruttore che solleva un'eccezione se le dimensioni sono minori di 0
	public Box(double altezza, double lunghezza, double profondita) throws UndiscoveredDimensionException {
		if (altezza < 0 || lunghezza < 0 || profondita < 0) {
			throw new UndiscoveredDimensionException("Le dimensioni della scatola devono essere maggiori di 0.");
		}
		this.altezza = altezza;
		this.lunghezza = lunghezza;
		this.profondita = profondita;
	}

	// Metodi get/set
	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}

	public double getProfondita() {
		return profondita;
	}

	public void setProfondita(double profondita) {
		this.profondita = profondita;
	}

	// Metodo isContenuto() che verifica se una scatola può essere contenuta
	// nell'altra
	public boolean isContenuto(Box altraScatola) {
		return this.altezza < altraScatola.getAltezza() && this.lunghezza < altraScatola.getLunghezza()
				&& this.profondita < altraScatola.getProfondita();
	}

	// Metodo equals() per verificare se due scatole sono uguali
	public boolean equals(Box altraScatola) {
		return this.altezza == altraScatola.getAltezza() && this.lunghezza == altraScatola.getLunghezza()
				&& this.profondita == altraScatola.getProfondita();
	}
}
