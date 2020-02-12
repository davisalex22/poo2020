package disenio_seleccion;

public class Empleado {
    // Declaración de variables
    private String nombreEmpleado;
    private int horasTrabajadas;
    private int valorHora;
    private int sueldo;
    /**
     * Método Constructor de la Clase Empleado
     * @param nombreEmpleado
     * @param horasTrabajadas
     * @param valorHora
     */
    public Empleado(String nombreEmpleado, int horasTrabajadas, int valorHora){
        this.setNombreEmpleado(nombreEmpleado);
        this.setValorHora(valorHora);
        this.setHorasTrabajadas(horasTrabajadas);
    }
    // Métodos get y set de las variables globales
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Método para calcular el sueldo
     * @return
     */
    public double calcularSueldo(){
        if (horasTrabajadas <= 40){
            setSueldo(getHorasTrabajadas()*getValorHora());
        }else{
            setSueldo((40 * getValorHora()) + (getHorasTrabajadas() -40) * (getValorHora()*2));
        }
        return getSueldo();
    }
}
