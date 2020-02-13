package deber_seleccion;

import javax.swing.*;

public class EjecutaEjercicio14_2 {
    public static void main(String[] args) {
        // Declaracion de Variables
        String nombre;
        double valorHora;
        double horasTrabajadas;
        // Ingreso de datos por JOptionPane
        nombre = (JOptionPane.showInputDialog("Ingrese Nombre:"));
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Horas trabajadas"));
        valorHora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cuota por Hora"));
        // Creacion de objeto, con inicializacion de variables
        Ejercicio14_2 empleado = new Ejercicio14_2(nombre,valorHora,horasTrabajadas);
        // Muestra en pantalla de resultado por medio de JOptionPane
        JOptionPane.showMessageDialog(null, "Nombre del empleado: "+ empleado.getNombre() +
                ":\n"+"" +"Valor que cobra por hora: " + empleado.getVhoras()+"\n"+"Horas trabajadas: "+
                empleado.getHtrabajadas() +"\n"+"Sueldo a recibir: "+empleado.calcularSueldo()+" USD\n");
    }
}
