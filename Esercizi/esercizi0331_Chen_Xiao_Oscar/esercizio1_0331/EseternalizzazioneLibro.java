package esercizio1_0331;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class EseternalizzazioneLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1 = new Libro("Il Signore degli Anelli", 29.99, "J.R.R. Tolkien");
		Libro libro2 = new Libro("Harry Potter e la Pietra Filosofale", 19.99, "J.K. Rowling");

		scriviLibro(libro1, "libro.ser");
		scriviLibro(libro2, "libro.ser");

		leggiLibro("libro.ser");
		leggiLibro("libro.ser");

	}

	public static void scriviLibro(Libro libro, String filename) {
		// TODO Auto-generated method stub

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("libro.ser"))) {

			libro.writeExternal(oos);
			System.out.println("Libro scritto: " + libro);

			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Libro leggiLibro(String filename) {
		// TODO Auto-generated method stub

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {

			Libro libro = new Libro();
			libro.readExternal(ois);
			System.out.println("Libro letto: " + libro);

			ois.close();
			return libro;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
