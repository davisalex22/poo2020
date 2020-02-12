package disenio_seleccion;

import javax.swing.*;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        // Declaración de variables
        String nombre;
        int horasTrabajadas;
        int valorHora;
        int sueldo;
        // Ingreso de datos por cuadro de ingreso de datos
        nombre = (JOptionPane.showInputDialog("Ingrese Nombre:"));
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Horas trabajadas"));
        valorHora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cuota por Hora"));
        // Creacion de objeto empleado
        Empleado empleado = new Empleado(nombre,horasTrabajadas,valorHora);
        // Muestra en pantalla de resultado por medio de JOptionPane
        JOptionPane.showMessageDialog(null, "   ESTADO EMPLEADO\n"+
                                                                "Nombre: "+empleado.getNombreEmpleado()+"\n"+
                                                                "Horas Trabajadas: "+empleado.getHorasTrabajadas()+"\n"+
                                                                "Valor por Hora: "+ empleado.getValorHora()+"\n"+
                                                                "Su sueldo es: "+empleado.calcularSueldo()+" USD");

    }
}
