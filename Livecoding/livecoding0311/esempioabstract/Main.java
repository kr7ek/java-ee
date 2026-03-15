package esempioabstract;

public class Main {
	
	public static void main(String[] args) {
		
		//Pittore è classe astratta, troopo generica per essere istanziata
		//Pittore p1 = new Pittore(); //non si possono creare oggetti di tipo Pittore
		
		//Sottoclassi concrete
		PittoreNeoRealista pn1 = new PittoreNeoRealista();
		pn1.dipingiQuadro();
		
		PittoreImpressionista pi1 = new PittoreImpressionista();
		pi1.dipingiQuadro();
		
	}

}
