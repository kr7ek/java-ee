package esercizio3;

public class TestCoppia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// coppia di intero + stringa
        CoppiaMista<String, Integer> coppiaN = new CoppiaMista<>();
        coppiaN.salvaElementi("Ciao", 20);
        
        System.out.println("Inserimenti di stringa 'Ciao' e Intero 20:");
        System.out.println(coppiaN.getUno() + " " + coppiaN.getDue());
        
        // coppia di stringa + intero
        CoppiaMista<Integer, String> coppiaS = new CoppiaMista<>();
        coppiaS.salvaElementi(10, "Mondo");
        
        System.out.println("Inserimenti di intero 10 e stringa 'Mondo':");
        System.out.println(coppiaS.getUno() + " " + coppiaS.getDue());
	}

}
