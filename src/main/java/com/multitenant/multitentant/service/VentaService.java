
package com.multitenant.multitentant.service;

import com.multitenant.multitentant.model.Venta;
import java.util.List;

public interface VentaService {
    public List<Venta> listar();
    public Venta buscarPorId(Long id);
    public void registrar(Venta venta);
    public void modificar(Venta venta);
    public void eliminar(Venta venta);
}
