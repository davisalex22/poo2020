package herenciaInversionistas;
/**
 * Super Clase Inversionista
 */
public class Inversionista {
    // Declaracion de variables
    protected String nombreC;
    protected String numeroCuenta;
    protected double capitalInvertido;
    protected int interesOpcion;

    /**
     * Métodos get y set clase Inversionista
     * @return
     */
    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getCapitalInvertido() {
        return capitalInvertido;
    }

    public void setCapitalInvertido(double capitalInvertido) {
        this.capitalInvertido = capitalInvertido;
    }

    public int getInteresOpcion() {
        return interesOpcion;
    }

    public void setInteresOpcion(int interesOpcion) {
        this.interesOpcion = interesOpcion;
    }

}
