package herencia_empleado;

public class EmpleadoPorHora extends Empleado {
    // Declaracion de variables
    int hora;
    double valorHora;
    /**
     * Método Constructor clase EmpleadoPorHora
     * @return
     */
    public EmpleadoPorHora(String nombre,String cargo,String dependencia, int hora, double valorHora ){
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia =dependencia;
        this.hora = hora;
        this.valorHora = valorHora;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * Método para calculadSueldoPorHoras
     * @return
     */
    public double calcularSueldoPorHoras(){
        double sueldo;
        sueldo = getHora()*getValorHora();
        return sueldo;
    }
}
