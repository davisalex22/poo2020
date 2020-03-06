package polimorfismoDeudores;

public class PrestamoAutomovil1 extends Deudores1 {
    // Declaracion de Variables
    private int anios;

    // Calculo del Interes Ganado
    @Override
    public void calcularInteresPagar() {
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
    // Método set de Anios
    public void setAnios(int anios) {
        this.anios = anios;
    }
}
