package com.akgulberk.controller.impl;

import com.akgulberk.controller.RestEmployeeController;
import com.akgulberk.dto.DtoEmployee;
import com.akgulberk.model.RootEntity;
import com.akgulberk.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.akgulberk.model.RootEntity.ok;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl implements RestEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/list/{id}")
    @Override
    public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(name = "id") Long id) {
        return ok(employeeService.findEmployeeById(id));
    }
}
