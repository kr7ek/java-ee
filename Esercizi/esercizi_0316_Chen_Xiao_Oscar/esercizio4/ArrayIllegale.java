package esercizio4;

/*
 * Creare una classe Java con un metodo main che preveda la stampa dei primi 5 elementi di un array di interi. 
 * Qualora l'array avesse meno di 5 elementi, gestire l'eccezione mostrando un messaggio di errore appropriato.
 */

public class ArrayIllegale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeri = { 1, 2, 3, 4, 5, 6, 7, 8 };

		try {
			for (int i = 0; i < 5; i++)
				System.out.print(numeri[i] + " ");

		} catch (Exception e) {
			System.out.println("\nArray troppo corto.");
		}
	}

}
