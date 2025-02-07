package be.intecbrussel.springtest.services.implementaties;

import be.intecbrussel.springtest.services.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class PersonDaoImpl implements PersonDao {

    private List<Person> personDB = new ArrayList<>();
    @Autowired
    private Logger logger;


    @Override
    public boolean createPerson(Person person) {
        personDB.add(person);

        return false;
    }

    @Override
    public Person readPerson(int id) {
        return personDB.get(id);
    }

    @Override
    public boolean updatePerson(Person person) {
        return false;
    }

    @Override
    public boolean deletePerson(Person person) {
        for (Person p :personDB) {
            personDB.remove(person);

        }
        return false;
    }

    @Override
    public void readAll(List<Person> personDB) {
      personDB.forEach(System.out::println);
    }
}
