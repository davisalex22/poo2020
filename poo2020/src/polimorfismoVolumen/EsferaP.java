package polimorfismoVolumen;

public class EsferaP extends FigurasGeo3{
    // Declaracion de Variables
    private double radioGeo;

    // Calculo del Volumen de la Esfera
    @Override
    public void calcularVolumen() {
        volumenGeo =  (4/3)*Math.PI*(Math.pow(radioGeo,3));
    }
    // Método set de RadioGeo
    public void setRadioGeo(double radioGeo) {
        this.radioGeo = radioGeo;
    }
}
