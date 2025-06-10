package com.akgulberk.services;

import com.akgulberk.dto.DtoAddress;

public interface IAddressService {

    public DtoAddress findAddressById(Long id);
}
