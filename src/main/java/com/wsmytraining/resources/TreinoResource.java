package com.wsmytraining.resources;

import com.wsmytraining.models.Treino;
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
@RequestMapping(value="/api/trerino")
public class TreinoResource {
    
    @Autowired
    TreinoRepository produtoRepository;
    
    @GetMapping("/trerinos")
    @ApiOperation(value="Retorna todos os trerino")
    public List<Treino> getAll(){
        return produtoRepository.findAll();
    }
    
    @GetMapping("/trerino/{id}")
    @ApiOperation(value="Recebe o id de um trerino e o retorna")
    public Treino get(@PathVariable(value = "id") long id){
        return produtoRepository.findById(id);
    }
    
    @PostMapping("/trerino")
    @ApiOperation(value="Recebe um trerino e o salva")
    public Treino insert(@RequestBody Treino ficha) {
        return produtoRepository.save(ficha);
    }
    
    @DeleteMapping("/trerino")
    @ApiOperation(value="recebe um trerino e o deleta")
    public void delete(@RequestBody Treino ficha) {
        produtoRepository.delete(ficha);
    }
    
    @PutMapping("/trerino")
    @ApiOperation(value="Recebe um trerino e o atualiza")
    public Treino update(@RequestBody Treino ficha) {
        return produtoRepository.save(ficha);
    }
    
}
