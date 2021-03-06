
package com.multitenant.multitentant.dao;

import com.multitenant.multitentant.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaDao extends JpaRepository<Venta, Long>{
    
}
