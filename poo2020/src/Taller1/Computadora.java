package Taller1;

public class Computadora {

    // Declaración de variables globales
    private String marca;
    private String procesador;
    private String ram;
    private double peso;
    private String rom;
    private double pulgadas;
    private String infoComputadora;


    /**
     * Método para obtener el valor de la variable marca
     *
     * @return this.marca
     */
    public String obtener_marca() {
        return this.marca;
    }

    /**
     * Método para obtener el valor de la variable procesador
     *
     * @return this.procesador
     */
    public String obtener_procesador() {
        return this.procesador;
    }

    /**
     * Método para obtener el valor de la variable ram
     *
     * @return this.ram
     */
    public String obtener_ram() {
        return this.ram;

    }

    /**
     * Método para obtener el valor de la variable peso
     *
     * @return this.peso
     */
    public double obtener_peso() {
        return this.peso;
    }

    /**
     * Método para obtener el valor de la variable rom
     *
     * @return this.rom
     */
    public String obtener_rom() {
        return this.rom;
    }

    /**
     * Método para obtener el valor de la variable pulgadas
     *
     * @return this.ram
     */
    public double obtener_pulgadas() {
        return this.pulgadas;

    }
    /**
     * Método para obtener el valor de la variable infoComputadora
     *
     * @return this.ram
     */
    public String obtener_infoComputadora() {
        String infoComputadora = "Las caracteristicas de la computadora son:\n"+"La marca es: "+marca+"\n"+"El peso es: "
                +peso+"\n"+"El procesador es: "+procesador+"\n"+"La ram es:"+ram+"\n"+"La rom es: "+rom+"\n"+
                "Las pulgadas en pantalla son: "+pulgadas;
        return infoComputadora;
    }
    // Métodos actualizar

    /**
     * Método actualizar marca
     * @param marca
     */
    public void actualizar_marca(String marca) {
        this.marca = marca;
    }

    /**
     * Método actualizar procesador
     * @param procesador
     */
    public void actualizar_procesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * Método actualizar ram
     * @param ram
     */
    public void actualizar_ram(String ram) {
        this.ram = ram;
    }

    /**
     * Método actualizar peso
     * @param peso
     */
    public void actualizar_peso(double peso) {
        this.peso = peso;
    }

    /**
     * Método rom
     * @param rom
     */
    public void actualizar_rom(String rom) {
        this.rom = rom;
    }

    /**
     * Método pulgadas
     * @param pulgadas
     */
    public void actualizar_pulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }
}