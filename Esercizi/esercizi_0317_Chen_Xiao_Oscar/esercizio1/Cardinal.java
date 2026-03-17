package esercizio1;

/*
 * Implementare l'enumerazione Cardinal, che rappresenta le 16 direzioni della rosa dei venti. 
 * Il metodo isOpposite prende come argomento un punto cardinale x e restituisce vero 
 * se questo punto cardinale è diametralmente opposto ad x, e falso altrimenti. 
 * Il metodo statico mix prende come argomento due punti cardinali, non opposti, 
 * e restituisce il punto cardinale intermedio tra i due.
 */

public enum Cardinal {
	N, NNE, NE, ENE, E, ESE, SE, SSE, S, SSO, SO, OSO, O, ONO, NO, NNO;

	public boolean isOpposite(Cardinal x) {

		// se sono nella stessa posizione return false
		if (this.ordinal() == x.ordinal())
			return false;

		// consideriamo i punti ordinati in senso orario numerati da 0 a 15
		// diametralmente opposti vuol dire a distanza di 8 posizioni tra loro
		if (this.ordinal() > x.ordinal())
			if (x.ordinal() + 8 == this.ordinal())
				return true;
		if (this.ordinal() < x.ordinal())
			if (this.ordinal() + 8 == x.ordinal())
				return true;

		return false;
	}

	public static Cardinal mix(Cardinal a, Cardinal b) throws CardinalException {

		// se sono opposti o se coincidono allora non va bene
		if (a.ordinal() == b.ordinal() || a.isOpposite(b)) 
			throw new CardinalException("Punti non validi. Programma terminato");
		

		if (a.ordinal() < b.ordinal())
			return Cardinal.values()[a.ordinal() + ((b.ordinal() - a.ordinal()) / 2)];
		if (a.ordinal() > b.ordinal())
			return Cardinal.values()[b.ordinal() + ((a.ordinal() - b.ordinal()) / 2)];

		return null;
	}

}
