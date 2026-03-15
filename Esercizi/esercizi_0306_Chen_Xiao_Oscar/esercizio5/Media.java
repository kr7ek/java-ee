package esercizio5;

/*
 * Creare una classe Media con il metodo main che stampi a schermo 
 * il calcolo della media tra 3 numeri, chiamando un metodo apposito.
 */

public class Media {

	public static void main(String[] args) {
		
		System.out.println("La media dei tre numeri 3.14, 1.14 e 2.70 è: " + media(3.14, 1.14, 2.70));
	}
	
	public static double media(double primo, double secondo, double terzo) {
		return (primo+secondo+terzo)/3;
	}
}
