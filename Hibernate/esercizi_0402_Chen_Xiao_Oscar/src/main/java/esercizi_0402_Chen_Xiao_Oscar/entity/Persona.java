package esercizi_0402_Chen_Xiao_Oscar.entity;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String nome;
	@Column
	private String cognome;
	@Column
	private String indirizzo;
	@Column
	private String professione;
	@Column
	private Integer eta;
	
	@OneToMany(mappedBy = "persona")
	private List<Automobile> automobili;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(Integer id, String nome, String cognome, String indirizzo, String professione, Integer eta) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.professione = professione;
		this.eta = eta;
	}

	public Persona(String nome, String cognome, String indirizzo, String professione, Integer eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.professione = professione;
		this.eta = eta;
	}

	public Persona(String nome, String cognome, String indirizzo, String professione, Integer eta,
			List<Automobile> automobili) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.professione = professione;
		this.eta = eta;
		this.automobili = automobili;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getProfessione() {
		return professione;
	}

	public void setProfessione(String professione) {
		this.professione = professione;
	}

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo
				+ ", professione=" + professione + ", eta=" + eta + "]";
	}
}
