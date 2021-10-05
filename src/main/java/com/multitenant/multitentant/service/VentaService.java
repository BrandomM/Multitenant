
package com.multitenant.multitentant.service;

import com.multitenant.multitentant.model.Venta;
import java.util.List;

public interface VentaService {
    public List<Venta> listar();
    public void registrar(Venta venta);
}
