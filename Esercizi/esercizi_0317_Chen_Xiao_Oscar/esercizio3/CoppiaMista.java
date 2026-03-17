package esercizio3;

/*
 * Creare una classe Java chiamata CoppiaMista, che descriva una coppia di elementi di diversi tipi di dato, 
 * preso tramite le generics. La classe dovrà avere due attributi privati chiamati uno e due
 * e tre metodi: uno per salvare i due elementi, uno per prendere solo il primo elemento della coppia 
 * ed un altro per prendere solo il secondo elemento della coppia.
 * Creare anche una classe Java chiamata TestCoppia con un metodo main per esibirne il funzionamento.
 */

public class CoppiaMista<T1,T2> {

	private T1 uno;
	private T2 due;

	public CoppiaMista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public T1 getUno() {
		return uno;
	}

	public void setUno(T1 uno) {
		this.uno = uno;
	}

	public T2 getDue() {
		return due;
	}

	public void setDue(T2 due) {
		this.due = due;
	}

	public void salvaElementi(T1 uno, T2 due) {
		this.setUno(uno);
		this.setDue(due);
	}
}
