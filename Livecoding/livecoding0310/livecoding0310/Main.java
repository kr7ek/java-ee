package livecoding0310;

public class Main {

	public static void main(String[] args) {

		Calendario calendario = new Calendario();
	
		// impossibile con il modificatore private
		// calendario.giorno = 10;
		// System.out.println(calendario.giorno);
		
		//Accesso consentito all'attributo data perchè dichiarato senza modificatore,
		//è visibile solo nel package
		calendario.data ="Prova";
		
		
		// Chiamo il metodo setGiorno() per assegnare/modificare il valore della
		// variabile giorno
		calendario.setGiorno(20);
		// Chiamo il metodo getGiorno() per visualizzare/leggere il valore della
		// variabile giorno
		System.out.println(calendario.getGiorno());

		int mioGiorno = calendario.getGiorno();
		System.out.println(mioGiorno);

		calendario.setMese(3);
		System.out.println(calendario.getMese());

		System.out.println(calendario.metodoPubblico());
		System.out.println(calendario.toString());
		//non è necessario scrivere .toString(), in automatico java chiamerà calendario.toString()
		System.out.println(calendario); 
		
		
		Albero a1 = new Albero();
		a1.setFrutta("Mele");
		System.out.println(a1.getFrutta());
		String frutta = a1.getFrutta();
		System.out.println(frutta);
		
	}
}
