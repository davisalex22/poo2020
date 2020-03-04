package herenciaAutomotriz;

/**
 * Superclase Empleado
 */
public class EmpleadoAut {
    // Declaracion de variables
    protected String nombreA;
    protected String departamentoA;
    protected String puestoA;

    // Métodos get y set de la clase EmpleadoAutomotriz
    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getDepartamentoA() {
        return departamentoA;
    }

    public void setDepartamentoA(String departamentoA) {
        this.departamentoA = departamentoA;
    }

    public String getPuestoA() {
        return puestoA ;
    }

    public void setPuestoA(String puestoA) {
        this.puestoA = puestoA;
    }
}
