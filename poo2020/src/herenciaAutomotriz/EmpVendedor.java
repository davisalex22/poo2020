package herenciaAutomotriz;

public class EmpVendedor extends EmpleadoAut {
    // Declaracion de variables
    private int numAutos;
    private double precioAuto;
    private double sueldoMinimo;
    private double sueldoQuincena;

    /**
     * Método constructor de la clase EmpVendedor
     * @param nombreA
     * @param departamentoA
     * @param puestoA
     * @param numAutos
     * @param precioAuto
     */
    public EmpVendedor(String nombreA, String departamentoA,String puestoA,int numAutos, double precioAuto,
                       double sueldoMinimo){
        this.nombreA = nombreA;
        this.departamentoA = departamentoA;
        this. puestoA = puestoA;
        this.numAutos = numAutos;
        this.precioAuto = precioAuto;
        this.sueldoMinimo = sueldoMinimo;
    }

    // Métodos get y set de la clase EmpVendedor
    public int getNumAutos() {
        return numAutos;
    }

    public void setNumAutos(int numAutos) {
        this.numAutos = numAutos;
    }

    public double getPrecioAuto() {
        return precioAuto;
    }

    public void setPrecioAuto(double precioAuto) {
        this.precioAuto = precioAuto;
    }

    /**
     * Método calcularSueldoVendedor
     */
    public void calcularSueldoVendedor(){
        sueldoQuincena = sueldoMinimo + (precioAuto*0.02);
    }

    /**
     * Método obtenerSueldoVendedor
     * @return
     */
    public double obtenerSueldoVendedor(){
        return sueldoQuincena;
    }
}
