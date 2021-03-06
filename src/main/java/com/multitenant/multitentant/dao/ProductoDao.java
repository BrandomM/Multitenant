
package com.multitenant.multitentant.dao;

import com.multitenant.multitentant.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDao extends JpaRepository<Producto, Long>{
    
}
