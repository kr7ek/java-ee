package esercizi_0403_Chen_Xiao_Oscar.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "partecipanti")
public class Partecipante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String nome;
	@Column
	private String cognome;
	@Column
	private Integer eta;
	
	@OneToMany(mappedBy = "partecipante")
	private List<GiocoDaTavolo> giochiDaTavolo;
	
	public Partecipante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Partecipante(Integer id, String nome, String cognome, Integer eta) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public Partecipante(String nome, String cognome, Integer eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public Partecipante(String nome, String cognome, Integer eta, List<GiocoDaTavolo> giochiDaTavolo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.giochiDaTavolo = giochiDaTavolo;
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

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Partecipante [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
}
