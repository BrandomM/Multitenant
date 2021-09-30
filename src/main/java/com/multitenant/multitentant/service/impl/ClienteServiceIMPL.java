
package com.multitenant.multitentant.service.impl;

import com.multitenant.multitentant.dao.ClienteDao;
import com.multitenant.multitentant.model.Cliente;
import com.multitenant.multitentant.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


public class ClienteServiceIMPL implements ClienteService{

    @Autowired
    ClienteDao clienteDao;
    
    @Override
    public List<Cliente> listarClientes() {
       return clienteDao.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
       return clienteDao.findById(id).orElse(null);
    }

    @Override
    public void registrar(Cliente cliente) {
       clienteDao.save(cliente);
    }

    @Override
    public void modificar(Cliente cliente) {
       clienteDao.save(cliente);
    }

    @Override
    public void eliminar(Cliente cliente) {
       clienteDao.delete(cliente);
    }
    
}
