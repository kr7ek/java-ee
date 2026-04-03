package esercizio4;

/*
 * Creare una classe Java che stampi a schermo le tabelline dei numeri da 1 a 10.
 */

public class Tabelline {
	
	public static void main(String[] args) {
		
		for(int i=1; i <= 10; i++) {
			for(int j=1; j <= 10; j++)
				System.out.print(i + "x" + j + "=" + i*j + "\t");
			System.out.println();
		}
	}
}
