package com.multitenant.multitentant.dao;

import com.multitenant.multitentant.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorDao extends JpaRepository<Proveedor, Long>{
    
}
