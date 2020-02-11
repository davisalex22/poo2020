package DisenioPoo;

import javax.swing.*;

public class EjecutaCerveza {
    public static void main(String[] args) {
        double precio;
        int unidades_vendidas;
        String nombre;
        String tipo;
        precio =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese en precio: "));
        unidades_vendidas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese unidades vendidas"));
        nombre = (JOptionPane.showInputDialog("Ingrese Nombre:"));
        tipo = (JOptionPane.showInputDialog("Ingrese Tipo:"));
        // Creación de Objeto
        Cerveza cerveza = new Cerveza(precio,unidades_vendidas,nombre,tipo);
        String data = cerveza.imprimir_Informacion();
        System.out.println(data);
    }
}
