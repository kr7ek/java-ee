package esercizio7;

public class Main {

	public static void main(String[] args) throws UndiscoveredDimensionException {
		// TODO Auto-generated method stub

		System.out.println("Creazione di una scatola di dimensioni 10x20x30:");
		Box box1 = new Box(10, 20, 30);
		System.out.println("Creazione di una scatola di dimensioni 15x25x35:");
		Box box2 = new Box(15, 25, 35);
		System.out.println("Creazione di una scatola di dimensioni 10x-3x30:");
		Box box3 = new Box(10, -3, 30); // Questo solleverà un'eccezione

		// Verifica se le due scatole sono uguali
		System.out.println("Verifica se le scatole 1 e 2 sono uguali:");
		if (box1.getAltezza() == box2.getAltezza() && box1.getLunghezza() == box2.getLunghezza()
				&& box1.getProfondita() == box2.getProfondita()) {
			System.out.println("Le due scatole sono uguali.");
		} else {
			System.out.println("Le due scatole non sono uguali.");
		}

		// Verifica se una scatola può essere contenuta nell'altra
		if (box1.isContenuto(box2)) {
			System.out.println("La scatola 1 può essere contenuta nella scatola 2.");
		} else if (box2.isContenuto(box1)) {
			System.out.println("La scatola 2 può essere contenuta nella scatola 1.");
		} else {
			System.out.println("Nessuna delle due scatole può essere contenuta nell'altra.");
		}

	}

}
