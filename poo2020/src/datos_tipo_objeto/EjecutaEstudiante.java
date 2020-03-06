package datos_tipo_objeto;

import javax.swing.*;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        // Declaración de Variables
        int opcion, cont;
        Estudiante[] estudiantes = new Estudiante[3];
        Estudiante estudiante;
        boolean bandera = true;
        for (cont = 0; cont < estudiantes.length; cont++) {
            String[] options = {"Ingresar Estudiante", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "A continuación elija una opción",
                    "Ingreso Nuevo Estudiante", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null,options, options[0]);
            System.out.println(opcion);
            Estudiante est = new Estudiante();
            est.setNombre(JOptionPane.showInputDialog("Ingrese Nombre"));
            est.setCedula(JOptionPane.showInputDialog("Ingrese la Cédula"));
            est.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
            est.setCarrera(JOptionPane.showInputDialog("Ingrese Carrera"));
            est.setCorreo(JOptionPane.showInputDialog("Ingrese Correo"));
            // Asignamos el objeto est a la variable estudiante
            estudiantes[cont] = est;
        }
        String cadena = "LISTADO DE ESTUDIANTES";
        double edad_acum = 0;
        for(cont = 0; cont < estudiantes.length;cont++){
            edad_acum += estudiantes[cont].getEdad()/3;
            cadena = String.format("%s\n%s\n%s\n%d\n%s\n%s\n",cadena,estudiantes[cont].getNombre(),
                    estudiantes[cont].getCedula(),estudiantes[cont].getEdad(),estudiantes[cont].getCarrera(),
                    estudiantes[cont].getCorreo());
        }
        JOptionPane.showMessageDialog(null,String.format("%s\nEDAD PROMEDIO DE LOS ESTUDIANTES = %.2f",
                cadena,edad_acum));
    }
}

