package ereditarieta;

public class Main {
	
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Elia", "Neri");
		p1.setEta(26);
		p1.setStipendio(1800);
		
		System.out.println(p1); //chiama automaticamente il metodo toString -> p1.toString()
		System.out.println(p1.saluta());
		System.out.println(p1.metodoNonSovrascrivibile());
		
		System.out.println("----------");
		
		Impiegato i1= new Impiegato("Mario", "Rossi", 39, 1500, 500);
		System.out.println(i1);
		System.out.println(i1.saluta());
		System.out.println(i1.calcolaTariffaOraria());
		System.out.println(i1.metodoNonSovrascrivibile());
		
		System.out.println("----------");
		
		Cliente c1 = new Cliente("Paola", "Verde", "via Roma", "369852147");
		System.out.println(c1); 
		System.out.println(c1.saluta());
		System.out.println(c1.metodoNonSovrascrivibile());
		
		System.out.println("----------");
		
		Manager m1 = new Manager();
		m1.cognome = "Blu";
		System.out.println(m1); 
		System.out.println(m1.saluta());
		System.out.println(m1.metodoNonSovrascrivibile());
	}

}
