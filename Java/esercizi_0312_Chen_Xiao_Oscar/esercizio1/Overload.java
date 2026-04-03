package esercizio1;

/*
 * Creare una classe di esempio con tre metodi con lo stesso nome, 
 * ma parametri diversi per numero o per tipo, in modo da effettuare un overload.
 */

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Somma di due numeri interi a=23 e b=14.");
		System.out.println("La somma e': " + somma(23, 14) + "\n");

		System.out.println("Somma di due numeri decimali a=23.56 e b=14.34.");
		System.out.println("La somma e': " + somma(23.56, 14.34) + "\n");

		System.out.println("Somma di tre numeri interi a=23, b=14 e c=38.");
		System.out.println("La somma e': " + somma(23, 14, 38) + "\n");

	}

	// somma di due numeri interi
	public static int somma(int a, int b) {
		return a + b;
	}

	// somma di due numeri decimali
	public static double somma(double a, double b) {
		return a + b;
	}

	// somma di tre numeri interi
	public static int somma(int a, int b, int c) {
		return a + b + c;
	}

}
