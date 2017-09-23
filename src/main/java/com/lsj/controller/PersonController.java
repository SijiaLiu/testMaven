package com.lsj.controller;

import com.lsj.Entity.Person;
import com.lsj.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by liusijia on 2017/9/22.
 */
@RestController
@EnableAutoConfiguration
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<Person> getPersonList(){
        return personRepository.findAll();
    }

    @RequestMapping(value = "/person/{_id}", method = RequestMethod.GET)
    public Person findPersonById(@PathVariable("_id") Integer _id){
        return personRepository.findOne(_id);
    }

    @RequestMapping(value = "/person/add", method = RequestMethod.POST)
    public Person addPerson(@RequestParam("_name") String _name, @RequestParam("_age") Integer _age){
        Person person = new Person();
        person.setName(_name);
        person.setAge(_age);
        return personRepository.save(person);
    }

    @RequestMapping(value = "/person/del/{_id}", method = RequestMethod.DELETE)
    public void delPerson(@PathVariable("_id") Integer _id){
        personRepository.delete(_id);
    }

    @RequestMapping(value = "/person/update/{_id}", method = RequestMethod.PUT)
    public Person updatePerson(@PathVariable("_id") Integer _id,
                             @RequestParam("_name") String _name,
                             @RequestParam("_age") Integer _age){
        Person person = new Person();
        person.setId(_id);
        person.setName(_name);
        person.setAge(_age);
        return personRepository.save(person);
    }
}
