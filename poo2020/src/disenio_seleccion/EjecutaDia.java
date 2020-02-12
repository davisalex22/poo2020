package disenio_seleccion;

import javax.swing.*;

public class EjecutaDia {
    public static void main(String[] args) {
        // Declaracion de variable
        int numDia;
        // Ingreso de datos por cuadro de texto
        numDia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del día"));
        // Creacion de objeto empleado
        Dia dia = new Dia(numDia);
        // Muestra en pantalla de resultado por medio de JOptionPane
        JOptionPane.showMessageDialog(null, "   OBTENCION NOMBRE DÍA\n"+
                "Número ingresado: "+dia.getNumDia()+"\n"+
                "Nombre del día: "+dia.nombreDia()+"\n");
    }
}
