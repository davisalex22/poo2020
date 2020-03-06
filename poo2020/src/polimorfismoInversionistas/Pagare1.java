package polimorfismoInversionistas;

public class Pagare1 extends Inversionista1 {
    // Declaracion de Variables
    private int anios;

    // Calculo del Interes Ganado
    @Override
    public void calcularInteres() {
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
    // Método set de Anios
    public void setAnios(int anios) {
        this.anios = anios;
    }
}
