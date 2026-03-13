package esercizio3_4;

public class Macchinetta {

	private int cialde;
	private int cassetto;
	private int caffeTotali;
	private int caffeDaUltimoSvuotamento;

	public Macchinetta() {
		cassetto = 5;
		cialde = 0;
		caffeTotali = 0;
		caffeDaUltimoSvuotamento = 0;
	}

	public Macchinetta(int capacita) {
		this.cialde = 0;
		this.cassetto = capacita;
		this.caffeTotali = 0;
		this.caffeDaUltimoSvuotamento = 0;
	}

	public int getCialde() {
		return cialde;
	}

	public void setCialde(int cialde) {
		this.cialde = cialde;
	}

	public int getCassetto() {
		return cassetto;
	}

	public void setCassetto(int cassetto) {
		this.cassetto = cassetto;
	}

	public int getCaffeTotali() {
		return caffeTotali;
	}

	public void setCaffeTotali(int caffeTotali) {
		this.caffeTotali = caffeTotali;
	}

	public int getCaffeDaUltimoSvuotamento() {
		return caffeDaUltimoSvuotamento;
	}

	public void setCaffeDaUltimoSvuotamento(int caffeDaUltimoSvuotamento) {
		this.caffeDaUltimoSvuotamento = caffeDaUltimoSvuotamento;
	}

	// prepara un caffe'
	public void preparaCaffe() {

		if (cialde < cassetto) {
			cialde++;
			caffeTotali++;
			caffeDaUltimoSvuotamento++;

			System.out.println("Caffe' pronto!");
		} else
			System.out.println("Cassetto cialde pieno!");
	}

	// svuota cassetto cialde
	public void svuotaCassetto() {

		if (cialde == cassetto) {
			cialde = 0;
			caffeDaUltimoSvuotamento = 0;
			System.out.println("Cassetto svuotato.");
		} else
			System.out.println("Il cassetto e' ancora libero!");
	}

	// visualizza caffe' totali
	public void visualizzaCaffeTotali() {
		System.out.println("Caffè totali preparati: " + caffeTotali);
	}

	// caffe' dall'ultimo svuotamento
	public void visualizzaCaffeDaUltimoSvuotamento() {
		System.out.println("Caffè preparati dall'ultimo svuotamento: " + caffeDaUltimoSvuotamento);
	}

}
