package esercizio8;

/*
 * Creare una classe Java che, con l'aiuto di una variabile numerica, stampi un numero 
 * se questo compreso tra 0 e 10, o stampi a schermo "errore" altrimenti.
 */

public class Verifica {

	public static void main(String [] args) {
		
		int a=0;
		int b=2;
		int c=34;
		int d=10;
		int e=11;
		int f=22;
		
		if(a>=0 && a<=10)
			System.out.println("Il numero " + a + " è compreso tra 0 e 10");
		else
			System.out.println("errore");
		
		if(b>=0 && b<=10)
			System.out.println("Il numero " + b + " è compreso tra 0 e 10");
		else
			System.out.println("errore");
		
		if(c>=0 && c<=10)
			System.out.println("Il numero " + c + " è compreso tra 0 e 10");
		else
			System.out.println("errore");
		
		if(d>=0 && d<=10)
			System.out.println("Il numero " + d + " è compreso tra 0 e 10");
		else
			System.out.println("errore");
		
		if(e>=0 && e<=10)
			System.out.println("Il numero " + e + " è compreso tra 0 e 10");
		else
			System.out.println("errore");
		
		if(f>=0 && f<=10)
			System.out.println("Il numero " + f + " è compreso tra 0 e 10");
		else
			System.out.println("errore");
		
		
	}
}
