package com.wsmytraining.repository;

import com.wsmytraining.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
    Cliente findById(long id);
    
    
    
}
