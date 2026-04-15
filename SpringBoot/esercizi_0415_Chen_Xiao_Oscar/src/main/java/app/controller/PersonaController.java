package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import app.model.*;
import app.service.*;

@Controller
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	private PersonaServiceImpl personaServiceImpl;
	@Autowired
	private SeggioServiceImpl seggioServiceImpl;
	
	@GetMapping
	public String getAll(Model model) {
		model.addAttribute("persona", personaServiceImpl.getAllObject());
		return "persona";
	}
	
	@GetMapping("/create")
	public String createForm(Model model) {
		model.addAttribute("persona", new Persona());
		model.addAttribute("seggi", seggioServiceImpl.getAllObject());
		return "persona-form";
	}
	
	@PostMapping("/save")
	public String save(Persona persona) {
		personaServiceImpl.saveObject(persona);
		return "redirect:/persona";
	}
}
