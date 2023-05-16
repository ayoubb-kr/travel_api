package com.saad.pays.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Passport {
	@Id
	private String IdPass;

	@Temporal(TemporalType.DATE)
	private Date PassExpDate;
	@JsonIgnore
	@OneToMany(mappedBy = "Passport")
	private List<Visa> Visas;

	public Passport(String idPass, Date passExpDate, List<Visa> visas) {
		this.IdPass = idPass;
		PassExpDate = passExpDate;
		this.Visas = visas;
	}

	public Date getPassExpDate() {
		return PassExpDate;
	}

	public void setPassExpDate(Date passExpDate) {
		PassExpDate = passExpDate;
	}

	public List<Visa> getVisas() {
		return Visas;
	}

	public void setVisas(List<Visa> visas) {
		this.Visas = visas;
	}

	public String getIdPass() {
		return IdPass;
	}

	public void setIdPass(String idPass) {
		this.IdPass = idPass;
	}

	@Override
	public String toString() {
		return "Passport{" +
				"idPass='" + IdPass + '\'' +
				", PassExpDate=" + PassExpDate +
				", visas=" + Visas +
				'}';
	}

	public Passport() {
		super();
	}
	


}
