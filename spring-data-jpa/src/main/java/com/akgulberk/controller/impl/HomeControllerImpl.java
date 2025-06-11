package com.akgulberk.controller.impl;

import com.akgulberk.controller.IHomeController;
import com.akgulberk.dto.DtoHome;
import com.akgulberk.services.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/home")
public class HomeControllerImpl implements IHomeController {

    @Autowired
    private IHomeService homeService;


    @GetMapping(path = "/{id}")
    @Override
    public DtoHome findHomeById(@PathVariable(name = "id") Long id) {

        return homeService.findHomeById(id);
    }
}
