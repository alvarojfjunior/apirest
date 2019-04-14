package com.wsmytraining.resources;

import com.wsmytraining.models.Cliente;
import com.wsmytraining.repository.ClienteRepository;
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
public class ClienteResource {
    
    @Autowired
    ClienteRepository clienteRepository;
    
    @GetMapping("/clientes")
    @ApiOperation(value="Retorna todos os cliente")
    public List<Cliente> getAll(){
        return clienteRepository.findAll();
    }
    
    @GetMapping("/cliente/{id}")
    @ApiOperation(value="Recebe o id de um cliente e a retorna")
    public Cliente get(@PathVariable(value = "id") long id){
        return clienteRepository.findById(id);
    }
    
    @PostMapping("/cliente")
    @ApiOperation(value="Recebe um cliente e a salva")
    public Cliente insert(@RequestBody Cliente ficha) {
        return clienteRepository.save(ficha);
    }
    
    @DeleteMapping("/cliente")
    @ApiOperation(value="recebe um cliente e a deleta")
    public void delete(@RequestBody Cliente cliente) {
        clienteRepository.delete(cliente);
    }
    
    @PutMapping("/cliente")
    @ApiOperation(value="Recebe um cliente e a atualiza")
    public Cliente update(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    
}
