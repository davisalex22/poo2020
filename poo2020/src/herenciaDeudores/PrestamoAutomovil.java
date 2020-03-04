package herenciaDeudores;

public class PrestamoAutomovil extends Deudores{
    // Declaración de variables
    private double interesPagar;
    private double anios;

    /**
     * Método Constructor clase PrestamoAutomovil
     * @param nombreD
     * @param numeroCuenta
     * @param capitalPrestamo
     * @param anios
     */
    public PrestamoAutomovil(String nombreD,String numeroCuenta,double capitalPrestamo,int anios){
        this.nombreD = nombreD;
        this.numeroCuenta = numeroCuenta;
        this.capitalPrestamo = capitalPrestamo;
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
     * Método para calcular el Interés a pagar
     */
    public void calcularIteresApagar(){
        if(capitalPrestamo < 5000){
            interesPagar= (capitalPrestamo*(0.11*anios));
        }else{
            if (capitalPrestamo > 5000 && capitalPrestamo < 10000){
                interesPagar =  (capitalPrestamo*(0.09*anios));
            }else{
                if (capitalPrestamo > 15000){
                    interesPagar = (capitalPrestamo*(0.07*anios));
                }
            }
        }
    }
    /**
     * Método para obtener el Interés a pagar
     * @return
     */
    public double obtenerIteresPagar(){
        return interesPagar;
    }
}
