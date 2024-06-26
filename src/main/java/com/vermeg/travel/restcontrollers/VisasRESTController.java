package com.vermeg.travel.restcontrollers;
import java.util.List;
import java.util.Optional;

import com.vermeg.travel.entities.Passport;
import com.vermeg.travel.entities.Visa;
import com.vermeg.travel.service.VisaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class VisasRESTController {
	@Autowired
	VisaService visaService;
		
	// select*
	@RequestMapping(value="/all",method = RequestMethod.GET)
	public List<Visa> getAllVisa() {
	return visaService.getAllVisa();
	}
	// select with id
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public List<Visa> getVisaByIdpass(@PathVariable("id") String id) {
		return visaService.getVisaByIdpass(id);
	}
	@RequestMapping(value="/id/{id}",method = RequestMethod.GET)
	public Optional<Visa> getVisaById(@PathVariable("id") String id) {
	return visaService.getVisaById(id);
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



	// select*
	@RequestMapping(value = "/passport/all",method = RequestMethod.GET)
	public List<Passport> getAllPassport() {
		return visaService.getAllPassport();
	}
	// select with id
	@RequestMapping(value="/passport/{id}",method = RequestMethod.GET)
	public Passport getPassportByUserId(@PathVariable("id") Long id) {
		return visaService.getPassportByUserId(id);
	}
	@RequestMapping(value="/passport/id/{id}",method = RequestMethod.GET)
	public Passport getPassport(@PathVariable("id")  String id) {
		return visaService.getPassport(id);
	}
	// insert *
	@RequestMapping(value = "/passport",method = RequestMethod.POST)
	public Passport creatPassport(@RequestBody Passport passport) {
		return visaService.savePassport(passport);
	}
	// update *
	@RequestMapping(value = "/passport",method = RequestMethod.PUT)
	public Passport updatePassport (@RequestBody Passport passport) {
		return visaService.updatePassport(passport);
	}
	//Delete id*
	@RequestMapping(value = "/passport/{id}", method = RequestMethod.DELETE)
	public void deletePassportById(@PathVariable String id) {
		visaService.deletePassportById(id);
	}

	
}
