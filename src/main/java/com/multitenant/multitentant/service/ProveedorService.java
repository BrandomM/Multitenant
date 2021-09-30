package com.multitenant.multitentant.service;

import com.multitenant.multitentant.model.Proveedor;
import java.util.List;


public interface ProveedorService {
    public List<Proveedor> listar();
    public Proveedor buscarPorId(Long id);
    public void registrar(Proveedor proveedor);
    public void modificar(Proveedor proveedor);
    public void eliminar(Proveedor proveedor);
}
