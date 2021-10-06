
package com.multitenant.multitentant.service;

import com.multitenant.multitentant.model.Producto;
import java.util.List;


public interface ProductoService {
    public List<Producto> listar();
    public Producto buscarPorId(Long id);
    public void registrar(Producto producto);
    public void modificar(Producto producto);
    public void eliminar (Producto producto);
}
