package herencia_figura;

public class Triangulo extends Figura {
    // Declaracion de variables
    private double baseTri;
    private double alturaTri;
    private double areaTri;

    /**
     * Método constructor de la clase Figura
     * @param nombre
     * @param baseTri
     * @param alturaTri
     */
    public Triangulo(String nombre,double baseTri,double alturaTri){
        this.nombre = nombre;
        this.baseTri = baseTri;
        this.alturaTri = alturaTri;
    }

    // Método get y set de la clase Triangulo
    public double getBaseTri() {
        return baseTri;
    }

    public void setBaseTri(double baseTri) {
        this.baseTri = baseTri;
    }

    public double getAlturaTri() {
        return alturaTri;
    }

    public void setAlturaTri(double alturaTri) {
        this.alturaTri = alturaTri;
    }

    /**
     * Método calcularAreaTriangulo
     */
    public void calcularAreaTri(){
        areaTri = (baseTri*alturaTri)/2;
    }

    /**
     * Método obtenerAreaTriangulo
     * @return
     */
    public double obtenerAreaTrian(){
        return areaTri;
    }
}
