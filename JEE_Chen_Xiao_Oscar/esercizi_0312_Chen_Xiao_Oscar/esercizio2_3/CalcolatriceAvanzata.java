package esercizio2_3;

/*
 * Creare una classe CalcolatriceAvanzata più evoluta rispetto a quella creata in passato.
 * Questa calcolatrice deve avere sempre i metodi di somma, sottrazione, moltiplicazione e divisione, 
 * ma si effettui l'overload dei 4 metodi. Tutti questi metodi dovranno restituire (e non stampare) un risultato. 
 * Deve essere presente per ognuno dei metodi sopra citati un overload che accetti: 
 * 
 * · due argomenti in ingresso di tipo numerico decimale. 
 * · tre argomenti in ingresso di tipo numerico decimale. 
 * · un argomento in ingresso, un array di tipo numerico decimale. 
 * 
 * Per le operazioni con più di due elementi, forniamo l'esempio con la sottrazione: 
 * dovrà essere scritta in modo che il risultato sia pari a arg1 - arg2 - arg3.
 */

public class CalcolatriceAvanzata {

	// somma
	public double somma(double a, double b) {
		return a + b;
	}

	public double somma(double a, double b, double c) {
		return a + b + c;
	}

	public double somma(double[] numeri) {
		double risultato = 0;
		for (double n : numeri) {
			risultato += n;
		}
		return risultato;
	}

	// sottrazione
	public double sottrazione(double a, double b) {
		return a - b;
	}

	public double sottrazione(double a, double b, double c) {
		return a - b - c;
	}

	public double sottrazione(double[] numeri) {
		double risultato = numeri[0];
		for (int i = 1; i < numeri.length; i++) {
			risultato -= numeri[i];
		}
		return risultato;
	}

	// moltiplicazione
	public double moltiplicazione(double a, double b) {
		return a * b;
	}

	public double moltiplicazione(double a, double b, double c) {
		return a * b * c;
	}

	public double moltiplicazione(double[] numeri) {
		double risultato = 1;
		for (double n : numeri) {
			risultato *= n;
		}
		return risultato;
	}

	// divisione
	public double divisione(double a, double b) {
		if (b != 0) // se il divisore e' diverso da zero
			return a / b;
		else
			return -1;
	}

	public double divisione(double a, double b, double c) {
		if (b != 0 || c != 0) // se uno dei due divisori e' diverso da zero
			return a / b / c;
		else
			return -1;
	}

	public double divisione(double[] numeri) {
		double risultato = numeri[0];
		for (int i = 1; i < numeri.length; i++) {
			if (numeri[i] != 0) // se uno dei divisori e' diverso da zero
				risultato /= numeri[i];
			else
				return -1;
		}
		return risultato;
	}
}
