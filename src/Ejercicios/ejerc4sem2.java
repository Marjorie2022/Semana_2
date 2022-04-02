/*
4-. Una empresa de venta de computadoras paga a su personal de ventas un salario de $300,00 más una comisión de 
$50,00 por computadora vendida. Diseñar un programa para calcular el salario de un vendedor en un determinado mes, 
conociendo el nº de computadoras vendidas. Al salario devengado se debe de retener el 10% en concepto de renta. Imprimir 
el nombre del vendedor, el salario devengado y la retención de la renta.
 */
package Ejercicios;

import java.util.Scanner;

public class ejerc4sem2 {
    public static void main(String[] args) {
        //Declaracion de variables
        double salario = 300.00;
        double comision = 50.00;
        double renta = 0.10;
        double salarioC;
        double salarioR;
        double salarioT;
        double Renta;
        double comi;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de el vendedor");
        String nombre = leer.nextLine();
        
        System.out.println("Cuantas ventas realizo en el mes");
        double Venta = leer.nextDouble();
        
        comi = Venta * comision;
       
        
        salarioC = salario + comi;
        salarioR = salario * renta;
        salarioT = salarioC - salarioR;
        
        System.out.println("El salatio total es de: $" + salarioT);
        
        Renta = salario * renta;
        
        System.out.println("El monto a pagar de renta es de: $" + Renta);
    }
}