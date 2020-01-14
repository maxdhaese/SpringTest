package be.intecbrussel.springtest.services.implementaties;

import be.intecbrussel.springtest.services.PersonDao;
import be.intecbrussel.springtest.services.PersonService;


import java.util.ArrayList;
import java.util.List;


public class PersonServiceImpl implements PersonService {
    public PersonDao personDao;
    private List<Person> allPersons = new ArrayList<>();

    @Override
    public Person getPerson(int id) {
        for (Person person :allPersons) {
            if (person.getId() == id)
                return person;

        }
        return null;
    }



    @Override
    public void addPerson(Person person) {
        allPersons.add(person);
        System.out.println("Person added");
    }

    @Override
    public void addPersons(List<Person> allPersons) {

    }

    @Override
    public void setAllPersons(List<Person> allPersons) {
        this.allPersons = allPersons;

    }
}
