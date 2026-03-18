package esercizio2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Creare una classe Java che chieda all'utente di immettere dei numeri. 
 * Ogni numero deve essere inserito nello stesso insieme. Alla fine stampare l'insieme.
 */

public class SetInput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inserire una sequenza di numeri interi terminato da INVIO:");

		Scanner in = new Scanner(System.in);
		Set<String> lista = new HashSet<>();

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
