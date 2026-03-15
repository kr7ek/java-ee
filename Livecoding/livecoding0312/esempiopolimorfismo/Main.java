package esempiopolimorfismo;

public class Main {

	public static void main(String[] args) {

		Programmatore p1 = new Programmatore("Elia", "000123", 1500, "Java", 3);
		Programmatore p2 = new Programmatore();
		p2.setNome("Leone");
		p2.setAnniEsperienza(0);

		Programmatore p3 = new Programmatore();
		p3.setNome("Luca");
		p3.setAnniEsperienza(10);

		Dirigente d1 = new Dirigente();
		d1.setNome("Paola");
		d1.setGrado("Primo Livello");

		Venditore v1 = new Venditore();
		v1.setNome("Giovanna");
		v1.provviggioni = 1000;

		System.out.println(p1.toString()); // p1.toString()
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(d1);
		System.out.println(v1);

		System.out.println("---------");

		// Altra dichiarazione
		// reference della superclasse = istanza della sottoclasse
		Dipendente dipP = new Programmatore();
		Dipendente dipD = new Dirigente();
		Object obj = new Venditore();

		System.out.println(dipP); // chiamata automatica al dipP.toString()
		System.out.println(dipD);
		System.out.println(obj);
		System.out.println("---------");

		// Collezione Eteregenea, composta da oggetti di diverso tipo
		Dipendente arrayDip[] = new Dipendente[10];
		// un oggetto si identifica con più tipi di dato
		arrayDip[0] = p1; // array di Dipendente [0] = istanza di programmatore
		arrayDip[1] = p2;
		arrayDip[2] = p3;
		arrayDip[3] = d1; // array di Dipendente [3] = istanza di Dirigente
		arrayDip[4] = v1; // array di Dipendnete [4] = istanza di Venditore

		// for-each per stampare le informazioni, scorre tutti i dipendenti presenti
		// nell'array
		// Dipendente -> tipo di dato
		// dip -> elemento corrente, oggetto
		// arrayDip -> collezione che vogliamo iterare
		for (Dipendente dip : arrayDip) {
			if (dip != null) {
				System.out.println(dip);
			}
		}

		System.out.println("---------");
		System.out.println("---------");
		System.out.println("---------");
		// Calcolare gli stipendi
		for (Dipendente dip : arrayDip) {
			if (dip != null) {
				Dipendente.calcolaStipendio(dip);
				System.out.println(dip);
			}
		}
	}

}
