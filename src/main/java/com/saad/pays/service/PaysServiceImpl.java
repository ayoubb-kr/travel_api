package com.saad.pays.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.saad.pays.entities.Continent;
import com.saad.pays.entities.Pays;
import com.saad.pays.repos.ContinentRepository;
import com.saad.pays.repos.PayRepository;


@Service
public class PaysServiceImpl implements PaysService {
	@Autowired
	PayRepository paysRepository;
	
	@Autowired
	ContinentRepository continentRepository;

	@Override
	public Pays savePays(Pays p) {
		return paysRepository.save(p);
	}
	@Override
	public Continent saveContinent(Continent c) {
		// TODO Auto-generated method stub
		return continentRepository.save(c);
	}

	
	@Override
	public Pays updatePays(Pays p) {
		return paysRepository.save(p);
	}

	@Override
	public Continent updateContinent(Continent c) {
		// TODO Auto-generated method stub
		return continentRepository.save(c);
	}
	
	@Override
	public void deletePays(Pays p) {
		paysRepository.delete(p);
	}
	
	@Override
	public void deleteContinent(Continent c) {
		// TODO Auto-generated method stub
		continentRepository.delete(c);
	}

	@Override
	public void deletePaysById(Long id) {
		paysRepository.deleteById(id);
	}

	@Override
	public Pays getPays(Long id) {
		return paysRepository.findById(id).get();
	}

	@Override
	public List<Pays> getAllPays() {
		return paysRepository.findAll();
	}

	@Override
	public Page<Pays> getAllPaysParPage(int page, int size) {
		
		return paysRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<Continent> getAllContinent() {
		
		return continentRepository.findAll() ;
	}

/// here 
	

	@Override
	public void deleteContinentById(Long id) {
		// TODO Auto-generated method stub
		continentRepository.deleteById(id);
	}

	@Override
	public Continent getContinent(Long id) {
		// TODO Auto-generated method stub
		return continentRepository.findById(id).get();
	}

	@Override
	public Page<Continent> getAllContinentParePAge(int page, int size) {
		// TODO Auto-generated method stub
		return continentRepository.findAll(PageRequest.of(page, size));
	}
	//@Override
	//public List<Pays> findByNomPaysLike(String nom) {
		// TODO Auto-generated method stub
	//	return paysRepository.findByNomPaysLike(nom);
	//}
	@Override
	public List<Pays> findPaysByName(String Name) {
		// TODO Auto-generated method stub
		return paysRepository.findByNomPays(Name);
	}
	@Override
	public List<Pays> findByContinentIdCat(Long id) {
		// return produitRepository.findByCategorieIdCat(id);
		return paysRepository.findByContinentIdCat(id);
	}

	

}
