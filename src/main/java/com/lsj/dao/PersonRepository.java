package com.lsj.dao;

import com.lsj.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by liusijia on 2017/9/22.
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
