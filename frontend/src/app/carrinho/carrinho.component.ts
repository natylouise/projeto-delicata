import { Component } from '@angular/core';
import { Item } from '../model/item';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-carrinho',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './carrinho.component.html',
  styleUrl: './carrinho.component.css'
})
export class CarrinhoComponent {
  public lista: Item[] = [];
  public mensagem: String = "";
  public totalCarrinho: number = 0;

  constructor(){
    let json = localStorage.getItem("carrinho");
    if(json==null){
      this.mensagem = "Seu carrinho de compras esta vazia !!!";
    } 
    else {
      this.lista = JSON.parse(json);
      for(let item of this.lista){
        this.totalCarrinho = this.totalCarrinho + item.total;
      }
    }
  }

  limpar(){
    this.lista = [];
    localStorage.removeItem("carrinho");
  }

  finalizar(){
    this.lista = [];
    localStorage.getItem("carrinho");
  }
}
