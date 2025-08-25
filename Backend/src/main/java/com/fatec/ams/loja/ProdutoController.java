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
public class ProdutoController {
    @Autowired
    ProdutoRepository bd;


    @PostMapping("/api/produto")
    public void gravar(@RequestBody ProdutoEntity obj){
        bd.save(obj);
        
    }

    @GetMapping("/api/produto/{codigo}")
    public ProdutoEntity ler(@PathVariable int codigo){
        Optional<ProdutoEntity> obj = bd.findById(codigo);
        if(obj.isPresent()){
            return obj.get();
        } else {
            return null;
        }
    }

    @DeleteMapping("/api/produto/{codigo}")
    public void remover(@PathVariable int codigo){
        bd.deleteById(codigo);
        
    }
    
    @PutMapping("/api/produto")
    public void alterar(@RequestBody ProdutoEntity obj){
        bd.save(obj);
       
    }    

    @GetMapping("/api/produtos")
    public List<ProdutoEntity> listar(){
        return bd.findAll();
    }

    @GetMapping("/api/produto/vitrine")
    public List<ProdutoEntity> carregarVitrine(){
        return bd.carregaVitrine();
    }

    @GetMapping("/api/produto/busca/{palavra}")
    public List<ProdutoEntity> fazerBusca(@PathVariable String palavra){
        return bd.fazerBusca('%'+ palavra +'%');
    }

}
