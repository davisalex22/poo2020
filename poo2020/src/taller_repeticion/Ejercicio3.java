package taller_repeticion;

public class Ejercicio3 {
    // Declaracion de variables
    private double num1;
    private double num2;
    private double total;

    public Ejercicio3(double num1, double num2){
        this.setNum1(num1);
        this.setNum2(num2);
    }
    // Métodos get y set de variables globales
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
    public double calcularDivision(){
        int c=0;
         while( getNum1() >= getNum2()){ //ciclo para la resta sucesiva
            setNum1(getNum1() - getNum2());
            c++;       //variable cociente o resultado
        }
        return c;
    }
}
