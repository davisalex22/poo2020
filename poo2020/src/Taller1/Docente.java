package Taller1;
public class Docente {
    private String nombre;
    private int edad;
    private double peso;
    private String genero;
    private double estatura;
    private String materia;


    /**
     *  Metodo para obtener el nombre
     * @return this.nombre
     */
    public String obtener_nombre(){

        return this.nombre;
    }
    /**
     *  Metodo para obtener la edad
     * @return this.edad
     */
    public int obtener_edad(){

        return this.edad;
    }
    /**
     *  Metodo para obtener la peso
     * @return this.peso
     */
    public double obtener_peso(){

        return this.peso;
    }
    /**
     *  Metodo para obtener la genero
     * @return this.genero
     */
    public String obtener_genero(){

        return this.genero;
    }
    /**
     *  Metodo para obtener la estatura
     * @return this.estatura
     */
    public double obtener_estatura(){

        return this.estatura;
    }
    /**
     *  Metodo para obtener la materia
     * @return this.materia
     */
    public String obtener_materia(){

        return this.materia;
    }
    /**
     *  Metodo para obtener la informacion
     * @return this.materia
     */
    public String obtener_informacion(){
        String informacion = "Nombre:"+ nombre+"\n"+"Edad:"+edad+"\n"+ "Peso:"+peso+"\n"+"Género:"+genero+"\n"+
                "Estatura:"+estatura+"\n"+"Materia:"+materia+"\n";
        return informacion;
    }

    /**
     * Método para actualizar la variable nombre
     * @param nombre
     */
    public void actualizar_nombre (String nombre){
        // Con el this hacemos referencia a las variables globales
        this.nombre= nombre;
    }
    /**
     * Método para actualizar la variable edad
     * @param edad
     */
    public void actualizar_edad (int edad){
        // Con el this hacemos referencia a las variables globales
        this.edad= edad;
    }

    /**
     * Método para actualizar la variable peso
     * @param peso
     */
    public void actualizar_peso (double peso){
        // Con el this hacemos referencia a las variables globales
        this.peso= peso;
    }
    /**
     * Método para actualizar la variable genero
     * @param genero
     */
    public void actualizar_genero (String genero){
        // Con el this hacemos referencia a las variables globales
        this.genero= genero;
    }

    /**
     * Método para actualizar la variable estatura
     * @param estatura
     */
    public void actualizar_estatura (double estatura){
        // Con el this hacemos referencia a las variables globales
        this.estatura= estatura;
    }
    /**
     * Método para actualizar la variable genero
     * @param materia
     */
    public void actualizar_materia (String materia){
        // Con el this hacemos referencia a las variables globales
        this.materia= materia;
    }


}