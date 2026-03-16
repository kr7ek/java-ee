package esercizio2;

/*
 * Creare una classe Java con un metodo main nel quale ci sia un cast di un oggetto da int a String.
 * Gestire l'eccezione risultante con un messaggio di errore appropriato.
 * Nota: per poter compilare senza errori, è necessario fare una variabile int con un valore, 
 * poi una variabile di tipo Object a cui si assegna il cast ad Object della variabile di interi 
 * e poi un System.out di un cast a String della variabile di tipo Object.
 */

public class ErroreCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5;
		Object o = i;

		try {
			System.out.println((String) o);
		} catch (Exception e) {
			System.out.println("Errore cast");
		}
	}
}
