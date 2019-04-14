package com.wsmytraining.resources;

import com.wsmytraining.models.Atividade;
import com.wsmytraining.models.Treino;
import com.wsmytraining.repository.AtividadeRepository;
import com.wsmytraining.repository.TreinoRepository;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/atividade")
public class AtividadeResource {
    
    @Autowired
    AtividadeRepository atividadeRepository;
    
    @GetMapping("/atividades")
    @ApiOperation(value="Retorna todas as fichas")
    public List<Atividade> getAll(){
        return atividadeRepository.findAll();
    }
    
    @GetMapping("/atividade/{id}")
    @ApiOperation(value="Recebe o id de uma ficha e a retorna")
    public Atividade get(@PathVariable(value = "id") long id){
        return atividadeRepository.findById(id);
    }
    
    @PostMapping("/atividade")
    @ApiOperation(value="Recebe uma ficha e a salva")
    public Atividade insert(@RequestBody Atividade atividade) {
        return atividadeRepository.save(atividade);
    }
    
    @DeleteMapping("/atividade")
    @ApiOperation(value="recebe uma ficha e a deleta")
    public void delete(@RequestBody Atividade atividade) {
        atividadeRepository.delete(atividade);
    }
    
    @PutMapping("/atividade")
    @ApiOperation(value="Recebe uma ficha e a atualiza")
    public Atividade update(@RequestBody Atividade atividade) {
        return atividadeRepository.save(atividade);
    }
    
}
