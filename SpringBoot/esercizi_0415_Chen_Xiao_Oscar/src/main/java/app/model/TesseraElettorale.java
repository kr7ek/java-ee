package app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tessere_elettorali")
public class TesseraElettorale {

    @Id
    private String numeroTessera;
    private String scadenza;

    @OneToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "seggio_id")
    private Seggio seggio;

	public TesseraElettorale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TesseraElettorale(String numeroTessera, String scadenza, Persona persona, Seggio seggio) {
		super();
		this.numeroTessera = numeroTessera;
		this.scadenza = scadenza;
		this.persona = persona;
		this.seggio = seggio;
	}

	public String getNumeroTessera() {
		return numeroTessera;
	}

	public void setNumeroTessera(String numeroTessera) {
		this.numeroTessera = numeroTessera;
	}

	public String getScadenza() {
		return scadenza;
	}

	public void setScadenza(String scadenza) {
		this.scadenza = scadenza;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Seggio getSeggio() {
		return seggio;
	}

	public void setSeggio(Seggio seggio) {
		this.seggio = seggio;
	}

	@Override
	public String toString() {
		return "TesseraElettorale [numeroTessera=" + numeroTessera + ", scadenza=" + scadenza + ", persona=" + persona
				+ ", seggio=" + seggio + "]";
	}
}