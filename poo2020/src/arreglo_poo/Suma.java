package arreglo_poo;
public class Suma {
    // Declaramos las variables
    private int[ ] arreglo1 = new int[10];
    private int[ ] arreglo2 = new int[10];
    private int[ ] arreglo3 = new int[10];

    private int suma = 0;
    private String cad = "";

    public Suma(int[]arreglo1, int[] arreglo2){
        this.arreglo1 = arreglo1;
        this.arreglo2 = arreglo2;
    }


    public String suma(){
        for(int i = 0; i < arreglo1.length; i++){
            arreglo3[i] = arreglo1[i] + arreglo2[i];
            cad = String.format("%s%d\t\t\t\t%d\t\t\t\t%d\n", cad, arreglo1[i], arreglo2[i], arreglo3[i]);
        }
        return cad;
    }


    public int[] getArreglo1() {
        return arreglo1;
    }

    public void setArreglo1(int[] arreglo1) {
        this.arreglo1 = arreglo1;
    }

    public int[] getArreglo2() {
        return arreglo2;
    }

    public void setArreglo2(int[] arreglo2) {
        this.arreglo2 = arreglo2;
    }
}
