package com.cognizant.spring_learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.AuthResponse;

@Service
public class CountryService {

    @Autowired
    private ApplicationContext context;

    public AuthResponse getCountry(String code) {
        List<AuthResponse> countries = (List<AuthResponse>) context.getBean("countryList");

        return countries.stream()
            .filter(c -> c.getCode().equalsIgnoreCase(code))
            .findFirst()
            .orElse(null);
    }
}
