package be.vdab.entities;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the docenten database table.
 * 
 */
@Entity
@Table(name="docenten")
public class Docent  {

	@Id
	@GeneratedValue
	private long id;

	private String familienaam;

	private String geslacht;

	private BigInteger rijksRegisterNr;

	private int versie;

	private String voornaam;

	private BigDecimal wedde;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="campusid")
	private Campus campussen;

	public Docent() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFamilienaam() {
		return this.familienaam;
	}

	public void setFamilienaam(String familienaam) {
		this.familienaam = familienaam;
	}

	public String getGeslacht() {
		return this.geslacht;
	}

	public void setGeslacht(String geslacht) {
		this.geslacht = geslacht;
	}

	public BigInteger getRijksRegisterNr() {
		return this.rijksRegisterNr;
	}

	public void setRijksRegisterNr(BigInteger rijksRegisterNr) {
		this.rijksRegisterNr = rijksRegisterNr;
	}

	public int getVersie() {
		return this.versie;
	}

	public void setVersie(int versie) {
		this.versie = versie;
	}

	public String getVoornaam() {
		return this.voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public BigDecimal getWedde() {
		return this.wedde;
	}

	public void setWedde(BigDecimal wedde) {
		this.wedde = wedde;
	}

	public Campus getCampussen() {
		return this.campussen;
	}

	public void setCampussen(Campus campussen) {
		this.campussen = campussen;
	}

}