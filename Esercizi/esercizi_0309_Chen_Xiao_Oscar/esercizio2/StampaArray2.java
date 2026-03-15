package esercizio2;

/*
 * Creare una classe Java che abbia all'interno un array di interi 
 * contenente i numeri pari da 0 a 12. Stampare l'array a schermo.
 */

public class StampaArray2 {

	public static void main(String[] args) {
		
		int[] numeri = new int[13];
		int j = 0;
		
		// inserimento in array
		for(int i=0; i<=12; i++)
			if(i%2 == 0) {
				numeri[j] = i;
				j++;
				}
		
		// stampa numeri fino a 12
		for(int i=0; i<=numeri.length; i++) {
			System.out.print(numeri[i] + " ");
			if(numeri[i] == 12)
				break;
		}
		
	}
}
