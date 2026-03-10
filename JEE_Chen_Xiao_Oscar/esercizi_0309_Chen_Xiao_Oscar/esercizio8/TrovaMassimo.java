package esercizio8;

/*
 * Creare una classe Java che abbia all'interno un array di interi 
 * contenente dei numeri scelti dal programmatore. 
 * Stampare il massimo tra tutti gli elementi dell'array a schermo.
 */

public class TrovaMassimo {

	public static void main(String[] args) {
		
		int[] numeri = {3, 7, 17, 19, 26, 77};
		int max = -2000000000;
		
		System.out.print("Siano dati i seguenti numeri: ");
		
		for(int i=0; i<numeri.length; i++) {
			System.out.print(numeri[i] + " ");
			
			if(numeri[i] > max) // ricerca valore massimo
				max = numeri[i];
		}
		
		System.out.println();
		System.out.println("Il valore massimo nell'array è: " + max);
	
	}
}
