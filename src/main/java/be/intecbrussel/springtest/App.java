package be.intecbrussel.springtest;

import be.intecbrussel.springtest.services.PersonService;
import be.intecbrussel.springtest.services.implementaties.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        ConfigurableApplicationContext ctx =
                new AnnotationConfigApplicationContext(PersonConfiguration.class);
        System.out.println("container initialized");


        Person max = new Person();
        max.setFirstName("Max");
        max.setDateOfBirth(LocalDate.of(1990, 7, 11));

        Person tom = new Person();
        tom.setFirstName("Tom");
        tom.setDateOfBirth(LocalDate.of(1990,5,15));

        Person bart = new Person();
        bart.setFirstName("Bart");
        bart.setDateOfBirth(LocalDate.of(1987,4,12));

        Person dirk = new Person();
        dirk.setFirstName("Dirk");
        dirk.setDateOfBirth(LocalDate.of(1984,12,30));

        personList.add(tom);
        personList.add(bart);
        personList.add(dirk);

        PersonService mockservice = ctx.getBean("mockService", PersonService.class);
        mockservice.addPerson(max);
        mockservice.addPersons(personList);
        mockservice.printAllPersons();

        System.out.println("Person with id = 2 : " + mockservice.getPerson(2));








        ctx.close();


    }
}
