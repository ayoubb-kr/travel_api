package com.saad.pays.service;

import java.util.List;

import com.saad.pays.entities.Passport;
import com.saad.pays.entities.Visa;
import org.springframework.data.domain.Page;


public interface PaysService {
	
	Visa savePays(Visa p);
	Passport saveContinent(Passport c);
	
	Visa updatePays(Visa p);
	Passport updateContinent(Passport c);
	
	void deletePays(Visa p);
	void deleteContinent(Passport c);
	
	void deletePaysById(Long id);
	void deleteContinentById(Long id);
	
	Visa getPays(Long id);
	Passport getContinent(Long id);
	
	List<Visa> getAllPays();
	
	List<Passport> getAllContinent();
	
	List<Visa> findPaysByName(String Name);
	
	Page<Visa> getAllPaysParPage(int page, int size);
	Page<Passport> getAllContinentParePAge(int page, int size);
	
//	List<Pays> findByNomPaysLike(String nom);
	
	List<Visa> findByContinentIdCat(Long id);
	

}
