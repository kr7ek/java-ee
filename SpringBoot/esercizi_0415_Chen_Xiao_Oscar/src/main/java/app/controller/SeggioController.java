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
@RequestMapping("/seggi")
public class SeggioController {

	@Autowired
	private SeggioServiceImpl seggioService;
	
	@GetMapping
	public String getAll(Model model) {
		model.addAttribute("seggi", seggioService.getAllObject());
		return "seggi";
	}
	
	@GetMapping("/create")
	public String createForm(Model model) {
		model.addAttribute("seggio", new Seggio());
		return "seggio-form";
	}
	
	public String save(Seggio seggio) {
		seggioService.saveObject(seggio);
		return "redirect:/seggi";
	}
	
	@GetMapping("/{id}")
	public String dettaglio(@PathVariable String id, Model model) {
		Seggio s = seggioService.getObjectById(id);
		model.addAttribute("seggio", s);
		return "seggio-dettaglio";
	}
}
