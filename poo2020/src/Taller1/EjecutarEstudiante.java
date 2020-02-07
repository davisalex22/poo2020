package Taller1;

public class EjecutarEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.actualizar_Edad(20);
        estudiante.actualizar_Nombre("David Alexander Salazar");
        estudiante.actualizar_Carrera("Ingenieria en Ciencias de la Computación");
        estudiante.actualizar_Libro("Metodología de la Programación");
        estudiante.actualizar_Comida("Pizza");
        estudiante.actualizar_Genero("Masculino");
        String mostrar_datos = estudiante.obtenerDatos();
        System.out.println(mostrar_datos);
    }
}
