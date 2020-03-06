package ejemploLista;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ListaNombres {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<String>();

        boolean opcion = true;
        while (opcion == true){
            // Seleccion de calcula a realizar
            String[] options = {"Agregar Nombre","Presentar Lista","Salir"};
            int condicion = JOptionPane.showOptionDialog(null, "A continuación elija una opción ",
                    "Lista Nombre", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    options, options[0]);
            System.out.println(condicion);
            switch (condicion){
                case 0:
                    nombres.add(JOptionPane.showInputDialog("Ingrese Nombres"));
                    break;
                case 1:
                    String cadena = "RESULTADO INGRESO DE NOMBRES";
                    for (int cont = 0; cont < nombres.size();cont++){
                        cadena = String.format("%s\n%s",cadena,nombres.get(cont));
                    }
                    JOptionPane.showMessageDialog(null,cadena);
                    opcion = false;
                    break;
                case 2:
                    opcion = false;
                    break;
                default:
                    System.out.println("Error de Seleccion");
            }
        }
    }
}
