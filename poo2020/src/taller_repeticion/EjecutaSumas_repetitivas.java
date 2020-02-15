package taller_repeticion;

import java.util.Scanner;

public class EjecutaSumas_repetitivas {
    public static void main(String[] args) {
        // Creacion de objeto, con inicializacion de variables
        Scanner teclado = new Scanner(System.in);
        boolean nuevoNumero = true;
        while(nuevoNumero == true){
            System.out.println("Ingrese el primer número: ");
            double num1 = teclado.nextDouble();
            System.out.println("Ingrese el segundo número: ");
            double num2 = teclado.nextDouble();
            Sumas_repetitivas sumas_repetitivas = new Sumas_repetitivas(num1,num2);
            System.out.println("El resultado es: "+sumas_repetitivas.calcularMultiplicacion());
            System.out.println("Desea realizar otra multiplicación: 1.- Si | 2.- No ");
            double opcion = teclado.nextDouble();
            if(opcion == 2){
                nuevoNumero = false;
            }
            teclado.nextLine();
        }
    }
}
