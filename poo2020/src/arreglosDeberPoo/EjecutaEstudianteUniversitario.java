package arreglosDeberPoo;

import javax.swing.*;

public class EjecutaEstudianteUniversitario {
    public static void main(String[] args) {
        // Declaracion de Variables
        String [] nombre = new String[5];
        int [] edad = new int[5];
        String [] universidad = new String[5];
        String [] celular = new String[5];


        // Ingreso de datos por JOptionPane
        JOptionPane.showMessageDialog(null,"Ingrese Información de los Estudiantes");
        for (int i = 0; i < nombre.length; i++) {
            JOptionPane.showMessageDialog(null,"Ingrese Información para Estudiante "+(i+1));
            nombre[i] = (JOptionPane.showInputDialog("Ingrese Nombre"));
            edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
            universidad[i] = (JOptionPane.showInputDialog("Ingrese Universidad"));
            celular[i] = (JOptionPane.showInputDialog("Ingrese Celular"));
        }

        // Creacion de objeto
        EstudiateUniversitario estudiante = new EstudiateUniversitario(nombre,edad,universidad,celular);

        // Impresion de resultados
        JOptionPane.showMessageDialog(null,"Informe estudiante Universitarios\n"+
                estudiante.presentar());
    }
}
