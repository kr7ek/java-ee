package esercizio8_9_10;
import java.util.ArrayList;

public class GestioneInventario {
	
	private ArrayList<Dispositivo> inventario;
	
	public GestioneInventario() {
		inventario = new ArrayList<>();
	}
	
	public void aggiungiDispositivo(Dispositivo dispositivo) {
		inventario.add(dispositivo);
	}
	
	public void rimuoviDispositivo(Dispositivo dispositivo) {
		inventario.remove(dispositivo);
	}
	
	public void visualizzaInventario() {
		for (Dispositivo dispositivo : inventario) {
			System.out.println("Marca: " + dispositivo.getMarca() + ", Modello: " + dispositivo.getModello());
		}
	}

	public Dispositivo[] getInventario() {
		// TODO Auto-generated method stub

		return inventario.toArray(new Dispositivo[0]);
	}

}
