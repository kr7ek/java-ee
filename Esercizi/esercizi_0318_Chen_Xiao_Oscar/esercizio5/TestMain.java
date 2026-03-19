package esercizio5;

/* 
 * Sviluppare le seguenti classi:
 *  - Rectangle
 *  - Square
 * Sviluppare, inoltre, la classe Point2D che tiene traccia della posizione 
 * nello spazio delle due figure geometriche.
 * Scrivere un caso di test per testare il corretto funzionamento dei metodi sviluppati.
 * Implementare anche le interfacce Shape e TwoDShape che contengono 
 * il metodo draw() l'una e i metodi area() e perimetro() l'altra.
 */

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point2D p1 = new Point2D(2, 3);
		p1.draw();

		Rectangle rettangolo = new Rectangle(5, 8);
		rettangolo.draw();
		System.out.println("Il suo perimetro e': " + rettangolo.perimetro());
		System.out.println("La sua area e': " + rettangolo.area());

		Square quadrato = new Square(5);
		quadrato.draw();
		System.out.println("Il suo perimetro e': " + quadrato.perimetro());
		System.out.println("La sua area e': " + quadrato.area());

	}

}
