package be.intecbrussel.springtest.services.implementaties;

import be.intecbrussel.springtest.services.PersonDao;
import be.intecbrussel.springtest.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class PersonServiceImpl implements PersonService {
    public PersonDao personDao = new PersonDaoImpl();
    private List<Person> allPersons = new ArrayList<>();
    @Autowired
    private Logger logger;

    @Override
    public Person getPerson(int id) {
        Person found = new Person();
        for (Person allPerson : allPersons) {
            if (allPerson.getId() == id )
                found = allPerson;

        }
        return found;
    }


    @Override
    public void addPerson(Person person) {
        if (person != null) {
            person.setId(allPersons.size() + 1);
            allPersons.add(person);
            personDao.createPerson(person);

            logger.info("Person with id: " + person.getId() + " added");
        } else {
            logger.info("object does not exist");
        }


    }

    @Override
    public void addPersons(List<Person> personList) {
        for (Person person : personList) {
            person.setId(allPersons.size() + 1);
            logger.info("Person with id: " + person.getId() + " added");
            allPersons.add(person);
            personDao.createPerson(person);

        }

    }

    @Override
    public void setAllPersons(List<Person> allPersons) {
        this.allPersons = allPersons;

    }

    public void printAllPersons() {
        allPersons.forEach(System.out::println);
    }


}
