package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class EmployeeCommandLineRunner implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void run(String... args) throws Exception {
        Employee emp1 = new Employee("John Doe", 50000);
        Employee emp2 = new Employee("Jane Smith", 60000);

        employeeService.addEmployee(emp1);
        employeeService.addEmployee(emp2);

        System.out.println("Employees added.");
    }
}
