package com.saad.pays.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
public class Visa {
	@Id
	private String idVisa;

	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date VisaExpDate;

	private long jours;

	private long mois;


	@ManyToOne
	private Passport Passport;

	public Visa(String idVisa, Date visaExpDate, long jours, long mois, Passport passport) {
		this.idVisa = idVisa;
		VisaExpDate = visaExpDate;
		this.jours = jours;
		this.mois = mois;
		this.Passport = passport;
	}

	public String getIdVisa() {
		return idVisa;
	}

	public void setIdVisa(String IdVisa) {
		this.idVisa = IdVisa;
	}

	public void setVisaExpDate(Date visaExpDate) {
		this.VisaExpDate = visaExpDate;
	}

	public Date getVisaExpDate() {
		return VisaExpDate;
	}



	public long getJours() {
		return jours;
	}

	public void setJours(long jours) {
		this.jours = jours;
	}

	public long getMois() {
		return mois;
	}

	public void setMois(long mois) {
		this.mois = mois;
	}

	public Passport getPassport() {
		return Passport;
	}

	public void setPassport(Passport passport) {
		this.Passport = passport;
	}

	public Visa() {
	}

	@Override
	public String toString() {
		return "Visa{" +
				"idVisa='" + idVisa + '\'' +
				", VisaExpDate=" + VisaExpDate +
				", jours=" + jours +
				", mois=" + mois +
				", Passport=" + Passport +
				'}';
	}
}
