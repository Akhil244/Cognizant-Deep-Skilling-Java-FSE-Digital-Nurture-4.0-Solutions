package com.cognizant.spring_learn.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.AuthResponse;

@RestController
public class CountryController {

    @RequestMapping("/country")
    public AuthResponse getCountryIndia() {
        // Load context from country.xml in resources
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        AuthResponse country = (AuthResponse) context.getBean("in");
        context.close();
        return country;
    }
}
