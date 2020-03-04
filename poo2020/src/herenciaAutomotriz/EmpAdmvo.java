package herenciaAutomotriz;

public class EmpAdmvo extends EmpleadoAut {
    // Declaracion de variables
    private double sueldoMensual;
    private double sueldoQuincena;

    /**
     * Método constructor de la clase EmpAdmvo
     * @param nombreA
     * @param departamentoA
     * @param puestoA
     * @param sueldoMensual
     */
    public EmpAdmvo(String nombreA, String departamentoA,String puestoA,double sueldoMensual){
        this.nombreA = nombreA;
        this.departamentoA = departamentoA;
        this. puestoA = puestoA;
        this.sueldoMensual = sueldoMensual;
    }

    // Métodos get y set clase EmpAdmvo
    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    /**
     * Método calcularSueldoAdminstrativo
     */
    public void calcularSueldoAdmvo(){
        sueldoQuincena = sueldoMensual/2;
    }

    /**
     * Método obtenerSueldoAdministrativo
     * @return sueldoQuincena
     */
    public double obtenerSueldoAdmvo(){
        return sueldoQuincena;
    }
}
