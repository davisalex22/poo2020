package polimorfismoInversionistas;

import javax.swing.*;

public class EjecutaInversionista1 {
    public static void main(String[] args) {
        // Declaracion de variables
        String presentacion,cadena="",pantalla;
        int contador = 0,seleccion,nuevaInversion = 0,opcion2;
        presentacion = String.format("%50s%s%20s%20s%20s\n","REPORTE DE INVERSIONES\n","No.Cliente","Nombre","No.Cuenta"
                ,"Interés Ganado");
        while (nuevaInversion == 0) {
            String[] inversiones = {"Cuenta de Ahorros", "Pagare", "Cuenta Maestra","Salir"};
            seleccion = JOptionPane.showOptionDialog(null, "A continuación elija una opción ",
                    "Bienvenido a Banco Inversionista", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, inversiones, inversiones[0]);

            switch (seleccion) {
                case 0:
                    CuentaAhorro1 ahorro1 = new CuentaAhorro1();
                    ahorro1.setNombreC(JOptionPane.showInputDialog("Ingrese el Nombre"));
                    ahorro1.setNumeroCuenta(JOptionPane.showInputDialog("Ingrese el Número de Cuenta"));
                    ahorro1.setCapitalInvertido(Double.parseDouble(JOptionPane.showInputDialog("Ingrese capital")));
                    ahorro1.setAnios(Integer.parseInt(JOptionPane.showInputDialog("Ingrese años")));
                    ahorro1.calcularInteres();
                    cadena = String.format("%30s%20s%20s", ahorro1.getNombreC(), ahorro1.getNumeroCuenta(),
                            ahorro1.getInteresGanado());
                    break;
                case 1:
                    Pagare1 pagare1 = new Pagare1();
                    pagare1.setNombreC(JOptionPane.showInputDialog("Ingrese el Nombre"));
                    pagare1.setNumeroCuenta(JOptionPane.showInputDialog("Ingrese el Número de Cuenta"));
                    pagare1.setCapitalInvertido(Double.parseDouble(JOptionPane.showInputDialog("Ingrese capital ")));
                    pagare1.setAnios(Integer.parseInt(JOptionPane.showInputDialog("Ingrese años")));
                    pagare1.calcularInteres();
                    cadena = String.format("%30s%20s%20s", pagare1.getNombreC(), pagare1.getNumeroCuenta(),
                            pagare1.getInteresGanado());
                    break;
                case 2:
                    CuentaMaestra1 maestra1 = new CuentaMaestra1();
                    maestra1.setNombreC(JOptionPane.showInputDialog("Ingrese el Nombre"));
                    maestra1.setNumeroCuenta(JOptionPane.showInputDialog("Ingrese el Número de Cuenta"));
                    maestra1.setCapitalInvertido(Double.parseDouble(JOptionPane.showInputDialog("Ingrese capital")));
                    maestra1.setAnios(Integer.parseInt(JOptionPane.showInputDialog("Ingrese años")));
                    maestra1.calcularInteres();
                    cadena = String.format("%30s%20s%20s", maestra1.getNombreC(), maestra1.getNumeroCuenta(),
                            maestra1.getInteresGanado());
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