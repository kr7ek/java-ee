package livecoding0311;

public class Main {
	
	public static void main (String[] args) {
		
		Superclasse superc1 = new Superclasse();
		superc1.setAttributoStringa("Superclasse 1");
		
		Superclasse superc2 = new Superclasse(10, "Superclasse 2");
		Superclasse superc3 = new Superclasse("Superclasse 3");
		
		
		Sottoclasse s1 = new Sottoclasse();
		Sottoclasse s2 = new Sottoclasse(88);
		Sottoclasse s3 = new Sottoclasse(10, "Sottoclasse 3", 36);
		Sottoclasse s4 = new Sottoclasse("Sottoclasse 4", 20);
		
		
		s1.setNumeroSottoclasse(25);
		s1.setAttributoNumerico(36);
		s2.setAttributoNumerico(100);
		s2.setAttributoStringa("Sottoclasse 2");
		
		System.out.println(s3.getAttributoStringa());
		s4.setAttributoNumerico(8);
		System.out.println(s4.getAttributoNumerico());
		
		//metodo presente nella Superclasse invocato su un oggetto della Superclasse
		System.out.println(superc2.metodoSuperclasse());
		
		
		//metodo presente nella Superclasse invocato su un oggetto della Sottoclasse
		//ma riscritto, sovrascritto, ridefinito nella sottoclasse
		System.out.println(s1.metodoSuperclasse());
		System.out.println(s3.metodoSuperclasse());
		
		System.out.println(superc3.metodoOverride());
		System.out.println(s4.metodoOverride());
		System.out.println(superc1);
		System.out.println(s4); //s4.toString();
		
		superc2.metodoFinal();
		s2.metodoFinal();
		
	}

}
