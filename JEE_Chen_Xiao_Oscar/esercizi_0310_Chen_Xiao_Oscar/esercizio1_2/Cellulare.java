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

	private int credito;
	private String ultimoNumero;
	
	public void creditoResiduo() {
		System.out.println(credito);
	}
	
	public void chiama() {
		
		if(credito>0) {
			System.out.println("Sto chiamando il numero: 1234567890.");
			credito--;
		}
		else
			System.out.println("Credito insufficiente.");
	}
	
	public String ultimaChiamataEffettuata() {
		return ultimoNumero;
	}
	
	public void richiama() {
		
	}
	
	public void ricaricaCredito() {
		
	}

}
