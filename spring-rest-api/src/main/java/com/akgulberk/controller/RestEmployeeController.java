package com.akgulberk.controller;

import com.akgulberk.model.Employee;
import com.akgulberk.model.UpdateEmployeeRequest;
import com.akgulberk.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/list")
    public List<Employee> getAllEmployeeList() {
        return employeeService.getAllEmployeeList();
    }

    @GetMapping(path = "/list/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id") String id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping(path = "/with-params")
    public List<Employee> getEmployeeWithParams(
            @RequestParam(name = "firstName",required = false) String firstName,
            @RequestParam(name = "lastName",required = false) String lastName)
    {
        return employeeService.getEmployeeWithParams(firstName,lastName);
    }

    @PostMapping("/save-employee")
    public Employee saveEmployee(@RequestBody Employee newEmployee) {
        return employeeService.saveEmployee(newEmployee);
    }

    @DeleteMapping("/delete-employee/{id}")
    public boolean deleteEmployee(@PathVariable(name = "id") String id) {
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/update-employee/{id}")
    public Employee updateEmployee(
            @PathVariable(name = "id") String id,
            @RequestBody UpdateEmployeeRequest request
    ) {
        return employeeService.updateEmployee(id, request);
    }
}
