package esercizio1;

/*
 * Creare una classe Java che, a partire da 4 variabili che contengono 
 * la lunghezza dei lati di un quadrilatero, stampi a schermo se la figura 
 * geometrica in questione è un quadrato, oppure no.
 */

public class Quadrato {

	public static void main(String[] args) {
		
		// Quadrilatero 1
		int l1 = 3;
		int l2 = 4;
		int l3 = 5;
		int l4 = 6;
		
		// Quadrilatero 2
		int l5 = 3;
		int l6 = 3;
		int l7 = 3;
		int l8 = 3;
		
		System.out.println("Controllo quadrilatero 1 di lati 3, 4, 5, 6:");
		controllaQuadrato(l1, l2, l3, l4);
		System.out.println("Controllo quadrilatero 1 di lati 3, 3, 3, 3:");
		controllaQuadrato(l5, l6, l7, l8);
	}
	
	public static void controllaQuadrato(int l1, int l2, int l3, int l4) {
		
		if(l1 == l2 && l2 == l3 && l3 == l4)
			System.out.println("Questo quadrilatero è un quadrato.");
		else
			System.out.println("Questo quadrilatero non è un quadrato.");
	}
}
