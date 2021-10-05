package com.multitenant.multitentant.controller;

import com.multitenant.multitentant.model.Producto;
import com.multitenant.multitentant.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    
    @PostMapping("/registrar")
    public void registrar(@RequestBody Producto producto) {
        productoService.registrar(producto);
    }
    
}
