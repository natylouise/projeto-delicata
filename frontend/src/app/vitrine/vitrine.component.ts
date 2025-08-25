import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Produto } from '../model/produto';
import { Item } from '../model/item';



@Component({
  selector: 'app-vitrine',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './vitrine.component.html',
  styleUrl: './vitrine.component.css'
})
export class VitrineComponent {
  public lista: Produto[] = 
  [{codigo:1,nome:"Conjunto - Brinco/Anel/Colar",valor:100, descritivo:"",
    valorPromo:90, estoque:10, destaque:1},
    {codigo:2,nome:"Colar",valor:89, descritivo:"",
    valorPromo:30, estoque:10, destaque:1},
    {codigo:3,nome:"Brinco",valor:90, descritivo:"",
    valorPromo:65, estoque:10, destaque:1},
    {codigo:4,nome:"Anel",valor:129, descritivo:"",
    valorPromo:90, estoque:10, destaque:1},
    {codigo:8,nome:"Berloque",valor:500, descritivo:"",
    valorPromo:90, estoque:10, destaque:1},
    {codigo:9,nome:"Tornozeleira",valor:19, descritivo:"",
      valorPromo:15, estoque:10, destaque:1}

  ];

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
  public verdetalhe (produto: Produto ){
    localStorage.setItem("detalhe",JSON.stringify(produto));
    window.location.href="./detalhe";

  }
}
