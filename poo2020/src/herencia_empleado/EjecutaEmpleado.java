package herencia_empleado;

import javax.swing.*;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        //Declaracion de variables
        String nombre,cargo,dependencia;
        int condicion,hora;
        double valorHora,valorMensual;

        // Seleccion de Opciones
        String[] options = {"Empleado por Hora", "Empleado Asalariado"};
        condicion = JOptionPane.showOptionDialog(null, "A continuación elija una opción ",
                "Calculo de Sueldo",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                options, options[0]);
        System.out.println(condicion);

        // Opciones segun seleccion
        if (condicion == 0){
            // Ingreso de datos por JOptionPane
            nombre = (JOptionPane.showInputDialog("Ingrese el nombre"));
            cargo = (JOptionPane.showInputDialog("Ingrese el cargo"));
            dependencia = (JOptionPane.showInputDialog("Ingrese la dependencia"));
            hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Horas trabajadas"));
            valorHora =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor por Hora"));

            // Creacion de objeto estudiante
            EmpleadoPorHora empleado = new EmpleadoPorHora(nombre,cargo,dependencia,hora,valorHora);

            // Presentacion en pantalla por JOptionPane
            JOptionPane.showMessageDialog(null,"Sueldo Empleado por Hora\n"+"Nombre: "+
                    empleado.getNombre()+"\n"+"Cargo: "+empleado.getCargo()+"\n"+"Dependencia: "+
                    empleado.getDependencia()+"\n"+"Horas trabajadas: "+empleado.getHora()+"\n"+"Sueldo: "+
                    empleado.calcularSueldoPorHoras()+"\n");
        }else{
            if(condicion == 1){
                // Ingreso de datos por JOptionPane
                nombre = (JOptionPane.showInputDialog("Ingrese el nombre"));
                cargo = (JOptionPane.showInputDialog("Ingrese el cargo"));
                dependencia = (JOptionPane.showInputDialog("Ingrese la dependencia"));
                valorMensual =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor Mensual"));

                // Creacion de objeto estudiante
                EmpleadoAsalariado empleado = new EmpleadoAsalariado(nombre,cargo,dependencia,valorMensual);

                // Presentacion en pantalla por JOptionPane
                JOptionPane.showMessageDialog(null,"Sueldo Empleado por Hora\n"+"Nombre: "+
                        empleado.getNombre()+"\n"+"Cargo: "+empleado.getCargo()+"\n"+"Dependencia: "+
                        empleado.getDependencia()+"\n"+"Sueldo: "+empleado.calcularSueldoMensual()+"\n");

            }
        }

    }
}
