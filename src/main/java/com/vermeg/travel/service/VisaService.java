package com.vermeg.travel.service;

import java.util.List;
import java.util.Optional;

import com.vermeg.travel.entities.Passport;
import com.vermeg.travel.entities.Visa;


public interface VisaService {


	List<Visa> getAllVisa();
	List<Visa> getVisaByIdpass(String id);
	Visa saveVisa(Visa v);
	Visa updateVisa(Visa v);
	void deleteVisaById(String idVisa);
	Optional<Visa> getVisaById(String id);


	void deleteVisa(Visa v);





	//

	List<Passport> getAllPassport();
	Passport getPassport(String id);
	Passport updatePassport(Passport p);
	void deletePassportById(String id);
	Passport savePassport(Passport p);
	Passport getPassportByUserId(Long userId);

	void deletePassport(Passport p);

}
