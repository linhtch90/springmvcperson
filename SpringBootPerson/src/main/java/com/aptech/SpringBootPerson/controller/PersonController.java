package com.aptech.SpringBootPerson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aptech.SpringBootPerson.entity.Person;
import com.aptech.SpringBootPerson.repository.PersonRepository;
import com.aptech.SpringBootPerson.service.PersonService;

@Controller
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/")
    public String findAll(Model model) {
        model.addAttribute("persons", personService.findAll());
        return "index";
    }

    @GetMapping("/addform")
    public String addPersonForm(Person person) {
        return "addform";
    }

    @PostMapping("/addperson")
    public String addPerson(Person person, Model model) {
        personService.save(person);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deletePerson(@PathVariable("id") int id, Model model) {
        personService.delete(id);

        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable("id") int id, Model model) {
        Person person = personService.findById(id);
        model.addAttribute("person", person);

        return "editform";
    }

    @PostMapping("/update/{id}")
    public String editPerson(@PathVariable("id") int id, Person person, Model model) {
        personService.save(person);

        return "redirect:/";
    }

}
