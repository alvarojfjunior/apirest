package com.wsmytraining.repository;

import com.wsmytraining.models.Treino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreinoRepository extends JpaRepository<Treino, Long>{
    
    Treino findById(long id);
    
    
    
}
