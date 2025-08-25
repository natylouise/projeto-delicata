import { Component } from '@angular/core';
import { Produto } from '../model/produto';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Item } from '../model/item';

@Component({
  selector: 'app-detalhe',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './detalhe.component.html',
  styleUrl: './detalhe.component.css'
})
export class DetalheComponent {
    public obj : Produto = new Produto();
  
    constructor(){
      let json = localStorage.getItem("detalhe");
      if(json!=null){
        this.obj = JSON.parse(json);
      }  

       }

       public comprar(produto: Produto){
        let novo: Item = new Item();
        novo.codigoProduto = produto.codigo;
        novo.nomeProduto = produto.nome;
        novo.valor = produto.valor;
        novo.qtd = 1;
        novo.total = produto.valor;
        let lista : Item[] = [];
        let json = localStorage.getItem("carrinho");
        if(json==null){
          lista.push(novo);  
          console.log(JSON.stringify(lista));
        } else {
          lista = JSON.parse(json);
          lista.push(novo);
        }  
        localStorage.setItem("carrinho",JSON.stringify(lista));
        window.location.href="./carrinho";
      }
       
 
    
}

