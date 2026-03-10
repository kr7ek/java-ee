package esercizio1;

/*
 * Creare una classe Java che abbia all'interno un array di interi 
 * contenente i numeri da 0 a 9. Stampare l'array a schermo.
 */

public class StampaArray {

	public static void main(String[] args) {
		
		int[] numeri = new int[10];
		
		// inserimento numeri nell'array
		for(int i=0; i<numeri.length; i++)
			numeri[i] = i;
		
		// stampa array
		for(int i=0; i<numeri.length; i++)
			System.out.print(numeri[i] + " ");
		
	}
}
