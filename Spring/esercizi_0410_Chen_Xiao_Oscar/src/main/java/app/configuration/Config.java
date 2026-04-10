package app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import app.beans.*;

@Configuration
public class Config {

    @Bean
    public Motore motoreElettrico() {
        return new MotoreElettrico();
    }

    @Bean
    public Motore motoreBenzina() {
        return new MotoreBenzina();
    }

    @Bean
    public Motore motoreDiesel() {
        return new MotoreDiesel();
    }


    @Bean
    public Automobile autoElettrica() {
        return new Automobile(motoreElettrico());
    }

    @Bean
    public Automobile autoBenzina() {
        return new Automobile(motoreBenzina());
    }

    @Bean
    public Automobile autoDiesel() {
        return new Automobile(motoreDiesel());
    }
}
