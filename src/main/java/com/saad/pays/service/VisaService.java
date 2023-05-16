package com.saad.pays.service;

import java.util.List;

import com.saad.pays.entities.Passport;
import com.saad.pays.entities.Visa;
import org.springframework.data.domain.Page;


public interface VisaService {


	List<Visa> getAllVisa();
	Visa getVisa(String idVisa);
	Visa saveVisa(Visa v);
	Visa updateVisa(Visa v);
	void deleteVisaById(String idVisa);




	void deleteVisa(Visa v);
	Page<Visa> getAllVisaParPage(int page, int size);




	//

	List<Passport> getAllPassport();
	Passport getPassport(String id);
	Passport updatePassport(Passport p);
	void deletePassportById(String id);
	Passport savePassport(Passport p);

	Page<Passport> getAllPassportParePAge(int page, int size);
	void deletePassport(Passport p);

}
