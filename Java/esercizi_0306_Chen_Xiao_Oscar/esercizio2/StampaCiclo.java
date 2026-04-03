package esercizio2;

/*
 * Crea una classe Java che stampi a schermo i numeri pari da 1 a 14. 
 * Utilizza sia un ciclo while, sia un ciclo for.
 */

public class StampaCiclo {
	
	public static void main(String[] args) {
		
		// Ciclo while
		System.out.println("Stampa numeri pari da 1 a 14 con ciclo while");
		
		int i = 1;
		while(i <= 14) {
			if(i%2 == 0)
				System.out.println(i);
			i++;
		}
		
		// Ciclo for
		System.out.println("Stampa numeri pari da 1 a 14 con ciclo for");
		
		for(int j=1; j<=14; j++) {
			if(j%2 == 0)
				System.out.println(j);
		}
		
	}
}