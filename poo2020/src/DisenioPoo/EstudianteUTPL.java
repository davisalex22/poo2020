package DisenioPoo;

public class EstudianteUTPL {
    // Declaracion de variables
    private double notaBimI;
    private double notaBimII;
    private String nombreEstudiante;
    private String cicloAcademico;
    private String materia;
    private double promedio;
    /**
     * Método Constructor de la clase estudianteUTPL
     * @param nombreEstudiante
     * @param cicloAcademico
     * @param notaBimI
     * @param notaBimII
     */
    public EstudianteUTPL(String nombreEstudiante, String cicloAcademico,String materia,
                          double notaBimI, double notaBimII) {
        this.notaBimI = notaBimI;
        this.notaBimII = notaBimII;
        this.nombreEstudiante = nombreEstudiante;
        this.cicloAcademico = cicloAcademico
        this.materia = materia;
    }
    //  Métodos
    public double getNotaBimI() {
        return notaBimI;
    }
    public void setNotaBimI(double notaBimI) {
        this.notaBimI = notaBimI;
    }
    public double getNotaBimII() {
        return notaBimII;
    }
    public void setNotaBimII(double notaBimII) {
        this.notaBimII = notaBimII;
    }
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
    public String getCicloAcademico() {
        return cicloAcademico;
    }
    public void setCicloAcademico(String cicloAcademico) {
        this.cicloAcademico = cicloAcademico;
    }
    public String getMateria() {
        return cicloAcademico;
    }
    public void setMateria(String materia) {this.materia = materia;
    }
    // Método para calcular promedioFinal
    public double promedioFinal() {
        this.promedio = notaBimI + notaBimII;
        return promedio;
    }
    // Método para evaluar el estado de Estudiante
    public String estadoEstudiante() {
        String informacion = "";
        if (promedio >= 27.5) {
            informacion = "APROBADO ¡Felicitaciones!";
        } else {
            if (promedio <= 20) {
                informacion = "REPROBADO - Exámen Final";
            } else {
                if (promedio < 27.5) {
                    informacion = "REPROBADO - Exámen Supletorio";
                }
            }
        }
        return informacion;
    }
    public String imprimir_Informacion() {

        String informacion =
                "       Universidad Técnica Particular de Loja\n" +
                " Alumno: " + getNombreEstudiante() + "\n" +
                " Ciclo Académico: " + getCicloAcademico() + "\n" +
                " Materia: " + getMateria() + "\n" +
                " * Promedio Final: " + promedioFinal() + "\n" +
                " Estado del Estudiante:  " + estadoEstudiante()+"\n";
        return informacion;
    }
}