package esercizio10;

/*
 * Creare una classe Java che, a partire da due variabili, 
 * controlli se il primo numero è maggiore del secondo. 
 * Stampare l’esito del controllo.
 */

public class Controllo {

	public static void main(String[] args) {
		
		int a=24;
		int b=10;
		
		System.out.println("Sia a=24 e b=10.");
		
		if(a > b)
			System.out.println("Il numero " + a + " è maggiore di " + b + ".");
		else if(a < b)
			System.out.println("Il numero " + a + " è minore di " + b + ".");
	}
}
