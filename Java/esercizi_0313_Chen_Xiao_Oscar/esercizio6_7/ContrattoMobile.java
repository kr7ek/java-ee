package esercizio6_7;

public class ContrattoMobile extends ContrattoTelefonico {

	private final double COSTO_RISPOSTA = 0.5;

	public ContrattoMobile() {
		// TODO Auto-generated constructor stub
	}

	public ContrattoMobile(String numero, String nomeAbbonato) {
		super(numero, nomeAbbonato);
		// TODO Auto-generated constructor stub
	}

	public double getCOSTO_RISPOSTA() {
		return COSTO_RISPOSTA;
	}

	@Override
	public double calcoloBolletta(int sec) {
		// TODO Auto-generated method stub

		return sec * (this.getCOSTO_AL_SECONDO() + this.getCOSTO_RISPOSTA());
	}

}
