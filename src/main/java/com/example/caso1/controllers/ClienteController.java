package com.example.caso1.controllers;

import com.example.caso1.models.ClienteModel;
import com.example.caso1.services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/cliente")
public class ClienteController {
@Autowired
    ClienteServices clienteService;

@GetMapping()
    public ArrayList<ClienteModel> obternerclientes(){
     return  clienteService.obtenerclientes();
}
@PostMapping()
    public  ClienteModel guardarCliente(@RequestBody ClienteModel cliente){
    return  this.clienteService.guardarCliente(cliente);


}



}
