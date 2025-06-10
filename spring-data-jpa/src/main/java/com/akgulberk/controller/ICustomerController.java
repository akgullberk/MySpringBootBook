package com.akgulberk.controller;

import com.akgulberk.dto.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer findCustomerById(Long id);
}
