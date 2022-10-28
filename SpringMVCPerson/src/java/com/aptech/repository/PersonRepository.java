/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aptech.repository;

import com.aptech.entity.Person;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PersonRepository {
    public List<Person> findAll();
}
