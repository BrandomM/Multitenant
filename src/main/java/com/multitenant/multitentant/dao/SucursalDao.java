
package com.multitenant.multitentant.dao;

import com.multitenant.multitentant.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalDao extends JpaRepository<Sucursal, Long>{
    
}
