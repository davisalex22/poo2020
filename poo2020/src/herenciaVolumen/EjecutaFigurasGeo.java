package herenciaVolumen;
import javax.swing.*;

public class EjecutaFigurasGeo {
    public static void main(String[] args) {
        // Declaracion de Variables
        String nombre;
        int condicion,nuevaFigura = 0;
        double radio,arista,altura;
        // Ciclo While
        while (nuevaFigura == 0) {
            // Seleccion de calcula a realizar
            String[] options = {"Cubo", "Cilindro", "Cono", "Esfera", "Fin"};
            condicion = JOptionPane.showOptionDialog(null, "A continuación elija una opción ",
                    "Cálculo de Volumen", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    options, options[0]);
            System.out.println(condicion);
            // Opciones segun respuesta de seleccion
            switch (condicion) {
                case 0:
                    // Ingreso de datos por JOptionPane
                    nombre = "Cubo";
                    arista = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Arista"));
                    // Creacion de objeto estudiante
                    Cubo cubo = new Cubo(nombre, arista);
                    cubo.calcularVolCubo();
                    // Presentacion en pantalla por JOptionPane
                    JOptionPane.showMessageDialog(null, "Nombre: " + cubo.getNombre() + "\n" +
                                    "Volumen: " + cubo.obtenerVolCubo() + "\n", "Cálculo del Volumen",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 1:
                    // Ingreso de datos por JOptionPane
                    nombre = "Cilindro";
                    radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del Radio"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Altura"));
                    // Creacion de objeto estudiante
                    Cilindro cilindro = new Cilindro(nombre, radio, altura);
                    cilindro.calcularVolCilindro();
                    // Presentacion en pantalla por JOptionPane
                    JOptionPane.showMessageDialog(null, "Nombre: " + cilindro.getNombre() + "\n" +
                                    "Volumen: " + cilindro.obtenerVolCilindro() + "\n", "Cálculo del Volumen",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    // Ingreso de datos por JOptionPane
                    nombre = "Cono";
                    radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del Radio"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Altura"));
                    // Creacion de objeto estudiante
                    Cono cono = new Cono(nombre, radio, altura);
                    cono.calcularVolCono();
                    // Presentacion en pantalla por JOptionPane
                    JOptionPane.showMessageDialog(null, "Nombre: " + cono.getNombre() + "\n" +
                                    "Volumen: " + cono.obtenerVolCono() + "\n", "Cálculo del Volumen",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    // Ingreso de datos por JOptionPane
                    nombre = "Esfera";
                    radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del Radio"));
                    // Creacion de objeto estudiante
                    Esfera esfera = new Esfera(nombre, radio);
                    esfera.calcularVolEsfera();
                    // Presentacion en pantalla por JOptionPane
                    JOptionPane.showMessageDialog(null, "Nombre: " + esfera.getNombre() + "\n" +
                                    "Volumen: " + esfera.obtenerVolEsfera() + "\n", "Cálculo del Volumen",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    // En caso de seleccionar Fin nuevaFigura sera = 0 para salir del bucle
                    nuevaFigura = 1;
                    break;
                default:
                    System.out.println("Error de Selección");
            }
            // A continuacion se evaluara un posible nuevo calculo
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
