package esempioarray;

public class Main {
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		p1.nome = "Mario";
		p1.cognome = "Rossi";
		
		Persona p2 = new Persona("Carmen", "Blu", 27);
		
		//Array della classe Persona
		Persona[] persone = new Persona[25];
		persone[0] = p1;
		persone[1] = p2;
		
		Condominio c1 = new Condominio(); //crea un array di 10 persone
		System.out.println(c1.condominio.length); //lunghezza array
		
		Condominio c2 = new Condominio(persone); //gli passiamo l'array di Persona creato in precedenza
		System.out.println(c2.condominio.length);
		
		Condominio c3 = new Condominio(100); //crea un array di 100 persone
		System.out.println(c3.condominio.length);
		
//		c1.condominio[2] = p1;
//		c2.condominio[2] = p1;
//		c3.condominio[2] = p1;
	
		
		c1.aggiungiPersona(p1);
		c1.aggiungiPersona(p2);
		
		c1.stampaCondomini();
		
		
		Persona p3 = new Persona("Paola", "Verde", 36);
		Persona p4 = new Persona("Giovanna", "Neri", 33);
		Persona p5 = new Persona("Luca", "Neri", 45);
		
		System.out.println("----------");
		c1.aggiungiPersona(p3);
		c1.aggiungiPersona(p4);
		c1.aggiungiPersona(p5);
		c1.aggiungiPersona(p3);
		c1.aggiungiPersona(p4);
		c1.aggiungiPersona(p5);
		c1.aggiungiPersona(p3);
		c1.aggiungiPersona(p4);
		c1.aggiungiPersona(p5);
		
		
		c1.stampaCondomini();
		
	}

}
