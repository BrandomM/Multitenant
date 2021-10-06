package com.multitenant.multitentant.controller;

import com.multitenant.multitentant.model.Cliente;
import com.multitenant.multitentant.model.Venta;
import com.multitenant.multitentant.service.VentaService;
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
@RequestMapping("/api/venta")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class VentaController {
    
    @Autowired
    VentaService ventaService;
    
    @GetMapping("/listar")
    public List<Venta> listar() {
        return ventaService.listar();
    }
    
    @GetMapping("/id/{id}")
    public Venta buscarPorId(@PathVariable Long id){
       return ventaService.buscarPorId(id);
    }
    
    @PostMapping("/registrar")
    public void registrar(@RequestBody Venta venta) {
        ventaService.registrar(venta);
    }
    
    @PutMapping("/modificar")
    public void modificar(@RequestBody Venta venta){
        ventaService.modificar(venta);
    }
    
    @DeleteMapping("/eliminar")
    public void eliminar(@RequestBody Venta venta){
        ventaService.eliminar(venta);
    }
    
}
