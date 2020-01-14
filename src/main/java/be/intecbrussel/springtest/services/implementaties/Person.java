package be.intecbrussel.springtest.services.implementaties;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Objects;


public class Person {
    private String lastName;
    private LocalDate dateOfBirth;
    private int id;
    private String firstName;


    public Person() {


    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, dateOfBirth, id, firstName);
    }

    @Override
    public String toString() {
        return "Person{ dateOfBirth=" + dateOfBirth +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
