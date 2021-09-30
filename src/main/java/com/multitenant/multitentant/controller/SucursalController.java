
package com.multitenant.multitentant.controller;

import com.multitenant.multitentant.model.Sucursal;
import com.multitenant.multitentant.service.SucursalService;
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
@RequestMapping("/api/sucursal")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class SucursalController {
    
    @Autowired
    SucursalService sucursalService;
    
    @GetMapping("/listar")
    public List<Sucursal> listar(){
        return sucursalService.listar();
    }
    
    @GetMapping("/id/{id}")
    public Sucursal buscarPorId(@PathVariable Long id){
        return sucursalService.buscarPorId(id);
    }
    
    @PostMapping("/registrar")
    public void registrar(@RequestBody Sucursal sucursal){
        sucursalService.registrar(sucursal);
    }
    
    @PutMapping("/modificar")
    public void modificar(@RequestBody Sucursal sucursal){
        sucursalService.modificar(sucursal);
    }
    
    @DeleteMapping("/eliminar")
    public void eliminar(@RequestBody Sucursal sucursal){
        sucursalService.eliminar(sucursal);
    }
    
}
