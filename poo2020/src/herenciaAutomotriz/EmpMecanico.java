package herenciaAutomotriz;

public class EmpMecanico extends EmpleadoAut {
    // Declaracion de variables
    private int numTrabajos;
    private double valorTrabajo;
    private double sueldoMensual;
    private double sueldoQuincena;


    /**
     * Método constructor de la clase EmpMecanico
     * @param nombreA
     * @param departamentoA
     * @param puestoA
     * @param numTrabajos
     */
    public EmpMecanico(String nombreA, String departamentoA,String puestoA,int numTrabajos, double valorTrabajo,
                       double sueldoMensual){
        this.nombreA = nombreA;
        this.departamentoA = departamentoA;
        this. puestoA = puestoA;
        this.numTrabajos = numTrabajos;
        this.valorTrabajo = valorTrabajo;
        this.sueldoMensual = sueldoMensual;
    }

    // Métodos get y set de la clase EmpMecanico
    public int getNumTrabajos() {
        return numTrabajos;
    }

    public void setNumTrabajos(int numTrabajos) {
        this.numTrabajos = numTrabajos;
    }
    public double getValorTrabajo() {
        return valorTrabajo;
    }

    public void setValorTrabajo(double valorTrabajo) {
        this.valorTrabajo = valorTrabajo;
    }
    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    /**
     * Método calcularSueldoMecanico
     */
    public void calcularSueldoMecanico(){
        sueldoQuincena = (sueldoMensual/2)+(valorTrabajo*0.04);
    }

    /**
     * Método obtenerSueldoMecanico
     */
    public double obtenerSueldoMecanico(){
        return sueldoQuincena;
    }


}
