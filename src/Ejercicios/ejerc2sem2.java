/*
2-. Hacer un programa que calcule el valor del DAI (Derecho Arancelario a la Importación) para un vehículo del año 2010 
utilizando la siguiente fórmula:
DAI = (Valor Vehículo en USA – Depreciación - Flete – Seguro) * 0.25
Depreciación = Valor Vehículo en USA * 0.10

El programa deberá permitir ingresar vía teclado los valores para el valor del vehículo en USA, flete y seguro. Por el momento 
el porcentaje de la depreciación será constante. Para efectos de prueba puede utilizar los siguientes valores: 

Valor USA = 5000, Depreciación = 10%, Flete = 700, Seguro = 100. 
Imprimir los valores capturados así como el monto del DAI. 
 */
package Ejercicios;

import java.util.Scanner;

public class ejerc2sem2 {
    public static void main(String[] args) {
        double DAI;
        double depreciacion = 0.10;
        double total1;
        double total2;
        double total3;
        double mul1 = 0.25;
        double mul2 = 0.10;
        double total;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del vehiculo en USA");
        double valorV = leer.nextDouble();
        
        System.out.println("Ingrse el costo por flete");
        double flete = leer.nextDouble();
        
        System.out.println("Ingrese el valor de seguro");
        double seguro = leer.nextDouble();
        
        DAI = valorV * depreciacion;
        total1 = valorV - DAI;
        total2 = total1 - flete;
        total3 = total2 - seguro;
        total = total3 * mul1;
        
        System.out.println("EL valor por Derecho Arancelario a la importacion de su vehiculo es de: $" + total);
        
        depreciacion = valorV * mul2;
        
        System.out.println("El valor de Depreciacion es de: $" + depreciacion);
        
    }
}
