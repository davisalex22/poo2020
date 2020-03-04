package polimorfismo_poo;

import javax.swing.*;

public class EjecutaEmpleado12 {
    public static void main(String[] args) {
        // Obtener el sueldo quincenal de un empleado por horas
        EmpleadoPorHoras2 empHoras = new EmpleadoPorHoras2();
        JOptionPane.showMessageDialog(null,"Cálculo sueldo quincenal empleado por horas");
        empHoras.setHoras_trabajadas(Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas trabajadas")));
        empHoras.setCuota_por_hora(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cuota por hora")));
        empHoras.calculasSueldoQna();
        JOptionPane.showMessageDialog(null,"El sueldo Quincenal es: "+empHoras.getSueldo());
        EmpleadoAsalariado2 empAs = new EmpleadoAsalariado2();
        JOptionPane.showMessageDialog(null,"Cálculo de sueldo quincenal de empleado asalariado");
        empAs.setSueldo_mensual(Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo mensual")));
        empAs.calculasSueldoQna();
        JOptionPane.showMessageDialog(null,"El sueldo quincenal es: "+empAs.getSueldo());
    }
}
