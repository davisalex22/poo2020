package polimorfismoInversionistas;

public class CuentaAhorro1 extends  Inversionista1 {
    // Declaracion de Variables
    private int anios;

    // Calculo del Interes Ganado
    @Override
    public void calcularInteres() {
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

    // Método set de Anios
    public void setAnios(int anios) {
        this.anios = anios;
    }
}
