package herencia_figura;

/**
 * Hereda atributos de Superclase Figura
 */

public class Rectangulo extends Figura{
    // Declaracion de variables
    private double baseRecta;
    private double alturaRecta;
    private double areaRecta;

    /**
     * Método Constructor de la clase Rectangulo
     * @param nombre
     * @param baseRecta
     * @param alturaRecta
     */
    public  Rectangulo(String nombre,double baseRecta,double alturaRecta){
        this.nombre = nombre;
        this.baseRecta = baseRecta;
        this.alturaRecta = alturaRecta;
    }

    // Métodos get y set de la clase Rectangulo
    public double getBaseRecta() {
        return baseRecta;
    }

    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    public double getAlturaRecta() {
        return alturaRecta;
    }

    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    /**
     * Método calcularAreaRecta
     */
    public void calcularAreaRecta(){
        areaRecta = baseRecta*alturaRecta;
    }

    /**
     * Método obtenerAreaRecta
     * @return areaRecta
     */
    public double obtenerAreaRecta(){
        return areaRecta;
    }
}
