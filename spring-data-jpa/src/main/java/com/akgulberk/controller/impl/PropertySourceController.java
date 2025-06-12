package com.akgulberk.controller.impl;

import com.akgulberk.configuration.DataSource;
import com.akgulberk.configuration.GlobalProperties;
import com.akgulberk.configuration.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/api/property")
public class PropertySourceController {

    private final GlobalProperties globalProperties;

    public PropertySourceController(@Qualifier("app-com.akgulberk.configuration.GlobalProperties") GlobalProperties globalProperties) {
        this.globalProperties = globalProperties;
    }

    @GetMapping("/datasource")
    public DataSource getDataSource(){

        return null;
    }

    @GetMapping(value = "/getServers")
    public List<Server> getServers(){
        return globalProperties.getServers();
    }
}
