package com.fatec.ams.loja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 

@Repository
public interface ClienteRepository 
extends JpaRepository<ClienteEntity, Integer> { 
    
}
