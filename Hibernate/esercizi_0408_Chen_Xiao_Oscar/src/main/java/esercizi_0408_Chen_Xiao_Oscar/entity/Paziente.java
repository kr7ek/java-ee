package esercizi_0408_Chen_Xiao_Oscar.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Paziente {

	@Id
	private String codiceFiscale;
	private String nome;
	private String cognome;
	private String dataNascita;

	@ManyToMany
	@JoinTable(name = "pazienti_medici", joinColumns = @JoinColumn(name = "codice_fiscale", 
	referencedColumnName = "codiceFiscale"), inverseJoinColumns = @JoinColumn(name = "id_medico", 
	referencedColumnName = "id"))
	List<Medico> medici;

	public Paziente() {
		super();
		medici = new ArrayList<Medico>();
	}

	public Paziente(String codiceFiscale, String nome, String cognome, String dataNascita) {
		this();
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public List<Medico> getMedici() {
		return medici;
	}

	public void setMedici(List<Medico> medici) {
		this.medici = medici;
	}

	@Override
	public String toString() {
		return "Paziente [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita="
				+ dataNascita + "]";
	}
}
