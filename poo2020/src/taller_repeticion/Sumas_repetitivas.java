package taller_repeticion;

public class Sumas_repetitivas {
    // Declaracion de vaiables
    private double num1;
    private double num2;
    private double total;

    public Sumas_repetitivas(double num1, double num2){
        this.setNum1(num1);
        this.setNum2(num2);
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public double calcularMultiplicacion() {
        int c = 0;
        double contador = getNum2();
        while (contador != 0) { //ciclo para la resta sucesiva
            total = total + getNum1();
            contador = contador - 1;      //variable cociente o resultado
        }
        return total;
    }
}
