/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab01.pkg9;

import java.awt.desktop.SystemSleepEvent;

/**
 *
 * @author Kimberly Santana
 */
public class Lab019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.print("Hola mundo");
        String[] variables = new String [3];
        //["Uno"] ["dos"] ["tres"]
        
        int edad1 = 10;
        int edad2 = 22;
        
        boolean esMayor;
        esMayor = edad1 >= 18;
        
        boolean esMayor2 = edad2 >= 18;
        
        
        
        System.out.println(
                "Edad1: " + (esMayor ? "Si es Mayor " :"Es menor")+ "\n"+
                "Edad2: " + (esMayor2 ?  "Si es Mayor " :"Es menor")
        );
        
        String nombre = "Fabian";
        variables[0] = nombre;
        System.out.println(nombre);
        
        char inicial = nombre.charAt(0);
        int tamaño = nombre.length();
        char ultima = nombre.charAt (tamaño -1);
        
        variables[1] =  inicial + "";
        variables[2] = ultima + "";
        
        for (String variable : variables) {
        System.out.println(variable);
        
    }
        int numero = 10;
        float division; 
        division = (float) numero / 4;
        System.out.println(division);
   } 
}
