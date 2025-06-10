package com.akgulberk.services.impl;

import com.akgulberk.dto.DtoAddress;
import com.akgulberk.dto.DtoCustomer;
import com.akgulberk.entities.Address;
import com.akgulberk.repository.AddressRepository;
import com.akgulberk.services.IAddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public DtoAddress findAddressById(Long id) {

        DtoAddress dtoAddress = new DtoAddress();

        Optional<Address> optional = addressRepository.findById(id);
        if(optional.isEmpty()){
            return null;
        }

        Address address = optional.get();
        BeanUtils.copyProperties(address,dtoAddress);

        DtoCustomer dtoCustomer = new DtoCustomer();
        dtoCustomer.setId(address.getCustomer().getId());
        dtoCustomer.setName(address.getCustomer().getName());
        //dtoCustomer.setAddress(dtoAddress);

        dtoAddress.setCustomer(dtoCustomer);
        return dtoAddress;
    }
}
