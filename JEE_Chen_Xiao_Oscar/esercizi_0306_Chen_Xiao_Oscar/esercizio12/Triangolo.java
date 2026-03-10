package esercizio12;

/*
 * Creare una classe Java che, a partire da 3 variabili che contengono la lunghezza dei lati di un triangolo, 
 * stampi a schermo se il triangolo in questione è equilatero, isoscele o scaleno.
 */

public class Triangolo {

	public static void main(String[] args) {
		
		int a=24;
		int b=10;
		int c=4;
		
		System.out.println("Sia un triangolo di lati a=24, b=10 e c=4.");
		
		if(a==b && b==c)
			System.out.println("Il triangolo è equilatero");
		else if(a==b || b==c || c==a)
			System.out.println("Il triangolo è isoscele");
		else if(a!=b && b!=c && c!=a)
			System.out.println("Il triangolo è scaleno");
	}
}
