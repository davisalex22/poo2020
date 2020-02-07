package Taller1;

public class Estudiante {
    // Declaración de variables globales
    private String nombre;
    private int edad;
    private String genero;
    private String comida;
    private String carrera;
    private String libro;

    // Métodos Obtener
    /**
     * Método para obtener el valor de la variable comida
     * @return comida
     */
    public String obtener_Comida(){
        return this.comida;
    }
    /**
     * Método para obtener el valor de la variable género
     * @return genero
     */
    public String obtener_Genero(){
        return this.genero;
    }
    /**
     * Método para obtener el valor de la variable nombre
     * @return nombre
     */
    public String obtener_Nombre(){
        return this.nombre;
    }
    /**
     * Método para obtener el valor de la variable carrera
     * @return materia
     */
    public String obtener_carrera(){
        return this.carrera;
    }
    /**
     * Método para obtener el valor de la variable libro (Libro favorito)
     * @return libro
     */
    public String obtener_Libro(){
        return this.libro;
    }
    /**
     * Método para obtener el valor de la variable edad
     * @return edad
     */
    public int Obtener_Edad(){
        return this.edad;
    }
    /**
     * Método para almacenar la información en una sola variable
     * @return data
     */
    public String obtenerDatos(){
        String data = "Información del estudiante\n"+"Nombre: "+nombre+"\n"+"Edad: "+edad+"\n"+"Género: "+genero+"\n"+
                "Carrera: "+carrera+"\n"+"Libro favorito: "+libro+"\n"+"Comida favorita: "+comida;
        return data;
    }
    // Métodos actualizar
    /**
     *Método que sirve para actualizar la variable comida
     * @param comida
     */
    public void actualizar_Comida(String comida){
        this.comida = comida;
    }
    /**
     *Método que sirve para actualizar la variable nombre
     * @param nombre
     */
    public void actualizar_Nombre(String nombre){
        this.nombre = nombre;
    }
    /**
     *Método que sirve para actualizar la variable edad
     * @param edad
     */
    public void actualizar_Edad(int edad){
        this.edad = edad;
    }
    /**
     *Método que sirve para actualizar la variable carrera
     * @param carrera
     */
    public void actualizar_Carrera(String carrera){
        this.carrera = carrera;
    }
    /**
     *Método que sirve para actualizar el libro
     * @param libro
     */
    public void actualizar_Libro(String libro){
        this.libro = libro;
    }
    /**
     *Método que sirve para actualizar el genero
     * @param genero
     */
    public void actualizar_Genero(String genero){
        this.genero = genero;
    }

}