package esercizio4;

/*
 * Scrivere una classe Studente con attributi: nome, cognome, isee e annoCorso, scegliere il tipo adatto. 
 * Creare due classi figlie, Triennale e Magistrale, e creare un metodo che, accettando in input un parametro polimorfo, 
 * permetta di calcolare le tasse che lo studente dovrà pagare.
 * - Se l'isee è minore di 10mila e lo studente è in corso -> 500.
 * - Se l'isee è maggiore di 10 mila ma minore di 30mila e lo studente è in corso -> 700.
 * - Se l'isee è maggiore di 30 mila, se lo studente è in corso -> 1200.
 * Paga il 10 % in più per ogni anno di fuori corso (tutti i casi precedenti), 
 * fino ad un massimo di 3 anni fuoricorso, poi la tassa non aumenta più.
 * La magistrale paga il 15% in più per i fuori corso fino ad un massimo di due anni.
 * Ad esempio fuori corso di un anno con isee<10 mila=550.
 * Creare un array di 5 studenti e passarlo al metodo.
 */

public class TestStudente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studente[] studenti = new Studente[5];

		studenti[0] = new Triennale("Nome1", "Cognome1", 9000, 1);
		studenti[1] = new Triennale("Nome2", "Cognome2", 15000, 4);
		studenti[2] = new Magistrale("Nome3", "Cognome3", 8000, 1);
		studenti[3] = new Magistrale("Nome4", "Cognome4", 35000, 3);
		studenti[4] = new Triennale("Nome5", "Cognome5", 20000, 5);

		for (int i = 0; i < studenti.length; i++) {
			System.out.println("Lo/a studente/ssa " + studenti[i].getNome() + " " + studenti[i].getCognome() + " paga: "
					+ calcolaTasse(studenti[i]) + " euro");
		}
	}

	// calcolo tasse studente
	public static double calcolaTasse(Studente stud) {

		double tassa = 0;
		int anniFuoriCorso = 0;

		// calcolo tassa base
		if (stud.getIsee() < 10000)
			tassa = 500;
		else if (stud.getIsee() >= 10000 && stud.getIsee() < 30000)
			tassa = 700;
		else
			tassa = 1200;

		// calcolo interessi (se fuoricorso)
		if (stud instanceof Triennale) {
			if (stud.getAnnoCorso() > 3) {
				anniFuoriCorso = stud.getAnnoCorso() - 3;
				if (anniFuoriCorso > 3)
					anniFuoriCorso = 3;

				tassa += tassa * 0.10 * anniFuoriCorso;
			}
		}

		if (stud instanceof Magistrale) {
			if (stud.getAnnoCorso() > 2) {
				anniFuoriCorso = stud.getAnnoCorso() - 2;
				if (anniFuoriCorso > 2)
					anniFuoriCorso = 2;

				tassa += tassa * 0.15 * anniFuoriCorso;
			}
		}

		return tassa;
	}

}
