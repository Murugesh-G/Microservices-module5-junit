package com.edureka.springboot.tutorial.basics.example.aop.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edureka.springboot.tutorial.basics.example.aop.data.Dao1;

@Service
public class Business1 {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Dao1 dao1;

    public String calculateSomething(){
        //Business Logic
        String value = dao1.retrieveSomething();
        logger.info("In Business - {}", value);
        return value;
    }
}