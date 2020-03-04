package herenciaVolumen;

public class Cilindro extends FigurasGeo{
    // Declaracion de Variables
    private double radio;
    private double altura;
    private double volumen;

    /**
     * Método constructor de la clase Cilindro
     * @param nombre
     * @param radio
     * @param altura
     */
    public Cilindro(String nombre, double radio,double altura){
        this.nombre = nombre;
        this.radio = radio;
        this.altura = altura;
    }
    // Método get y set de la clase Cilindro
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
     * Método calcularVolumenCilindro
     */
    public void calcularVolCilindro(){
        volumen = Math.PI * (Math.pow(radio,2)*altura);
    }

    /**
     * Método obtenerVolumenCilindro
     * @return volumen
     */
    public double obtenerVolCilindro(){
        return volumen;
    }
}
