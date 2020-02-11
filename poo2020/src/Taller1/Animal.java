package Taller1;

public class Animal {
    // Declaración de variables globales
    private String raza;
    private int peso;
    private String comida;
    private int horas;
    private String genero;
    private int recorre;

    /**
     * Método para obtener la variable comida
     *      * @return comida
     */
    public String obtener_Comida(){return this.comida;}
    /**
     * Método para obtener el valor de la variable horas
     * @return genero
     */
    public int obtener_Horas(){
        return this.horas;
    }
    /**
     * Método para obtener el valor de la variable nombre
     * @return nombre
     */
    public String obtener_Nombre(){
        return this.raza;
    }
    /**
     * Método para obtener el valor de la variable peso
     * @return peso
     */
    public int obtener_Peso(){
        return this.peso;
    }
    /**
     * Método para obtener el valor de la variable libro
     * @return libro
     */
    public String obtener_Genero(){
        return this.genero;
    }
    /**
     * Método para obtener el valor de la variable recorre
     * @return edad
     */
    public int obtener_Recorrido(){
        return this.recorre;
    }

    /**
     * Metodo qeu extrae los datos de la clase Animal
     * @return
     */
    public String obtenerDatos(){
        String data = "Nombre del animal: " +raza+"\n"+"Peso: "+peso+"\n"+"Tipo de Comida: "+comida+"\n"
                +"Horas de sueño: "+horas+"\n"+"Metros recorridos: "+recorre+"\n"+"Género: "+genero;
        return data;
    }

    /**
     *Metodo que sirve para actualizar  comida
     * @param comida
     */
    public void actualizar_Comida(String comida){
        this.comida = comida;
    }
    /**
     *Metodo que sirve para actualizar  raza
     * @param raza
     */
    public void actualizar_Raza(String raza){
        this.raza = raza;
    }
    /**
     *Metodo que sirve para actualizar peso
     * @param peso
     *
     */
    public void actualizar_Peso(int peso){
        this.peso = peso;
    }
    /**
     *Metodo que sirve para actualizar género
     * @param genero
     */
    public void actualizar_Genero(String genero){
        this.genero = genero;
    }
    /**
     *Metodo que sirve para actualizar las horas de sueño
     * @param horas
     */
    public void actualizar_Horas(int horas){
        this.horas = horas;
    }
    /**
     *Metodo que sirve para actualizar los metros recorridos por el animal
     * @param recorre
     */
    public void actualizar_Recorre(int recorre){
        this.recorre = recorre;
    }
}