package livecoding0312;

public class Main {
	
	public static void main(String[] args) {
		
		//Telefono è classe astratta non è possibile istanziare oggetto
//		Telefono t1 = new Telefono();		
//		t1.setNumero("365789412");
		
		TelefonoFisso tf1 = new TelefonoFisso();
		Smartphone s1 = new Smartphone();
		
		tf1.chiama("123456789");
		tf1.rispondi();
		
		s1.chiama("987654321");
		s1.rispondi();
		System.out.println("----------");
		/*
		 * Polimorfismo
		 * Capacità di un oggetto di identificarsi con più tipi di dato
		 * permette di assegnare a un reference di una superclasse a un'istanza di una
		 * sottoclasse
		 * Un oggetto Telefono può puntare a oggetti diversi, un TelefonoFisso o uno Smarthphone
		 * 
		 * Le variabili Telefono assumono comportamenti diversi
		 */
		
		//Reference della superclasse = oggetto della sottoclasse
		Telefono t1 = new TelefonoFisso();
		
		Telefono t2 = new Smartphone();
		
		//t1 è una variabile di tipo Telefono che si riferisce a un oggetto TelefonoFisso
		t1.chiama("456789123");
		t1.rispondi();
		
		//t2 è una variabile di tipo superclasse che si riferisce a un oggetto Smarthphone
		t2.chiama("741258963");
		t2.rispondi();

	}

}
