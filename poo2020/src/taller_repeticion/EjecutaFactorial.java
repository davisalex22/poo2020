package taller_repeticion;

import java.util.Scanner;

public class EjecutaFactorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaración de Variables
        int f;
        String cad = "";
        boolean val = true;
        int num;
        cad = String.format("%s%s\n%s\t\t%s\n",cad,"Programa para saber el factorial de un número",
                "Número ingresado", "Factorial");
        while (val == true){
            System.out.println("Ingrese el Número");
            f = entrada.nextInt();
            // Creacion del objeto
            Factorial fact = new Factorial(f);
            cad = String.format("%s%s", cad, fact.obtenerDatos());
            System.out.println();
            System.out.println("Desea ingresar más números Presione:\n1._Si\n2._No\n");
            num = entrada.nextInt();
            if (num == 2){
                val = false;
            }
            entrada.nextLine();
        }
        System.out.printf("%s", cad);
    }
}
