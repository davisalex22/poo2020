package herenciaAutomotriz;

import javax.swing.*;

public class EjecutaEmpleadoAut {
    public static void main(String[] args) {
        // Declaracion de variables
        String nombre,departamento,nomPuesto,cadena ="",presentacion = "";
        int numTrabajos,nuevoEmpleado = 0,seleccion,numAutos,contador = 0;
        double sueldoMensual,valorTrabajo = 0,precioAutos = 0,sueldoMinimo;

        // Iniciación de cadena con encabezado
        presentacion = String.format("%20s%20s%20s%20s%20s\n","RFC","Nombre","Departamento","Puesto","Sueldo Quincena");
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
                    // Ingreso de datos por JOptionPane
                    nombre = (JOptionPane.showInputDialog("Ingrese el nombre"));
                    departamento = (JOptionPane.showInputDialog("Ingrese el departamento"));
                    sueldoMensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Sueldo Mensual"));
                    nomPuesto = "Administrativo";
                    EmpAdmvo admi = new EmpAdmvo(nombre,departamento,nomPuesto,sueldoMensual);
                    admi.calcularSueldoAdmvo();
                    cadena = String.format("%20s%20s%20s%20s",admi.getNombreA(),admi.getDepartamentoA(),
                            admi.getPuestoA(),admi.obtenerSueldoAdmvo());
                    break;
                case 1:
                    // Ingreso de datos por JOptionPane
                    nombre = (JOptionPane.showInputDialog("Ingrese el nombre"));
                    departamento = (JOptionPane.showInputDialog("Ingrese el departamento"));
                    sueldoMensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Sueldo Mensual"));
                    numTrabajos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de trabajos"));
                    for (int i = 1; i <= numTrabajos; i++) {
                        valorTrabajo += Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Costo del Trabajo "
                                + i));
                    }
                    nomPuesto = "Mecánico";
                    EmpMecanico mecanico = new EmpMecanico(nombre, departamento, nomPuesto, numTrabajos, valorTrabajo
                             ,sueldoMensual);
                    mecanico.calcularSueldoMecanico();
                    cadena = String.format("%20s%20s%20s%20s", mecanico.getNombreA(), mecanico.getDepartamentoA(),
                            mecanico.getPuestoA(), mecanico.obtenerSueldoMecanico());
                    break;
                case 2:
                    // Ingreso de datos por JOptionPane
                    nombre = (JOptionPane.showInputDialog("Ingrese el nombre"));
                    departamento = (JOptionPane.showInputDialog("Ingrese el departamento"));
                    numAutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de Autos Vendidos"));
                    for (int i = 1; i <= numAutos; i++) {
                        precioAutos += Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del Auto "+i));
                    }
                    sueldoMinimo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo Minimo"));
                    nomPuesto = "Vendedor";
                    EmpVendedor vendedor = new EmpVendedor(nombre,departamento,nomPuesto,numAutos,precioAutos,
                            sueldoMinimo);
                    vendedor.calcularSueldoVendedor();
                    cadena = String.format("%20s%20s%20s%20s",vendedor.getNombreA(),vendedor.getDepartamentoA(),
                            vendedor.getPuestoA(),vendedor.obtenerSueldoVendedor());
                    break;
                case 3:
                    nuevoEmpleado = 1;
                    break;
                default:
                    System.out.println("Error de Selección");
            }
            contador += 1;
            // Acumulacion de cadenas para presentar en pantalla
            presentacion = String.format("%s%30d%s\n",presentacion,contador,cadena);
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
