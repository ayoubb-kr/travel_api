package com.saad.pays.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Passport {
	@Id
	private String idPass;

	@Temporal(TemporalType.DATE)
	private Date PassExpDate;
	@JsonIgnore
	@OneToMany(mappedBy = "passport")
	private List<Visa> visas;

	public Passport(String idPass, Date passExpDate, List<Visa> visas) {
		this.idPass = idPass;
		PassExpDate = passExpDate;
		this.visas = visas;
	}

	public Date getPassExpDate() {
		return PassExpDate;
	}

	public void setPassExpDate(Date passExpDate) {
		PassExpDate = passExpDate;
	}

	public List<Visa> getVisas() {
		return visas;
	}

	public void setVisas(List<Visa> visas) {
		this.visas = visas;
	}

	public String getIdPass() {
		return idPass;
	}

	public void setIdPass(String idPass) {
		this.idPass = idPass;
	}

	@Override
	public String toString() {
		return "Passport{" +
				"idPass='" + idPass + '\'' +
				", PassExpDate=" + PassExpDate +
				", visas=" + visas +
				'}';
	}

	public Passport() {
		super();
	}
	


}
