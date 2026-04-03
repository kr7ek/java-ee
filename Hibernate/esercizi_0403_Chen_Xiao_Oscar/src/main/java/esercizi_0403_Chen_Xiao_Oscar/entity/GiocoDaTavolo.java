package esercizi_0403_Chen_Xiao_Oscar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "giochi_da_tavolo")
public class GiocoDaTavolo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String nome;
	@Column(name = "casa_produttrice")
	private String casaProduttrice;
	@Column(name = "numero_min_giocatori")
	private Integer numeroMinGiocatori;
	@Column(name = "numero_max_giocatori")
	private Integer numeroMaxGiocatori;
	@Column(name = "eta_minima")
	private Integer etaMinima;

	@ManyToOne
	@JoinColumn(name = "id_partecipante")
	private Partecipante partecipante;

	public GiocoDaTavolo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiocoDaTavolo(Integer id, String nome, String casaProduttrice, Integer numeroMinGiocatori,
			Integer numeroMaxGiocatori, Integer etaMinima) {
		super();
		this.id = id;
		this.nome = nome;
		this.casaProduttrice = casaProduttrice;
		this.numeroMinGiocatori = numeroMinGiocatori;
		this.numeroMaxGiocatori = numeroMaxGiocatori;
		this.etaMinima = etaMinima;
	}

	public GiocoDaTavolo(String nome, String casaProduttrice, Integer numeroMinGiocatori, Integer numeroMaxGiocatori,
			Integer etaMinima) {
		super();
		this.nome = nome;
		this.casaProduttrice = casaProduttrice;
		this.numeroMinGiocatori = numeroMinGiocatori;
		this.numeroMaxGiocatori = numeroMaxGiocatori;
		this.etaMinima = etaMinima;
	}

	public GiocoDaTavolo(String nome, String casaProduttrice, Integer numeroMinGiocatori, Integer numeroMaxGiocatori,
			Integer etaMinima, Partecipante partecipante) {
		super();
		this.nome = nome;
		this.casaProduttrice = casaProduttrice;
		this.numeroMinGiocatori = numeroMinGiocatori;
		this.numeroMaxGiocatori = numeroMaxGiocatori;
		this.etaMinima = etaMinima;
		this.partecipante = partecipante;
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

	public String getCasaProduttrice() {
		return casaProduttrice;
	}

	public void setCasaProduttrice(String casaProduttrice) {
		this.casaProduttrice = casaProduttrice;
	}

	public Integer getNumeroMinGiocatori() {
		return numeroMinGiocatori;
	}

	public void setNumeroMinGiocatori(Integer numeroMinGiocatori) {
		this.numeroMinGiocatori = numeroMinGiocatori;
	}

	public Integer getNumeroMaxGiocatori() {
		return numeroMaxGiocatori;
	}

	public void setNumeroMaxGiocatori(Integer numeroMaxGiocatori) {
		this.numeroMaxGiocatori = numeroMaxGiocatori;
	}

	public Integer getEtaMinima() {
		return etaMinima;
	}

	public void setEtaMinima(Integer etaMinima) {
		this.etaMinima = etaMinima;
	}

	@Override
	public String toString() {
		return "GiocoDaTavolo [id=" + id + ", nome=" + nome + ", casaProduttrice=" + casaProduttrice
				+ ", numeroMinGiocatori=" + numeroMinGiocatori + ", numeroMaxGiocatori=" + numeroMaxGiocatori
				+ ", etaMinima=" + etaMinima + "]";
	}
}
