package com.lsj.service.impl;

import com.lsj.Entity.Person;
import com.lsj.dao.PersonRepository;
import com.lsj.enums.ResultEnum;
import com.lsj.exception.PersonException;
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
    //事务管理
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

    @Override
    //统一异常处理
    public void getAge(Integer _id) throws Exception {
        Person person = personRepository.findOne(_id);
        Integer age = person.getAge();
        if (age <= 10){
            throw new PersonException(ResultEnum.PRIMARY_SCHOOL);
        }else if (age > 10 && age <= 16){
            throw new PersonException(ResultEnum.MIDDLE_SCHOOL);
        }
//        else {
//            throw new PersonException(ResultEnum.UNKNOWN_ERROR);
//        }
    }
}
