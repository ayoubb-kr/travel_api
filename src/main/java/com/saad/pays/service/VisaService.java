package com.saad.pays.service;

import java.util.List;

import com.saad.pays.entities.Passport;
import com.saad.pays.entities.Visa;
import org.springframework.data.domain.Page;


public interface VisaService {
	
	Visa saveVisa(Visa v);
	Passport savePassport(Passport p);
	
	Visa updateVisa(Visa v);
	Passport updatePassport(Passport p);
	
	void deleteVisa(Visa v);
	void deletePassport(Passport p);
	
	void deleteVisaById(Long id);
	void deletePassportById(Long id);
	
	Visa getVisa(Long id);
	Passport getPassport(Long id);
	
	List<Visa> getAllVisa();
	
	List<Passport> getAllPassport();
	
	List<Visa> findVisaByName(String Name);
	
	Page<Visa> getAllVisaParPage(int page, int size);
	Page<Passport> getAllPassportParePAge(int page, int size);

	List<Visa> findByVisaId(Long id);
	

}
