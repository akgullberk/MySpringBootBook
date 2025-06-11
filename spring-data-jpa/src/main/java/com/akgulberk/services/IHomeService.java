package com.akgulberk.services;

import com.akgulberk.dto.DtoHome;

public interface IHomeService {

    public DtoHome findHomeById(Long id);
}
