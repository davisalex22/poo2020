package polimorfismoVolumen;

public class CilindroP extends FigurasGeo3{
    // Declaracion de variables
    private double radioGeo;
    private double alturaGeo;

    // Calculo de Volumen de Cilindro
    @Override
    public void calcularVolumen() {
        volumenGeo = Math.PI * (Math.pow(radioGeo,2)*alturaGeo);
    }

    // Método set de radioGeo y alturaGeo
    public void setRadioGeo(double radioGeo) {
        this.radioGeo = radioGeo;
    }

    public void setAlturaGeo(double alturaGeo) {
        this.alturaGeo = alturaGeo;
    }
}
