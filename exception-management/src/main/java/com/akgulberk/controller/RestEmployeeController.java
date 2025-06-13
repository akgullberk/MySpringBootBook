package com.akgulberk.controller;

import com.akgulberk.dto.DtoEmployee;
import com.akgulberk.model.RootEntity;

public interface RestEmployeeController {

    public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
