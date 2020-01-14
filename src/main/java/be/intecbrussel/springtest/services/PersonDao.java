package be.intecbrussel.springtest.services;

import be.intecbrussel.springtest.services.implementaties.Person;

import java.util.List;

public interface PersonDao {

    boolean createPerson(Person person);
    Person readPerson(int id);
    boolean updatePerson(Person person);
    boolean deletePerson(Person person);
    Person readAll(List<Person> allPersons);
}
