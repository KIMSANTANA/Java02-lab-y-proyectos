/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02;

/**
 *
 * @author Kimberly Santana
 */
public class Lab02{

    static String[] meses = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    static String[] estaciones = {
        "Invierno", "Invierno", "Primavera", "Primavera", "Primavera", "Verano",
        "Verano", "Verano", "Otono", "Otono", "Otono", "Invierno"
    };

    public static String getMesEstacion(int mes) {
        return "En " + meses[mes] + " la estacion es " + estaciones[mes];
    }

    public static void main(String[] args) {
        try {
            char letra = 'F';
            System.out.println("Letra: " + letra);
            int[] numeros = new int[4];
            numeros[0] = 10;
            numeros[3] = 30;
            numeros[2] = 30;
            numeros[1] = 20;

            //sout
            //imprime los valores del arreglo
            System.out.println(Arrays.toString(numeros));

//            for (String mes : meses) {
//                System.out.println(mes);
//            }
//            for (int i = 0; i < meses.length; i++) {
//                System.out.println(i + ".En " + meses[i] + " la estacion es " + estaciones[i]);
//            }
            System.out.println(getMesEstacion(1));

        } catch (ArithmeticException e) {
            if (e.getMessage().contains("/ by zero")) {
                System.err.println("Estas intentando dividir entre 0");
                return;
            }
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
            //serr    
            System.err.println("Estas fuera del rango del arreglo");
        }
    }
}


    
