
package com.multitenant.multitentant.service;

import com.multitenant.multitentant.model.Cliente;
import java.util.List;


public interface ClienteService {
    
    public List<Cliente> listarClientes();
    public Cliente buscarPorId (Long id);
    public void registrar(Cliente cliente);
    public void modificar(Cliente cliente);
    public void eliminar (Cliente cliente);
}
