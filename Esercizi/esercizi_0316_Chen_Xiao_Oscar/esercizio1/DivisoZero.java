package esercizio1;

/*
 * Creare una classe Java con un metodo main dove si provi a dividere un numero per 0, 
 * gestendo l'eccezione risultante con un messaggio di errore appropriato.
 */

public class DivisoZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 32;
		int z = 0;

		try {
			System.out.println(n / z);
		} catch (Exception e) {
			System.out.println("Errore");
		}

	}

}
