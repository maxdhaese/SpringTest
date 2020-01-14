package be.intecbrussel.springtest;

import be.intecbrussel.springtest.services.PersonDao;
import be.intecbrussel.springtest.services.PersonService;
import be.intecbrussel.springtest.services.implementaties.Person;
import be.intecbrussel.springtest.services.implementaties.PersonDaoImpl;
import be.intecbrussel.springtest.services.implementaties.PersonServiceImpl;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class PersonConfiguration {

    @Bean
    @Scope("prototype")
    public Person person() {
        return new Person();
    }


    @Bean(name = "mockDao")
    @Lazy
    public PersonDao mockDao() {
        PersonDaoImpl cs = new PersonDaoImpl();
        cs.createPerson(person());
        return cs;

    }

    @Bean(name = "mockService")
    public PersonService mockService() {
        PersonServiceImpl ps = new PersonServiceImpl();
        return ps;

    }


}
