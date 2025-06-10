package com.akgulberk.services;

import com.akgulberk.dto.DtoCustomer;

public interface ICustomerService {

    public DtoCustomer findCustomerById(Long id);
}
