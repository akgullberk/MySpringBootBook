package com.akgulberk.config;

import com.akgulberk.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "Berk", "Akgül"));
        employeeList.add(new Employee("1","Efe","Akgül"));
        employeeList.add(new Employee("3","Samet","Akgül"));
        employeeList.add(new Employee("4","Yasin","Akgül"));

        return employeeList;
    }
}
