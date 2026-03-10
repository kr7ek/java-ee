package esercizio1;

/*
 * Scrivere una classe che abbia un metodo main e altri 4 metodi: uno per la somma, uno per la 
 * sottrazione, uno per la moltiplicazione e uno per la divisione tra due numeri. 
 * Ognuno di questi metodi deve restituire il risultato dell'operazione. 
 * Inserire nel main delle stampe dei risultati come esempio.
 */

public class Operazioni {
	
	public static void main(String[] args) {
		
		int a = 12;
		int b = 2;
		
		System.out.println("Sia a=12 e b=2.");
		System.out.println("La loro somma è: " + somma(a, b));
		System.out.println("La loro differenza è: " + sottrazione(a, b));
		System.out.println("Il loro prodotto è: " + moltiplicazione(a, b));
		System.out.println("Il loro rapporto è: " + divisione(a, b));
	}
	
	public static int somma(int a, int b) {
		return a+b;
	}
	
	public static int sottrazione(int a, int b) {
		return a-b;
	}
	
	public static int moltiplicazione(int a, int b) {
		return a*b;
	}
	
	public static int divisione(int a, int b) {
		return a/b;
	}
}
