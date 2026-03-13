package esercizio2_3;

import java.util.Scanner;

/*
 * Creare una classe chiamata TestCalcolatriceAvanzata che abbia lo scopo 
 * di accettare input dagli utenti e che restituisca i risultati delle operazioni a schermo.
 */

public class TestCalcolatriceAvanzata {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		Scanner input = new Scanner(System.in);
		CalcolatriceAvanzata calcolatrice = new CalcolatriceAvanzata();

		System.out.print("Inserisci il primo numero decimale: ");
		a = input.nextDouble();

		System.out.print("Inserisci il secondo numero decimale: ");
		b = input.nextDouble();

		// operazioni con due operatori
		System.out.println();
		System.out.println("Operazioni con due operatori.");
		System.out.println("Somma: " + calcolatrice.somma(a, b));
		System.out.println("Sottrazione: " + calcolatrice.sottrazione(a, b));
		System.out.println("Moltiplicazione: " + calcolatrice.moltiplicazione(a, b));
		System.out.println("Divisione: " + calcolatrice.divisione(a, b));

		// inserimento terzo numero
		System.out.println();
		System.out.print("Inserisci il terzo numero decimale: ");
		c = input.nextDouble();
		input.close();

		// operazioni con due operatori
		System.out.println();
		System.out.println("Operazioni con tre operatori.");
		System.out.println("Somma: " + calcolatrice.somma(a, b, c));
		System.out.println("Sottrazione: " + calcolatrice.sottrazione(a, b, c));
		System.out.println("Moltiplicazione: " + calcolatrice.moltiplicazione(a, b, c));
		System.out.println("Divisione: " + calcolatrice.divisione(a, b, c));

		double[] numeri = {a, b, c};
		
		// operazioni con un array
		System.out.println();
		System.out.println("Operazioni con un array costituito dai numeri inseriti [" + a + ", " + b + ", " + c + "]");
		System.out.println("Somma: " + calcolatrice.somma(numeri));
		System.out.println("Sottrazione: " + calcolatrice.sottrazione(numeri));
		System.out.println("Moltiplicazione: " + calcolatrice.moltiplicazione(numeri));
		System.out.println("Divisione: " + calcolatrice.divisione(numeri));
	}

}
