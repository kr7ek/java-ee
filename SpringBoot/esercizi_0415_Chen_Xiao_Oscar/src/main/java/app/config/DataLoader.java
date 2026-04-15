package app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import app.model.*;
import app.service.*;

@Configuration
public class DataLoader {

	@Bean
	CommandLineRunner initDatabase(PersonaServiceImpl personaService, SeggioServiceImpl seggioService, TesseraElettoraleServiceImpl tesseraElettoraleService) {

		return args -> {

			if (!seggioService.getAllObject().isEmpty() || !tesseraElettoraleService.getAllObject().isEmpty()) {
				return;
			}
			
			Seggio s1 = new Seggio("0001", "Scuola Elementare Rossi", "Milano", "MI", "Lombardia");
			seggioService.saveObject(s1);

			Persona p1 = new Persona("Mario", "Rossi", "ABCDEF123456");
			p1.setSeggio(s1);
			personaService.saveObject(p1);
			Persona p2 = new Persona("Luigi", "Bianchi", "GHIJKL789012");
			p2.setSeggio(s1);
			personaService.saveObject(p2);
			Persona p3 = new Persona("Giulia", "Verdi", "MNOPQR345678");
			p3.setSeggio(s1);
			personaService.saveObject(p3);
			Persona p4 = new Persona("Francesca", "Neri", "STUVWX901234");
			p4.setSeggio(s1);
			personaService.saveObject(p4);
			Persona p5 = new Persona("Alessandro", "Gialli", "YZABCD567890");
			p5.setSeggio(s1);
			personaService.saveObject(p5);
			
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA000", "31/12/2030", p1, seggioService.getAllObject().get(0)));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA001", "31/12/2030", p2, seggioService.getAllObject().get(0)));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA002", "31/12/2030", p3, seggioService.getAllObject().get(0)));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA003", "31/12/2030", p4, seggioService.getAllObject().get(0)));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA004", "31/12/2030", p5, seggioService.getAllObject().get(0)));
			
			Seggio s2 = new Seggio("0002", "Scuola Elementare Bianchi", "Roma", "RM", "Lazio");
			seggioService.saveObject(s2);
			
			Persona p6 = new Persona("Federica", "Rossi", "CDEFGH123456");
			p6.setSeggio(s2);
			personaService.saveObject(p6);
			Persona p7 = new Persona("Matteo", "Bianchi", "IJKLMN789012");
			p7.setSeggio(s2);
			personaService.saveObject(p7);
			Persona p8 = new Persona("Sara", "Verdi", "OPQRST345678");
			p8.setSeggio(s2);
			personaService.saveObject(p8);
			Persona p9 = new Persona("Luca", "Neri", "UVWXYZ901234");
			p9.setSeggio(s2);
			personaService.saveObject(p9);
			Persona p10 = new Persona("Giovanni", "Gialli", "ZABCDE567890");
			p10.setSeggio(s2);
			personaService.saveObject(p10);
			
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA005", "31/12/2030", p6, s2));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA006", "31/12/2030", p7, s2));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA007", "31/12/2030", p8, s2));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA008", "31/12/2030", p9, s2));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA009", "31/12/2030", p10, s2));
			
			Seggio s3 = new Seggio("0003", "Scuola Elementare Verdi", "Torino", "TO", "Piemonte");
			seggioService.saveObject(s3);
			
			Persona p11 = new Persona("Elena", "Rossi", "DEFGHI123456");
			p11.setSeggio(s3);
			personaService.saveObject(p11);
			Persona p12 = new Persona("Andrea", "Bianchi", "JKLMNO789012");
			p12.setSeggio(s3);
			personaService.saveObject(p12);
			Persona p13 = new Persona("Martina", "Verdi", "PQRSTU345678");
			p13.setSeggio(s3);
			personaService.saveObject(p13);
			Persona p14 = new Persona("Simone", "Neri", "VWXYZ901234");
			p14.setSeggio(s3);
			personaService.saveObject(p14);
			Persona p15 = new Persona("Francesco", "Gialli", "ZABCDEF567890");
			p15.setSeggio(s3);
			personaService.saveObject(p15);
			
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA010", "31/12/2030", p11, s3));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA011", "31/12/2030", p12, s3));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA012", "31/12/2030", p13, s3));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA013", "31/12/2030", p14, s3));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA014", "31/12/2030", p15, s3));
			
			Seggio s4 = new Seggio("0004","Scuola Elementare Neri", "Bologna", "BO", "Emilia-Romagna");
			seggioService.saveObject(s4);
			
			Persona p16 = new Persona("Valentina", "Rossi", "EFGHIJ123456");
			p16.setSeggio(s4);
			personaService.saveObject(p16);
			Persona p17 = new Persona("Gabriele", "Bianchi", "KLMNOP789012");
			p17.setSeggio(s4);
			personaService.saveObject(p17);
			Persona p18 = new Persona("Chiara", "Verdi", "QRSTUV345678");
			p18.setSeggio(s4);
			personaService.saveObject(p18);
			Persona p19 = new Persona("Davide", "Neri", "WXYZ901234");
			p19.setSeggio(s4);
			personaService.saveObject(p19);
			Persona p20 = new Persona("Simona", "Gialli", "ZABCDEFG567890");
			p20.setSeggio(s4);
			personaService.saveObject(p20);
			
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA015", "31/12/2030", p16, s4));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA016", "31/12/2030", p17, s4));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA017", "31/12/2030", p18, s4));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA018", "31/12/2030", p19, s4));
			tesseraElettoraleService.saveObject(new TesseraElettorale("TESSERA019", "31/12/2030", p20, s4));
		};
	}
}
