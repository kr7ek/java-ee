package esercizio2;

public class TestCoppia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// coppia di interi
        CoppiaMista<Integer> coppiaN = new CoppiaMista<>();
        coppiaN.salvaElementi(10, 20);
        
        System.out.println("Inserimenti di Integer 10 e 20:");
        System.out.println(coppiaN.getUno() + " " + coppiaN.getDue());
        
        // coppia di stringhe
        CoppiaMista<String> coppiaS = new CoppiaMista<>();
        coppiaS.salvaElementi("Ciao", "Mondo");
        
        System.out.println("Inserimenti di Ciao + Mondo:");
        System.out.println(coppiaS.getUno() + " " + coppiaS.getDue());
	}

}
