package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import app.beans.Smartphone;

/*
 * Realizzare un progetto Spring che astragga il concetto di Smartphone e il concetto di Batteria, 
 * tenendo presente che uno smartphone è composto da una batteria.
 * Implementare tale progetto tramitel’annotazione @Component.
 */

@ComponentScan("app")
public class Main {

	public static void main(String[] args) {

		System.out.println("Pre-start");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		System.out.println("Post-start");
		
		Smartphone s1 = context.getBean(Smartphone.class);
		s1.setMarca("Samsung Galaxy S23 Ultra");
		s1.setModello("S23 Ultra");
		s1.getBatteria().setCapacita(5000);
		
		System.out.println(s1);
		
		System.out.println("Pre-close");
		context.close();
		System.out.println("Post-close");

	}

}
