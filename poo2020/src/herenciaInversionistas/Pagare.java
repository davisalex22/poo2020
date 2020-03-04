package herenciaInversionistas;

public class Pagare extends Inversionista {
    // Declaración de variables
    private double interesGanado;
    private double anios;

    /**
     * Método Constructor clase Pagare
     * @param nombreC
     * @param numeroCuenta
     * @param capitalInvertido
     * @param anios
     */
    public Pagare(String nombreC, String numeroCuenta, double capitalInvertido,int anios){
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
            interesGanado = (capitalInvertido*(0.04*anios));
        }else{
            if (capitalInvertido > 5000 && capitalInvertido < 10000){
                interesGanado = (capitalInvertido*(0.06*anios));
            }else{
                if (capitalInvertido > 15000){
                    interesGanado =(capitalInvertido*(0.08*anios));
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
