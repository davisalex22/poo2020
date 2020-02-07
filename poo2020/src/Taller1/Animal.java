package Taller1;

public class Animal {
    // Declaración de variables globales
    private String raza;
    private int peso;
    private String comida;
    private int horas;
    private String genero;
    private int recorre;
    //metodos de comer duerme reproduce y camina

    /**
     * Metodo que sirve para indicar que animal esta comiendo
     * @return comida
     */
    public String obtener_Comida(){
        return this.comida;
    }

    /**
     * Metodo que sirve para indicar el numero de horas que duerme el animal
     * @return genero
     */
    public int obtener_Horas(){
        return this.horas;
    }

    /**
     * Metodo que sirve para indicar el nombre
     * @return nombre
     */
    public String obtener_Nombre(){
        return this.raza;
    }
    /**
     * Metodo que sirve para indicar que el peso del animal
     * @return materia
     */
    public int obtener_Peso(){
        return this.peso;
    }

    /**
     * Metodo que sirve para indicar que el animal esta en celo
     * @return libro
     */
    public String obtener_Genero(){
        return this.genero;
    }


    /**
     * Metodo que sirve para indicar cuantos metros recorrre el animal
     * @return edad
     */
    public int obtener_Recorrido(){
        return this.recorre;
    }

    /**
     * Metodo qeu extrae todos los datos de los animales
     * @return
     */
    public String obtenerDatos(){
        String data = "Nombre del animal: \n" +raza+"\n"+"Peso: \n"+peso+"\n"+"Tipo de Comida:\n"+comida+"\n"
                +"Horas de sueño:\n"+horas+"\n"+"Metros recorridos: \n"+recorre+"\n"+"Género"+genero;
        return data;
    }

    /**
     *Metodo que sirve para actualizar la comida
     * @param comida
     */
    public void actualizar_Comida(String comida){
        this.comida = comida;
    }
    /**
     *Metodo que sirve para actualizar la raza
     * @param raza
     */
    public void actualizar_Raza(String raza){
        this.raza = raza;
    }
    /**
     *Metodo que sirve para actualizar el peso
     * @param peso
     *
     */
    public void actualizar_Peso(int peso){
        this.peso = peso;
    }
    /**
     *Metodo que sirve para actualizar el  celo del animal
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