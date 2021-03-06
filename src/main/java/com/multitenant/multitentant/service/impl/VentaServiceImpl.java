package com.multitenant.multitentant.service.impl;

import com.multitenant.multitentant.dao.VentaDao;
import com.multitenant.multitentant.model.Venta;
import com.multitenant.multitentant.service.VentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaServiceImpl implements VentaService {

    @Autowired
    VentaDao ventaDao;

    @Override
    public List<Venta> listar() {
        return ventaDao.findAll();
    }
    
    @Override
    public Venta buscarPorId(Long id) {
        return ventaDao.findById(id).orElse(null);
    }
    
    @Override
    public void registrar(Venta venta) {
        ventaDao.save(venta);
    }


    @Override
    public void modificar(Venta venta) {
        ventaDao.save(venta);
    }

    @Override
    public void eliminar(Venta venta) {
        ventaDao.delete(venta);
    }

}
