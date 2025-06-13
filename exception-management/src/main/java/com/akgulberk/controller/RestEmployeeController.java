package com.akgulberk.controller;

import com.akgulberk.dto.DtoEmployee;

public interface RestEmployeeController {

    public DtoEmployee findEmployeeById(Long id);
}
