package com.saad.pays.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.saad.pays.entities.*;
import com.saad.pays.service.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PaysRESTController {
	@Autowired
	PaysService paysService;
	

	
	// select*
	@RequestMapping(method = RequestMethod.GET)
	public List<Pays> getAllPays() {
	return paysService.getAllPays();
	}
	// select with id 
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Pays getPays(@PathVariable("id") Long id) {
	return paysService.getPays(id);
	}
	// insert *
	@RequestMapping(method = RequestMethod.POST)
	public Pays greatePays(@RequestBody Pays pays) {
		return paysService.savePays(pays);
	}
	// update *
	@RequestMapping(method = RequestMethod.PUT)
	public Pays updatePays (@RequestBody Pays pays) {
		return paysService.updatePays(pays);
	}
	//Delete id*
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deletepays(@PathVariable("id") Long id) {
		paysService.deletePaysById(id);
	}
	@RequestMapping(value="/paycont/{idCat}",method = RequestMethod.GET)
	public List<Pays> getPaysByIcat(@PathVariable("idCat") Long idCat){
		//return null ;
		return paysService.findByContinentIdCat(idCat) ;
	}
	
	@RequestMapping(value="/paysByName/{nom}",method = RequestMethod.GET)
	public List<Pays> findByNomPaysContains(@PathVariable("nom") String nom) {
	return paysService.findPaysByName(nom);
	}
	
	
	
	
	
}
