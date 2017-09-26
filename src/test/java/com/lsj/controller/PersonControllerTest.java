package com.lsj.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

/**
 * Created by liusijia on 2017/9/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PersonControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getPersonList() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/person"))
                .andExpect(MockMvcResultMatchers.status().isOk());
//        .andDo(MockMvcResultHandlers.print())
//                .andReturn();
//                .andExpect(MockMvcResultMatchers.content().string("abc"));
    }

}