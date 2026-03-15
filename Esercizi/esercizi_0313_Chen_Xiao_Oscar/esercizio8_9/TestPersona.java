package esercizio8_9;

/*
 * Istanziare nel metodo main() un oggetto di tipo sottoclasse 
 * (quindi almeno un oggetto di tipo Studente ed uno di tipo Insegnante) mediante reference della superclasse. 
 * Creare un metodo statico al di fuori del main() che riceve in ingresso un parametro polimorfo di tipo Persona. 
 * All’interno di tale metodo verificare se un oggetto passato come parametro è di tipo Studente o Insegnante. 
 * Nel caso in cui si tratti di uno Studente, richiamare il metodo studia(). 
 * Se invece si ha a che fare con un Insegnante, richiamare il metodo insegna(). 
 * Inoltre nel metodo main(), invocare il metodo calcolaMediaVoti() e stampare successivamente i dettagli dello studente.
 */

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona stud = new Studente("Mario", "Rossi", 22);
		Persona ins = new Insegnante("Maria", "Rissa", 45, "Java");

		studiaOInsegna(stud);
		((Studente) stud).calcolaMediaVoti(24, 25, 26, 27, 28, 29);
		System.out.println(stud.toString());

		studiaOInsegna(ins);
		System.out.println(ins.toString());

	}

	public static void studiaOInsegna(Persona p) {

		if (p instanceof Studente)
			((Studente) p).studia();

		else if (p instanceof Insegnante)
			((Insegnante) p).insegna();
	}

}
