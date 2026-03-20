package esercizio8_9_10;

/*
 * Creare un progetto in Java per un contesto di gestione dell’inventario di un negozio di elettronica. 
 * In tale progetto dovranno esserci le classi Dispositivo, Computer e Smartphone.
 * In particolare quest’ultime due estendono la classe Dispositivo, 
 * ed in particolare Computer implementerà anche il metodo inserisciPeriferica(), mentre Smartphone il metodo mandaMessaggio().
 * Ogni Dispositivo dovrà avere un attributo sistemaOperativo 
 * che utilizza un’enumerazione per specificare il sistema operativo utilizzato (WINDOWS, MACOS, LINUX, ANDROID E IOS). 
 * Creare una classe GestioneInventario che gestisce un array di dispositivi, 
 * in particolare bisogna poter aggiungere i dispositivi, rimuovere i dispositivi 
 * e stampare i dettagli a video di tutti i dispositivi presenti nell’inventario.
 * Creare nel metodo main() degli oggetti di tipo Computer e Smartphone applicando il polimorfismo per dati. Fornire dei casi di test.
 * 
 * Creare un metodo statico al di fuori del metodo main() che richiede in ingresso un parametro di tipo GestioneInventario. 
 * Tale metodo dovrà calcolare quanti dispositivi per ogni tipologia di sistema operativo contiene l’inventario e stampare il resoconto a video.
 * 
 * Creare un metodo statico al di fuori del metodo main() che richiede in ingresso un parametro polimorfo di tipo Dispositivo, 
 * se tale oggetto è un Computer invocare il metodo inserisciPeriferica(), 
 * se invece si tratta di uno Smartphone, invocare il metodo mandaMessaggio().
 */

public class Main {

	public static void calcolaDispositiviPerSistemaOperativo(GestioneInventario inventario) {
		int windowsCount = 0;
		int macosCount = 0;
		int linuxCount = 0;
		int androidCount = 0;
		int iosCount = 0;

		for (Dispositivo dispositivo : inventario.getInventario()) {
			switch (dispositivo.getSistemaOperativo()) {
			case WINDOWS:
				windowsCount++;
				break;
			case MACOS:
				macosCount++;
				break;
			case LINUX:
				linuxCount++;
				break;
			case ANDROID:
				androidCount++;
				break;
			case IOS:
				iosCount++;
				break;
			}
		}

		System.out.println("Windows: " + windowsCount);
		System.out.println("MacOS: " + macosCount);
		System.out.println("Linux: " + linuxCount);
		System.out.println("Android: " + androidCount);
		System.out.println("iOS: " + iosCount);
	}

	public static void inserisciPerifericaOMandaMessaggio(Dispositivo dispositivo) {
		if (dispositivo instanceof Computer) {
			((Computer) dispositivo).inserisciPeriferica();
		} else if (dispositivo instanceof Smartphone) {
			((Smartphone) dispositivo).mandaMessaggio();
		} else {
			System.out.println("Dispositivo non riconosciuto.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestioneInventario inventario = new GestioneInventario();

		Computer computer1 = new Computer("Dell", "XPS 15", SistemaOperativo.WINDOWS);
		Computer computer2 = new Computer("Apple", "MacBook Pro", SistemaOperativo.MACOS);
		Smartphone smartphone1 = new Smartphone("Samsung", "Galaxy S21", SistemaOperativo.ANDROID);
		Smartphone smartphone2 = new Smartphone("Apple", "iPhone 13", SistemaOperativo.IOS);

		inventario.aggiungiDispositivo(computer1);
		inventario.aggiungiDispositivo(computer2);
		inventario.aggiungiDispositivo(smartphone1);
		inventario.aggiungiDispositivo(smartphone2);

		System.out.println("Inventario:");
		inventario.visualizzaInventario();

		System.out.println("\nResoconto dei dispositivi per sistema operativo:");
		calcolaDispositiviPerSistemaOperativo(inventario);

		System.out.println("\nTest del metodo polimorfo:");
		inserisciPerifericaOMandaMessaggio(computer1);
		inserisciPerifericaOMandaMessaggio(smartphone1);
	}
}
