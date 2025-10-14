/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo; 

/**
 *
 * @author Kimberly Santana
 */
public class Trafico {

    private String nombre;
    private int cantidadCarros;

    public Trafico(String nombre, int cantidadCarros) {
        this.nombre = nombre;
        this.cantidadCarros = cantidadCarros;
    }

    public String obtenerEstadoTrafico(int cantidad) {
        if (cantidad <= 3) {
            return "tiene un flujo ligero";
        }
        if (cantidad <= 5) {
            return "tiene un flujo moderado";
        }
        if (cantidad <= 8) {
            return "esta comenzando a congestionarse";
        }
        if (cantidad <= 11) {
            return "se esta gerenando un embotellamiento en la carretera.";
        }
        return " hay mucho embotellamiento";

    }

    public void verificarEstado() {
        //int cantidad = this.cantidadCarros();
        String estado = obtenerEstadoTrafico(cantidadCarros);
        System.out.printf("La carretera %s %s\n", nombre, estado);
    }

}
