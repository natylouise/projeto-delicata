package com.fatec.ams.loja;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="cliente")
public class ClienteEntity {
    
    @Id
    private int codigo;
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private String endFaturamento;
    private String documento;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEndFaturamento() {
        return endFaturamento;
    }
    public void setEndFaturamento(String endFaturamento) {
        this.endFaturamento = endFaturamento;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
}
