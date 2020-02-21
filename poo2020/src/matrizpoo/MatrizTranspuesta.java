package matrizpoo;

public class MatrizTranspuesta {
    // Declaración de Variables
    private int[][] matrizA = new int[3][3];

    /**
     * Método Constructor de la Clase Matriz Transpuesta
     * @param matrizA
     */
    public MatrizTranspuesta(int matrizA[][]){
        this.setMatrizA(matrizA);
    }
    // Método get y set Matriz A
    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }


    /**
     * Método para presentar Matriz
     * @param matrizP
     * @return
     */
    public String presentarMatriz(int matrizP[][]){
        String presentarMatriz = "";
        for (int i = 0; i < matrizP.length; i++) {
            for(int j = 0; j < matrizP[i].length; j++){
                presentarMatriz += matrizP[i][j];
                presentarMatriz +="       ";
            }
            presentarMatriz +="\n";
        }
        return presentarMatriz;
    }

    /**
     * Método para realizar la transpuesta de cualquier Matriz
     * @param matrizT
     * @return
     */
    public int [][] matrizTranspuesta(int matrizT[][]){
        int[][] transpuesta = new int[getMatrizA()[0].length][getMatrizA().length];
        for(int i = 0; i< matrizT.length; i++){
            for(int j = 0; j< matrizT[i].length; j++){
                transpuesta[j][i] = matrizT[i][j];
            }
        }
         return transpuesta;
    }
}
