
package com.multitenant.multitentant.service;

import com.multitenant.multitentant.dao.CityDao;
import com.multitenant.multitentant.model.City;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityDao cityDao;

    @Override
    public List<City> listar() {
        return cityDao.findAll();
    }
    
}
