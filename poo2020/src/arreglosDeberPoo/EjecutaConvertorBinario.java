package arreglosDeberPoo;
import javax.swing.*;
public class EjecutaConvertorBinario {
        public static void main(String[] args) {
            // Declaracion de variables
            String numBinario;
            // Ingreso del numero binario JOptionPane
            numBinario = (JOptionPane.showInputDialog("Ingrese binario"));
            // Creacion del objeto
            ConvertorBinario convertorBinario = new ConvertorBinario(numBinario);
            // Muestra en Pantalla con JOptionPane
            JOptionPane.showMessageDialog(null,convertorBinario.presentarDecimal());
        }
    }

