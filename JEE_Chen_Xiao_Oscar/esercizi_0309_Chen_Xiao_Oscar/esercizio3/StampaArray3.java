package esercizio3;

/*
 * Creare una classe Java che abbia all'interno un array di interi 
 * contenente i numeri dispari da -3 a 11. Stampare l'array a schermo.
 */

public class StampaArray3 {

	public static void main(String[] args) {
		
		int[] numeri = new int[20];
		int j = 0;
		
		// inserimento in array
		for(int i=-3; i<=11; i++)
			if(i%2 != 0) {
				numeri[j] = i;
				j++;
				}
		
		// stampa dei numeri fino a 11
		for(int i=0; i<=numeri.length; i++) {
			System.out.print(numeri[i] + " ");
			if(numeri[i] == 11)
				break;
		}
	}
}
