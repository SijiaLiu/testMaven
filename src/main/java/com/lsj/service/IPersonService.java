package com.lsj.service;


import com.lsj.Entity.Person;

/**
 * Created by liusijia on 2017/9/22.
 */
public interface IPersonService {

    public void insertTwo();

    public void getAge(Integer _id) throws Exception;

    public Person findOne(Integer _id);
}
