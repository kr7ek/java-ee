package esercizi_0408_Chen_Xiao_Oscar.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Medico {

	@Id
	private int id;
	private String nome;
	private String cognome;
	private String specializzazione;
	private String email;

	@ManyToMany(mappedBy = "medici")
	List<Paziente> pazienti;

	public Medico() {
		super();
		pazienti = new ArrayList<Paziente>();
	}

	public Medico(int id, String nome, String cognome, String specializzazione, String email) {
		this();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.specializzazione = specializzazione;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Paziente> getPazienti() {
		return pazienti;
	}

	public void setPazienti(List<Paziente> pazienti) {
		this.pazienti = pazienti;
	}

	@Override
	public String toString() {
		return "Medico [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", specializzazione=" + specializzazione
				+ ", email=" + email + "]";
	}

}
