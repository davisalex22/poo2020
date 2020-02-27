package herencia;

/**
 * Esta clase hereda de la clase padre Persona
 */
public class Docente extends Persona{
    private String area;

    public Docente(String nombre, String area,String identificacion, String estado_civil,String fecha_nac){
        this.nombre = nombre;
        this.area = area;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nac;
    }
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void enseniar(){
        System.out.println("Método enseñar");
    }

    public void calificar(){
        System.out.println("Método calificar");
    }
}
