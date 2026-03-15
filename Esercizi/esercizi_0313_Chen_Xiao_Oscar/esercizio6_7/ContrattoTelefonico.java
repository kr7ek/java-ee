package esercizio6_7;

/*
 * Sviluppare una classe ContrattoTelefonico che ha un numero, 
 * un nome dell'abbonato e una bolletta, data da una costante (COSTO_AL_SECONDO) 
 * moltiplicata per il numero di secondi di una telefonata.
 * Un contratto fisso è un contratto telefonico con la sola aggiunta 
 * che in questo caso abbiamo anche l'indirizzo dell'utenza.
 * Un contratto per un telefono mobile è un contratto telefonico 
 * dove il conteggio della bolletta viene fatto con lo stesso criterio generale, 
 * salvo che ad ogni risposta viene aggiunto un sovrapprezzo COSTO_RISPOSTA.
 */

public abstract class ContrattoTelefonico {

	private final double COSTO_AL_SECONDO = 0.5;
	private String numero;
	private String nomeAbbonato;
	private double bolletta;

	// costruttore default
	public ContrattoTelefonico() {
		this.numero = "";
		this.nomeAbbonato = "";
	}

	// costruttore parametrizzato
	public ContrattoTelefonico(String numero, String nomeAbbonato) {
		this.numero = numero;
		this.nomeAbbonato = nomeAbbonato;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNomeAbbonato() {
		return nomeAbbonato;
	}

	public void setNomeAbbonato(String nomeAbbonato) {
		this.nomeAbbonato = nomeAbbonato;
	}

	public double getBolletta() {
		return bolletta;
	}

	public void setBolletta(double bolletta) {
		this.bolletta = bolletta;
	}

	public double getCOSTO_AL_SECONDO() {
		return COSTO_AL_SECONDO;
	}

	public abstract double calcoloBolletta(int sec);

}
