
package com.multitenant.multitentant.controller;

import com.multitenant.multitentant.model.Cliente;
import com.multitenant.multitentant.service.ClienteService;
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
@RequestMapping("/api/cliente")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class ClienteController {
    
    @Autowired
    ClienteService clienteService;
    
    @GetMapping("/listar")
    public List<Cliente> listar(){
       return clienteService.listar();
    }
    
    @GetMapping("/id/{id}")
    public Cliente buscarPorId(@PathVariable Long id){
       return clienteService.buscarPorId(id);
    }
    
    @PostMapping("/registrar")
    public void  registrar(@RequestBody Cliente cliente){
        clienteService.registrar(cliente);
    }
    
    @PutMapping("/modificar")
    public void modificar(@RequestBody Cliente cliente){
        clienteService.modificar(cliente);
    }
    
    @DeleteMapping("/eliminar")
    public void eliminar(@RequestBody Cliente cliente){
        clienteService.eliminar(cliente);
    }
}
