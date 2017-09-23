package com.lsj.dao;

import com.lsj.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liusijia on 2017/9/22.
 */
@Component
public interface PersonRepository extends JpaRepository<Person, Integer> {

    public List<Person> findPersonByAge(Integer _age);
}
