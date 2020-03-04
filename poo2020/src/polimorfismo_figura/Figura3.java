package polimorfismo_figura;

public abstract class Figura3 {
    // Declaracion de variables
    protected String nomFigura;
    protected double area;
    /**
     * Método abstracto, que seá implementado
     * dentro de las clases hijas
     */
    public abstract void calcularArea();

    // Métodos get y set de clase Figura3
    public String getNomFigura() {
        return nomFigura;
    }
    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }

    public double getArea() {
        return area;
    }


}
