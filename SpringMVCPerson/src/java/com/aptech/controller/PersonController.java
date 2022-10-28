/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aptech.controller;

import com.aptech.entity.Person;
import com.aptech.repository.PersonRepository;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Admin
 */
@Controller
public class PersonController {
    @Autowired
    private PersonRepository personRepository;
    
    @GetMapping(value = "/listperson")
    public ModelAndView findAllPersons(ModelAndView model) throws IOException {
        List<Person> persons = personRepository.findAll();
        model.addObject("persons", persons);
        model.setViewName("view-persons");
        
        return model;
    }
    
}
