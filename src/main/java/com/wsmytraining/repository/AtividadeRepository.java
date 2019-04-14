package com.wsmytraining.repository;

import com.wsmytraining.models.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtividadeRepository extends JpaRepository<Atividade, Long>{
    
    Atividade findById(long id);
    
    
    
}
