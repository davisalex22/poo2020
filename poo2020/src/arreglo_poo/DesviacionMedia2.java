package arreglo_poo;
public class DesviacionMedia2 {
    // Declaracion de variables
    private int [] numeros = new int [15];
    private double media;
    private double [] desviacion = new double [15];
    String cad = "";

    public int[] establecerNumeros(int[] n){
        numeros = n;
        return numeros;
    }
    public double calcularMedia(){
        int r;
        int sumatoria = 0;
        for ( r = 0; r <=14; r++){
            sumatoria = sumatoria + numeros[r];
        }
        media = sumatoria / r;
        return media;
    }
    public String calcularDesviacion(){
        int j;
        for ( j = 0; j <=14; j++){
            desviacion[j] = numeros[j]- media;
            cad = String.format("%s%d\t\t\t\t%.2f\n", cad, numeros[j], desviacion[j]);
        }
        return cad;
    }
    public int[] obtenerNumeros(int[] arreglo){
        return numeros;
    }
    public double obtenerMedia(){
        return media;
    }
    public double[] obtenerDesviacion(double[] arreglo){
        return desviacion;
    }
}
