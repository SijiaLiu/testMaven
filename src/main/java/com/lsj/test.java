package com.lsj;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liusijia on 2017/9/18.
 */
@RestController
@EnableAutoConfiguration
public class test {

    @RequestMapping("/hello")
    public String hello(){
        return "hello SprintBoot";
    }

    @RequestMapping("/word/{name}")
    public String word(@PathVariable String name){
        return "SoringBoot:"+name;
    }
}
