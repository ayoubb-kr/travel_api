package com.saad.pays.service;

import java.util.List;

import com.saad.pays.entities.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.saad.pays.entities.Visa;
import com.saad.pays.repos.ContinentRepository;
import com.saad.pays.repos.PayRepository;


@Service
public class PaysServiceImpl implements PaysService {
	@Autowired
	PayRepository paysRepository;
	
	@Autowired
	ContinentRepository continentRepository;

	@Override
	public Visa savePays(Visa p) {
		return paysRepository.save(p);
	}
	@Override
	public Passport saveContinent(Passport c) {
		// TODO Auto-generated method stub
		return continentRepository.save(c);
	}

	
	@Override
	public Visa updatePays(Visa p) {
		return paysRepository.save(p);
	}

	@Override
	public Passport updateContinent(Passport c) {
		// TODO Auto-generated method stub
		return continentRepository.save(c);
	}
	
	@Override
	public void deletePays(Visa p) {
		paysRepository.delete(p);
	}
	
	@Override
	public void deleteContinent(Passport c) {
		// TODO Auto-generated method stub
		continentRepository.delete(c);
	}

	@Override
	public void deletePaysById(Long id) {
		paysRepository.deleteById(id);
	}

	@Override
	public Visa getPays(Long id) {
		return paysRepository.findById(id).get();
	}

	@Override
	public List<Visa> getAllPays() {
		return paysRepository.findAll();
	}

	@Override
	public Page<Visa> getAllPaysParPage(int page, int size) {
		
		return paysRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Passport> getAllContinent() {
		
		return continentRepository.findAll() ;
	}

/// here 
	

	@Override
	public void deleteContinentById(Long id) {
		// TODO Auto-generated method stub
		continentRepository.deleteById(id);
	}

	@Override
	public Passport getContinent(Long id) {
		// TODO Auto-generated method stub
		return continentRepository.findById(id).get();
	}

	@Override
	public Page<Passport> getAllContinentParePAge(int page, int size) {
		// TODO Auto-generated method stub
		return continentRepository.findAll(PageRequest.of(page, size));
	}
	//@Override
	//public List<Pays> findByNomPaysLike(String nom) {
		// TODO Auto-generated method stub
	//	return paysRepository.findByNomPaysLike(nom);
	//}
	@Override
	public List<Visa> findPaysByName(String Name) {
		// TODO Auto-generated method stub
		return paysRepository.findByNomPays(Name);
	}
	@Override
	public List<Visa> findByContinentIdCat(Long id) {
		// return produitRepository.findByCategorieIdCat(id);
		return paysRepository.findByContinentIdCat(id);
	}

	

}
