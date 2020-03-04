package herenciaInversionistas;

public class CuentaAhorro extends Inversionista{
    // Declaración de variables

    private double interesGanado;
    private double anios;

    /**
     * Método Constructor Clase CuentaAhorro
     * @param nombreC
     * @param numeroCuenta
     * @param capitalInvertido
     * @param anios
     */
    public CuentaAhorro(String nombreC, String numeroCuenta, double capitalInvertido,int anios){
        this.nombreC = nombreC;
        this.numeroCuenta = numeroCuenta;
        this.capitalInvertido = capitalInvertido;
        this.anios = anios;
    }
    // Método get y set para años
    public double getAnios() {
        return anios;
    }

    public void setAnios(double anios) {
        this.anios = anios;
    }
    /**
     * Método para calcular el interés ganado
     */
    public void calcularIteresGanado(){
        if(capitalInvertido < 5000){
            interesGanado = (capitalInvertido*(0.03*anios));
        }else{
            if (capitalInvertido > 5000 && capitalInvertido < 10000){
                interesGanado = (capitalInvertido*(0.05*anios));
            }else{
                if (capitalInvertido > 15000){
                    interesGanado = (capitalInvertido*(0.07*anios));
                }
            }
        }
    }
    /**
     * Método para obtener el interés ganado
     * @return interesGanado
     */
    public double obtenerInteresGanado(){
        return interesGanado;
    }
}
