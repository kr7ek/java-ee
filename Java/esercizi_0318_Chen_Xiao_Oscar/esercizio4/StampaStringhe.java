package esercizio4;

import java.util.ArrayList;
import java.util.List;

/*
 * Creare una classe Java con una lista di Stringhe definita dal programmatore. 
 * Stampare a schermo la lista con una lambda.
 */

public class StampaStringhe {
	public static void main(String[] args) {

		// lista definita dal programmatore
		List<String> lista = new ArrayList<>();

		lista.add("Ciao");
		lista.add("Mondo");
		lista.add("Come");
		lista.add("Stai");

		// stampa con lambda
		lista.forEach(elemento -> System.out.println(elemento));
	}
}
