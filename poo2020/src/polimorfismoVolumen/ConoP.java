package polimorfismoVolumen;

public class ConoP extends FigurasGeo3{
    // Declaracion de Variables
    private double radioGeo;
    private double alturaGeo;

    // Calculo del Volumen del Cono
    @Override
    public void calcularVolumen() {
        volumenGeo = (Math.PI*(Math.pow(radioGeo,2))*alturaGeo)/3;
    }

    // Métodos set de RadioGeo y AlturaGeo
    public void setRadioGeo(double radioGeo) {
        this.radioGeo = radioGeo;
    }

    public void setAlturaGeo(double alturaGeo) {
        this.alturaGeo = alturaGeo;
    }
}
