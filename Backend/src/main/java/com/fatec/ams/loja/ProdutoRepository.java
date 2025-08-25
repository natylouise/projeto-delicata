package com.fatec.ams.loja;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository 
extends JpaRepository<ProdutoEntity, Integer> {
   @Query(value = "select * from produto where destaque>0 order by destaque",  nativeQuery = true)
    List<ProdutoEntity> carregaVitrine();

    @Query(value = "select * from produto where descritivo like ?1 ",  nativeQuery = true)
    List<ProdutoEntity> fazerBusca(String busca);
}
