package com.akgulberk.controller;

import com.akgulberk.dto.DtoAddress;

public interface IAddressController {

    public DtoAddress findAddressById(Long id);
}
