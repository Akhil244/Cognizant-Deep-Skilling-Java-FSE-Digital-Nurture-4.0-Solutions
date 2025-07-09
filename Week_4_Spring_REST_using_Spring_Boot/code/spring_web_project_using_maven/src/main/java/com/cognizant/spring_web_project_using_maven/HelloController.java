package com.cognizant.spring_web_project_using_maven;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Spring Boot is running successfully!";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Hello from /greet endpoint!";
    }
}