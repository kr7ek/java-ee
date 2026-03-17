package esercizio2;

/*
 * Creare una classe Java chiamata Coppia, che descriva una coppia di elementi dello stesso tipo di dato, 
 * preso tramite le generics. La classe dovrà avere due attributi privati chiamati uno e due e tre metodi: 
 * uno per salvare i due elementi, uno per prendere solo il primo elemento della coppia 
 * ed un altro per prendere solo il secondo elemento della coppia.
 * Creare anche una classe Java chiamata TestCoppia con un metodo main per esibirne il funzionamento.
 */

public class CoppiaMista<T> {

	private T uno;
	private T due;

	public CoppiaMista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public T getUno() {
		return uno;
	}

	public void setUno(T uno) {
		this.uno = uno;
	}

	public T getDue() {
		return due;
	}

	public void setDue(T due) {
		this.due = due;
	}

	public void salvaElementi(T uno, T due) {
		this.setUno(uno);
		this.setDue(due);
	}

}
