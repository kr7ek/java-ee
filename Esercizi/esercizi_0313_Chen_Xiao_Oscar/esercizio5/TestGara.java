package esercizio5;

/*
 * Sviluppare un'applicazione Java che gestisce corse automobilistiche. 
 * Saranno presenti le classi Auto, Gara, Pilota e TestGara. 
 * Ogni pilota avrà un nome, ogni auto avrà una scuderia. 
 * La classe Gara avrà un circuito, un vincitore e una griglia di partenza per i piloti. 
 * Creare il metodo creaGrigliaDiPartenza() che istanzierà i piloti associandoli alla griglia di partenza. 
 * Creare il metodo corriGara() che restituirà il pilota vincente e ne stamperà le info in console, 
 * assieme a quelle dell'auto che guidava.
 */

public class TestGara {

	public static void main(String[] args) {

		Gara gara = new Gara(37, 7);

		Pilota vincitore = gara.corriGara();

		System.out.println("Il vincitore e': " + vincitore.getNome() + " con l'auto: " + vincitore.getAuto().getScuderia());

	}

}
