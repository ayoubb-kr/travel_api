package com.saad.pays.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.saad.pays.entities.Continent;
import com.saad.pays.entities.Pays;
import com.saad.pays.service.PaysService;





@Controller
public class ContinentController {
	@Autowired
	PaysService paysService;
	
	@RequestMapping("rootTesting")
	public String viewHomePage () {
		return "index";
	}

	@RequestMapping("/ListeContinent")
	public String listeContinent(ModelMap modelMap,
			@RequestParam (name="page",defaultValue = "0") int page,
			@RequestParam (name="size", defaultValue = "4") int size)
	{
		Page<Continent> prods = paysService.getAllContinentParePAge(page, size);
		modelMap.addAttribute("continent", prods);		
		modelMap.addAttribute("pages", new int[prods.getTotalPages()]);	
		modelMap.addAttribute("currentPage", page);	
		return "listeContinent";	
	}
	
	@RequestMapping("/showCreateC")
	public String showCreateC(ModelMap modelMap)
	{
		modelMap.addAttribute("continent", new Continent());
		modelMap.addAttribute("mode", "new");
		return "formContinents";
	}
	
	@RequestMapping("/saveContinent")
	public String saveSinger(@Valid Continent continent, BindingResult bindingResult)
	{
	if (bindingResult.hasErrors()) return "formContinents";
	paysService.saveContinent(continent);
	return "listeContinent";
	}
	
	@RequestMapping("/supprimerContinent")
	public String supprimerContinent(@RequestParam("id") Long id,
	 ModelMap modelMap)
	{ 
		paysService.deleteContinentById(id);
	List<Continent> cats = paysService.getAllContinent();
	modelMap.addAttribute("continent", cats);
	return "listeContinent";
	}
	
	@RequestMapping("/updateContinent")
	public String updateContinent(@ModelAttribute("continent") Continent continent,ModelMap modelMap) 
	{
		paysService.updateContinent(continent);
		  List<Continent> prods = paysService.getAllContinent();
		  modelMap.addAttribute("Continent", prods);	
		return "listeContinent";
	}
	
	@RequestMapping("/modifierContinent")
	public String editerContinent(@RequestParam("id") Long id,ModelMap modelMap)
	{
	Continent c = paysService.getContinent(id);
	modelMap.addAttribute("continent", c);
	modelMap.addAttribute("mode", "edit");
	return "formContinents";
	}
	
	
}
