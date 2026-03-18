package esercizio1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Creare una classe Java che chieda all'utente di immettere dei numeri. 
 * Ogni numero deve essere inserito nella stessa lista. Alla fine stampare la lista.
 */

public class ListaInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inserire una sequenza di numeri interi terminato da INVIO:");

		Scanner in = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<>();

		while (true) {
			String s = in.nextLine();
			if (s == "")
				break;
			lista.add(s);
		}

		in.close();
		System.out.println(lista);

	}

}
