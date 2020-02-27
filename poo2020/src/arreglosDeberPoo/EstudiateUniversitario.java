package arreglosDeberPoo;

public class EstudiateUniversitario {
    // Declaracion de Variables
    private String[] nombre = new String[5];
    private int[] edad = new int[5];
    private String[] universidad = new String[5];
    private String[] celular = new String[5];
    private String informe = " ";
    /**
     * Método Constructor de la clase EstudianteUniversitario
     * @param nombre
     * @param edad
     * @param universidad
     * @param celular
     */
    public EstudiateUniversitario(String nombre[], int edad[], String universidad[], String celular[]){
        this.nombre = nombre;
        this.edad = edad;
        this.universidad = universidad;
        this.celular = celular;
    }

    // Métodos get y set de las variables globales
    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getEdad() {
        return edad;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    public String[] getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String[] universidad) {
        this.universidad = universidad;
    }

    public String[] getCelular() {
        return celular;
    }

    public void setCelular(String[] celular) {
        this.celular = celular;
    }

    /**
     * Método para presentar en pantalla en informe
     * @return
     */
    public String presentar(){
        for (int i = 0; i < nombre.length; i++) {
            informe = (String.format("%sNombre: %s\n Edad: %d\n Universidad: %s\n Celular: %s\n\n",informe,
                    getNombre()[i],getEdad()[i],getUniversidad()[i],getCelular()[i]));
        }
        return informe;
    }
 }
