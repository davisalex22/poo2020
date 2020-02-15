package disenio_repeticion;
import javax.swing.*;

public class EjecutaEmpleado_For {
    public static void main(String[] args) {
    // Declaracion de variables
        int horasTrabajadas;
        double valorHora;
        String nombre;
       int opcion =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de empleados"));
        for (int i = 0; i < opcion; i++){
            nombre = (JOptionPane.showInputDialog("Ingrese Nombre:"));
            valorHora =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor por Hora"));
            horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Horas trabajadas"));
            // Creacion de objeto, con inicializacion de variables
            Empleado_while empleado = new Empleado_while(nombre,horasTrabajadas,valorHora);
            JOptionPane.showMessageDialog(null, "Nombre del empleado: "+ empleado.getNombre() +
                    ":\n"+"" +"Valor que cobra por hora: " + empleado.getValorHoras()+"\n"+"Horas trabajadas: "+
                    empleado.getHorasTrabajadas() +"\n"+"Sueldo a recibir: "+empleado.calcularSueldo()+" USD\n");

        }
    }
}
