package esercizio3_4_5_6_7_8;

/*
 * Crea una classe Java che stampi a schermo i numeri da 1 a 10. 
 * Utilizza sia un ciclo while, sia un ciclo for.
 * 
 * Creare una classe Java che stampi a schermo i numeri pari da 0 a -10. 
 * Utilizza sia un while che un ciclo for.
 * 
 * Creare una classe Java che stampi a schermo i numeri dispari da -1 a 20. 
 * Utilizza sia un ciclo while, sia un ciclo for.
 * 
 * Creare una classe Java che stampi a schermo la somma dei numeri da 1 a 10. 
 * Utilizza sia un ciclo while, sia un ciclo for.
 * 
 * Creare una classe Java che stampi a schermola tabellina di un numero a piacere da 1 a 10.
 */

public class Counter {

	public static void main(String[] args) {
		
		esercizio3();
		esercizio4();
		esercizio5();
		esercizio6();
		esercizio7();
		esercizio8();
		
	}
	
	public static void esercizio3() {
		// Ciclo while
		System.out.println("Stampa numeri da 1 a 10 con ciclo while");
		
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		// Ciclo for
		System.out.println("Stampa numeri da 1 a 10 con ciclo for");
		
		for(int j=1; j<=10; j++)
			System.out.println(j);
	}
	
	public static void esercizio4() {
		// Ciclo while
		System.out.println("Stampa numeri da 10 a 1 con ciclo while");
		
		int i = 10;
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
		
		// Ciclo for
		System.out.println("Stampa numeri da 10 a 1 con ciclo for");
		
		for(int j=10; j>=1; j--)
			System.out.println(j);
	}
	
	public static void esercizio5() {
		// Ciclo while
		System.out.println("Stampa numeri da 0 a -10 con ciclo while");
		
		int i = 0;
		while(i >= -10) {
			System.out.println(i);
			i--;
		}
		
		// Ciclo for
		System.out.println("Stampa numeri da 0 a -10 con ciclo for");
		
		for(int j=0; j>=-10; j--)
			System.out.println(j);
	}
	
	public static void esercizio6() {
		// Ciclo while
		System.out.println("Stampa i numeri dispari da -1 a 20 con ciclo while");
		
		int i = -1;
		while(i <= 20) {
			if(i % 2 != 0)
				System.out.println(i);
			i++;
		}
		
		// Ciclo for
		System.out.println("Stampa i numeri dispari da -1 a 20 con ciclo for");
		
		for(int j=-1; j<=20; j++)
			if(j % 2 != 0)
				System.out.println(j);
	}
	
	public static void esercizio7() {
		// Ciclo while
		System.out.println("Stampa somma numeri da 1 a 10 con ciclo while");
		
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum += i;
			if(i==10)
				System.out.println(sum);
			i++;
		}
		
		
		// Ciclo for
		System.out.println("Stampa somma numeri da 1 a 10 con ciclo for");
		
		sum = 0;
		for(int j=1; j<=10; j++) {
			sum += j;
			if(j==10)
				System.out.println(sum);
		}
	}
	
	public static void esercizio8() {
		// Ciclo while
		System.out.println("Stampa primi 10 numeri della tabellina del 5 con while");
		
		int i = 0;
		while(i <= 10) {
			System.out.println(i*5);
			i++;
		}
		
		// Ciclo for
		System.out.println("Stampa primi 10 numeri della tabellina del 5 con for");
		
		for(int j=0; j<=10; j++)
			System.out.println(j*5);
	}
}
