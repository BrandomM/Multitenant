package com.multitenant.multitentant.service;

import com.multitenant.multitentant.model.Sucursal;
import java.util.List;

public interface SucursalService {

    public List<Sucursal> listar();
    public Sucursal buscarPorId(Long id);
    public void registrar(Sucursal sucursal);
    public void modificar(Sucursal sucursal);
    public void eliminar(Sucursal sucursal);
}
