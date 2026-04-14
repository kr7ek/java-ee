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

import app.model.Manga;
import app.service.FumetteriaServiceImpl;
import app.service.MangaServiceImpl;

@Controller
@RequestMapping("/manga")
public class MangaController {

	private static final Logger logger = LoggerFactory.getLogger(MangaController.class);
	
	@Autowired
	private MangaServiceImpl mangaServiceImpl;
	
	@Autowired
	private FumetteriaServiceImpl fumetteriaServiceImpl;
	
	@GetMapping
    public String getAll(Model model) {
        model.addAttribute("manga", mangaServiceImpl.getAllObject());
        return "manga";
    }

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("manga", new Manga());
        model.addAttribute("fumetterie", fumetteriaServiceImpl.getAllObject());
        return "manga-form";
    }

    @PostMapping
    public String save(@ModelAttribute Manga manga) {
        mangaServiceImpl.saveObject(manga);
        return "redirect:/manga";
    }
}
