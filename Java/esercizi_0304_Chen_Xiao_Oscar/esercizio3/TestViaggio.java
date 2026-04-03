package esercizio3;

public class TestViaggio {
	
	public static void main(String[] args) {
		
		Viaggio v1 = new Viaggio("New York", 7, 900.00);
		Viaggio v2 = new Viaggio("Roma", 10, 2000.00);
		Viaggio v3 = new Viaggio("Longyearbyen", 30, 5000.00);
		
		System.out.println("Viaggio n.1");
		v1.stampaInfo();
		System.out.println("");
		System.out.println("Viaggio n.2");
		v2.stampaInfo();
		System.out.println("");
		System.out.println("Viaggio n.3");
		v3.stampaInfo();
		System.out.println("");
		
		// Altri metodi
		System.out.println("Prezzi medi:");
		System.out.println("Viaggio 1: " + (float)v1.prezzoMedio());
		System.out.println("Viaggio 2: " + (float)v2.prezzoMedio());
		System.out.println("Viaggio 3: " + (float)v3.prezzoMedio());
		
		// Controllo durata
		System.out.println("La durata supera la settimana?");
		System.out.println("Viaggio 1: " + v1.settimanaCheck());
		System.out.println("Viaggio 2: " + v2.settimanaCheck());
		System.out.println("Viaggio 3: " + v3.settimanaCheck());
	}

}
