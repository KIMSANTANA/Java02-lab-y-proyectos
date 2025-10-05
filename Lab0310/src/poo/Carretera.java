/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.ArrayList;

/**
 *
 * @author Kimberly Santana
 */
public class Carretera {
    
    private String nombre;
    private ArrayList<Carro>carros;
   
    public Carretera(String nombre) {
        this.nombre = nombre;
        this.carros = new ArrayList();
    }
    
    //AgregarCarro()
    public void agregarCarro(Carro carro) {
        this.carros.add(carro);
        this.verificarEstado();
    }
    //cantidadCarros()
    public int cantidadDeCarros(){
        return this.carros.size();
    }
    
    //verificarEstado()
    public void verificarEstado(){
        int cantidad = cantidadDeCarros();
        if(cantidad < 3) {
        System.out.printf("La carretera %s tiene un flujo ligero\n",this.nombre);
    }
        }
        //swich
    //listarCarros()
     public void listarCarros(){
        var it = this.carros.iterator();
         while (it.hasNext()){
             Carro next = it.next();
             System.out.printf("%s[%s]\n",next.getMarca(),next.getModelo());
     }           
    }
    //removerCarrosAntiguos()
     public void removerCarrosAntiguos(){
        var it = this.carros.iterator();
         while (it.hasNext()){
             Carro next = it.next();
             //TODO: validar antiguedad del carro
//this.carros.remover(it);
             System.out.printf("%s[%s]\n",next.getMarca(),next.getModelo());
     }   
          }
    
    
}
