package livecoding0304;

public class Main {
	
	//TIPI PRIMITIVI
	//Interi: byte, short, int, long
	public byte numeroByte = 25; //8bit -128 a +127
	
	public short numeroShort = 250; //16bit
	
	public int numeroInt = 10; //32bit
	
	//Di default Java utilizza il tipo int (Java lo interpreta come un int), questo numero 
	// è troppo grande per int devo necessariemnte utilizzare il tipo long, specificandolo 
	//aggiungendo la lettera L o l
	public long numeroLong = 3000000000000L; //64bit
	public long numeroLong1 = 300000000000l;
	
	//Dati in virgola mobile
	public double numeroDouble = 3.2; //64bit, precisione di 15-16 cifre
	public float numeroFloat = 2.5F;  //32bit, precisione di 6-7 cifre, richiede la F o f
	
	//Dati Boolean
	public boolean espressione1 = true;
	public boolean espressione2 = false;
	
	//tipo char, singoli apici
	public char carattere = '!';
	
	//COSTANTE
	//Final -> il valore non può essere modificato
	public final double PI_GRECO = 3.14;
	public final int NUMERO_LATI_QUADRATO = 4;
	
	//TIPI REFERENCE
	//String per le sequenze di caratteri
	public String testo = "Ciao Mondo";
	
	//Commento su una riga, piccola annotazione
	
	/*
	 * Commento su più righe, per spiegare blocchi di codice
	 */
	
	/**
	 * Commento che genera automaticamente la documentazione Java, Javadoc
	 * serve a spiegare cosa rappresenta quel parametro
	 * @param args parametro del metodo main
	 */
	public static void main(String[] args) {
		
		/*
		 * WRAPPER
		 * Classi contenitore, astraggono il concetto di tipo primitivo
		 * Byte, Short, Interger (int), Long, Float, Double, Character (char), Boolean
		 * I tipi primitivi NON SONO oggetti
		 * Le classi wrapper SONO oggetti
		 */
		int x = 20; //è un valore
		Integer y = 36; //è un oggetto
		System.out.println(x + 30 + y.toString()); //toString() converte in stringa
		
		//Conversione implicita (Cast implicito)
		//int -> long --- in automatico passa da int a long
		//float -> double
		//chat -> int
		//da un tipo di dato più ristretto (int 32bit) si passa a uno più ampio (double 64bit)
		int numeroI = 612545;
		System.out.println(numeroI);
		double numeroD = numeroI;
		System.out.println(numeroD);
		
		char lettera = 'A';
		int codice = lettera;
		System.out.println(lettera);
		System.out.println(codice); //codice numerico UNICODE
		
		//Conversione esplicita, manuale
		//long -> int
		//int -> byte
		//da un tipo di dato più ampio (double 64bit) si passa a uno più ristretto (int 32bit)
		double numeroD2 = 130.6;
		//int numeroInt1 = numeroD2; //errore: operazione non consentita
		int numeroInt2 = (int)numeroD2; //CAST, obbligatorio
		System.out.println(numeroInt2); //perdita di informazioni
		
		byte numeroB = (byte)numeroInt2; //esce dall'intervallo del byte
		System.out.println(numeroB);  //overflow
		
		System.out.println("------------");
		System.out.println("------------");
		System.out.println("------------");
		
		Studente s1 = new Studente();
		Studente.numeroDiOre = Studente.numeroDiOre +10;
		s1.nome = "Elia";
		s1.cognome = "Neri";
		s1.codiceFiscale = "ELNR08";
		s1.eta = 25;
		
		Studente s2= new Studente("Leone", "Neri", "LNR03", 18);
		
		System.out.println("Lo studente: " + s1.nome + " deve frequentare "+ Studente.numeroDiOre + " ore");
		System.out.println("Lo studente: " + s2.nome + " deve frequentare "+ Studente.numeroDiOre + " ore");
		
		System.out.println(s1.salutare("Buongiorno"));
		System.out.println(s1.salutare("Ciao"));
		
		System.out.println("Differenza: "+ Studente.differenzaEta(s1.eta, s2.eta));
		System.out.println("Differenza: "+ Studente.differenzaEta(69, 36));
		System.out.println("Differenza: "+ s1.differenzaEta(s2));
		System.out.println("Differenza: "+ s2.differenzaEta(s1));
		
		Studente s3 = new Studente("Paola", "Verde", "PLVR10", 38);
		
		System.out.println(Studente.numeroDiPostiDisponibili);
	}

}
