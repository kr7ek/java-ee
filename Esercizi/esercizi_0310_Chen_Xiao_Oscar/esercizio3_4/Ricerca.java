package esercizio3_4;

import java.util.Scanner;

/*
 * Dato un array di numeri interi già definito come: 
 * 
 *                  int[] numeri = {1, 25, -4, 36, 0, -1, -4, 27, 3, -1, -1, 52}; 
 *    
 * scrivere una classe che ha un metodo main che prende in input un numero intero dall'utente 
 * e stampa se questo numero è presente o meno nell'array numeri.
 * 
 * Nella stessa classe dell'esercizio 3, scrivere un metodo che conti le occorrenze di un dato numero preso come argomento, 
 * che conterà quante volte quel numero compare nell'array. Modificare il codice dell'esercizio 3 
 * in modo che questo metodo sia chiamato solo quando è già stato stabilito se compare o meno nell'array.
 */

public class Ricerca {

	public static void main(String[] args) {

		final int[] numeri = { 1, 25, -4, 36, 0, -1, -4, 27, 3, -1, -1, 52 };
		int val;
		Scanner input = new Scanner(System.in);
		boolean flag = false;

		// inserimento numero
		System.out.print("Per favore inserire un numero intero: ");
		val = input.nextInt();
		input.close();

		// cerca e segnala presenza del numero
		for (int i = 0; i < numeri.length; i++)
			if (numeri[i] == val) {
				flag = true;
				break;
			}

		// stampa messaggio di esito
		if (flag)
			System.out.println("il numero " + val + " e' presente " + conta(numeri, val) + " volte nell' array.");
		else
			System.out.println("il numero " + val + " non e' presente nell' array.");

	}

	// conta le occorrenza di un numero val in un array num
	public static int conta(int[] num, int val) {

		int count = 0;

		for (int i = 0; i < num.length; i++)
			if (num[i] == val)
				count++;

		return count;
	}
}
