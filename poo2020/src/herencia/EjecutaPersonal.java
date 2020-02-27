package herencia;

import javax.swing.*;

public class EjecutaPersonal {
    public static void main(String[] args) {
        // Declaracion de variables
        String nombre, identificacion,estado_civil,fecha_nac,carrera,area,dependencia;

        // Ingreso de datos por JOptionPane
        JOptionPane.showMessageDialog(null, "CREACIÓN DE OBJETO ESTUDIANTE");
        nombre = (JOptionPane.showInputDialog("Ingrese el nombre"));
        identificacion = (JOptionPane.showInputDialog("Ingrese la identificación"));
        carrera = (JOptionPane.showInputDialog("Ingrese la carrera"));
        estado_civil = (JOptionPane.showInputDialog("Ingrese el estado civil"));
        fecha_nac = (JOptionPane.showInputDialog("Ingrese la fecha de nacimiento"));

        // Creacion de objeto estudiante
        Estudiante estudiante = new Estudiante(nombre,carrera,identificacion,estado_civil,fecha_nac);

        // Presentacion en pantalla por JOptionPane
        JOptionPane.showMessageDialog(null,"Datos de Objeto Estudiante\n"+"Nombre: "+
                estudiante.getNombre()+"\n"+"Identificación: "+estudiante.getIdentificacion()+"\n"+"Carrera: "+
                estudiante.getCarrera()+"\n"+"Estado Civil: "+estudiante.getEstado_civil()+"\n"+"Fecha de nacimiento: "+
                estudiante.getFecha_nacimiento()+"\n");
        /**
         * Ingreso de datos y muestra en pantalla Docente
         */
        // Ingreso de datos por JOptionPane
        JOptionPane.showMessageDialog(null, "CREACIÓN DE OBJETO DOCENTE");
        nombre = (JOptionPane.showInputDialog("Ingrese el nombre"));
        identificacion = (JOptionPane.showInputDialog("Ingrese la identificación"));
        area = (JOptionPane.showInputDialog("Ingrese el Área"));
        estado_civil = (JOptionPane.showInputDialog("Ingrese el estado civil"));
        fecha_nac = (JOptionPane.showInputDialog("Ingrese la fecha de nacimiento"));

        // Creacion de objeto docente
        Docente docente = new Docente(nombre,area,identificacion,estado_civil,fecha_nac);

        // Presentacion en pantalla por JOptionPane
        JOptionPane.showMessageDialog(null,"Datos de Objeto Estudiante\n"+"Nombre: "+
                docente.getNombre()+"\n"+"Identificación: "+docente.getIdentificacion()+"\n"+"Área: "+
                docente.getArea()+"\n"+"Estado Civil: "+docente.getEstado_civil()+"\n"+"Fecha de nacimiento: "+
                docente.getFecha_nacimiento()+"\n");

        /**
         * Ingreso de datos y muestra en pantalla de Administrativo
         */
        // Ingreso de datos por JOptionPane
        JOptionPane.showMessageDialog(null, "CREACIÓN DE OBJETO ADMINISTRATIVO");
        nombre = (JOptionPane.showInputDialog("Ingrese el nombre"));
        identificacion = (JOptionPane.showInputDialog("Ingrese la identificación"));
        dependencia = (JOptionPane.showInputDialog("Ingrese de dependencia"));
        estado_civil = (JOptionPane.showInputDialog("Ingrese el estado civil"));
        fecha_nac = (JOptionPane.showInputDialog("Ingrese la fecha de nacimiento"));

        // Creacion de objeto administrativo
        Administrativo administrativo = new Administrativo(nombre,dependencia,identificacion,estado_civil,fecha_nac);

        // Presentacion en pantalla por JOptionPane
        JOptionPane.showMessageDialog(null,"Datos de Objeto Estudiante\n"+"Nombre: "+
                administrativo.getNombre()+"\n"+"Identificación: "+administrativo.getIdentificacion()+"\n"+
                "Dependencia: "+estudiante.getCarrera()+"\n"+"Estado Civil: "+administrativo.getEstado_civil()+"\n"+
                "Fecha de nacimiento: "+administrativo.getFecha_nacimiento()+"\n");

    }
}
