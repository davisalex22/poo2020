package polimorfismo_figura;

public class Circulo3 extends Figura3 {
    // Declaración de variables
    private double radio;

    @Override
    public void calcularArea() {
        area = Math.PI * (Math.pow(radio,2));
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
