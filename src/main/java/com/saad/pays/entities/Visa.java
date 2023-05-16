package com.saad.pays.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
public class Visa {
	@Id
	private String IdVisa;

	@Temporal(TemporalType.DATE)
	private Date VisaExpDate;

	private long Jours;

	private long Mois;


	@ManyToOne
	private Passport Passport;

	public Visa(String idVisa, Date visaExpDate, long jours, long mois, Passport passport) {
		this.IdVisa = idVisa;
		VisaExpDate = visaExpDate;
		this.Jours = jours;
		this.Mois = mois;
		this.Passport = passport;
	}

	public String getIdVisa() {
		return IdVisa;
	}

	public void setIdVisa(String IdVisa) {
		this.IdVisa = IdVisa;
	}

	public Date getVisaExpDate() {
		return VisaExpDate;
	}

	public void setVisaExpDate(Date visaExpDate) {
		VisaExpDate = visaExpDate;
	}

	public long getJours() {
		return Jours;
	}

	public void setJours(long jours) {
		this.Jours = jours;
	}

	public long getMois() {
		return Mois;
	}

	public void setMois(long mois) {
		this.Mois = mois;
	}

	public Passport getPassport() {
		return Passport;
	}

	public void setPassport(Passport passport) {
		this.Passport = passport;
	}

	public Visa() {
	}
}
