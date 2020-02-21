package arreglo_poo;

import javax.swing.*;

public class EjecutaArreglo {
    public static void main(String[] args) {
        int[] vectorA = new int[10];
        int [] vectorB = new int[10];
        // Ingreso de datos por OptionPane
        JOptionPane.showMessageDialog(null,"Ingrese valores del Vector A");
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posición "+i));
        }
        JOptionPane.showMessageDialog(null,"Ingrese valores del Vector B");
        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posición "+i));
        }
        // Creacion de objeto
        Arreglo arreglo = new Arreglo(vectorA,vectorB);
        // Impresion en pantalla
        JOptionPane.showMessageDialog(null,"CÁLCULO SUMATORIA\n"+"Valores Vector A:\n"+
                arreglo.presentarVector1()+"\n"+"Valores Vector B:\n"+arreglo.presentarVector2()+"\n"+"Resultado: "+
                arreglo.Sumatoria_producto());
    }
}
