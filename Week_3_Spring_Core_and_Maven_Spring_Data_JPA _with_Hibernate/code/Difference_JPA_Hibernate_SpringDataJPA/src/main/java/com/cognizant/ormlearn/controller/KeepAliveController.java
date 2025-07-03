// src/main/java/com/cognizant/ormlearn/controller/KeepAliveController.java
package com.cognizant.ormlearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeepAliveController {

    @GetMapping("/")
    public String keepAlive() {
        return "App is running!";
    }
}
