package esercizio1_0331;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Libro implements Externalizable {

	private static final long serialVersionUID = 1L;

	private String titolo;
	private transient double prezzo;
	private String autore;
	
	public Libro() {
		// Costruttore senza argomenti richiesto per Externalizable
	}

	public Libro(String titolo, double prezzo, String autore) {
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.autore = autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", prezzo=" + prezzo + ", autore=" + autore + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub

		out.writeUTF(titolo);
		out.writeUTF(autore);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		titolo = in.readUTF();
		autore = in.readUTF();

	}

}
