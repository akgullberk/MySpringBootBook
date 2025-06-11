package com.akgulberk.controller;

import com.akgulberk.dto.DtoEmployee;
import java.util.List;

public interface IEmployeeController {

    public List<DtoEmployee> findAllEmployees();
}
