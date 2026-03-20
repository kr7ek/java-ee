package esercizio2;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Creare un’applicazione Java che chieda in input all’utente dei numeri positivi. 
 * L’acquisizione dei numeri da parte dell’utente finisce quando l’utente digita un numero negativo. 
 * Dopodiché, l’utente da in input un numero che chiameremo n. 
 * L’applicazione deve stampare a schermo due liste:
 * • la lista dei numeri dati dall’utente, da cui vengono tolti i multipli di n.
 * • La lista dei soli multipli di n.
 */

public class StampaMultipli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeri = new ArrayList<>();
		ArrayList<Integer> multipli = new ArrayList<>();

		System.out.println("Inserisci numeri positivi (termina con il numero -1):");
		int input = sc.nextInt();
		while (input >= 0) {
			numeri.add(input);
			input = sc.nextInt();
		}

		System.out.println("Inserisci un numero n:");
		int n = sc.nextInt();

		// Identifichiamo i multipli di n e li aggiungiamo alla lista dei multipli
		for (Integer numero : numeri) {
			if (numero % n == 0)
				multipli.add(numero);
		}

		// Rimuoviamo i multipli di n dalla lista dei numeri
		numeri.removeAll(multipli);

		// Stampa delle due liste
		System.out.println("Lista dei numeri senza i multipli di n:");
		for (Integer numero : numeri) {
			System.out.println(numero);
		}

		System.out.println("Lista dei multipli di n:");
		for (Integer multiplo : multipli) {
			System.out.println(multiplo);
		}
		
		sc.close();

	}

}
