package polimorfismoVolumen;

public class CuboP extends FigurasGeo3{
    // Declaracion de variables
    private double aristaGeo;

    // Calculo del Volumen del Cubo
    @Override
    public void calcularVolumen() {
        volumenGeo =  Math.pow(aristaGeo,3);
    }
    // Método set de aristaGeo
    public void setAristaGeo(double aristaGeo) {
        this.aristaGeo = aristaGeo;
    }
}
