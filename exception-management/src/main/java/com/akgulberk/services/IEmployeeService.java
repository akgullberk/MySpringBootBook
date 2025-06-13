package com.akgulberk.services;

import com.akgulberk.dto.DtoEmployee;
import com.akgulberk.model.Employee;

public interface IEmployeeService {

    public DtoEmployee findEmployeeById(Long id);
}
