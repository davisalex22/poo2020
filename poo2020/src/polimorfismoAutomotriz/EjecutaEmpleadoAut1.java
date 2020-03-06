package polimorfismoAutomotriz;

import javax.swing.*;

public class EjecutaEmpleadoAut1 {
    public static void main(String[] args) {
        // Declaracion de variables
        String cadena ="",presentacion;
        int numTrabajos,nuevoEmpleado = 0,seleccion,contador = 0;
        double autosTotal = 0,valorTrabajo = 0;
        // Iniciación de cadena con encabezado
        presentacion = String.format("%20s%20s%25s%22s%35s\n","RFC","Nombre","Departamento","Puesto","Sueldo Quincena");
        // Ciclo While
        while (nuevoEmpleado == 0) {
            // Seleccion de calculo a realizar
            String[] options = {"Administrativo", "Mecánico", "Vendedor","Salir"};
            seleccion = JOptionPane.showOptionDialog(null, "A continuación elija una opción ",
                    "Seleccione el Puesto", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null,options, options[0]);
            System.out.println(seleccion);
            // Opciones segun respuesta de seleccion
            switch (seleccion) {
                case 0:
                    EmpAdmvo1 empAdmvo1 = new EmpAdmvo1();
                    empAdmvo1.setNombreA(JOptionPane.showInputDialog("Ingrese el Nombre"));
                    empAdmvo1.setDepartamentoA(JOptionPane.showInputDialog("Ingrese el Departamento"));
                    empAdmvo1.setPuestoA("Administrativo");
                    empAdmvo1.setSueldoMensual(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo " +
                            "mensual")));
                    empAdmvo1.calculasSueldoQna();
                    cadena = String.format("%25s%25s%30s%25s",empAdmvo1.getNombreA(),empAdmvo1.getDepartamentoA(),
                            empAdmvo1.getPuestoA(),empAdmvo1.getSueldo());
                    break;
                case 1:
                    EmpMecanico1 empMecanico1 = new EmpMecanico1();
                    empMecanico1.setNombreA(JOptionPane.showInputDialog("Ingrese el Nombre"));
                    empMecanico1.setDepartamentoA(JOptionPane.showInputDialog("Ingrese el Departamento"));
                    empMecanico1.setSueldoMensual(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo " +
                            "mensual")));
                    empMecanico1.setPuestoA("Mecánico");
                    numTrabajos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de trabajos"));
                    for (int i = 1; i <= numTrabajos; i++) {
                        valorTrabajo += Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Costo del Trabajo "
                                + i));
                    }
                    empMecanico1.setValorTrabajo(valorTrabajo);
                    empMecanico1.calculasSueldoQna();
                    cadena = String.format("%25s%25s%30s%25s", empMecanico1.getNombreA(), empMecanico1.getDepartamentoA(),
                            empMecanico1.getPuestoA(), empMecanico1.getSueldo());
                    break;
                case 2:
                    EmpVendedor1 empVendedor1 = new EmpVendedor1();
                    empVendedor1.setNombreA(JOptionPane.showInputDialog("Ingrese el Nombre"));
                    empVendedor1.setDepartamentoA(JOptionPane.showInputDialog("Ingrese el Departamento"));
                    empVendedor1.setSueldoMinimo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo " +
                            "mínimo")));
                    empVendedor1.setPuestoA("Vendedor");
                    numTrabajos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de trabajos"));
                    for (int i = 1; i <= numTrabajos; i++) {
                        autosTotal += Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Costo del Trabajo "
                                + i));
                    }
                    empVendedor1.setAutosTotal(autosTotal);
                    empVendedor1.calculasSueldoQna();
                    cadena = String.format("%25s%25s%30s%25s",empVendedor1.getNombreA(),empVendedor1.getDepartamentoA(),
                            empVendedor1.getPuestoA(),empVendedor1.getSueldo());
                    break;
                case 3:
                    nuevoEmpleado = 1;
                    break;
                default:
                    System.out.println("Error de Selección");
            }
            contador += 1;
            // Acumulacion de cadenas para presentar en pantalla
            presentacion = String.format("%s%20d%s\n",presentacion,contador,cadena);
            // A continuacion se evaluara un posible nuevo calculo
            if (seleccion <= 2) {
                // Seleccion de calcula a realizar
                String[] options1 = {"Agregar Empleado", "Presentar Informe", "Salir"};
                int opcion = JOptionPane.showOptionDialog(null, "Seleccione una Opción ",
                        "Automotriz", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null,options1, options1[0]);
                System.out.println(opcion);
                switch (opcion){
                    case 0:
                        nuevoEmpleado = 0;
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null,presentacion);
                        nuevoEmpleado = 1;
                        break;
                    case 2:
                        nuevoEmpleado = 1;
                        break;
                    default:
                        System.out.println("Error de seleccion");
                }
            }
        }
    }
}
