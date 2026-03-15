package esercizio6;

/*
 * Creare una classe Cerchio con una variabile di classe final chiamata PI_GRECO e che valga 3,14. 
 * Questa classe deve avere un metodo main con una variabile chiamata raggio che abbia un valore 
 * scelto dal programmatore e che stampi a schermo la circonferenza e l'area del cerchio. La classe 
 * deve avere un metodo che calcoli la circonferenza ed un altro metodo che calcoli l'area del cerchio.
 */
 	
public class Cerchio {

	final static double PI_GRECO = 3.14;
	
	public static void main(String[] args) {
		
		int raggio = 10;
		
		System.out.println("Sia un cerchio di raggio 10.");
		System.out.println("La sua circonferenza è: " + circonferenza(raggio));
		System.out.println("La sua area è: " + area(raggio));
	}
	
	public static double circonferenza(int r) {
		return PI_GRECO*2*r;
	}
	
	public static double area(int r) {
		return PI_GRECO*r*r;
	}
}
