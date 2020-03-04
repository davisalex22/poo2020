package herenciaDeudores;
import javax.swing.*;
import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showInputDialog;

public class EjecutaDeudores {
    public static void main(String[] args) {
        // Declaracion de variables
        String nombre, numCuenta,presentacion,cadena="",pantalla;
        int contador = 0,seleccion, nuevaDeuda = 0,opcion2,anios = 0;
        double capitalPrestamo;
        presentacion = String.format("%50s%s%20s%20s%20s\n","REPORTE DE DEUDORES\n","No.Cliente","Nombre","No.Cuenta"
                ,"Interés A pagar");
        // Ciclo While
        while (nuevaDeuda == 0) {
            String[] inversiones = {"Personal", "Hipotecario", "Automóvil","Salir"};
            seleccion = showOptionDialog(null, "A continuación elija una opción ",
                    "Bienvenido a Banco Prestamista", DEFAULT_OPTION, INFORMATION_MESSAGE,
                    null, inversiones, inversiones[0]);

            switch (seleccion) {
                case 0:
                    nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
                    numCuenta = JOptionPane.showInputDialog("Ingrese el Número de Cuenta");
                    capitalPrestamo = Double.parseDouble(showInputDialog("Ingrese capital a endeudarce"));
                    anios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese años"));
                    PrestamoPersona prestamoPersona = new PrestamoPersona(nombre,numCuenta,capitalPrestamo,anios);
                    prestamoPersona.calcularIteresApagar();
                    cadena = String.format("%30s%20s%20s", prestamoPersona.getNombreD(),prestamoPersona.getNumeroCuenta(),
                            prestamoPersona.obtenerIteresPagar());
                    break;
                case 1:
                    nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
                    numCuenta = JOptionPane.showInputDialog("Ingrese el Número de Cuenta");
                    capitalPrestamo = Double.parseDouble(showInputDialog("Ingrese capital a endeudarce"));
                    anios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese años"));
                    PrestamoHipotecario prestamoHip = new PrestamoHipotecario(nombre,numCuenta,capitalPrestamo,anios);
                    prestamoHip.calcularIteresApagar();
                    cadena = String.format("%30s%20s%20s", prestamoHip.getNombreD(), prestamoHip.getNumeroCuenta(),
                            prestamoHip.obtenerIteresPagar());
                    break;
                case 2:
                    nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
                    numCuenta = JOptionPane.showInputDialog("Ingrese el Número de Cuenta");
                    capitalPrestamo = Double.parseDouble(showInputDialog("Ingrese capital a edeudarce"));
                    anios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese años"));
                    PrestamoAutomovil prestamoAut = new PrestamoAutomovil(nombre,numCuenta,capitalPrestamo,anios);
                    prestamoAut.calcularIteresApagar();
                    cadena = String.format("%30s%20s%20s",prestamoAut.getNombreD(),prestamoAut.getNumeroCuenta(),
                            prestamoAut.obtenerIteresPagar());
                    break;
                case 3:
                    nuevaDeuda = 1;
                    break;
                default:
                    System.out.println("Error de selección");
            }
            contador += 1;
            // Acumulacion de cadenas para presentar en pantalla
            presentacion = String.format("%s%10d%s\n",presentacion,contador,cadena);
            pantalla = String.format("%s\nTOTAL DEUDORES: %d",presentacion,contador);
            // A continuacion se evaluara un posible nuevo calculo
            if (seleccion <= 2) {
                // Seleccion de calcula a realizar
                String[] options2 = {"Agregar Prestamista", "Presentar Informe", "Salir"};
                opcion2 = JOptionPane.showOptionDialog(null, "Seleccione una Opción ",
                        "Banco Prestamista", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null,options2, options2[0]);
                System.out.println(opcion2);
                switch (opcion2){
                    case 0:
                        nuevaDeuda = 0;
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null,pantalla);
                        nuevaDeuda = 1;
                        break;
                    case 2:
                        nuevaDeuda = 1;
                        break;
                    default:
                        System.out.println("Error de seleccion");
                }
            }
        }
    }
}
