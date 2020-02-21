package matrizpoo;

import javax.swing.*;

public class EjectuaMatrizTranspuesta {
    public static void main(String[] args) {
        // Declaracion de variables
        int columnas;
        int filas;
        // Ingreso por JOptionPane de fila y columnas
        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño en filas de la Matriz"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño en columnas de la Matriz"));

        // Declaracion matriz dinamica
        int[][] matrizA = new int[filas][columnas];

        // Ingreso de datos por OptionPane de matrizA
        JOptionPane.showMessageDialog(null,"Ingrese valores de la matriz A");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++){
                matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posición "+i+":"+j));
            }
        }
        // Creacion de Objeto
        MatrizTranspuesta matriz1 = new MatrizTranspuesta(matrizA);
        // Muestra en pantalla de resultados
        JOptionPane.showMessageDialog(null,"     Matriz Original\n"+
                matriz1.presentarMatriz(matriz1.getMatrizA())+"\n     Matriz Transpuesta\n"+
                matriz1.presentarMatriz(matriz1.matrizTranspuesta(matrizA)));
    }
}
