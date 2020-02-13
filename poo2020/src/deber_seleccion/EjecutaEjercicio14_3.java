package deber_seleccion;

import javax.swing.*;
public class EjecutaEjercicio14_3 {
    public static void main(String[] args) {
        // Declaracion de Variables
        double num1;
        double num2;
        double num3;
        double num4;
        // Ingreso de datos por JOptionPane
        num1 =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese Número 1"));
        num2 =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese Número 2"));
        num3 =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese Número 3"));
        num4 =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese Número 4"));
        // Creacion de objeto
        Ejercicio14_3 numeros = new Ejercicio14_3(num1,num2,num3,num4);
        // Muestra en pantalla de resultado por medio de JOptionPane
        JOptionPane.showMessageDialog(null, "   OBTENCION DE NÚMERO MAYOR\n"+
                "Números: "+"\n             "+numeros.getNum1()+"\n             "+numeros.getNum2()+"\n             "+
                numeros.getNum3()+"\n             "+numeros.getNum4()+"\nNÚMERO MAYOR: "+numeros.numeroAlto()+"\n");

    }
}
