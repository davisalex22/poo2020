package matrizpoo;

public class Promedio {
    // Declaracion de variables
    private int[][] matrizA = new int[3][3];
    private double suma;
    private double prom;
    private  String cadena = "Matriz ingresada:\n\n";

    public Promedio(int[][] matrizA) {
        this.matrizA = matrizA;

    }

    /**
     * Metodo para la suma de la matriz
     * @return suma
     */
    public double sumaMatriz(){
        for (int i = 0; i < getMatrizA().length; i++) {
            for (int j = 0; j < getMatrizA().length; j++){
                suma = (suma+ getMatrizA()[i][j]);
            }
        }
        return suma;
    }

    /**
     * Metodo para el calculo del promedio
     * @return prom
     */
    public double promMatriz(){
        for (int i = 0; i < getMatrizA().length; i++) {
            for (int j = 0; j < getMatrizA().length; j++){
                prom = suma/9;
            }
        }
        return prom;
    }

    /**
     * Metodo para la presentacion de la matriz, la suma y le promedio
     * @param matriz
     * @return cadena
     */
    public String presentacionMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++){
                cadena += matriz[i][j];
                cadena +="       ";
            }
            cadena+="\n";
        }
        cadena = String.format("%s\nLa suma de la matriz es igual a: %.2f\n",cadena,sumaMatriz());
        cadena = String.format("%sEl promedio de la matriz es de: %.2f\n",cadena,promMatriz());
        return cadena;
    }
    // Get y set de la matriz
    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }
}
