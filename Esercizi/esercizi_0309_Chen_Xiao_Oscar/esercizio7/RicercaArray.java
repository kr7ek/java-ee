package esercizio7;

/*
 * Creare una classe Java che abbia all'interno un array di interi, 
 * con numeri arbitrari definiti dal programmatore. 
 * Con l'ausilio di una variabile, controllare che un numero sia nell'array.
 */

public class RicercaArray {

	public static void main(String[] args) {
		
		int[] numeri = {3, 7, 17, 19, 26, 77};
		int val = 26;
		boolean flag = false;
		
		System.out.print("Siano dati i seguenti numeri: ");
		
		// ricerca valore in array
		for(int i=0; i<numeri.length; i++) {
			System.out.print(numeri[i] + " ");
			if(numeri[i] == val)
				flag = true;
		}
		
		System.out.println();
		
		if(flag)
			System.out.println("Il numero " + val + " e' presente nell'array.");
		else
			System.out.println("Il numero " + val + " non e' presente nell'array.");
		
	}
}
