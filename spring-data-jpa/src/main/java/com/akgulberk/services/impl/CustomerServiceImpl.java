package com.akgulberk.services.impl;

import com.akgulberk.dto.DtoAddress;
import com.akgulberk.dto.DtoCustomer;
import com.akgulberk.entities.Address;
import com.akgulberk.entities.Customer;
import com.akgulberk.repository.CustomerRepository;
import com.akgulberk.services.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public DtoCustomer findCustomerById(Long id)    {

        DtoCustomer dtoCustomer = new DtoCustomer();
        DtoAddress dtoAddress = new DtoAddress();

        Optional<Customer> optional = customerRepository.findById(id);
        if(optional.isEmpty()){
            return null;
        }
        Customer customer = optional.get();
        Address address = customer.getAddress();

        BeanUtils.copyProperties(customer, dtoCustomer);
        BeanUtils.copyProperties(address, dtoAddress);

        dtoCustomer.setAddress(dtoAddress);

        return dtoCustomer;
    }
}
