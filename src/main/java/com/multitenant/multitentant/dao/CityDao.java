
package com.multitenant.multitentant.dao;

import com.multitenant.multitentant.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDao extends JpaRepository<City, Long>{
    
}
