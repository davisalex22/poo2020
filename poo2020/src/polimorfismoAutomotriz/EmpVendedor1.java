package polimorfismoAutomotriz;

public class EmpVendedor1 extends  EmpleadoAut1{
    // Declaracion de variables
    private double AutosTotal;
    private double sueldoMinimo;

    // Calculo del sueldo de un Vendedor
    @Override
    public void calculasSueldoQna() {
        sueldo = sueldoMinimo + (AutosTotal*0.02);
    }

    // Métodos set de AutosTotal y sueldoMinimo
    public void setSueldoMinimo(double sueldoMinimo) {
        this.sueldoMinimo = sueldoMinimo;
    }
    public void setAutosTotal(double autosTotal) {
        AutosTotal = autosTotal;
    }
}
