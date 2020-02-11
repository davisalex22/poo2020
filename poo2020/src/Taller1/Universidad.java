package Taller1;

public class Universidad {
    private String nombre;
    private String ubicacion;
    private int estudiantes;
    private String autoridades;
    private String laboratorios;
    private String docentes;


    /**
     *  Metodo para obtener el nombre
     * @return this.nombre
     */
    public String obtener_nombre(){

        return this.nombre;
    }
    /**
     *  Metodo para obtener la ubicacion
     * @return this.ubicacion
     */
    public String obtener_ubicacion(){

        return this.ubicacion;
    }
    /**
     *  Metodo para obtener la estudiantes
     * @return this.estudiantes
     */
    public double obtener_estudiantes(){

        return this.estudiantes;
    }
    /**
     *  Metodo para obtener la autoridades
     * @return this.autoridades
     */
    public String obtener_autoridades(){

        return this.autoridades;
    }
    /**
     *  Metodo para obtener la laboratorios
     * @return this.laboratorios
     */
    public String obtener_laboratorios(){

        return this.laboratorios;
    }
    /**
     *  Metodo para obtener la docentes
     * @return this.docentes
     */
    public String obtener_docentes(){

        return this.docentes;
    }
    /**
     *  Metodo para obtener la informacion
     * @return this.materia
     */
    public String obtener_informacion(){
        String informacion = "Nombre:"+ nombre+"\n"+"Ubicación:"+ubicacion+"\n"+ "Estudiantes:"+estudiantes+"\n"+
                "Autoridades:"+autoridades+"\n"+ "Laborarios:"+laboratorios+"\n"+"Docentes:"+docentes+"\n";
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
     * Método para actualizar la variable ubicacion
     * @param ubicacion
     */
    public void actualizar_ubicacion (String ubicacion){
        // Con el this hacemos referencia a las variables globales
        this.ubicacion= ubicacion;
    }

    /**
     * Método para actualizar la variable estudiantes
     * @param estudiantes
     */
    public void actualizar_estudiantes (int estudiantes){
        // Con el this hacemos referencia a las variables globales
        this.estudiantes= estudiantes;
    }
    /**
     * Método para actualizar la variable autoridades
     * @param autoridades
     */
    public void actualizar_autoridades (String autoridades){
        // Con el this hacemos referencia a las variables globales
        this.autoridades= autoridades;
    }

    /**
     * Método para actualizar la variable laboratorios
     * @param laboratorios
     */
    public void actualizar_laboratorios (String laboratorios){
        // Con el this hacemos referencia a las variables globales
        this.laboratorios= laboratorios;
    }
    /**
     * Método para actualizar la variable docentes
     * @param docentes
     */
    public void actualizar_docentes (String docentes){
        // Con el this hacemos referencia a las variables globales
        this.docentes= docentes;
    }
}
