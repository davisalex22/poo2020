package deber_seleccion;

public class Ejercicio14_2 {
    // Declaración de variables
    private String nombre;
    private double vhoras;
    private double htrabajadas;
    private double sueldo;
    /**
     * Método constructor de la clase Ejercicio14_2
     * @param nombre
     * @param vhoras
     * @param htrabajadas
     */
    public Ejercicio14_2(String nombre, double vhoras,double htrabajadas){
        this.setNombre(nombre);
        this.setVhoras(vhoras);
        this.setHtrabajadas(htrabajadas);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVhoras() {
        return vhoras;
    }

    public void setVhoras(double vhoras) {
        this.vhoras = vhoras;
    }

    public double getHtrabajadas() {
        return htrabajadas;
    }

    public void setHtrabajadas(double htrabajadas) {
        this.htrabajadas = htrabajadas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Método para calcular el sueldo
     * @return sueldo
     */
    public double calcularSueldo(){
        if(getHtrabajadas() <= 40){
            setSueldo(getHtrabajadas() * getVhoras());
        }else{
            if(getHtrabajadas() <=50){
                setSueldo((40* getVhoras()) + (getHtrabajadas() - 40) * (getVhoras() *2));;
            }else {
                setSueldo((40*getVhoras())+(10*getVhoras()*2)+((getHtrabajadas()-50)*(getVhoras()*3)));
            }
        }
        return getSueldo();
    }
}
