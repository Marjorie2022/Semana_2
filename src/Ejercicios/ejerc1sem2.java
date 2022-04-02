/*
1-. Escriba un programa que imprima por pantalla cuánto le costará comprar una computadora a un determinado precio 
si sabe que puede conseguir una rebaja del 15%. No olvidar que al precio del artículo se le debe de agregar el IVA. El 
programa deberá permitir digitar el precio de la computadora y deberá de realizar los cálculos correspondientes.
 */
package Ejercicios;

import java.util.Scanner;

public class ejerc1sem2 {
    public static void main(String[] args) {
        double rebaja = 0.15;
        double iva = 0.13;
        double precioT = 0.0;
        double precioI;
        double precioF;
        double total;
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Imgrese el precio de la computadora");
        double n = leer.nextDouble();
        
        precioT = n * iva;
        precioI = n + precioT;
        precioF = precioI * rebaja;
        total = precioI - precioF;
        
        System.out.println("El precio total es: $" + total);
        
        
    }
}
