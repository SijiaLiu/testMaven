package com.lsj.controller;

import com.lsj.Entity.Person;
import com.lsj.dao.PersonRepository;
import com.lsj.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by liusijia on 2017/9/22.
 */
@RestController
@EnableAutoConfiguration
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    IPersonService iPersonService;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<Person> getPersonList(){
        return personRepository.findAll();
    }

    @RequestMapping(value = "/person/{_id}", method = RequestMethod.GET)
    public Person findPersonById(@PathVariable("_id") Integer _id){
        return personRepository.findOne(_id);
    }

    @RequestMapping(value = "/person/add", method = RequestMethod.POST)
    public Person addPerson(@Valid Person person, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        person.setName(person.getName());
        person.setAge(person.getAge());
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

    @RequestMapping(value = "/person/age/{_age}", method = RequestMethod.GET)
    public List<Person> getPersonByAge(@PathVariable("_age") Integer _age){
        return personRepository.findPersonByAge(_age);
    }

    @RequestMapping(value = "/person/addTwo", method = RequestMethod.POST)
    public void addTwo(){
        iPersonService.insertTwo();
    }
}
