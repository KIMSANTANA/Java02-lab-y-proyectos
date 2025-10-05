/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

  //import lab0310.Carro;

/**
 *
 * @author Kimberly Santana
 */
public class Garaje {
    
   private  int capacidad;
   private  Carro[] espacios;
   private int index;
   
   
   public Garaje(int capacidad){
   this.capacidad = capacidad;
   this.espacios = new Carro[capacidad];
   
   }
   //Aparcar carro
   public void aparcarCarro(Carro carro){
       if (index < capacidad){
    this.espacios[index++] = carro;
    System.out.printf("Aparcando %s-%s%n", carro.getMarca(), carro.getModelo());
           
    }
   }
   
//Listar carros
   
    
}
