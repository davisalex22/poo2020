package taller_repeticion;
import java.util.Scanner;
public class EjecutaCajero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaracion de variables
        int retiro;
        double deposito;
        String nombre;
        String cad = "";
        double saldo;
        boolean val = true;
        int val2;
        int opciones;
        // Uso de concatenacion de cadenas
        cad = String.format("%s%s\n%s\t\t\t%s\t\t\t%s\t\t\t%s\t\t\t%s\n", cad, "Banco Monopoly","Nombre de Afiliad@",
                "Saldo inicial","Monto de retiro", "Monto de Deposito", "Saldo Actual");
        System.out.println("BANCO MONOPOLY");
        System.out.println("Nombre de la Afiliad@\n");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el monto inicial de su cuenta");
        saldo = entrada.nextDouble();
        // Uso del While
        while (val == true){
            System.out.println("Presione una de las opciones que requiere realizar\n1._Deposito\n2._Retiro\n" +
                    "3._Saldo actual de la cuenta\n");
            opciones = entrada.nextInt();
            if (opciones == 1){
                System.out.println("Cual es el monto a depositar en su cuenta\n");
                deposito = entrada.nextDouble();
                // Creacion de objeto
                Cajero caj = new Cajero(nombre, saldo, deposito);
                cad = String.format("%s%s", cad, caj.obtenerDatos2());
            }
            if (opciones == 2){
                System.out.println("Cual es el monto a retirar en su cuenta\n");
                retiro = entrada.nextInt();
                // Creacion de objeto
                Cajero caj2 = new Cajero(nombre, saldo, retiro);
                cad = String.format("%s%s", cad, caj2.obtenerDatos1());
            }
            if (opciones == 3){
                cad = String.format("%s%s\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%.2f", cad,nombre, saldo);
            }
            System.out.println("Desea realizar más operaciones Presione:\n1._Si\n2._No\n");
            val2 = entrada.nextInt();
            if (val2 == 2){
                val = false;
            }
            entrada.nextLine();
        }
        // Impresion de cadena
        System.out.printf("%s", cad);

    }
}
