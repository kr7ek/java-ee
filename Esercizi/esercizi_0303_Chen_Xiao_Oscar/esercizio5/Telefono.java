package esercizio5;

/*
 * Creare una classe che contenga un metodo main ed un altro metodo chiamato “chiama”. 
 * Al metodo chiama dobbiamo passare un parametro di tipo String che rappresenta un numero di telefono. 
 * Il metodo chiama deve stampare a schermo la frase: “Sto chiamando il numero: “ seguita dal numero telefonico.
 */

public class Telefono {

	public static void main(String[] args) {
		
		String numero = "3349888165";
		
		chiama(numero);
		
	}
	
	public static void chiama(String numero) {
		System.out.println("Sto chiamando il numero: " + numero);
	}
	
}
