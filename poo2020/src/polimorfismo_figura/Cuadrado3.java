package polimorfismo_figura;

public class Cuadrado3 extends Figura3{
    // Declaracion de Variables
    private double ladoCuadrado;

    public void setLadoCuadrado(double ladoCuadrado) {
        this.ladoCuadrado = ladoCuadrado;

    }

    @Override
    public void calcularArea() {
        area = Math.pow(ladoCuadrado,2);
    }
}
