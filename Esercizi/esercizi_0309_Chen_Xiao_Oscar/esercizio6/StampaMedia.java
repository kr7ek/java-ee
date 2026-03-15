package esercizio6;

/*
 * Creare una classe Java che abbia all'interno un array di interi 
 * contenente dei numeri scelti dal programmatore. 
 * Stampare la media di tutti gli elementi dell'array a schermo.
 */

public class StampaMedia {

	public static void main(String[] args) {
		
		int[] numeri = {3, 7, 17, 19, 26, 77};
		double somma = 0;
		
		System.out.print("Siano dati i seguenti numeri: ");
		
		// stampa numeri e calcolo della somma
		for(int i=0; i<numeri.length; i++) {
			System.out.print(numeri[i] + " ");
			somma += numeri[i];
		}
		
		System.out.println();
		
		// stampa media dei numeri
		System.out.println("La loro media e': " + somma/numeri.length);
	}
}
