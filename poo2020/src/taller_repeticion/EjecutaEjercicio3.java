package taller_repeticion;

import javax.swing.*;

public class EjecutaEjercicio3 {
    public static void main(String[] args) {
        // Declaracion de variables
        double num1,num2;
        int nuevoCalculo = 0 ;
        // Uso del While si se desea realizar nuevos Cálculos
        while (nuevoCalculo == 0){
            // Ingreso de datos por teclado
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dividendo"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Divisor 2"));
            // Creacion de objetos
            Ejercicio3 ejercicio3 = new Ejercicio3(num1,num2);
            JOptionPane.showMessageDialog(null, " Calculo de la división\n"+"Dividendo: "
            + ejercicio3.getNum1()+"\n"+"Divisor: "+ejercicio3.getNum2()+"\n"+"RESPUESTA: " +
            ejercicio3.calcularDivision());
            // 0=yes, 1=no, 2=cancel
            int opcion = JOptionPane.showConfirmDialog(null,"Desea realizar otro Cálculo");
            if (opcion == 1){
                nuevoCalculo = 1;
            }
        }
    }
}
