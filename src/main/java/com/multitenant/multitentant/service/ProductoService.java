
package com.multitenant.multitentant.service;

import com.multitenant.multitentant.model.Producto;
import java.util.List;


public interface ProductoService {
    public List<Producto> listar();
    public void registrar(Producto producto);
}
