package herencia_figura;
import javax.swing.*;

public class EjecutaFigura {
    public static void main(String[] args) {
        // Declaracion de variables
        String nombre;
        int condicion, nuevaFigura = 0;
        double base,altura,radio,lado;
        // Ciclo While
        while (nuevaFigura == 0){
            // Seleccion de Opciones
            String[] options = {"Rectángulo", "Círculo","Cuadrado","Triángulo"};
            condicion = JOptionPane.showOptionDialog(null, "A continuación elija una opción ",
                    "Cálculo de Areas",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    options, options[0]);
            System.out.println(condicion);
            // Opciones segun seleccion
            switch (condicion){
                case 0:
                    // Ingreso de datos por JOptionPane
                    nombre = "Rectángulo";
                    base =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Base"));
                    altura =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Altura"));
                    // Creacion de objeto estudiante
                    Rectangulo rectang = new Rectangulo(nombre,base,altura);
                    rectang.calcularAreaRecta();
                    // Presentacion en pantalla por JOptionPane
                    JOptionPane.showMessageDialog(null,"Nombre: "+rectang.getNombre()+"\nÁrea: "+
                            rectang.obtenerAreaRecta()+"\n","Cálculo de Área",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 1:
                    // Ingreso de datos por JOptionPane
                    nombre = "Círculo";
                    radio =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del Radio"));
                    // Creacion de objeto estudiante
                    Circulo circulo = new Circulo(nombre,radio);
                    circulo.calcularAreaCirculo();
                    // Presentacion en pantalla por JOptionPane
                    JOptionPane.showMessageDialog(null,"Nombre: "+circulo.getNombre()+"\nÁrea: "+
                            circulo.obtenerAreaCirculo()+"\n","Cálculo de Área",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    // Ingreso de datos por JOptionPane
                    nombre = "Cuadrado";
                    lado =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del lado"));
                    // Creacion de objeto estudiante
                    Cuadrado cuadrado = new Cuadrado(nombre,lado);
                    cuadrado.calcularAreaCuadrado();
                    // Presentacion en pantalla por JOptionPane
                    JOptionPane.showMessageDialog(null,"Nombre: "+cuadrado.getNombre()+"\nÁrea: "+
                            cuadrado.obtenerAreaCuadrado()+"\n","Cálculo de Área",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    // Ingreso de datos por JOptionPane
                    nombre = "Triángulo";
                    base =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Base"));
                    altura =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Altura"));
                    // Creacion de objeto estudiante
                    Triangulo triangulo = new Triangulo(nombre,base,altura);
                    triangulo.calcularAreaTri();
                    // Presentacion en pantalla por JOptionPane
                    JOptionPane.showMessageDialog(null,"Nombre: "+triangulo.getNombre()+"\nÁrea: "+
                            triangulo.obtenerAreaTrian()+"\n","Cálculo de Área",JOptionPane.INFORMATION_MESSAGE);
                    break;
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
