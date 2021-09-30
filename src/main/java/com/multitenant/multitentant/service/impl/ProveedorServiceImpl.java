package com.multitenant.multitentant.service.impl;

import com.multitenant.multitentant.dao.ProveedorDao;
import com.multitenant.multitentant.model.Proveedor;
import com.multitenant.multitentant.service.ProveedorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorServiceImpl implements ProveedorService{
    
    @Autowired
    ProveedorDao proveedorDao;
    
    @Override
    public List<Proveedor> listar() {
        return proveedorDao.findAll();
    }

    @Override
    public Proveedor buscarPorId(Long id) {
        return proveedorDao.findById(id).orElse(null);
    }

    @Override
    public void registrar(Proveedor proveedor) {
       proveedorDao.save(proveedor);
    }

    @Override
    public void modificar(Proveedor proveedor) {
        proveedorDao.save(proveedor);
    }

    @Override
    public void eliminar(Proveedor proveedor) {
       proveedorDao.delete(proveedor); 
    }
    
}
