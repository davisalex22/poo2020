package polimorfismoVolumen;

public abstract class FigurasGeo3 {
    // Declaración de Variables
    protected String nombreGeo;
    protected double volumenGeo;

    /**
     * Método abstracto de la SuperClase FigurasGeo3
     */
    public abstract void calcularVolumen();

    // Métodos get y set de la clase FiguraGeo3
    public String getNombreGeo() {
        return nombreGeo;
    }
    public void setNombreGeo(String nombreGeo) {
        this.nombreGeo = nombreGeo;
    }
    public double getVolumenGeo() {
        return volumenGeo;
    }
}
