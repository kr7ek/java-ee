package esercizio5;

/*
 * Creare una classe Java che abbia all'interno un array di interi 
 * contenente dei numeri scelti dal programmatore. 
 * Stampare a schermo un messaggio se l'array contiene numeri negativi.
 */

public class Controllo {

	public static void main(String[] args) {

		int[] numeri1 = { 3, 7, 17, 19, 26, 77, 90 }; // array di numeri interi positivi
		int[] numeri2 = { 8, 17, 23, 58, -67, 50, 33 }; // array di numeri positivi e negativi

		System.out.println("Sia il primo array con questi numeri: 3, 7, 17, 19, 26, 77 e 90.");
		System.out.println("Sia il secondo array con questi numeri: 8, 17, 23, 58, -67, 50 e 33.");

		System.out.println();

		System.out.println("Verifica sul primo array:");
		for (int i = 0; i < numeri1.length; i++) {
			if (numeri1[i] < 0) {
				System.out.println("L'array contiene numeri negativi");
				break; // se trova il numero negativo stampa il messaggio ed esce
			}
			if (i == (numeri1.length - 1)) // altrimenti stampa un messaggio diverso
				System.out.println("L'array non contiene numeri negativi");
		}

		// stessa cosa con l'array precedente
		System.out.println("Verifica sul secondo array:");
		for (int i = 0; i < numeri2.length; i++) {
			if (numeri2[i] < 0) {
				System.out.println("L'array contiene numeri negativi");
				break;
			}
			if (i == (numeri2.length - 1))
				System.out.println("L'array non contiene numeri negativi");
		}

	}
}
