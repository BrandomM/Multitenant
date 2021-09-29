package com.multitenant.multitentant.controller;

import com.multitenant.multitentant.model.City;
import com.multitenant.multitentant.service.CityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/city")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/listar")
    public List<City> listar() {
        return cityService.listar();
    }

}
