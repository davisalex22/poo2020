package matrizpoo;
import java.util.Scanner;
public class EjecutaPromedio {
    // Declaracion de variables
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaracion de la matriz
        int[][] matriz = new int[3][3];
        System.out.println("Ingreso de valores dela Matriz");
        // Ciclo para recorrer la matriz y llenar los campos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++){
                System.out.println("Ingrese el valor de la posicion "+"["+i+"],["+j+"]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        // Creacion del objeto
        Promedio promedio = new Promedio(matriz);
        // Print final 
        System.out.println(promedio.presentacionMatriz(promedio.getMatrizA()));
    }

}
