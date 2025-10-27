/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author fbarg
 */
public class InvertirLista {

    public static List<Integer> invertirLista(List<Integer> lista) {
        Stack<Integer> pila = new Stack<>();
        

        // Apilar todos los elementos de la lista
        for (Integer elemento : lista) {
            pila.push(elemento);
        }

        // Crear una nueva lista para almacenar los elementos invertidos
        List<Integer> listaInvertida = new ArrayList<>();

        // Desapilar los elementos y agregarlos a la nueva lista
        while (!pila.isEmpty()) {
            listaInvertida.add(pila.pop());
        }

        return listaInvertida;
    }

    public static void main(String[] args) {
      String input = JOptionPane.showInputDialog("Ingrese los numeros aleatorios");
      int cantidad = Integer.parseInt(input);
      
    
        List<Integer> listaOriginal = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < cantidad;i++){
            listaOriginal.add(rand.nextInt(100));
        }
        
         JOptionPane.showMessageDialog(null, "Lista Original: " + listaOriginal);

        List<Integer> listaInvertida;
        listaInvertida = invertirLista(listaOriginal);

        JOptionPane.showMessageDialog(null, "Lista Invertida: " + listaInvertida);
}
}