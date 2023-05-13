package com.saad.pays.controllers;

import java.util.List;

import javax.validation.Valid;

import com.saad.pays.entities.Passport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.saad.pays.service.VisaService;





@Controller
public class ContinentController {
	/*
	@Autowired
	VisaService visaService;
	
	//@RequestMapping("rootTesting")
	//public String viewHomePage () {
	//	return "index";
	//}

	@RequestMapping("/ListeContinent")
	public String listeContinent(ModelMap modelMap,
			@RequestParam (name="page",defaultValue = "0") int page,
			@RequestParam (name="size", defaultValue = "4") int size)
	{
		Page<Passport> prods = visaService.getAllPassportParePAge(page, size);
		modelMap.addAttribute("continent", prods);		
		modelMap.addAttribute("pages", new int[prods.getTotalPages()]);	
		modelMap.addAttribute("currentPage", page);	
		return "listeContinent";	
	}
	
	@RequestMapping("/showCreateC")
	public String showCreateC(ModelMap modelMap)
	{
		modelMap.addAttribute("continent", new Passport());
		modelMap.addAttribute("mode", "new");
		return "formContinents";
	}
	
	@RequestMapping("/saveContinent")
	public String saveSinger(@Valid Passport passport, BindingResult bindingResult)
	{
	if (bindingResult.hasErrors()) return "formContinents";
	visaService.savePassport(passport);
	return "listeContinent";
	}

	@RequestMapping("/supprimerContinent")
	public String supprimerContinent(@RequestParam("id") Long id,
	 ModelMap modelMap)
	{ 
		visaService.deletePassportById(id);
	List<Passport> cats = visaService.getAllPassport();
	modelMap.addAttribute("continent", cats);
	return "listeContinent";
	}

	@RequestMapping("/updateContinent")
	public String updateContinent(@ModelAttribute("continent") Passport passport, ModelMap modelMap)
	{
		visaService.updatePassport(passport);
		  List<Passport> prods = visaService.getAllPassport();
		  modelMap.addAttribute("Continent", prods);	
		return "listeContinent";
	}

	@RequestMapping("/modifierContinent")
	public String editerContinent(@RequestParam("id") Long id,ModelMap modelMap)
	{
	Passport p = visaService.getPassport(id);
	modelMap.addAttribute("continent", p);
	modelMap.addAttribute("mode", "edit");
	return "formContinents";
	}
	
	*/
}
