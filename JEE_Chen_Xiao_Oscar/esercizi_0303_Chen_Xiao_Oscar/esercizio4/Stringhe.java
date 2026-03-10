package esercizio4;

/*
 * Creare una classe con un metodo main ed un altro metodo che, 
 * date tre stringhe come parametri, stampi a schermo prima il terzo parametro, poi il secondo e poi il primo.
 * Dentro al metodo main richiamare l’altro metodo per fornire un esempio.
 */

public class Stringhe {
	
	public static void main(String[] args) {
		
		String stringa1 = "Ciao";
		String stringa2 = "Mondo";
		String stringa3 = "Come va?";
		
		System.out.println("Stringa 1: " + stringa1);
		System.out.println("Stringa 2: " + stringa2);
		System.out.println("Stringa 3: " + stringa3);
		
		System.out.println("Inversione ordine: ");
		
		stampaStringhe(stringa1, stringa2, stringa3);
		
		
	}
	
	public static void stampaStringhe(String stringa1, String stringa2, String stringa3) {
		System.out.println("Stringa 3: " + stringa3 + ", Stringa 2: " + stringa2 + ", Stringa 1: " + stringa1);
	}
	
}
