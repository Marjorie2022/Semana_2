/*
5-. Escriba un programa para calcular el salario bruto de un empleado. Para calcular el salario del empleado debemos de hacer 
los descuentos por llegadas tardías así como la retención de la renta que es el 10% del salario menos el descuento por llegada 
tardía. Debe de crear una fórmula para determinar el salario por minuto y calcular el monto por las llegadas tardías y 
descontarlo al salario, luego debe de descontar el monto de la renta. El programa deberá permitir ingresar el nombre del
empleado, el salario mensual. El programa deberá de imprimir el nombre del empleado, el descuento por llegadas tardías, la 
retención de la renta y finalmente el salario bruto.
 */
package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ejerc5sem2 {
    public static void main(String[] args) {
        //Declaracion de variables
        double salarioB;
        double descuentoT;
        double renta = 0.10;
        double salarioM;
        double salario1;
        double F;
        double minutoT;
        double total;
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#0.00");
        
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese su salario mensual");
        double salario = leer.nextDouble();
        
        System.out.println("Ingrese los minutos tardes en el mes");
        double minuto = leer.nextDouble();
        
        //Salario por minuto
        
        minutoT = salario / 30;
        salario1 = minutoT / 8;
        salarioM = salario1 / 60;
        F = salarioM * minuto;
        
        //Formula
        
        salarioB = salario - F;
        descuentoT = salarioB * renta;
        total = salarioB - descuentoT;
        
        System.out.println("Su nombre es: " + nombre);
        
        System.out.println("El descuento por llegadas tardias es de: " + formato.format(F));
        
        System.out.println("La retencion de renta es: $" + formato.format(descuentoT));
        
        System.out.println("Su salario total es de: $" + formato.format(total) );         
    } 
}