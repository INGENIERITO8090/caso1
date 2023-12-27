package com.example.caso1.repositories;
import com.example.caso1.models.ClienteModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteModel,Integer> {

    @Query(value = "select c.nombre_ciudad ,cli.numerodoc,cli.telefono,cli.apeliido,cli.email,cli.fechanacimiento,cli.nombre,cli.ocupacion   from  ciudad as c   inner join cliente as cli on cli.id_ciudad = c.id_ciudad;",nativeQuery = true)
    List obtener_clientes();



}