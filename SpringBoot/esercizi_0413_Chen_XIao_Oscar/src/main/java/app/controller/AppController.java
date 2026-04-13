package app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/params")
public class AppController {
	
	private static final Logger logger = LoggerFactory.getLogger(AppController.class);

	// Qui mi suggeriscono di usare GetMapping invece di RequestMapping
	
    // Visualizza un testo a piacere
    @GetMapping("/testo")
    public String testo(Model model) {
    	logger.info("Visualizza un testo di prova");
        model.addAttribute("messaggio", "Ciao! Questo è un testo di prova.");
        return "index";
    }

    // Nome prodotto venduto
    @GetMapping("/prodotto")
    public String prodotto(@RequestParam String nome, Model model) {
    	logger.info("Visualizza il nome del prodotto venduto: " + nome);
        model.addAttribute("risultato", "Prodotto venduto: " + nome);
        return "index";
    }

    // Quantità prodotti venduti
    @GetMapping("/quantita")
    public String quantita(@RequestParam int qta, Model model) {
    	logger.info("Visualizza la quantità di prodotti venduti: " + qta);
        model.addAttribute("risultato", "Quantità venduta: " + qta);
        return "index";
    }

    // Prezzo + descrizione (RequestParam + PathVariable)
    @GetMapping("/dettagli/{descrizione}")
    public String dettagli(@PathVariable String descrizione,
                           @RequestParam double prezzo,
                           Model model) {
		logger.info("Visualizza i dettagli del prodotto: " + descrizione + " - Prezzo: " + prezzo + "€");
        model.addAttribute("risultato",
                "Prodotto: " + descrizione + " - Prezzo: " + prezzo + "€");

        return "index";
    }

    // 5. Nome cliente + prodotto (doppio RequestParam)
    @GetMapping("/cliente")
    public String cliente(@RequestParam String nomeCliente,
                          @RequestParam String prodotto,
                          Model model) {
		logger.info("Visualizza il cliente: " + nomeCliente + " ha acquistato: " + prodotto);
        model.addAttribute("risultato",
                "Cliente: " + nomeCliente + " ha acquistato: " + prodotto);

        return "index";
    }
}