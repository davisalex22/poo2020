package deber_seleccion;

public class Ejercicio14_3 {
    // Declaracion  de variables
    private double num1;
    private double num2;
    private double num3;
    private double num4;
    private double numAlto;
    // Metodos del ejercicio
    /**
     * Metodo constructor clase Ejercicio14_3
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     */
    public Ejercicio14_3(double num1, double num2, double num3, double num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
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

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public double getNum4() {
        return num4;
    }

    public void setNum4(double num4) {
        this.num4 = num4;
    }

    public double getNumAlto() {
        return numAlto;
    }

    public void setNumAlto(double numAlto) {
        this.numAlto = numAlto;
    }

    /**
     * Método para obtener el número mayor
     * @return
     */
    public double numeroAlto() {
        if ((getNum1() > getNum2()) && (getNum1() > getNum3()) && (getNum1() > getNum4())) {
            setNumAlto(num1);
        } else if ((getNum2() > getNum3()) && (getNum2() > getNum4())) {
            setNumAlto(num2);
        } else if (getNum3() > getNum4()) {
            setNumAlto(num3);
        } else {
            setNumAlto(num4);
        }
        return getNumAlto();
    }
}


