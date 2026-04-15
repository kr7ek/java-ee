package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import app.model.*;
import app.service.*;

@Controller
@RequestMapping("/tessere")
public class TesseraElettoraleController {

	@Autowired
	private PersonaServiceImpl personaServiceImpl;
	@Autowired
	private SeggioServiceImpl seggioServiceImpl;
	
	@GetMapping("/all")
	public String getAll(Model model) {
		model.addAttribute("tessere", personaServiceImpl.getAllObject());
		return "tessere";
	}
	
	@GetMapping("/{id}")
	public String findById(@PathVariable Integer id, Model model) {
		Persona t = personaServiceImpl.getObjectById(id);
		model.addAttribute("persona", t);
		return "tessera-dettaglio";
	}
	
	@GetMapping
	public void createForm(Model model) {
		model.addAttribute("tessera", new TesseraElettorale());
		model.addAttribute("persona", personaServiceImpl.getAllObject());
		model.addAttribute("seggio", seggioServiceImpl.getAllObject());
		return;
	}
}
