package com.akgulberk.controller;

import com.akgulberk.dto.DtoHome;

public interface IHomeController {

    public DtoHome findHomeById(Long id);
}
