package esercizio6;

/*
 * Scrivere un programma SommaApprossimata che prende due numeri con la virgola, 
 * li somma e poi stampa il risultato come numero intero.
 */

public class Somma {

	public static void main(String[] args) {
		
		double num1 = 3.141592653589793;
		double num2 = 1.4142135623730951;
		
		System.out.println("Primo numero: " + num1);
		System.out.println("Secondo numero: " + num2);
		
		sommaApprossimata(num1, num2);
		
	}
	
	/*
	 *  Metodo che prende due numeri in ingresso, calcola la loro somma e
	 *  stampa il risultato in intero.
	 */
	public static void sommaApprossimata(double numero1, double numero2) {
		
		double num3 = numero1 + numero2;
		System.out.println("Somma: " + (int)num3);
		
	}
}
