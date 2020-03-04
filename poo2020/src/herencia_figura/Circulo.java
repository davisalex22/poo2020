package herencia_figura;

public class Circulo extends Figura{
    // Declaracion de variables
    private double radio;
    private double area;

    /**
     * Método constructor de la clase Circulo
     * @param nombre
     * @param radio
     */
    public Circulo(String nombre, double radio){
        this.nombre = nombre;
        this.radio = radio;
    }

    // Métodos get y set de variables de la clase
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Método calcularAreCirculo
     */
    public void calcularAreaCirculo(){
        area = Math.PI * (Math.pow(radio,2));
    }

    /**
     * Método obtenerAreaCirculo
     * @return area
     */
    public double obtenerAreaCirculo(){
        return area;
    }
}
