package polimorfismo_figura;

public class Triangulo3 extends Figura3{
    // Declaración de variables
    private double baseTrian;
    private double alturaTrian;

    public void setBaseTrian(double baseTrian) {
        this.baseTrian = baseTrian;
    }

    public void setAlturaTrian(double alturaTrian) {
        this.alturaTrian = alturaTrian;
    }

    @Override
    public void calcularArea() {
        area = (baseTrian*alturaTrian)/2;
    }
}
