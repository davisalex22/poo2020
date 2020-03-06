package polimorfismo_figura;

import javax.swing.*;

public class EjecutaFigura3 {
    public static void main(String[] args) {
        // Declaracion de Variables
        int nuevaFigura =0, condicion;
        while (nuevaFigura == 0) {
            // Seleccion de Opciones
            String[] options = {"Rectángulo", "Círculo", "Cuadrado", "Triángulo"};
            condicion = JOptionPane.showOptionDialog(null, "A continuación elija una opción ",
                    "Cálculo de Areas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    options, options[0]);
            System.out.println(condicion);
            switch (condicion){
                case 0:
                    Rectangulo3 rectangulo3 = new Rectangulo3();
                    JOptionPane.showMessageDialog(null, "Cálculo del área del rectángulo");
                    rectangulo3.setAlturaRecta(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura")));
                    rectangulo3.setBaseRecta(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base")));
                    rectangulo3.calcularArea();
                    JOptionPane.showMessageDialog(null, String.format("El área del rectángulo es: %.2f",
                            rectangulo3.getArea()));
                    break;
                case 1:
                    Circulo3 circulo3 = new Circulo3();
                    JOptionPane.showMessageDialog(null, "Cálculo del área del círculo");
                    circulo3.setRadio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del Radio")));
                    circulo3.calcularArea();
                    JOptionPane.showMessageDialog(null, String.format("El área del circulo es: %.2f",
                            circulo3.getArea()));
                    break;
                case 2:
                    Cuadrado3 cuadrado3 = new Cuadrado3();
                    JOptionPane.showMessageDialog(null, "Cálculo del área del cuadrado");
                    cuadrado3.setLadoCuadrado(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado ")));
                    cuadrado3.calcularArea();
                    JOptionPane.showMessageDialog(null, String.format("El área del cuadrado es: %.2f",
                            cuadrado3.getArea()));
                    break;
                case 3:
                    Triangulo3 triangulo3 = new Triangulo3();
                    JOptionPane.showMessageDialog(null, "Cálculo del área del triángulo");
                    triangulo3.setAlturaTrian(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura")));
                    triangulo3.setBaseTrian(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base")));
                    triangulo3.calcularArea();
                    JOptionPane.showMessageDialog(null, String.format("El área del triángulo es: %.2f",
                            triangulo3.getArea()));
                    break;//
                default:
                    System.out.println("Error de Selección");
            }
             // A continuacion se evaluara un posible nuevo calculo
            int opcion = JOptionPane.showConfirmDialog(null,"Desea realizar otro Cálculo");
            // 0=yes, 1=no, 2=cancel
            if (opcion == 1 || opcion == 2){
                nuevaFigura = 1;
            }
        }
    }
}
