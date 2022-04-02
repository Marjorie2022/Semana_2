/*
Una agencia de ventas de autos paga a su personal de ventas un salario de $800,00 
mas una comision de $700,00 por auto vendido más un 5% del valor de venta. Diseñar 
un programa para calcular el salario de un vendedor en un determinado 
mes, conociendo el nº de automóviles vendidos y el total del monto de ventas. 
Imprimir el nombre del vendedor y el salario 
devengado por este.
 */
package Ejercicios;

import java.util.Scanner;

public class ejerc3sem2 {
    public static void main(String[] args) {
        double salarioBase = 800.00;
        double salario = 0.0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de autos vendidos");
        double n = leer.nextDouble();
        
        System.out.println("Introduzca el nombre de el vendedor");
        String nombre = leer.next();
        
        //System.out.println("Cuantas ventas realizo en el mes: ");
        //int xVentas = leer.nextInt();
        double com = comisionAutosDos();
        
        //comisionAutosVendidos(n);       
        salario = salarioBase + comisionAutosVendidos(n) + com;
        
        System.out.println("El salario del trabajador es: $" + salario);
        System.out.println("El nombre de el trabajador es: " + nombre);
        
        
        
    }
    
    public static double comisionAutosVendidos(double cantidad) {
        //double comi = 170;
        double totalComision = 170 * cantidad;
        return totalComision;
    }
    public static double comisionAutosDos() {
        int xVentas = 3;
        double valorV1 = 5000;
        double valorV2 = 7000;
        double valorV3 = 15000;
        
        double comision = (valorV1 * 0.05) + (valorV2 * 0.05) + (valorV3 * 0.05);
        return comision;
    }
}
