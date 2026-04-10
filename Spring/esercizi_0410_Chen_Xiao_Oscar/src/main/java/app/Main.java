package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.beans.*;
import app.configuration.Config;

public class Main {

	public static void main(String[] args) {

		System.out.println("pre - start");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println("post - start");

		Automobile autoElettrica = context.getBean("autoElettrica", Automobile.class);
		autoElettrica.stampaDettagli();
		Automobile autoBenzina = context.getBean("autoBenzina", Automobile.class);
		autoBenzina.stampaDettagli();
		Automobile autoDiesel = context.getBean("autoDiesel", Automobile.class);
		autoDiesel.stampaDettagli();

		System.out.println("pre - close");
		context.close();
		System.out.println("post - start");
	}

}
