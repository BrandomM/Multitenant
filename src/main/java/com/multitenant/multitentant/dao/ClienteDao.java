
package com.multitenant.multitentant.dao;

import com.multitenant.multitentant.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDao extends JpaRepository<Cliente, Long> {
    
}
