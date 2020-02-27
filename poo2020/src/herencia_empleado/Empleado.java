package herencia_empleado;

public class Empleado {
    // Declaracion de Varriables
    protected String nombre;
    protected String cargo;
    protected String dependencia;

    // Metodos get y set de la clase Empleado
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
}
