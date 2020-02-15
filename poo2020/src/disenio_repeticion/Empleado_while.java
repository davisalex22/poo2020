package disenio_repeticion;

public class Empleado_while {
    // Declaracion de Variables
    private int horasTrabajadas;
    private double valorHoras;
    private String nombre;
    private double sueldo;


    /**
     * Método Constructor de la clase Empleado
     * @param horasTrabajadas
     * @param valorHoras
     * @param nombre
     */
    public Empleado_while(String nombre , int horasTrabajadas, double valorHoras){
        this.setHorasTrabajadas(horasTrabajadas);
        this.setValorHoras(valorHoras);
        this.setNombre(nombre);
    }
    // Métodos get y set de variables globales
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public double getValorHoras() {
        return valorHoras;
    }
    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Método calcularSueldo
     * @return
     */
    public double calcularSueldo(){
        if (getHorasTrabajadas() <= 40) {
            setSueldo(getHorasTrabajadas()*getValorHoras());
        }else{
            setSueldo((40*valorHoras)+(horasTrabajadas - 40)*(valorHoras*2));
        }
        return getSueldo();
    }
}
