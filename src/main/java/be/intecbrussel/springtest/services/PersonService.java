package be.intecbrussel.springtest.services;

import be.intecbrussel.springtest.services.implementaties.Person;

import java.util.List;

public interface PersonService {

    public Person getPerson(int id);
    public void addPerson(Person person);
    public void addPersons(List<Person> allPersons);
    public void setAllPersons(List<Person> allPersons);



}
