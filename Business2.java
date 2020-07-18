package com.edureka.springboot.tutorial.basics.example.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edureka.springboot.tutorial.basics.example.aop.data.Dao2;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomething(){
        //Business Logic
        return dao2.retrieveSomething();
    }
}