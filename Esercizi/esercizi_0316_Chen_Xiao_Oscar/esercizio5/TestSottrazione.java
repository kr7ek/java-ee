package esercizio5;

/*
 * Scrivere un programma che, dato un numero ed un array di sottraendi, 
 * svolga l'operazione della sottrazione e, nel caso in cui la sottrazione 
 * fosse impossibile (ovvero quando il risultato è un numero negativo), 
 * sollevi un'eccezione personalizzata.
 */

public class TestSottrazione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 30;
		int[] sottraendi = { 3, 7, 13, 15 };

		try {
			sottrai(n, sottraendi);
		} catch (SottrazioneIllegale e) {
			System.out.println(e.getMessage());
		}
	}

	public static int sottrai(int numero, int[] sottraendi) throws SottrazioneIllegale {

		int risultato = numero;

		for (int s : sottraendi) {
			risultato = risultato - s;

			if (risultato < 0) {
				throw new SottrazioneIllegale("Errore: risultato negativo!");
			}
		}

		return risultato;
	}

}
