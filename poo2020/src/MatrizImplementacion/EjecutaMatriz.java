package MatrizImplementacion;

import javax.swing.*;

public class EjecutaMatriz {
    public static void main(String[] args) {
        // Declaracion de variables
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];

        // Ingreso de datos por OptionPane de matrizA
        JOptionPane.showMessageDialog(null,"Ingrese valores de la matriz A");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++){
                matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posición "+i+":"+j));
            }
        }
        // Ingreso de datos por OptionPane de matrizB
        JOptionPane.showMessageDialog(null,"Ingrese valores de la matriz B");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB.length; j++){
                matrizB[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posición "+i+":"+j));
            }
        }
        // Creacion de objeto1
        Matriz matriz1 = new Matriz(matrizA,matrizB);

        // Impresion en pantalla
        JOptionPane.showMessageDialog(null,"     Matriz A\n"+
                matriz1.presentarMatriz(matriz1.getMatrizA())+"\n     Matriz B\n"+
                matriz1.presentarMatriz(matriz1.getMatrizB())+"\n     Matriz C\n"+
                matriz1.presentarMatriz(matriz1.sumaMatrices()));


    }
}
