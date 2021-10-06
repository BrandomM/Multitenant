package com.multitenant.multitentant.controller;

import com.multitenant.multitentant.model.Producto;
import com.multitenant.multitentant.service.ProductoService;
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
@RequestMapping("/api/producto")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ProductoController {
    
    @Autowired
    ProductoService productoService;
    
    @GetMapping("/listar")
    public List<Producto> listar() {
        return productoService.listar();
    }
    
    @GetMapping("id/{id}")
    public Producto buscarPorId(@PathVariable Long id){
        return productoService.buscarPorId(id);
    }
    
    @PostMapping("/registrar")
    public void registrar(@RequestBody Producto producto) {
        productoService.registrar(producto);
    }
    
    @PutMapping("/modificar")
    public void modificar (@RequestBody Producto producto){
        productoService.modificar(producto);
    }
    
    @DeleteMapping("/eliminar")
    public void eliminar (@RequestBody Producto producto){
        productoService.eliminar(producto);
    }
    
}
