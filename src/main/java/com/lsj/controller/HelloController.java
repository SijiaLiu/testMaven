package com.lsj.controller;

/**
 * Created by liusijia on 2017/9/22.
 */

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello SpringBoot";
    }

    @RequestMapping("/word/{name}")
    public String word(@PathVariable String name){
        return "SoringBoot:"+name;
    }
}