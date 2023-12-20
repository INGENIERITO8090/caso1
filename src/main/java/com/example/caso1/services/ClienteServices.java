package com.example.caso1.services;

import com.example.caso1.models.ClienteModel;
import com.example.caso1.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteServices {
    @Autowired
    ClienteRepository clienteRepository;


    public ArrayList<ClienteModel> obtenerclientes(){
        return  (ArrayList<ClienteModel>)

                clienteRepository.findAll();
    }

    public  ClienteModel guardarCliente (ClienteModel cliente  ){
      return clienteRepository.save(cliente);
    }


}
