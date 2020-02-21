package arreglo_poo;
import java.util.Scanner;
public class EjecutaDesviacionMedia2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declarar variables
        int [] nums1 = new int [15];
        int [] nums2 = new int [15];
        double [] devs = new double [15];
        int i;
        String cad = "";
        cad = String.format("%sDesviación\n\n%s\t\t%s\n", cad, "Numero", "Desviación");
        DesviacionMedia2 objNumeros = new DesviacionMedia2();
        for(i = 0; i <= 14;i++){
            System.out.println("Ingrese el valor de la posicion "+i+": ");
            nums1[i] = teclado.nextInt();
        }
        objNumeros.establecerNumeros(nums1);
        objNumeros.calcularMedia();
        cad = String.format("%s%s\n%.2f",cad,objNumeros.calcularDesviacion(),objNumeros.calcularMedia());
        System.out.printf("%s",cad);
    }
}
