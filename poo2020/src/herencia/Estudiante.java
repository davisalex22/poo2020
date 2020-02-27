package herencia;

/**
 * Clase que hereda de la clase Persona
 * Contendrá todos los atributos y métodos definidos en clase Persona
 */
public class Estudiante extends Persona{
    // Atributos propios de la clase
    private String carrera;

    public Estudiante(String nombre, String carrera,String identificacion, String estado_civil,String fecha_nac){
        this.nombre = nombre;
        this.carrera = carrera;
        this.identificacion = identificacion;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nac;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void matricular(){
        System.out.println("Método para patricular");
    }

    public void aprender(){
        System.out.println("Método para aprender");
    }
}
