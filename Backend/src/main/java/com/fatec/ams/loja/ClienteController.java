package com.fatec.ams.loja;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
public class ClienteController {
    @Autowired
    ClienteRepository bd;
    
    @PostMapping("/api/cliente")
    public void gravar(@RequestBody ClienteEntity obj){
        bd.save(obj);
        
    }

    @GetMapping("/api/cliente/{codigo}")
    public ClienteEntity ler(@PathVariable int codigo){
        Optional<ClienteEntity> retorno = bd.findById(codigo);
        if(retorno.isPresent()) {
            return retorno.get();
        } else {
            return null;
        }
    }

    @DeleteMapping("/api/cliente/{codigo}")
    public void remover(@PathVariable int codigo){
        bd.deleteById(codigo);
    }
    
    @PutMapping("/api/cliente")
    public void alterar(@RequestBody ClienteEntity obj){
        bd.save(obj);
    }    

    @GetMapping("/api/clientes")
    public List<ClienteEntity> listar(){
        List<ClienteEntity> lista = bd.findAll();
        return lista;
    }

}
