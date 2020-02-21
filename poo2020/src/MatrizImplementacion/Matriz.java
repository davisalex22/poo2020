package MatrizImplementacion;

public class Matriz {
    // Declaración de Variables
    private int[][] matrizA = new int[3][3];
    private int[][] matrizB = new int[3][3];
    private int[][] matrizC = new int[3][3];

    /**
     *  Método Constructor clase Matriz
     * @param matrizA
     * @param matrizB
     */
    public Matriz(int matrizA [][], int matrizB [][]){
        this.setMatrizA(matrizA);
        this.setMatrizB(matrizB);
    }


    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }

    public int[][] getMatrizC() {
        return matrizC;
    }

    public int [][] sumaMatrices(){
        for (int i = 0; i < getMatrizA().length; i++) {
           for(int j = 0; j < getMatrizB().length; j++){
               getMatrizC()[i][j] = getMatrizA()[i][j]+getMatrizB()[i][j];
           }
        }
        return getMatrizC();
    }

    public String presentarMatriz(int matriz[][]){
        String presentarMatriz = "";
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++){
                presentarMatriz += matriz[i][j];
                presentarMatriz +="       ";
            }
            presentarMatriz +="\n";
        }
        return presentarMatriz;
    }

}
