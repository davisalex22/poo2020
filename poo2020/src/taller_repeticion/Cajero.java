package taller_repeticion;

public class Cajero {
    //Declaración de Variables
    private double depositos;
    private int retiros;
    private double saldo;
    private double saldoActual;
    private String cadena = "";
    private String nombre;

    /**
     * Método constructor de la clase Cajero
     * @param nombre
     * @param saldo
     * @param retiros
     */
    public Cajero(String nombre, double saldo, int retiros){
        this.nombre = nombre;
        this.saldo = saldo;
        this.retiros = retiros;
    }

    /**
     * Método obtener datos1
     * @return
     */
    public String obtenerDatos1(){
        cadena = String.format("%s%s\t\t\t\t\t\t%.2f\t\t\t\t\t\t%d\t\t\t\t\t\t%.2f\t\t\t\t\t\t%.2f\n",
                cadena, getNombre(), getSaldo(),  getRetiros(), 0.0,retiro());
        return cadena;
    }

    /**
     * Método obtener datos 2
     * @return
     */
    public String obtenerDatos2(){
        cadena = String.format("%s%s\t\t\t\t\t\t%.2f\t\t\t\t\t%.2f\t\t\t\t\t%.2f\t\t\t\t\t\t%.2f\n", cadena,
                getNombre(), getSaldo(), 0.0 ,getDepositos(), Depositoc());
        return cadena;
    }


    /**
     * Método Constructor 2 Cajero
     * @param nombre
     * @param saldo
     * @param depositos
     */
    public Cajero(String nombre, double saldo, double depositos){
        this.setNombre(nombre);
        this.saldo = saldo;
        this.depositos = depositos;
    }

    public double retiro(){
        saldoActual = getSaldo() - getRetiros();
        return saldoActual;
    }

    public double Depositoc(){
        saldoActual = getSaldo() + getDepositos();
        return saldoActual;
    }


    public double getDepositos() {
        return depositos;
    }

    public void setDepositos(double depositos) {
        this.depositos = depositos;
    }

    public int getRetiros() {
        return retiros;
    }

    public void setRetiros(int retiros) {
        this.retiros = retiros;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
