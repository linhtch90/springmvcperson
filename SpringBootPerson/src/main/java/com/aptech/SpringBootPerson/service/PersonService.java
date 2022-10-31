package com.aptech.SpringBootPerson.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aptech.SpringBootPerson.entity.Person;
import com.aptech.SpringBootPerson.repository.PersonRepository;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findById(int id) {
        return personRepository.findById(id).get();
    }

    public void save(Person person) {
        personRepository.save(person);
    }

    public void delete(int id) {
        personRepository.deleteById(id);
    }
}
