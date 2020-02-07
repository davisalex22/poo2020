package Taller1;

public class Celular {
    // Declaración de variables globales
    private String marca;
    private String modelo;
    private String procesador;
    private String ram;
    private String rom;


    // Métodos Obtener
    /**
     * Método para obtener el valor de la variable marca
     * @return this.marca
     */
    public String obtener_marca() {
        return this.marca;
    }
    /**
     * Método para obtener el valor de la variable modelo
     * @return this.modelo
     */
    public String obtener_modelo() {
        return this.modelo;
    }
    /**
     * Método para obtener el valor de la variable procesador
     * @return this.procesador
     */
    public String obtener_procesador() {
        return this.procesador;
    }
    /**
     * Método para obtener el valor de la variable ram
     * @return this.ram
     */
    public String obtener_ram() {
        return this.ram;
    }
    /**
     * Método para obtener el valor de la variable rom
     * @return this.rom
     */
    public String obtener_rom() {
        return this.rom;
    }
    /**
     * Método para obtener el valor de la variable infoComputadora
     * @return this.ram
     */
    public String obtener_infoCelular() {
        String infoComputadora = "Las caracteristicas del Celular es:\n"+"La marca es: "+marca+"\n"+"El modelo es: "
                +modelo+"\n"+"El procesador es: "+procesador+"\n"+"La ram es:"+ram+"\n"+"La rom es: "+rom+"\n";
        return infoComputadora;
    }

    // Métodos actualizar

    /**
     * Método Actualizar Marca
     * @param marca
     */
    public void actualizar_marca(String marca) {
        this.marca = marca;
    }
    public void actualizar_procesador(String procesador) {
        this.procesador = procesador;
    }
    public void actualizar_ram(String ram) {
        this.ram = ram;
    }
    public void actualizar_modelo(String modelo) {
        this.modelo = modelo;
    }
    public void actualizar_rom(String rom) {
        this.rom = rom;
    }

}
