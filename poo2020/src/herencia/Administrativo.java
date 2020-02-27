package herencia;

/**
 * Esta clase herenda de la clase Persona
 */
public class Administrativo extends Persona{
    private String dependencia;
    public Administrativo(String nombre, String dependencia,String identificacion, String estado_civil,String fecha_nac){
        this.nombre = nombre;
        this.dependencia = dependencia;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nac;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public void gestionar_procesos(){
        System.out.println("Método gestionar procesos");
    }
}
