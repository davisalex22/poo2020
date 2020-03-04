package herenciaDeudores;
/**
 * Superclase Deudores
 */
public class Deudores {
    // Declaracion de variables
    protected String nombreD;
    protected String numeroCuenta;
    protected double capitalPrestamo;
    protected int prestamoOpcion;

    // Métodos get y set de la superclase
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

    public int getPrestamoOpcion() {
        return prestamoOpcion;
    }

    public void setPrestamoOpcion(int prestamoOpcion) {
        this.prestamoOpcion = prestamoOpcion;
    }
}
