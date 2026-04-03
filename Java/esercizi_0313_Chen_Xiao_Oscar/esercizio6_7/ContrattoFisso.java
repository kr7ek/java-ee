package esercizio6_7;

public class ContrattoFisso extends ContrattoTelefonico {

	private String indirizzoUtenza;

	public ContrattoFisso() {
		indirizzoUtenza = "";
		// TODO Auto-generated constructor stub
	}

	public ContrattoFisso(String numero, String nomeAbbonato, String indirizzoUtenza) {
		super(numero, nomeAbbonato);
		this.indirizzoUtenza = indirizzoUtenza;
		// TODO Auto-generated constructor stub
	}

	public String getIndirizzoUtenza() {
		return indirizzoUtenza;
	}

	public void setIndirizzoUtenza(String indirizzoUtenza) {
		this.indirizzoUtenza = indirizzoUtenza;
	}

	@Override
	public double calcoloBolletta(int sec) {
		// TODO Auto-generated constructor stub

		return sec * this.getCOSTO_AL_SECONDO();
	}

}
