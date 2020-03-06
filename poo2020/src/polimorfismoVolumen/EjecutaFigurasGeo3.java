package polimorfismoVolumen;
import javax.swing.*;
public class EjecutaFigurasGeo3 {
    public static void main(String[] args) {
        // Declaracion de Variables
        int nuevaFigura = 0,condicion;
        while (nuevaFigura ==0){
            // Selección de Opciones
            String[] options = {"Cilindro","Cono","Cubo","Esfera","Fin"};
            condicion = JOptionPane.showOptionDialog(null,"A continuación elija una opcion",
                    "Cálculo de Volumenes",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,
                    options,options[0]);
            System.out.println(condicion);
            switch (condicion){
                case 0:
                    CilindroP cilindroP = new CilindroP();
                    JOptionPane.showMessageDialog(null, "Cálculo del volumen del Cilindro");
                    cilindroP.setAlturaGeo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura")));
                    cilindroP.setRadioGeo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Radio")));
                    cilindroP.calcularVolumen();
                    JOptionPane.showMessageDialog(null, String.format("El volumen del Cilindro es: %.2f",
                            cilindroP.getVolumenGeo()));
                    break;
                case 1:
                    ConoP conoP = new ConoP();
                    JOptionPane.showMessageDialog(null, "Cálculo del volumen del Cono");
                    conoP.setAlturaGeo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura")));
                    conoP.setRadioGeo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Radio")));
                    conoP.calcularVolumen();
                    JOptionPane.showMessageDialog(null, String.format("El volumen del Cono es: %.2f",
                            conoP.getVolumenGeo()));
                    break;
                case 2:
                    CuboP cuboP = new CuboP();
                    JOptionPane.showMessageDialog(null, "Cálculo del volumen del Cubo");
                    cuboP.setAristaGeo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese Arista")));
                    cuboP.calcularVolumen();
                    JOptionPane.showMessageDialog(null, String.format("El volumen del Cubo es: %.2f",
                            cuboP.getVolumenGeo()));
                    break;
                case 3:
                    EsferaP esferaP = new EsferaP();
                    JOptionPane.showMessageDialog(null, "Cálculo del volumen de la Esfera");
                    esferaP.setRadioGeo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese EL Radio")));
                    esferaP.calcularVolumen();
                    JOptionPane.showMessageDialog(null, String.format("El volumen de la Esfera es: %.2f",
                            esferaP.getVolumenGeo()));
                    break;
                case 4:
                    // En caso de seleccionar Fin nuevaFigura sera = 0 para salir del bucle
                    nuevaFigura = 1;
                    break;
                default:
                    System.out.println("Error de Selección");
            }
            if (condicion <= 3) {
                // 0=yes, 1=no, 2=cancel
                int opcion = JOptionPane.showConfirmDialog(null, "Desea realizar otro Cálculo");
                if (opcion == 1 || opcion == 2) {
                    nuevaFigura = 1;
                }
            }
        }
    }
}
