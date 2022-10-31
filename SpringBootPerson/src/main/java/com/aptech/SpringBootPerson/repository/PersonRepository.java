package com.aptech.SpringBootPerson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aptech.SpringBootPerson.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
