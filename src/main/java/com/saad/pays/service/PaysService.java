package com.saad.pays.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.saad.pays.entities.Continent;
import com.saad.pays.entities.Pays;


public interface PaysService {
	
	Pays savePays(Pays p);
	Continent saveContinent(Continent c);
	
	Pays updatePays(Pays p);
	Continent updateContinent(Continent c);
	
	void deletePays(Pays p);
	void deleteContinent(Continent c);
	
	void deletePaysById(Long id);
	void deleteContinentById(Long id);
	
	Pays getPays(Long id);
	Continent getContinent(Long id);
	
	List<Pays> getAllPays();
	
	List<Continent> getAllContinent();
	
	List<Pays> findPaysByName(String Name);
	
	Page<Pays> getAllPaysParPage(int page, int size);
	Page<Continent> getAllContinentParePAge(int page, int size);
	
//	List<Pays> findByNomPaysLike(String nom);
	
	List<Pays> findByContinentIdCat(Long id);
	

}
