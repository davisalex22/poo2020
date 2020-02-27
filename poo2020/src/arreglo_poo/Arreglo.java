package arreglo_poo;

public class Arreglo {
    private int[] vectorA = new int[10];
    private int[] vectorB = new int[10];
    private int sumatoria_producto;
    private String presentarVectorA = " ";
    private String presentarVectorB = " ";

    /**
     * Método Constructor clase Arreglo
     * @param vectorA
     * @param vectorB
     */
    public Arreglo(int vectorA [], int vectorB []) {
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

     public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public int getSumatoria_producto() {
        return sumatoria_producto;
    }

    public String getPresentarVectorA() {
        return presentarVectorA;
    }

    public void setPresentarVectorA(String presentarVectorA) {
        this.presentarVectorA = presentarVectorA;
    }

    public String getPresentarVectorB() {
        return presentarVectorB;
    }

    public void setPresentarVectorB(String presentarVectorB) {
        this.presentarVectorB = presentarVectorB;
    }
    public void setSumatoria_producto(int sumatoria_producto) {
        this.sumatoria_producto = sumatoria_producto;
    }

    /**
     * Método para calcular la Sumatoria
     * @return
     */
    public int Sumatoria_producto() {
        setSumatoria_producto(0);
        for (int i = 0; i < getVectorA().length; i++){
            setSumatoria_producto(getSumatoria_producto() + (getVectorA()[i]*getVectorB()[i]));
        }
        return getSumatoria_producto();
    }

    /**
     * Método para presentar los valores del Vector1
     * @return
     */
    public String presentarVector1() {
        for (int i = 0; i < vectorA.length; i++) {
            setPresentarVectorA(String.format("%s%d ",getPresentarVectorA(),vectorA[i]));
        }
        return getPresentarVectorA();
    }

    /**
     * Método para presentar los valores del Vector2
     * @return
     */
    public String presentarVector2() {
        for (int i = 0; i < vectorA.length; i++) {
            setPresentarVectorB(String.format("%s%d ",getPresentarVectorB(),vectorB[i]));
        }
        return getPresentarVectorB();
    }
}

