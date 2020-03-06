package polimorfismoAutomotriz;

public abstract class EmpleadoAut1 {
    // Declaracion de variables
    protected String nombreA;
    protected String departamentoA;
    protected String puestoA;
    protected double sueldo;

    /**
     * Método abstracto, que seá implementado
     * dentro de las clases hijas
     */
    public abstract void calculasSueldoQna();

    // Métodos get y ser de la clase EmpleadoAut1
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
        return puestoA;
    }

    public void setPuestoA(String puestoA) {
        this.puestoA = puestoA;
    }
    public double getSueldo() {
        return sueldo;
    }
}
