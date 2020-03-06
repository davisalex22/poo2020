package ejemploLista;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class listaEstudiante {
    public static void main(String[] args) {
        // Creacion de lista;
        List<Estudiante> estudiante = new ArrayList<Estudiante>();
        boolean bandera = true;
        JOptionPane.showMessageDialog(null,"BIENVENIDO AL SISTEMA DE INGRESO DE ESTUDIANTES");
        do {
            // Seleccion de calcula a realizar
            String[] options = {"Almacenar Nuevo","Presentar","Salir"};
            int condicion = JOptionPane.showOptionDialog(null, "A continuación elija una opción",
                    "Sistema de Ingreso de Estudiantes", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null,options, options[0]);
            System.out.println(condicion);
            switch (condicion){
                case 0:
                    Estudiante estudiantes = new Estudiante();
                    estudiantes.setNombre(JOptionPane.showInputDialog("Ingrese Nombre"));
                    estudiantes.setCedula(JOptionPane.showInputDialog("Ingrese Cédula"));
                    estudiantes.setCarrera(JOptionPane.showInputDialog("Ingrese Carrera"));
                    estudiantes.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Edad")));
                    estudiantes.setCorreo(JOptionPane.showInputDialog("Ingrese Correo"));
                    // Agregamos objeto vehículo a la lista
                    estudiante.add(estudiantes);
                    break;
                case 1:
                    String cadena = String.format("%20s\n%s","DATOS ESTUDIANTES","--------------------------");
                    // Recoremos la lista con un foreach
                    for (Estudiante e:estudiante){
                        cadena = String.format("%s\nNombre: %s\nCédula: %s\nCarrera: %s\nEdad: %d\nCorreo: %s\n%s",
                                cadena,e.getNombre(),e.getCedula(),e.getCarrera(),e.getEdad(),e.getCorreo()
                                ,"--------------------------");
                    }
                    JOptionPane.showMessageDialog(null,cadena);
                    bandera = false;
                    break;
                case 2:
                    bandera = false;
                    break;
                default:
                    System.out.println("Error de Selección");
            }
        }while (bandera == true);
    }
}


