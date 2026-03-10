package esercizio1_2;

/*
 * Creare una classe Java che rispecchia il funzionamento di un telefono cellulare, 
 * chiamata Cellulare, in un package a vostra scelta. 
 * Dotare la classe di quegli attributi e di quei costruttori che si ritengono necessari. 
 * Usare l'incapsulamento per rendere le variabili inaccessibili all'esterno 
 * e dotare la classe di getter e di setter per ognuna di esse. 
 * 
 * Dotare la classe di quattro metodi: 
 * 
 *     a. Il metodo "chiama", che simula una chiamata, stampando a schermo: "sto
 *        chiamando il numero: ", corredata da un numero di esempio. La chiamata può 
 *        partire solo se il credito è maggiore di 0. 
 *     b. Il metodo "creditoResiduo", che stampa a schermo il credito residuo. 
 *     c. Il metodo "ultimaChiamataEffettuata", che ritorna l'ultimo numero chiamato dall'utente. 
 *     d. Il metodo "richiama", che chiama l'ultimo numero che è stato chiamato. 
 *     e. Il metodo "ricaricaCredito", che ricarica il credito del cellulare. 
 *     
 * Un consiglio: int potrebbe essere un tipo di dato non adatto 
 * a contere numeri di telefono, potete usare String.
 */

public class Cellulare {

	private String numero;
	private int credito;
	private String ultimoNumero;

	// costruttore parametrizzato che riceve solo il numero di telefono
	public Cellulare(String numero) {
		this.numero = numero;
		this.ultimoNumero = "";
		this.credito = 0;
	}

	public String getNumero() {
		return numero;
	}

	public int getCredito() {
		return credito;
	}

//	esiste gia' un metodo che ritorna l'ultimo numero chiamato
//	
//	public String getUltimoNumero() {
//		return ultimoNumero;
//	}
//
//	public void setUltimoNumero(String numero) {
//		ultimoNumero = numero;
//	}

	public void creditoResiduo() {
		System.out.println("Il credito residuo e' di: " + credito + " euro.");
	}

	public void chiama(String numero) {

		System.out.println("Sto chiamando il numero: " + numero);
		ultimoNumero = numero;

		// controllo numero valido
		if (numero == this.numero || numero == null)
			System.out.println("Numero non valido");

		// controllo credito
		if (credito > 0)
			credito--;
		else
			System.out.println("Credito insufficiente.");
	}

	// restituisce null se il registro e' vuoto
	public String ultimaChiamataEffettuata() {
		return ultimoNumero;
	}

	public void richiama() {
		if (ultimoNumero == "") {
			System.out.println("Nessun numero chiamato in precedenza.");
			return;
		}

		chiama(ultimoNumero);
	}

	public void ricaricaCredito(int n) {
		if (n > 0) {
			credito += n;
			System.out.println("La ricarica di " + n + " euro e' stata effettuata.");
		} else
			System.out.println("Importo non valido");
	}

}
