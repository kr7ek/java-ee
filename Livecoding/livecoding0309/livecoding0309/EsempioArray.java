package livecoding0309;

public class EsempioArray {

	public static void main(String[] args) {

		/*
		 * Array -> collezione indicizzata di dati primitivi, reference o altri array
		 * 
		 * Strutture dati che contengono più elementi dello stesso tipo, in un'unica
		 * variabile andiamo a memorizzare molti valori
		 * 
		 */

		// Dichiarazione e creazione
		String[] array1 = new String[3]; // obbligatorio specificare la dimensione

		// Inizializzazione, l'accesso avviene tramite gli indici, si parte da zero
		array1[0] = "Luca";
		array1[1] = "Elia";
		array1[2] = "Leone";

		// Eccezione: posizione FUORI dal limite dell'array
		// (ArrayIndexOutBoundsException)
		// array1[3]= "Mario";

		System.out.println(array1); // visualizza in console il riferimento
		System.out.println(array1[1]); // stampa un singolo elemento, [1] è il secondo elemento

		// nomearray.length restituisce la dimensione dell'array
		System.out.println("Dimensione " + array1.length);

		// stampare tutti gli elementi di un array
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

		// Dichiarazione, creazione e inizializzazione
		int[] arrInteri = { 3, 45, 8, 5, 10 };
		// arrInteri[0] = 3; arrInteri[1] = 45; arrInteri[2] = 8; arraInteri[3] = 5;
		// arraInteri[4] = 10;

		System.out.println("Dimensione " + arrInteri.length);
		for (int i = 0; i < arrInteri.length; i++) {
			System.out.println(arrInteri[i]);
		}

		System.out.println("-------------");
		// Modifica di un elemento
		arrInteri[1] = 9;
		for (int i = 0; i < arrInteri.length; i++) {
			System.out.println(arrInteri[i]);
		}
		System.out.println("-------------");
		array1[0] = "Paola";
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

		System.out.println("-------------");
		// Riempire un array
		int l = 10;
		for (int i = 0; i < arrInteri.length; i++) {
			arrInteri[i] = arrInteri[i] + l + 5;
		}
		for (int i = 0; i < arrInteri.length; i++) {
			System.out.println(arrInteri[i]);
		}

		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println("-------------");

		// Array Multidimensionali
		/*
		 * int -> tipo di dato [][] -> array bidimensionale interi -> identificativo new
		 * int[5][5]; -> indica il numero di righe e colonne
		 */
		int[][] interi = new int[5][5]; // tutti i valori sono inizializzati a zero

		// interi[numero riga] [numero colonna]
		interi[0][0] = 25;
		interi[0][1] = 36; // ...continua con l'assegnazione

		// dichiarazione, creazione e inizilizzazione (diretta)
		int[][] interi2 = { { 1, 25, 4, 9, 36 }, { 56, 8, 63, 41, 5 } }; // matrice con 2 righe e 5 colonne

		// stampa dei valori
		System.out.println(interi2[0][0]); // prima riga e prima colonna
		System.out.println(interi2[0][3]); // prima riga e colonna 4
		System.out.println(interi2[1][0]); // seconda riga e colonna 1
		System.out.println(interi2[1][1]); // seconda riga e colonna 2
		System.out.println(interi2[1][3]); // seconda riga e colonna 4
		System.out.println("-------------");

		// stampare la matrice
		for (int i = 0; i < interi2.length; i++) { // interi2.length -> numero di righe
			for (int j = 0; j < interi2[i].length; j++) { // interi[i].length -> numero di colonne
				System.out.print(interi2[i][j] + " "); // print() stampa senza andare a capo
			}
			System.out.println(); // println() stampa e va a capo
		}

		System.out.println("-------------");

		int[] v1 = { 1, 2, 3, 4, 5, 6 };
		int[] v2 = { 7, 8, 9, 10, 11, 12 };

		int[][] matrice = new int[v1.length][v2.length]; // new int[6][6]

		// assegnazione
		matrice[0][0] = 1;
		matrice[0][1] = 10;
		matrice[1][0] = 100;
		matrice[1][1] = 50;
		matrice[2][3] = 25;
		matrice[4][3] = 36;

		for (int i = 0; i < v1.length; i++) {
			for (int j = 0; j < v2.length; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("-------------");
		// riempire l'array
		for (int i = 0; i < v1.length; i++) {
			for (int j = 0; j < v2.length; j++) {
				matrice[i][j] = v1[i] * v2[j];
			}
		}
		for (int i = 0; i < v1.length; i++) {
			for (int j = 0; j < v2.length; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("-------------");
		// matrice 2 -> array di array, array multidimensionale irregolare
		// le righe hanno una lunghezza diversa (un diverso numero di colonne)
		int[][] matrice2 = { { 1, 2 }, { 3, 4, 5, 6, }, { 7, 8, 9 } };

		System.out.println(matrice2[1][2]);

		for (int i = 0; i < matrice2.length; i++) {
			for (int j = 0; j < matrice2[i].length; j++) {
				System.out.print(matrice2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
