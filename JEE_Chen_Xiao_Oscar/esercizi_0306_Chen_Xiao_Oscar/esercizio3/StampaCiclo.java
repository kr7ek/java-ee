package esercizio3;

/*
 * Creare una classe Java che stampi a schermo i numeri dispari da 14 a -3. 
 * Utilizza sia un while che un ciclo for.
 */

public class StampaCiclo {

	public static void main(String[] args) {
		
		// Ciclo while
		System.out.println("Stampa numeri dispari da 14 a -3 con ciclo while");
		
		int i = 14;
		while(i >= -3) {
			if(i%2 != 0)
				System.out.println(i);
			i--;
		}
		
		// Ciclo for
		System.out.println("Stampa numeri dispari da 14 a -3 con ciclo for");
		
		for(int j=14; j >= -3; j--) {
			if(j%2 != 0)
				System.out.println(j);
		}
		
	}
}
