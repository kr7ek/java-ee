package esercizio1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Creare una classe Java che chieda in input all’utente dei numeri che dovranno essere salvati in una lista. 
 * L’algoritmo deve stampare la lista dei numeri inseriti, il massimo e la media di tutti gli elementi.
 */

public class MidMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int sum = 0;

		System.out.println("Inserisci dei numeri interi terminati da INVIO:");
		while (true) {
			try {
				String input = sc.nextLine();
				if (input.isEmpty()) {
					break; // Esce dal ciclo se l'utente preme INVIO senza inserire un numero
				}
				int number = Integer.parseInt(input);
				numbers.add(number);
				sum += number;
			} catch (NumberFormatException e) {
				System.out.println("Per favore, inserisci un numero intero valido.");
			}
		}

		System.out.println("Numeri inseriti: " + numbers);
		if (!numbers.isEmpty()) {
			int max = numbers.get(0);
			for (int num : numbers) {
				if (num > max) {
					max = num;
				}
			}
			double average = (double) sum / numbers.size();
			System.out.println("Massimo: " + max);
			System.out.println("Media: " + average);
		} else {
			System.out.println("Nessun numero inserito.");
		}
		
		sc.close();

	}

}
