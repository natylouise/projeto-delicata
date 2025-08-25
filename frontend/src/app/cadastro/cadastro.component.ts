import { Component } from '@angular/core';
import { Cliente } from '../model/cliente';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { json } from 'stream/consumers';
@Component({
  selector: 'app-cadastro',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './cadastro.component.html',
  styleUrl: './cadastro.component.css'
})
export class CadastroComponent {
  public mensagem: string = "";
  public obj: Cliente = new Cliente(); 

  public constructor(){
    let json = localStorage.getItem("cadastro");
    if(json==null){
      this.mensagem = "Voce ainda nao tem cadastro!!!";
    } else {
      this.obj = JSON.parse(json);
    }  
  }

  public gravar(){
    this.mensagem = "Cliente cadastrado com sucesso!"; 
    console.log(JSON.stringify(this.obj));   
    localStorage.setItem("cadastro", 
                        JSON.stringify(this.obj));
  }
}
