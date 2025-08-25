package com.fatec.ams.loja;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CestaController {
    @Autowired
    CestaRepository bd;

    @PostMapping("/api/cesta")
    public String gravar(@RequestBody CestaEntity obj){
        bd.save(obj);
        return "Cesta gravada com sucesso!";
    }

    @GetMapping("/api/cesta/{codigo}")
    public CestaEntity ler(@PathVariable int codigo){
        Optional<CestaEntity> obj = bd.findById(codigo);
        if(obj.isPresent()){
            return obj.get();
        } else {
            return null;
        }
    }

    @DeleteMapping("/api/cesta/{codigo}")
    public String remover(@PathVariable int codigo){
        bd.deleteById(codigo);
        return "Cesta "+ codigo +" removido com sucesso !!";
    }
    
    @PutMapping("/api/cesta")
    public String alterar(@RequestBody CestaEntity obj){
        bd.save(obj);
        return "Cesta alterada com sucesso !";
    }    

    @GetMapping("/api/cesta/itens")
    public List<CestaEntity> listar(){
        return bd.findAll();
    }

    @GetMapping("/api/cesta/cliente/{codigo}")
    public List<CestaEntity> carregaCestaCliente(@PathVariable int codigo){
        return bd.carregaCestaCliente(codigo);
    }
}
