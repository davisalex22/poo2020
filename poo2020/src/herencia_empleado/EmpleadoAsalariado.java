package herencia_empleado;

public class EmpleadoAsalariado extends Empleado{
    // Declaracion de variables
    double valor_mensual;
    /**
     * Método Constructor clase EmpleadoAsalariado
     * @return
     */
    public EmpleadoAsalariado(String nombre,String cargo,String dependencia, double valor_mensual){
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.valor_mensual = valor_mensual;
    }

    public double getValor_mensual() {
        return valor_mensual;
    }

    public void setValor_mensual(double valor_mensual) {
        this.valor_mensual = valor_mensual;
    }

    /**
     * Método para calcularSueldoMensual
     * @return
     */
    public double calcularSueldoMensual(){
        double sueldo;
        sueldo = valor_mensual;
        return sueldo;
    }
}
