package polimorfismoAutomotriz;

public class EmpMecanico1 extends EmpleadoAut1{
    // Declaracion de variables
    private double valorTrabajo;
    private double sueldoMensual;

    // Calculo del sueldo de un Mecanico
    @Override
    public void calculasSueldoQna() {
        sueldo = (sueldoMensual/2)+(valorTrabajo*0.04);
    }

    // Métodos set de valorTrabajo y sueldoMensual
    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
     public void setValorTrabajo(double valorTrabajo) {
        this.valorTrabajo = valorTrabajo;
    }
}
