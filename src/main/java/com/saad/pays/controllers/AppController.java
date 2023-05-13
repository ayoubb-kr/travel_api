package com.saad.pays.controllers;

import java.util.List;

import javax.validation.Valid;

import com.saad.pays.entities.Passport;
import com.saad.pays.entities.Visa;
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
public class AppController {
	/*
	@Autowired
	VisaService visaService;
	
	//@RequestMapping("indexx")
	//public String viewHomePage () {
	//	return "index";
	//}
	
	@RequestMapping("/updatePays")
	public String updatePays(@ModelAttribute("Pays") Visa visa, ModelMap modelMap)
	{
		visaService.updateVisa(visa);
		  List<Visa> prods = visaService.getAllVisa();
		  modelMap.addAttribute("pays", prods);	
		return "listePays";
	}
	
	@RequestMapping("/recherchePay")
	public String Search(ModelMap modelMap, @Valid String nomPays) {
		List<Visa> pays = visaService.findVisaByName(nomPays);
		modelMap.addAttribute("pays", pays);
		return "listePaysRecherchers";
	}
	
	
	
	@RequestMapping("/modifierPays")
	public String editerpays(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Visa v= 	visaService.getVisa(id);
		List<Passport> cats = visaService.getAllPassport();
		modelMap.addAttribute("pays", v);
		modelMap.addAttribute("mode", "edit");
		modelMap.addAttribute("continent", cats);
		return "formPays";
	}

	
	@RequestMapping("/savePays")
	public String savePays(@Valid Visa visa, BindingResult bindingResult)
	{
	if (bindingResult.hasErrors()) return "formPays";
	visaService.saveVisa(visa);
	return "listePays";	
	}
	
	
	@RequestMapping("/showCreate")
	public String showCreate(ModelMap modelMap)
	{
		List<Passport> cats = visaService.getAllPassport();
		Visa prod = new Visa();
		Passport cat = new Passport();
		cat = cats.get(0); 
		prod.setPassport(cat);
		modelMap.addAttribute("pays",prod);
		modelMap.addAttribute("mode", "new");
		modelMap.addAttribute("continent", cats);
		return "formPays";
	}
	
	
	@RequestMapping("/ListePays")
	public String listepayss(ModelMap modelMap,
			@RequestParam (name="page",defaultValue = "0") int page,
			@RequestParam (name="size", defaultValue = "4") int size)
	{
		Page<Visa> prods = visaService.getAllVisaParPage(page, size);
		modelMap.addAttribute("pays", prods);		
		modelMap.addAttribute("pages", new int[prods.getTotalPages()]);	
		modelMap.addAttribute("currentPage", page);	
		return "listePays";	
	}
	

	@RequestMapping("/supprimerPays")
	public String supprimerpays(@RequestParam("id") Long id,
			ModelMap modelMap,
			@RequestParam (name="page",defaultValue = "0") int page,
			@RequestParam (name="size", defaultValue = "4") int size)

		visaService.deleteVisaById(id);
		Page<Visa> prods = visaService.getAllVisaParPage(page, size);
		modelMap.addAttribute("pays", prods);		
		modelMap.addAttribute("pages", new int[prods.getTotalPages()]);	
		modelMap.addAttribute("currentPage", page);	
		modelMap.addAttribute("size", size);	
		return "listePays";	
	}
*/
}
