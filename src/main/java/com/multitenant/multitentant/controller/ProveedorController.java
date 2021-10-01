package com.multitenant.multitentant.controller;

import com.multitenant.multitentant.model.Proveedor;
import com.multitenant.multitentant.service.ProveedorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/proveedor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ProveedorController {
    
    @Autowired
    ProveedorService proveedorService;
    
    @GetMapping("/listar")
    public List<Proveedor> listar(){
        return proveedorService.listar();
    }
    
    @GetMapping("/id/{id}")
    public Proveedor buscarPorId(@PathVariable Long id){
        return proveedorService.buscarPorId(id);
    }
    
    @PostMapping("/registrar")
    public void registrar(@RequestBody Proveedor proveedor){
        proveedorService.registrar(proveedor);
    }
    
    @PutMapping("/modificar")
    public void modificar(@RequestBody Proveedor proveedor){
        proveedorService.modificar(proveedor);
    }
    
    @DeleteMapping("/eliminar")
    public void eliminar(@RequestBody Proveedor proveedor){
        proveedorService.eliminar(proveedor);
    }
}
