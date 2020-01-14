package be.intecbrussel.springtest.services.implementaties;

import be.intecbrussel.springtest.services.PersonDao;
import be.intecbrussel.springtest.services.PersonService;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class PersonServiceImpl implements PersonService {
    public PersonDao personDao = new PersonDaoImpl();
    private List<Person> allPersons = new ArrayList<>();
    private Logger logger;

    @Override
    public Person getPerson(int id) {
        return allPersons.get(id);

        }



    @Override
    public void addPerson(Person person) {
        person.setId(allPersons.size() + 1);
        allPersons.add(person);
        personDao.createPerson(person);
        System.out.println("person added");


    }

    @Override
    public void addPersons(List<Person> personList) {
        for (Person person : personList) {
            person.setId(allPersons.size() + 1);
            allPersons.add(person);

        }

        System.out.println("personList added");


    }

    @Override
    public void setAllPersons(List<Person> allPersons) {
        this.allPersons = allPersons;

    }

    public void printAllPersons() {
        allPersons.forEach(System.out::println);
    }


}
