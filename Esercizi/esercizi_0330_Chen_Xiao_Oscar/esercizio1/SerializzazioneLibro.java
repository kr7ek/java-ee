package esercizio1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Creare una classe Libro che abbia gli attributi titolo, prezzo ed autore. 
 * Rendere la classe persistente mediante la tecnica di Serializzazione, 
 * scegliendo di “salvare” tutti i dettagli tranne il prezzo. 
 * Sul file dovranno essere salvate almeno 2 istanze della classe Libro. 
 * Dopo di ciò leggere i dati dal file precedentemente creato, 
 * applicando quindi la deserializzazione.
 */

public class SerializzazioneLibro {

	public static void serialize(Libro libro, String filename) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("libro.ser"))) {

			oos.writeObject(libro);
			System.out.println("Libro serializzato: " + libro);

			oos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deserialize(String filename) {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {

			Libro libro = (Libro) ois.readObject();
			System.out.println("Libro deserializzato: " + libro);

			ois.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1 = new Libro("Il Signore degli Anelli", 29.99, "J.R.R. Tolkien");
		Libro libro2 = new Libro("Harry Potter e la Pietra Filosofale", 19.99, "J.K. Rowling");

		// Serializzazione
		serialize(libro1, "libro.ser");
		serialize(libro2, "libro.ser");

		// Deserializzazione
		deserialize("libro.ser");
		deserialize("libro.ser");

	}
}
