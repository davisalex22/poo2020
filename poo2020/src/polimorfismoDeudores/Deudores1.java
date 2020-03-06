package polimorfismoDeudores;

public abstract class Deudores1 {
    // Declaracion de variables
    protected String nombreD;
    protected String numeroCuenta;
    protected double capitalPrestamo;
    protected double interesPagar;

    /**
     * Método abstracto, que seá implementado
     * dentro de las clases hijas
     */
    public abstract void calcularInteresPagar();

    // Métodos get y set de la superclase Deudores1
    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getCapitalPrestamo() {
        return capitalPrestamo;
    }

    public void setCapitalPrestamo(double capitalPrestamo) {
        this.capitalPrestamo = capitalPrestamo;
    }

    public double getInteresPagar() {
        return interesPagar;
    }
}
