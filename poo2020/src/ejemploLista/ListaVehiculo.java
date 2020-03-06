package ejemploLista;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ListaVehiculo {
    public static void main(String[] args) {
        // Creacion de lista;
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        boolean bandera = true;
        JOptionPane.showMessageDialog(null,"BIENVENIDO AL SISTEMA DE INGRESO DE VEHÍCULOS");
        do {
            // Seleccion de calcula a realizar
            String[] options = {"Almacenar Nuevo","Presentar","Salir"};
            int condicion = JOptionPane.showOptionDialog(null, "A continuación elija una opción",
                    "Sistema de Ingreso de Vehículos", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null,options, options[0]);
            System.out.println(condicion);
            switch (condicion){
                case 0:
                    Vehiculo vehiculo = new Vehiculo();
                    vehiculo.setPlaca(JOptionPane.showInputDialog("Ingrese Placa"));
                    vehiculo.setMarca(JOptionPane.showInputDialog("Ingrese Marca"));
                    vehiculo.setAnio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año")));
                    vehiculo.setModelo(JOptionPane.showInputDialog("Ingrese Modelo"));
                    vehiculo.setColor(JOptionPane.showInputDialog("Ingrese Color"));
                    vehiculo.setCilindraje(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cilindraje")));
                    // Agregamos objeto vehículo a la lista
                    vehiculos.add(vehiculo);
                    break;
                case 1:
                    String cadena = String.format("%20s\n%s","DATOS VEHÍCULO","--------------------------");
                    // Recoremos la lista con un foreach
                    for (Vehiculo v:vehiculos){
                        cadena = String.format("%s\nPlaca: %s\nMarca: %s\nCilindraje: %d\n%s\n",cadena,v.getPlaca(),
                                v.getMarca(),v.getCilindraje(),"--------------------------");
                    }
                    JOptionPane.showMessageDialog(null,cadena);
                    bandera = false;
                    break;
                case 2:
                    bandera = false;
                    break;
                default:
                    System.out.println("Error de Selección");
            }
        }while (bandera == true);
    }
}
