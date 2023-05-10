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
@CrossOrigin("*")
public class PaysRESTController {
	@Autowired
	PaysService paysService;
		
	// select*
	@RequestMapping(method = RequestMethod.GET)
	public List<Visa> getAllPays() {
	return paysService.getAllPays();
	}
	// select with id 
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Visa getPays(@PathVariable("id") Long id) {
	return paysService.getPays(id);
	}
	// insert *
	@RequestMapping(method = RequestMethod.POST)
	public Visa greatePays(@RequestBody Visa visa) {
		return paysService.savePays(visa);
	}
	// update *
	@RequestMapping(method = RequestMethod.PUT)
	public Visa updatePays (@RequestBody Visa visa) {
		return paysService.updatePays(visa);
	}
	//Delete id*
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deletepays(@PathVariable("id") Long id) {
		paysService.deletePaysById(id);
	}
	@RequestMapping(value="/paycont/{idCat}",method = RequestMethod.GET)
	public List<Visa> getPaysByIcat(@PathVariable("idCat") Long idCat){
		//return null ;
		return paysService.findByContinentIdCat(idCat) ;
	}
	
	@RequestMapping(value="/paysByName/{nom}",method = RequestMethod.GET)
	public List<Visa> findByNomPaysContains(@PathVariable("nom") String nom) {
	return paysService.findPaysByName(nom);
	}
	
	
	
	
	
}
