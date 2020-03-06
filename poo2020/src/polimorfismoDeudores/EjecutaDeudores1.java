package polimorfismoDeudores;


import javax.swing.*;

public class EjecutaDeudores1 {
    public static void main(String[] args) {
// Declaracion de variables
        String presentacion,cadena="",pantalla;
        int contador = 0,seleccion, nuevaDeuda = 0,opcion2;
        presentacion = String.format("%50s%s%20s%20s%20s\n","REPORTE DE DEUDORES\n","No.Cliente","Nombre","No.Cuenta"
                ,"Interés A pagar");
        // Ciclo While
        while (nuevaDeuda == 0) {
            String[] inversiones = {"Personal", "Hipotecario", "Automóvil","Salir"};
            seleccion = JOptionPane.showOptionDialog(null, "A continuación elija una opción ",
                    "Bienvenido a Banco Prestamista", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, inversiones, inversiones[0]);
            switch (seleccion) {
                case 0:
                    PrestamoPersona1 persona1 = new PrestamoPersona1();
                    persona1.setNombreD(JOptionPane.showInputDialog("Ingrese el Nombre"));
                    persona1.setNumeroCuenta(JOptionPane.showInputDialog("Ingrese el Número de Cuenta"));
                    persona1.setCapitalPrestamo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese capital")));
                    persona1.setAnios(Integer.parseInt(JOptionPane.showInputDialog("Ingrese años")));
                    persona1.calcularInteresPagar();
                    cadena = String.format("%30s%20s%20.2f",persona1.getNombreD(),
                            persona1.getNumeroCuenta(),persona1.getInteresPagar());
                    break;
                case 1:
                    PrestamoHipotecario1 presHipo = new PrestamoHipotecario1();
                    presHipo.setNombreD(JOptionPane.showInputDialog("Ingrese el Nombre"));
                    presHipo.setNumeroCuenta(JOptionPane.showInputDialog("Ingrese el Número de Cuenta"));
                    presHipo.setCapitalPrestamo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese capital")));
                    presHipo.setAnios(Integer.parseInt(JOptionPane.showInputDialog("Ingrese años")));
                    presHipo.calcularInteresPagar();
                    cadena = String.format("%30s%20s%20.2f", presHipo.getNombreD(), presHipo.getNumeroCuenta(),
                            presHipo.getInteresPagar());
                    break;
                case 2:
                    PrestamoAutomovil1 presAut = new PrestamoAutomovil1();
                    presAut.setNombreD(JOptionPane.showInputDialog("Ingrese el Nombre"));
                    presAut.setNumeroCuenta(JOptionPane.showInputDialog("Ingrese el Número de Cuenta"));
                    presAut.setCapitalPrestamo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese capital")));
                    presAut.setAnios(Integer.parseInt(JOptionPane.showInputDialog("Ingrese años")));
                    presAut.calcularInteresPagar();
                    cadena = String.format("%30s%20s%20.2f",presAut.getNombreD(),presAut.getNumeroCuenta(),
                            presAut.getInteresPagar());
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