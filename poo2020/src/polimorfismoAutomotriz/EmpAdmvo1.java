package polimorfismoAutomotriz;

public class EmpAdmvo1 extends EmpleadoAut1  {
    // Declaracion de variables
    private double sueldoMensual;

    // Calculo del sueldo de un Administrativo
    @Override
    public void calculasSueldoQna() {
        sueldo = sueldoMensual/2;
    }

    // Método set de sueldoMensual
    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
