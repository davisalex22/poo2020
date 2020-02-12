package disenio_seleccion;

import java.rmi.MarshalException;

public class Dia {
    // Declaración de variables
    private  int numDia;
    private  String mensajeDia;

    /**
     * Método constructor para la clase Dia
     * @param numDia
     */
    public Dia(int numDia){
        this.setNumDia(numDia);
    }
    // Métodos get y set de las variables globales
    public int getNumDia() {
        return numDia;
    }
    public void setNumDia(int numDia) {
        this.numDia = numDia;
    }

    /**
     * Método que evalua el nombre del dia son stwich
     * @return
     */
    public String nombreDia(){
        switch (getNumDia()){
            case 1:
                mensajeDia = "Domdingo";
            case 2:
                mensajeDia = "Lunes";
                break;
            case 3:
                mensajeDia = "Martes";
                break;
            case 4:
                mensajeDia = "Miércoles";
                break;
            case 5:
                mensajeDia = "Jueves";
                break;
            case 6:
                mensajeDia = "Viernes";
                break;
            case 7:
                mensajeDia = "Sábado";
                break;
            default:
                mensajeDia = "Opción INCORRECTA";
        }
        return mensajeDia;
    }
}
