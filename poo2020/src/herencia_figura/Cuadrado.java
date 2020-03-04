package herencia_figura;

public class Cuadrado extends Figura {
    // Declaracion de Variables
    private double lado;
    private double areaCuadrado;

    /**
     * Método constructor de la clase Cuadrado
     * @param nombre
     * @param lado
     */
    public Cuadrado(String nombre, double lado){
        this.nombre = nombre;
        this.lado = lado;
    }
    // Métodos get y set de la clase Cuadrado
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     * Método calcularAreaCuadrado
     */
    public void calcularAreaCuadrado(){
        areaCuadrado = Math.pow(lado,2);
    }

    /**
     * Método obtenerAreaCuadrado
     * @return areaCuadrado
     */
    public double obtenerAreaCuadrado(){
        return areaCuadrado;
    }
}
