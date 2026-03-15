package domande_aperte;

public class Domande {

	public static void main(String[] args) {
		
//	1) Cos'è un linguaggio di programmazione?
//	2) Definisci il linguaggio Java.
//	3) Cos'è un linguaggio orientato agli oggetti?
//	4) Quali sono le caratteristiche principali di Java.
//	5) Cos'è una variabile?
//	6) Che differenza c'è tra un linguaggio compilato ed interpretato.
//	7) Come si aggiunge un commento nel linguaggio Java?
//	8) Che cos'è un oggetto?
//	9) Che cos'è una classe?
//	10) Quali sono gli operatori di confronto?
//	11) Cosa si intende per istanza?
//	12) Cos'è un attributo?
//	13) Cosa sono JDK, JRE, JVM e a cosa servono?
//	14) La sigla IDE cosa rappresenta?
//	15) A cosa servono le librerie?
//	16) Cos'è un metodo e a cosa serve? Qual è la firma di un metodo?
//	17) Definisci la differenza tra un metodo statico e un metodo d'istanza.
//	18) Che cos'è un costruttore?
//	19) A cosa serve l'operatore new?
//	20) Cos'è un package e a cosa serve?
//	21) Descrivi i tipi di dato primitivi che conosci.
//	22) Cosa sono i reference?
//	23) Cosa si intende con indentazione? Perché è importante?
//	24) Come avviene in Java il passaggio di parametri?
//	25) Descrivi l'utilizzo della parola this.
//	26) Cosa sono le Stringhe in Java?
//	27) Cos'è un blocco di codice?
//	28) Quali strutture di controllo conosci? Descrivile e fai un esempio.
//	29) Spiega l'utilizzo dell'operatore ternario.
//	30) Qual è la funzione di break? E di continue?
		
		
		// Nel caso la risposta fosse troppo lunga da visualizzare sul terminale,
		// attivare il word wrap.
		System.out.println("Domanda: 1) Cos'è un linguaggio di programmazione?");
		System.out.println("Risposta: E' un linguaggio utilizzato per tradurre istruzioni specifiche, anche "
				+ "astratte, ma comprensibili all' umano, in un linguaggio macchina che viene elaborato direttamente "
				+ "dal calcolatore (linguaggio macchina)." + "\n");
		
		System.out.println("Domanda: 2) Definisci il linguaggio Java.");
		System.out.println("Risposta: Java è un linguaggio di programmazione di alto livello "
				+ "orientato agli oggetti." + "\n");
		
		System.out.println("Domanda: 3) Cos'è un linguaggio orientato agli oggetti?");
		System.out.println("Risposta: E' un linguaggio di programmazione in cui è possibile definire delle "
				+ "classi che possono contenere dati e funzioni (attributi e metodi nel caso di Java). "
				+ "Queste classi possono essere istanziati in oggetti ed essere manipolati dal programmatore." + "\n");
		
		System.out.println("Domanda: 4) Quali sono le caratteristiche principali di Java.");
		System.out.println("Risposta: Tra le principali caratteristiche di Java è il fatto di essere un "
				+ "linguaggio orientato agli oggetti, quindi poter lavorare su una grande quantità di dati "
				+ "senza troppe definizioni. Come sintassi ricorda molto il linguaggio C, per esempio"
				+ " per quanto riguarda la dichiarazione delle variabili, le espressioni di controllo e "
				+ "le chiamate a funzioni. Dal C deriva il C++ che è anche un linguaggio orientato agli oggetti, "
				+ "però la gestione della memoria è manuale e rigorosa. Java è un linguaggio che gira all' interno di un ambiente "
				+ "virtuale (JVM) e tra le funzioni ha la capacità di gestire in autonomia gli spazi di memoria allocati "
				+ "tramite il garbage collector." + "\n");
		
		System.out.println("Domanda: 5) Cos'è una variabile?");
		System.out.println("Risposta: Nel caso di Java, una variabile è un' informazione digitale "
				+ "(numero, lettera, parola, frase, oggetto...), che viene memorizzato sul computer a cui viene assegnato un nome. "
				+ "Il valore memorizzato può essere modificato (salvo casi particolari in cui viene applicata una restrizione dal "
				+ "programmatore)." + "\n");
		
		System.out.println("Domanda: 6) Che differenza c'è tra un linguaggio compilato ed interpretato.");
		System.out.println("Risposta: Un linguaggio compilato è un programma che il calcolatore può utilizzare dopo "
				+ "che il compilatore ha tradotto il codice sorgente (scritto in un linguaggio di alto livello). Un linguaggio interpretato "
				+ "è un linguaggio in cui è possibile eseguire il codice riga per riga anche a runtime." + "\n");
		
		System.out.println("Domanda: 7) Come si aggiunge un commento nel linguaggio Java?");
		System.out.println("Risposta: Il commento è una parte del codice che viene ignorato dal compilatore e può "
				+ "essere utile per esempio per documentare il codice e aiutare a chi guarda il codice sorgente di avere "
				+ "un' idea delle scelte del programmatore. in Java il commento può essere aggiunto aggiungendo dei delimitatori "
				+ "come /* e */ all'inizio e alla fine di un testo anche su più righe oppure // seguito dal testo da "
				+ "commentare (solo sulla stessa riga). " + "\n");
		
		System.out.println("Domanda: 8) Che cos'è un oggetto?");
		System.out.println("Risposta: Un' oggetto è l'istanza di una classe. In Java tutti gli oggetti ereditano caratteristiche "
				+ "simili dalla superclasse Object." + "\n");
		
		System.out.println("Domanda: 9) Che cos'è una classe?");
		System.out.println("Risposta: Una classe è uno schema in cui vengono definiti attributi e metodi." + "\n");
		
		System.out.println("Domanda: 10) Quali sono gli operatori di confronto?");
		System.out.println("Risposta: Gli operatori di confronto sono: <, >, =, <=, >=, == e !=. Questi restituiscono TRUE o FALSE. \n"
				+ "Da non confondere con gli operatori logici (esempio AND &, OR |, XOR ^ ecc...)." + "\n");
		
		System.out.println("Domanda: 11) Cosa si intende per istanza?");
		System.out.println("Risposta: Un' istanza è l'oggetto che è stato creato a partire dalla definizione della classe. " + "\n");
		
		System.out.println("Domanda: 12) Cos'è un attributo?");
		System.out.println("Risposta: Un' attributo è un informazione che può possedere una classe, per esempio una variabile." + "\n");
		
		System.out.println("Domanda: 13) Cosa sono JDK, JRE, JVM e a cosa servono?");
		System.out.println("Risposta: JDK è un insieme di strumenti necessari per programmare in Java e viene rilasciato da Oracle. \n"
				+ "JRE è la Java Runtime Enviroment, un ambiente in cui viene eseguito il programma Java. \n"
				+ "JVM Java Virtual Machine è un software che esegue il programma Java." + "\n");
		
		System.out.println("Domanda: 14) La sigla IDE cosa rappresenta?");
		System.out.println("Risposta: Integrated Development Environment è un ambiente di sviluppo per scrivere codice sorgente Java. \n"
				+ "Java può essere scritto anche su un editor di testo come blocco note, ma un IDE fornisce strumenti avanzati di controllo, "
				+ "organizzazione ed esecuzione di un programma Java." + "\n");
		
		System.out.println("Domanda: 15) A cosa servono le librerie?");
		System.out.println("Risposta: Le librerie contengono classi e metodi già pronti per essere utilizzati e quindi semplificare "
				+ "la scrittura del codice (per esempio calcolare la radice quadrata di un numero)." + "\n");
		
		System.out.println("Domanda: 16) Cos'è un metodo e a cosa serve? Qual è la firma di un metodo?");
		System.out.println("Risposta: Un metodo è una funzione che esegue uno o un insieme di istruzioni. Questo è utile per esempio "
				+ "quando si vuole ripetere un insieme di istruzioni e quindi migliora la leggibilità di un codice. "
				+ "Ogni metodo deve contenere il nome del metodo, parametri in ingresso (anche senza parametri) e un valore di ritorno "
				+ "(anche questa potrebbe essere vuota ma deve essere specificato 'void'). Ovviamente anche il nome deve essere valido, "
				+ "quindi non usato già da altri metodi nella stessa classe." + "\n");
		
		System.out.println("Domanda: 17) Definisci la differenza tra un metodo statico e un metodo d'istanza.");
		System.out.println("Risposta: Un metodo statico è un metodo che possiede una classe, quello di istanza appartiene all'oggetto "
				+ "che è stato creato." + "\n");
		
		System.out.println("Domanda: 18) Che cos'è un costruttore?");
		System.out.println("Risposta: E' un metodo che serve a inizializzare un oggetto. Alla creazione dell' oggetto si fa riferimeto "
				+ "a un costruttore per capire come creare il nuovo oggetto (per esempio se si vuole assegnare qualche valore a un attributo). "
				+ "Può esserci più di un costruttore, l'importante è che vengano rispettati l'inserimento dei parametri." + "\n");
		
		System.out.println("Domanda: 19) A cosa serve l'operatore new?");
		System.out.println("Risposta: E' l'operatore che serve per allocare nuovi spazi in memoria. Può essere usato per gli oggetti ma anche "
				+ "per strutture dati complesse." + "\n");
		
		System.out.println("Domanda: 20) Cos'è un package e a cosa serve?");
		System.out.println("Risposta: E' una raccolta di classi. Aiuta ad organizzare meglio le classi." + "\n");
		
		System.out.println("Domanda: 21) Descrivi i tipi di dato primitivi che conosci.");
		System.out.println("Risposta: Tra le principali ricordiamo int, char, float, double, boolean, byte... e vengono utilizzate per memorizzare "
				+ "diversi tipi di dati. Teoricamente l'unica differenza tra loro è la quantità di spazio occupato anche perchè il calcolatore non "
				+ "fa una distinzione semantica, cioè non distingue l'elemento da stampare '1' rispetto al suo valore numerico. In questo caso per esempio "
				+ "la lettera '1' viene codificato in 16 bit che può rappresentare lettere dell'alfabeto, caratteri speciali ecc, mentre il valore "
				+ "'1' artimetico viene memorizzato come un int che occupa 32 bit, e viene utilizzato per eseguire calcoli numerici;" + "\n");
		
		System.out.println("Domanda: 22) Cosa sono i reference?");
		System.out.println("Risposta: Sono variabili che contengono gli indirizzi di memoria a cui viene associato un valore (o NULL)." + "\n");
		
		System.out.println("Domanda: 23) Cosa si intende con indentazione? Perché è importante?");
		System.out.println("Risposta: E' uno stile di scrittura per migliorare la leggibilità del codice di un linguaggio (non solo di programmazione). "
				+ "Questo avviene mettendo un spazio di tabulazione per organizzare le varie righe. In Java non è strettamente necessario in quanto si può scrivere "
				+ "tutto il codice su una riga sola, ma aiuta a rendere il testo più comprensibile. " + "\n");
		
		System.out.println("Domanda: 24) Come avviene in Java il passaggio di parametri?");
		System.out.println("Risposta: Il passaggio dei tipi primitivi sempre per valore, mentre strutture dati e oggetti per reference." + "\n");
		
		System.out.println("Domanda: 25) Descrivi l'utilizzo della parola this.");
		System.out.println("Risposta: E' una keyword che si riferisce all' oggetto che si sta creando. Serve per non fare confusione tra il "
				+ "parametro passato e l'attriibuto dell' oggetto." + "\n");
		
		System.out.println("Domanda: 26) Cosa sono le Stringhe in Java?");
		System.out.println("Risposta: Rappresentano una sequenza di caratteri in quanto non esistono tipi primitivi per rappresentare parole o frasi. "
				+ "Le stringhe appartengono alla classe String che contiene metodi per la manipolazione delle stringhe." + "\n");
		
		System.out.println("Domanda: 27) Cos'è un blocco di codice?");
		System.out.println("Risposta: E' un insieme di istruzioni raggruppate da {}." + "\n");
		
		System.out.println("Domanda: 28) Quali strutture di controllo conosci? Descrivile e fai un esempio.");
		System.out.println("Risposta: Tra le principali ricordiamo if-else, cicli while-for e switch.\n\n"
				+ "- if(espressione da valutare) {istruzione/i} else{istruzione/i}:\n"
				+ "  Si esegue una o più istruzioni quando una o più condizioni vengono verificate. Esempio:\n\n"
				+ "		int a=2; int b=4;\n"
				+ "		if(a==b)\n"
				+ "		   System.out.println(\"Ciao Mondo\"); // viene eseguita solo se a è uguale a b" + "\n\n"
				+ "- while(espressione da valutare) {istruzione/i} \n"
				+ "  Si esegue il blocco di istruzioni a ripetizione finché è verificata la condizione dell' espressione. Esempio\n\n"
				+ "		int i=0;\n"
				+ "		while(i<100){\n"
				+ "		   System.out.println(\"Ciao Mondo\"); // viene eseguita finché il valore di i è minore di 100\n"
				+ "		   i++; // incremento conteggio e poi ritorna alla valutazione dell'espressione\n"
				+ "		}\n"
				+ ""
				+ "  Si può uscire manualmente dal ciclo con l'istruzione 'break;' o continuare con la prossima iterazione con 'continue;'.\n\n"
				+ "- for(statement;statement;statement) {istruzione/i}\n"
				+ "  Molto simile al while ma oltre all'espressione da valutare si aggiunge un contatore.\n\n"
				+ "		for(int 1=0; i<100; i++)\n"
				+ "		  System.out.println(\"Ciao Mondo\"); // stampa 100 volte \"Ciao Mondo\"\n\n"
				+ "  In questo caso l'inizializzazione e l'aggiornamento del contatore è incorporato vicino all'espressione.\n\n"
				+ "- switch(). Serve per eseguire diverse istruzioni anche quando si verificano più condizioni. \n"
				+ "  L'idea sarebbe quella "
				+ "di raggruppare strutture di if a cascata. Esempio:\n\n"
				+ "		switch(espressione){\n"
				+ "		   case (condizione 1):\n"
				+ "		     System.out.println(\"Ciao Mondo 1\");\n"
				+ "		     break;\n"
				+ "		   case (condizione 2):\n"
				+ "		     System.out.println(\"Ciao Mondo 2\");\"\n"
				+ "		     break;\n"
				+ "		}\n\n"
				+ " Si possono eseguire le istruzioni quando si verificano almeno una delle condizioni. \n"
				+ " Se non ce ne sono si può assegnare uno di base con 'default'.\n");
		
		System.out.println("Domanda: 29) Spiega l'utilizzo dell'operatore ternario.");
		System.out.println("Risposta: è una forma abbreviata per realizzare una struttura del tipo if-else.\n\n"
				+ "		// Esempio:\n"
				+ "		int n=0; int a=3; int b=5;\n"
				+ "		if(a>b)\n"
				+ "		  n=a;\n"
				+ "		else\n"
				+ "		  n=b;\n\n"
				+ "Questa forma puo essere riscritta in questo modo:\n\n"
				+ "		int n=0; int a=3; int b=5;\n"
				+ "		n = (a>b) ? a : b;\n\n"
				+ "In questo caso abbiamo: \n"
				+ "Un'espressione da valutare. \n"
				+ "Il primo valore di ritorno se la condizione è verificata.\n"
				+ "Il secondo valore di ritorno se la condizione non è verificata." + "\n");
		
		System.out.println("Domanda: 30) Qual è la funzione di break? E di continue?");
		System.out.println("Risposta: Come detto prima, l'istruzione 'break;' viene usata per uscire da un ciclo o switch, \n"
				+ "e 'continue;' per passare all'iterazione successiva di un ciclo while/for." + "\n");
		
		
	}
}
