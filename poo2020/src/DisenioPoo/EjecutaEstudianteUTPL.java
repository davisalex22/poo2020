package DisenioPoo;
import javax.swing.*;
public class EjecutaEstudianteUTPL {
    public static void main(String[] args) {
        // Declaración de variables para el ingreso de datos
        double notaBimI;
        double notaBimII;
        String nombre;
        String cicloAcademico;
        String materia;
        // Ingreso de datos por JOptionPane
        nombre = (JOptionPane.showInputDialog("Ingrese su Nombre"));
        cicloAcademico = (JOptionPane.showInputDialog("Ingrese el Ciclo Académico "));
        materia = (JOptionPane.showInputDialog("Ingrese la Materia"));
        notaBimI =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese su promedio del Primer Bimestre"));
        notaBimII =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese su promedio del Segundo Bimestre"));
        // Creación de Objeto
        EstudianteUTPL estudianteUTPL = new EstudianteUTPL(nombre,cicloAcademico,materia,notaBimI,notaBimII);
        // Muestra en pantalla de resultado por medio de JOptionPane
        JOptionPane.showMessageDialog(null, estudianteUTPL.imprimir_Informacion());
    }
}
