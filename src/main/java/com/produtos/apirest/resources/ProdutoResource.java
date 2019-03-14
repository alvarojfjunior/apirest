package com.produtos.apirest.resources;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;
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
@RequestMapping(value="/api")
public class ProdutoResource {
    
    @Autowired
    ProdutoRepository produtoRepository;
    
    @GetMapping("/produtos")
    @ApiOperation(value="Retorno uma lista de todos os produtos")
    public List<Produto> listaProdutos(){
        return produtoRepository.findAll();
    }
    
    @GetMapping("/produto/{id}")
    @ApiOperation(value="Recebe o id de um produto e o retorna")
    public Produto listaProdutoUnico(@PathVariable(value = "id") long id){
        return produtoRepository.findById(id);
    }
    
    @PostMapping("/produto")
    @ApiOperation(value="Recebe um objeto produto e o salva")
    public Produto salvaProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
    
    @DeleteMapping("/produto")
    @ApiOperation(value="recebe o id de um produto e o deleta")
    public void deletaProduto(@RequestBody Produto produto) {
        produtoRepository.delete(produto);
    }
    
    @PutMapping("/produto")
    @ApiOperation(value="Recebe um produto e o atualiza")
    public Produto atualizaProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
    
}
