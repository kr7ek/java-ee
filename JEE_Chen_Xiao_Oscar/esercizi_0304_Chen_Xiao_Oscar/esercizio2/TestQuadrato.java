package esercizio2;

/*
 * Creare una classe Quadrato, che dichiari la variabile intera lato 
 * e due metodi per calcolare perimetro e area. 
 * Creare una classe TestQuadrato che contenga un metodo main che istanzi più 
 * oggetti di tipo Quadrato per fare degli esempi.
 */

public class TestQuadrato {

	public static void main(String[] args) {
		
		//Quadrato 1
		Quadrato q1 = new Quadrato(3);
		System.out.println("Creato quadrato 1 con lato 3");
		System.out.println("Il suo perimetro è: " + q1.perimetro());
		System.out.println("La sua area è: " + q1.area());
		System.out.println("");
		
		// Quadrato 2
		Quadrato q2 = new Quadrato(10);
		System.out.println("Creato quadrato 2 con lato 10");
		System.out.println("Il suo perimetro è: " + q2.perimetro());
		System.out.println("La sua area è: " + q2.area());
		System.out.println("");
		
		// Quadrato 3
		Quadrato q3 = new Quadrato(50);
		System.out.println("Creato quadrato 3 con lato 50");
		System.out.println("Il suo perimetro è: " + q3.perimetro());
		System.out.println("La sua area è: " + q3.area());
		System.out.println("");
		
		// Quadrato 4
		Quadrato q4 = new Quadrato(5000);
		System.out.println("Creato quadrato 4 con lato 5000");
		System.out.println("Il suo perimetro è: " + q4.perimetro());
		System.out.println("La sua area è: " + q4.area());
		System.out.println("");
		
	}
}
