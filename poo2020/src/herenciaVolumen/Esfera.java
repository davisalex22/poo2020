package herenciaVolumen;

public class Esfera extends  FigurasGeo{
    // Declaracion de Variables
    private double radio;
    private double volumen;

    /**
     * Método constructor de la clase Esfera
     * @param nombre
     * @param radio
     */
    public Esfera(String nombre, double radio){
        this.nombre = nombre;
        this.radio = radio;
    }
    // Métodos get y set de la clase Esfera
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Método calcularVolumenEsfera
     */
    public void calcularVolEsfera(){
        volumen = (4/3)*Math.PI*(Math.pow(radio,3));
    }

    /**
     * Método obtenerVolumenEsfera
     * @return volumen
     */
    public double obtenerVolEsfera(){
        return volumen;
    }
}
