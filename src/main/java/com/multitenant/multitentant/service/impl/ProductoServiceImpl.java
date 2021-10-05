
package com.multitenant.multitentant.service.impl;

import com.multitenant.multitentant.dao.ProductoDao;
import com.multitenant.multitentant.model.Producto;
import com.multitenant.multitentant.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {
    
    @Autowired
    ProductoDao productoDao;

    @Override
    public List<Producto> listar() {
        return productoDao.findAll();
    }

    @Override
    public void registrar(Producto producto) {
        productoDao.save(producto);
    }
    
}
