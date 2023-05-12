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
public class VisasRESTController {
	@Autowired
	VisaService visaService;
		
	// select*
	@RequestMapping(method = RequestMethod.GET)
	public List<Visa> getAllVisa() {
	return visaService.getAllVisa();
	}
	// select with id 
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Visa getVisa(@PathVariable("id") Long id) {
	return visaService.getVisa(id);
	}
	// insert *
	@RequestMapping(method = RequestMethod.POST)
	public Visa greateVisa(@RequestBody Visa visa) {
		return visaService.saveVisa(visa);
	}
	// update *
	@RequestMapping(method = RequestMethod.PUT)
	public Visa updateVisa (@RequestBody Visa visa) {
		return visaService.updateVisa(visa);
	}
	//Delete id*
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteVisa(@PathVariable("id") Long id) {
		visaService.deleteVisaById(id);
	}
	/*
	@RequestMapping(value="/paycont/{idCat}",method = RequestMethod.GET)
	public List<Visa> getPaysByIcat(@PathVariable("idCat") Long idCat){
		//return null ;
		return visaService.findByVisaId(idCat) ;
	}
	*/
	@RequestMapping(value="/paysByName/{nom}",method = RequestMethod.GET)
	public List<Visa> findByNomPaysContains(@PathVariable("nom") String nom) {
	return visaService.findVisaByName(nom);
	}
	
	
	
	
	
}
