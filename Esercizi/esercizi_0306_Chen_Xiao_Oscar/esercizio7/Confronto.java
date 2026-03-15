package esercizio7;

/*
 *  Creare una classe Java che stampi se la somma tra due numeri è maggiore 100, oppure no.
 */

public class Confronto {
	
	public static void main(String[] args) {
		
		int a=13;
		int b=31;
		int c=27;
		int d=64;
		int e=7;
		int f=85;
		
		maggiore(a, b);
		maggiore(a, c);
		maggiore(a, d);
		maggiore(a, e);
		maggiore(a, f);
		maggiore(b, c);
		maggiore(b, d);
		maggiore(b, e);
		maggiore(b, f);
		maggiore(c, d);
		maggiore(c, e);
		maggiore(c, f);
		maggiore(d, e);
		maggiore(d, f);
		
	}
	
	public static void maggiore(int a, int b) {
		
		if((a+b) > 100)
			System.out.println("La somma tra " + a + " e " + b + " è un numero maggiore di 100");
		else
			System.out.println("La somma tra " + a + " e " + b + " non è un numero maggiore di 100");
	}
}
