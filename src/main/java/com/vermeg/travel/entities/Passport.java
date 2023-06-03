package com.vermeg.travel.entities;

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
	@OneToMany(mappedBy = "Passport" , cascade = CascadeType.ALL )
	private List<Visa> visas;
	@JsonIgnore
	@OneToOne(mappedBy = "passport")
	private User user;
	public Passport(String idPass, Date passExpDate, List<Visa> visas, User user) {
		this.idPass = idPass;
		PassExpDate = passExpDate;
		this.visas = visas;
		this.user= user;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Passport() {
		super();
	}


	@Override
	public String toString() {
		return "Passport{" +
				"idPass='" + idPass + '\'' +
				", PassExpDate=" + PassExpDate +
				", visas=" + visas +
				", user=" + user +
				'}';
	}
}
