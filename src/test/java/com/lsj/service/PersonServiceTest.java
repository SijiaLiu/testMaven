package com.lsj.service;

import com.lsj.Entity.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by liusijia on 2017/9/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceTest {

    @Autowired
    private IPersonService iPersonService;


    @Test
    public void getAgeById(){
        Person person = iPersonService.findOne(12);
        Assert.assertEquals(new Integer(23), person.getAge());
    }
}
