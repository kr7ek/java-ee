package app.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "persone")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cognome;

    @Column(unique = true)
    private String codiceFiscale;

    @ManyToOne
    @JoinColumn(name = "seggio_id")
    private Seggio seggio;
    
    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL)
    private TesseraElettorale tessera;

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(String nome, String cognome, String codiceFiscale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}

	public Persona(String nome, String cognome, String codiceFiscale, TesseraElettorale tessera) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.tessera = tessera;
	}

	public Seggio getSeggio() {
		return seggio;
	}

	public void setSeggio(Seggio seggio) {
		this.seggio = seggio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public TesseraElettorale getTessera() {
		return tessera;
	}

	public void setTessera(TesseraElettorale tessera) {
		this.tessera = tessera;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale
				+ ", tessera=" + tessera + "]";
	}
}