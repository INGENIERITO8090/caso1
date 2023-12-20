package com.example.caso1.repositories;
import com.example.caso1.models.ClienteModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteModel,Integer> {
}
