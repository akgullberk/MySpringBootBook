package com.akgulberk.services;

import com.akgulberk.dto.DtoEmployee;
import com.akgulberk.entities.Employee;

import java.util.List;

public interface IEmployeeService {

    public List<DtoEmployee> findAllEmployees();
}
