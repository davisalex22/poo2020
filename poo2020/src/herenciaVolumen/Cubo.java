package herenciaVolumen;

public class Cubo extends FigurasGeo{
    // Declaracion de variables
    private double arista;
    private double volumen;

    /**
     * Método constructor de la clase Cubo
     * @param nombre
     * @param arista
     */
    public Cubo(String nombre, double arista){
        this.nombre = nombre;
        this.arista = arista;
    }
    // Métodos get y set de la clase Cubo
    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    /**
     * Método calcularVolumenCubo
     */
    public void calcularVolCubo(){
        volumen = Math.pow(arista,3);
    }

    /**
     * Método obtenerVolumenCubo
     * @return volumen
     */
    public double obtenerVolCubo(){
        return volumen;
    }
}
