package esercizio11;

/*
 * Creare una classe Java che, a partire da 3 variabili, 
 * stampi a schermo se i numeri sono in ordine dal più piccolo al più grande, oppure no.
 */

public class Controllo2 {

	public static void main(String[] args) {
		
		int a=24;
		int b=10;
		int c=4;
		
		System.out.println("Sia a=24, b=10 e c=4.");
		
		if(a < b && b < c)
			System.out.println("I tre numeri sono in ordine crescente");
		else
			System.out.println("I tre numeri non sono in ordine crescente");
	}
}
