package com.lsj.service.impl;

import com.lsj.Entity.Person;
import com.lsj.dao.PersonRepository;
import com.lsj.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by liusijia on 2017/9/22.
 */
@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    @Transactional
    public void insertTwo() {

        Person personA = new Person();
        personA.setName("刘斯佳");
        personA.setAge(21);
        personRepository.save(personA);

        System.out.println(1/0);

        Person personB = new Person();
        personB.setName("栗子");
        personB.setAge(2);
        personRepository.save(personB);
    }
}
