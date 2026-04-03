package esercizio1;

import java.util.Scanner;

/*
 * Creare una classe Java che lasci inserire numeri in input all'utente finché la sequenza di numeri è decrescente, 
 * cioè l'ultimo elemento immesso dall'utente deve essere più piccolo del precedente. 
 * L'algoritmo alla fine deve stampare quanti numeri sono stati immessi e la loro media.
 */

public class Decrescente {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int somma = 0;
		int last;
		int current;
		int count = 0;

		System.out.println("Inserire una sequenza di numeri decrescenti: ");

		// inserimento primo numero
		last = input.nextInt();
		somma += last;
		count++;

		while (true) {
			current = input.nextInt();
			if (current < last) {
				last = current;
				somma += last;
				count++;
			} else
				break;
		}

		System.out.println("Sono stati inseriti " + count + " numeri in ordine decrescente.");
		System.out.println("La somma e': " + somma);
		System.out.println("La media e': " + (double) somma / count);

		input.close();
	}

}
