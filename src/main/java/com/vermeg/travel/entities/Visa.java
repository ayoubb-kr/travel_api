package com.vermeg.travel.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


@Entity
public class Visa {
	@Id
	private String idVisa;

	@Temporal(TemporalType.DATE)

	private Date visaExpDate;

	private long jours;

	private long mois;


	@ManyToOne
	private Passport passport;

	public Visa(String idVisa, Date visaExpDate, long jours, long mois, Passport passport) {
		this.idVisa = idVisa;
		visaExpDate = visaExpDate;
		this.jours = jours;
		this.mois = mois;
		this.passport = passport;
	}

	public String getIdVisa() {
		return idVisa;
	}

	public void setIdVisa(String IdVisa) {
		this.idVisa = IdVisa;
	}

	public void setVisaExpDate(Date visaExpDate) {
		this.visaExpDate = visaExpDate;
	}

	public Date getVisaExpDate() {
		return visaExpDate;
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
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public Visa() {
	}


}
