package com.saad.pays.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
	@RequestMapping(value="/{idVisa}",method = RequestMethod.GET)
	public Visa getVisa(@PathVariable("idVisa") String idVisa) {
	return visaService.getVisa(idVisa);
	}
	// insert *
	@RequestMapping(method = RequestMethod.POST)
	public Visa createVisa(@RequestBody Visa visa) {
		return visaService.saveVisa(visa);
	}
	// update *
	@RequestMapping(method = RequestMethod.PUT)
	public Visa updateVisa (@RequestBody Visa visa) {
		return visaService.updateVisa(visa);
	}
	//Delete id*
	@RequestMapping(value = "/{idVisa}", method = RequestMethod.DELETE)
	public void deleteVisaById(@PathVariable String idVisa) {
		visaService.deleteVisaById(idVisa);
	}

	/*
	@RequestMapping(value="/paycont/{idCat}",method = RequestMethod.GET)
	public List<Visa> getPaysByIcat(@PathVariable("idCat") Long idCat){
		//return null ;
		return visaService.findByVisaId(idCat) ;
	}
	*/
	/*@RequestMapping(value="/paysByName/{nom}",method = RequestMethod.GET)
	public List<Visa> findByNomPaysContains(@PathVariable("nom") String nom) {
	return visaService.findVisaByName(nom);
	}
	*/

	// select*
	@RequestMapping(value = "/passport",method = RequestMethod.GET)
	public List<Passport> getAllPassport() {
		return visaService.getAllPassport();
	}
	// select with id
	@RequestMapping(value="/passport/{id}",method = RequestMethod.GET)
	public Passport getPassport(@PathVariable("id") String id) {
		return visaService.getPassport(id);
	}
	// insert *
	@RequestMapping(value = "/passport",method = RequestMethod.POST)
	public Passport creatPassport(@RequestBody Passport passport) {
		return visaService.savePassport(passport);
	}
	// update *
	@RequestMapping(value = "/passport",method = RequestMethod.PUT)
	public Passport updateVisa (@RequestBody Passport passport) {
		return visaService.updatePassport(passport);
	}
	//Delete id*
	@RequestMapping(value = "/passport/{id}", method = RequestMethod.DELETE)
	public void deletePassportById(@PathVariable String id) {
		visaService.deletePassportById(id);
	}
}
