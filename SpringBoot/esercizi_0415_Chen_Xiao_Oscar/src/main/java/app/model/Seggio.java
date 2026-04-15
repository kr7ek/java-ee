package app.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "seggi")
public class Seggio {

    @Id
    @Column(length = 4, name = "codice_seggio")
    private String codiceSeggio;

    private String sede;
    private String citta;
    private String provincia;
    private String regione;
    
    @OneToMany(mappedBy = "seggio")
    private List<Persona> persone;
    
	public Seggio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seggio(String codiceSeggio, String sede, String citta, String provincia, String regione) {
		super();
		this.codiceSeggio = codiceSeggio;
		this.sede = sede;
		this.citta = citta;
		this.provincia = provincia;
		this.regione = regione;
	}

	public Seggio(String codiceSeggio, String sede, String citta, String provincia, String regione,
			List<Persona> persone) {
		super();
		this.codiceSeggio = codiceSeggio;
		this.sede = sede;
		this.citta = citta;
		this.provincia = provincia;
		this.regione = regione;
		this.persone = persone;
	}

	public String getCodiceSeggio() {
		return codiceSeggio;
	}

	public void setCodiceSeggio(String codiceSeggio) {
		this.codiceSeggio = codiceSeggio;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public List<Persona> getPersone() {
		return persone;
	}

	public void setPersone(List<Persona> persone) {
		this.persone = persone;
	}

	@Override
	public String toString() {
		return "Seggio [codiceSeggio=" + codiceSeggio + ", sede=" + sede + ", citta=" + citta + ", provincia="
				+ provincia + ", regione=" + regione + "]";
	}
}
