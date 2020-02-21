package arreglosDeberPoo;
import javax.swing.*;

public class EjecutaVerificadorCedula {
    public static void main(String[] args) {
        // Declaracion de variables
        String numCedula;
        // Ingreso del numero binario JOptionPane
        numCedula = (JOptionPane.showInputDialog("Ingrese su Número de Cédula"));
        // Creacion del objeto
        VerificadorCedula verificadorCedula = new VerificadorCedula(numCedula);
        // Muestra en Pantalla con JOptionPane
        JOptionPane.showMessageDialog(null, verificadorCedula.presentarVerificacion());
    }




}
