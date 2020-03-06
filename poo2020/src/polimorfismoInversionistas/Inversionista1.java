package polimorfismoInversionistas;

public abstract class Inversionista1 {
    // Declaracion de variables
    protected String nombreC;
    protected String numeroCuenta;
    protected double capitalInvertido;
    protected double interesGanado;

    /**
     * Método abstracto, que seá implementado
     * dentro de las clases hijas
     */
    public abstract void calcularInteres();
    // Métodos get y set de la superclase Inversionista1
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

    public double getInteresGanado() {
        return interesGanado;
    }
}
