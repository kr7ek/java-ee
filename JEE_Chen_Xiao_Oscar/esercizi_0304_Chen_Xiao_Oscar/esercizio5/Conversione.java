package esercizio5;

/*
 * Creare una classe che abbia un metodo main ed un altro metodo che serve
 * ad effettuare la conversione di un double a intero. 
 * Dentro al metodo main richiamare l’altro metodo per fornire un esempio.
 */

public class Conversione {
	
	public static void main(String[] args) {
		
		double num1 = 3.141592653589793;
		double num2 = 1.4142135623730951;
		double num3 = 2.718281828459045;
		
		System.out.println("Numeri in notazione double: ");
		System.out.println("PI greco: " + num1);
		System.out.println("Radice di 2: " + num2);
		System.out.println("Costante di Eulero: " + num3);
		
		// COnversione in int
		System.out.println("");
		System.out.println("Conversione in int:");
		System.out.println("PI greco: " + converti(num1));
		System.out.println("Radice di 2: " + converti(num2));
		System.out.println("Costante di Eulero: " + converti(num3));
		
		
	}
	
	public static int converti(double numero) {
		
		return((int)numero);
		
	}
}
