package arreglo_poo;
import java.util.Scanner;

public class EjecutaSuma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declarar variables
        int[ ] arreglo1 = new int[10];
        int[ ] arreglo2 = new int[10];
        String cad = "";

        cad = String.format("%Suma de dos arreglos\n\n%s\t\t%s\t\t%s\n\n", cad, "Arreglo 1", "Arreglo2", "Arreglo3");

        for (int i = 0;i < arreglo1.length; i++){
            System.out.println("Ingrese un numero de la posición "+ i+ " para la lista 1\n");
            arreglo1[i] = entrada.nextInt();
        }

        for (int i = 0;i < arreglo2.length; i++){
            System.out.println("Ingrese un numero de la posición "+ i+ " para la lista 2\n");
            arreglo2[i] = entrada.nextInt();

        }

        Suma sum = new Suma(arreglo1, arreglo2);

        cad = String.format("%s%s", cad, sum.suma());
        System.out.printf("%s", cad);
    }
}
