/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aptech.repository;

import com.aptech.entity.Person;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Admin
 */
public class PersonRepositoryImpl implements PersonRepository {

    private JdbcTemplate jdbcTemplate;

    public PersonRepositoryImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Person> findAll() {
        String sql = "SELECT * FROM person";

        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Person.class));
    }

}
