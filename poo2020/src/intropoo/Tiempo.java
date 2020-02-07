package intropoo;

public class Tiempo {
    // Definicion de atributos globales
    private int hora;
    private int minutos;
    private int segundos;

    /**
     * Método para obtener el valor de la variable hora
     * @return this.hora
     */
    public int  obtener_hora(){
        return this.hora;
    }

    /**
     * Método para obtener el valor de la variable minutos
     * @return this. minutos
     */
    public int obtener_minutos() {
        return this.minutos;
    }

    /**
     * Método para obtener el valor de la variable segundos
     * @return this.segundos
     */
    public int obtener_segundos() {
        return this.segundos;
    }

    /**
     * Método para btener el tiempo en formato HH:MM:SS
     * @return tiempo
     */
    public String obtener_tiempo() {
        String tiempo = hora+":"+minutos+":"+segundos;
        return tiempo;
    }

    /**
     * Método para actualizar hora
     * @param hora
     */
    public void actualizar_hora(int hora) {
        // this hace referencia a variables globales
        this.hora = hora;
    }

    /**
     * Método para actualizar minutos
     * @param minutos
     */
    public void actualizar_minuto(int minutos) {
        // this hace referencia a variables globales
        this.minutos = minutos;
    }

    /**
     * Método para actualizar segundos
     * @param segundos
     */
    public void actualizar_segundo(int segundos) {
        // this hace referencia a variables globales
        this.segundos = segundos;
    }

}

