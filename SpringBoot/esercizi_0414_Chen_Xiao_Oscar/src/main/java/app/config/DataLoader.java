package app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import app.model.Fumetteria;
import app.model.Manga;
import app.service.FumetteriaServiceImpl;
import app.service.MangaServiceImpl;

@Configuration
public class DataLoader {

	@Bean
	CommandLineRunner initDatabase(FumetteriaServiceImpl fumetteriaService, MangaServiceImpl mangaService) {

		return args -> {

			if (!fumetteriaService.getAllObject().isEmpty() || !mangaService.getAllObject().isEmpty()) {
				return;
			}

			Fumetteria f1 = new Fumetteria();
			f1.setNome("Otaku World");
			f1.setIndirizzo("Via Sakura 12, Milano");
			fumetteriaService.saveObject(f1);

			mangaService.saveObject(new Manga("Naruto", "Kishimoto", 5.50, f1));
			mangaService.saveObject(new Manga("One Piece", "Oda", 6.00, f1));
			mangaService.saveObject(new Manga("Bleach", "Kubo", 5.00, f1));
			mangaService.saveObject(new Manga("Attack on Titan", "Isayama", 7.00, f1));
			mangaService.saveObject(new Manga("Death Note", "Ohba", 6.50, f1));

			Fumetteria f2 = new Fumetteria();
			f2.setNome("Manga Paradise");
			f2.setIndirizzo("Corso Tokyo 45, Roma");
			fumetteriaService.saveObject(f2);

			mangaService.saveObject(new Manga("Demon Slayer", "Gotouge", 6.00, f2));
			mangaService.saveObject(new Manga("Jujutsu Kaisen", "Akutami", 6.50, f2));
			mangaService.saveObject(new Manga("Chainsaw Man", "Fujimoto", 7.00, f2));
			mangaService.saveObject(new Manga("Spy x Family", "Endo", 6.00, f2));
			mangaService.saveObject(new Manga("Tokyo Ghoul", "Ishida", 6.50, f2));

			Fumetteria f3 = new Fumetteria();
			f3.setNome("Anime Planet");
			f3.setIndirizzo("Via Kyoto 8, Torino");
			fumetteriaService.saveObject(f3);

			mangaService.saveObject(new Manga("Fullmetal Alchemist", "Arakawa", 7.50, f3));
			mangaService.saveObject(new Manga("Hunter x Hunter", "Togashi", 6.00, f3));
			mangaService.saveObject(new Manga("Dragon Ball", "Toriyama", 5.50, f3));
			mangaService.saveObject(new Manga("My Hero Academia", "Horikoshi", 6.50, f3));
			mangaService.saveObject(new Manga("Black Clover", "Tabata", 6.00, f3));

			Fumetteria f4 = new Fumetteria();
			f4.setNome("Nippon Comics");
			f4.setIndirizzo("Via Osaka 22, Bologna");
			fumetteriaService.saveObject(f4);

			mangaService.saveObject(new Manga("One Punch Man", "ONE", 6.00, f4));
			mangaService.saveObject(new Manga("Mob Psycho 100", "ONE", 6.50, f4));
			mangaService.saveObject(new Manga("Vinland Saga", "Yukimura", 7.50, f4));
			mangaService.saveObject(new Manga("Berserk", "Miura", 8.00, f4));
			mangaService.saveObject(new Manga("Claymore", "Yagi", 6.50, f4));

			
			Fumetteria f5 = new Fumetteria();
			f5.setNome("Tokyo Store");
			f5.setIndirizzo("Piazza Anime 3, Firenze");
			fumetteriaService.saveObject(f5);

			mangaService.saveObject(new Manga("Fairy Tail", "Mashima", 6.00, f5));
			mangaService.saveObject(new Manga("Blue Lock", "Kaneshiro", 7.00, f5));
			mangaService.saveObject(new Manga("Haikyuu!!", "Furudate", 6.50, f5));
			mangaService.saveObject(new Manga("Dr. Stone", "Inagaki", 6.50, f5));
			mangaService.saveObject(new Manga("The Promised Neverland", "Shirai", 7.00, f5));
		};
	}
}
