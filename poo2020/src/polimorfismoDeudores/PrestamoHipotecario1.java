package polimorfismoDeudores;

public class PrestamoHipotecario1 extends Deudores1{
    // Declaracion de Variables
    private int anios;

    // Calculo del Interes Ganado
    @Override
    public void calcularInteresPagar() {
        if(capitalPrestamo < 5000){
            interesPagar= (capitalPrestamo*(0.08*anios));
        }else{
            if (capitalPrestamo > 5000 && capitalPrestamo < 10000){
                interesPagar =  (capitalPrestamo*(0.07*anios));
            }else{
                if (capitalPrestamo > 15000){
                    interesPagar = (capitalPrestamo*(0.05*anios));
                }
            }
        }
    }
    // Método set de Anios
    public void setAnios(int anios) {
        this.anios = anios;
    }
}
