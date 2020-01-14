package be.intecbrussel.springtest;

import be.intecbrussel.springtest.services.PersonDao;
import be.intecbrussel.springtest.services.PersonService;
import be.intecbrussel.springtest.services.implementaties.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.time.LocalDate;


public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                new AnnotationConfigApplicationContext(PersonConfiguration.class);
        ctx.getBean("mockService", PersonService.class);

        Person max = new Person();
        max.setFirstName("Max");
        max.setDateOfBirth(LocalDate.of(1990, 7, 11));

        Person tom = new Person();
        tom.setFirstName("Tom");
        tom.setDateOfBirth(LocalDate.of(1990,5,15));

        Person bart = new Person();
        bart.setFirstName("Bart");




        ctx.close();


    }
}
