
package proyecto_java;

import java.util.Scanner;

public class Proyecto_java {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double a, b, suma;
        a = 3;
        b = 7;
        suma = a + b;
        System.out.println("Hola Mundo!");
        System.out.println(a + " + " + b + " = " + suma);
        System.out.println("Ingrese primer número:");
        a = Double.parseDouble(leer.nextLine());
        System.out.println("Ingrese segundo número:");
        b = Double.parseDouble(leer.nextLine());
        restar(a, b);
    }
    
    public static double restar(double a, double b){
        double resultado;
        resultado = a - b;
        return resultado;
    }
    
}
