package herenciaInversionistas;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class EjecutaInversionista {
    public static void main(String[] args) {
        // Declaracion de variables
        String nombre, numCuenta,presentacion,cadena="",pantalla;
        int contador = 0,seleccion,nuevaInversion = 0,opcion2,anios = 0;
        double capitalInvertido;
        presentacion = String.format("%50s%s%20s%20s%20s\n","REPORTE DE INVERSIONES\n","No.Cliente","Nombre","No.Cuenta"
                ,"Interés Ganado");
        // Ciclo While
        while (nuevaInversion == 0) {
            String[] inversiones = {"Cuenta de Ahorros", "Pagare", "Cuenta Maestra","Salir"};
            seleccion = showOptionDialog(null, "A continuación elija una opción ",
                    "Bienvenido a Banco Inversionista", DEFAULT_OPTION, INFORMATION_MESSAGE,
                    null, inversiones, inversiones[0]);

            switch (seleccion) {
                case 0:
                    nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
                    numCuenta = JOptionPane.showInputDialog("Ingrese el Número de Cuenta");
                    capitalInvertido = Double.parseDouble(showInputDialog("Ingrese capital a Invertir"));
                    anios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese años"));
                    CuentaAhorro cuentaAhorro = new CuentaAhorro(nombre, numCuenta, capitalInvertido,anios);
                    cuentaAhorro.calcularIteresGanado();
                    cadena = String.format("%30s%20s%20s", cuentaAhorro.getNombreC(), cuentaAhorro.getNumeroCuenta(),
                            cuentaAhorro.obtenerInteresGanado());
                    break;
                case 1:
                    nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
                    numCuenta = JOptionPane.showInputDialog("Ingrese el Número de Cuenta");
                    capitalInvertido = Double.parseDouble(showInputDialog("Ingrese capital a Invertir"));
                    anios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese años"));
                    Pagare pagare1 = new Pagare(nombre, numCuenta, capitalInvertido,anios);
                    pagare1.calcularIteresGanado();
                    cadena = String.format("%30s%20s%20s", pagare1.getNombreC(), pagare1.getNumeroCuenta(),
                            pagare1.obtenerInteresGanado());
                    break;
                case 2:
                    nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
                    numCuenta = JOptionPane.showInputDialog("Ingrese el Número de Cuenta");
                    capitalInvertido = Double.parseDouble(showInputDialog("Ingrese capital a Invertir"));
                    anios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese años"));
                    CuentaMaestra cuentaMaestra = new CuentaMaestra(nombre, numCuenta, capitalInvertido,anios);
                    cuentaMaestra.calcularIteresGanado();
                    cadena = String.format("%30s%20s%20s", cuentaMaestra.getNombreC(), cuentaMaestra.getNumeroCuenta(),
                            cuentaMaestra.obtenerInteresGanado());
                    break;
                case 3:
                    nuevaInversion = 1;
                    break;
                default:
                    System.out.println("Error de selección");
            }
            contador += 1;
            // Acumulacion de cadenas para presentar en pantalla
            presentacion = String.format("%s%10d%s\n",presentacion,contador,cadena);
            pantalla = String.format("%s\nTOTAL INVERSORES: %d",presentacion,contador);
            // A continuacion se evaluara un posible nuevo calculo
            if (seleccion <= 2) {
                // Seleccion de calcula a realizar
                String[] options2 = {"Agregar Inversor", "Presentar Informe", "Salir"};
                opcion2 = JOptionPane.showOptionDialog(null, "Seleccione una Opción ",
                        "Banco Inversor", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null,options2, options2[0]);
                System.out.println(opcion2);
                switch (opcion2){
                    case 0:
                        nuevaInversion = 0;
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null,pantalla);
                        nuevaInversion = 1;
                        break;
                    case 2:
                        nuevaInversion = 1;
                        break;
                    default:
                        System.out.println("Error de seleccion");
                }
            }
        }
    }
}
