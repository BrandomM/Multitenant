
package com.multitenant.multitentant.service.impl;

import com.multitenant.multitentant.dao.SucursalDao;
import com.multitenant.multitentant.model.Sucursal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.multitenant.multitentant.service.SucursalService;

@Service
public class SucursalServiceImpl implements SucursalService{

    @Autowired
    SucursalDao sucursalDao;
    
    @Override
    public List<Sucursal> listar() {
        return sucursalDao.findAll();
    }

    @Override
    public Sucursal buscarPorId(Long id) {
        return sucursalDao.findById(id).orElse(null);
    }

    @Override
    public void registrar(Sucursal sucursal) {
        sucursalDao.save(sucursal);
    }

    @Override
    public void modificar(Sucursal sucursal) {
        sucursalDao.save(sucursal);
    }

    @Override
    public void eliminar(Sucursal sucursal) {
        sucursalDao.delete(sucursal);
    }
    
}
