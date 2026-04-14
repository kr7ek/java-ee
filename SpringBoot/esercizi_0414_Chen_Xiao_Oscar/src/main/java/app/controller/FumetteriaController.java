package app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import app.model.Fumetteria;
import app.service.FumetteriaServiceImpl;

@Controller
@RequestMapping("/fumetterie")
public class FumetteriaController {

	private static final Logger logger = LoggerFactory.getLogger(FumetteriaController.class);
	
	@Autowired
	private FumetteriaServiceImpl fumetteriaServiceImpl;
	
    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("fumetterie", fumetteriaServiceImpl.getAllObject());
        return "fumetterie";
    }

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("fumetteria", new Fumetteria());
        return "fumetteria-form";
    }

    @PostMapping
    public String save(@ModelAttribute Fumetteria fumetteria) {
        fumetteriaServiceImpl.saveObject(fumetteria);
        return "redirect:/fumetterie";
    }
}
