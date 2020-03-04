package herenciaVolumen;

public class Cono extends FigurasGeo {
    // Declaracion de Variables
    private double radio;
    private double altura;
    private double volumen;

    /**
     * Método constructor de la Cono
     * @param nombre
     * @param radio
     * @param altura
     */
    public Cono(String nombre, double radio, double altura){
        this.nombre = nombre;
        this.radio = radio;
        this.altura = altura;
    }
    // Método get y set de la clase Cono
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Método calcularVolumenCono
     */
    public void calcularVolCono(){
        volumen = (Math.PI*(Math.pow(radio,2))*altura)/3;
    }

    /**
     * Método obtenerVolumenCono
     * @return volumen
     */
    public double obtenerVolCono(){
        return volumen;
    }
}
