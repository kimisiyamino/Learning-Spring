package com.eleonoralion.spring.dao;

import com.eleonoralion.spring.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private static int ID;
    private List<Person> people;

    public PersonDAO(){
        people = new ArrayList<>();
        people.add(new Person(++ID, "Tom"));
        people.add(new Person(++ID, "Kate"));
        people.add(new Person(++ID, "Bob"));
        people.add(new Person(++ID, "Ann"));
        people.add(new Person(++ID, "Jack"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person){
        person.setId(++ID);
        people.add(person);
    }

    public void update(int id, Person updatedPerson){
        Person oldPerson = show(id);
        oldPerson.setName(updatedPerson.getName());
    }

    public void delete(int id){
        //people.remove(show(id));
        people.removeIf(person -> person.getId() == id);
    }
}


