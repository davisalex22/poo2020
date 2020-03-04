package polimorfismo_figura;

public class Rectangulo3 extends Figura3 {
    // Declaración de Variables
    private double baseRecta;
    private double alturaRecta;

    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    @Override
    public void calcularArea() {
        area = baseRecta*alturaRecta;
    }
}
