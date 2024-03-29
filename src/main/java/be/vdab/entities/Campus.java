package be.vdab.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the campussen database table.
 * 
 */
@Entity
@Table(name="campussen")

public class Campus  {
	@Id
	@GeneratedValue
	private long id;

	private String gemeente;

	private String huisNr;

	private int managerid;

	private String naam;

	private String postCode;

	private String straat;

	@OneToMany(mappedBy="campussen", fetch = FetchType.EAGER)
	private Set<Docent> docenten;

	public Campus() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGemeente() {
		return this.gemeente;
	}

	public void setGemeente(String gemeente) {
		this.gemeente = gemeente;
	}

	public String getHuisNr() {
		return this.huisNr;
	}

	public void setHuisNr(String huisNr) {
		this.huisNr = huisNr;
	}

	public int getManagerid() {
		return this.managerid;
	}

	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}

	public String getNaam() {
		return this.naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getStraat() {
		return this.straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public Set<Docent> getDocentens() {
		return this.docenten;
	}

	public void setDocentens(Set<Docent> docentens) {
		this.docenten = docentens;
	}

	public Docent addDocenten(Docent docenten) {
		getDocentens().add(docenten);
		docenten.setCampussen(this);

		return docenten;
	}

	public Docent removeDocenten(Docent docenten) {
		getDocentens().remove(docenten);
		docenten.setCampussen(null);

		return docenten;
	}

}