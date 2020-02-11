package Taller1;

public class Vehiculo {
    // Declaración de variables globales
    private String marca;
    private String modelo;
    private String cilindraje;
    private String anio;
    private int numPuertas;
    private int numAirbags;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumAirbags() {
        return numAirbags;
    }

    public void setNumAirbags(int numAirbags) {
        this.numAirbags = numAirbags;
    }
    public String obtenerDatos(){
        String data = "Modelo de carro: " +modelo+"\n"+"Marca: "+marca+"\n"+"Cilindraje: "+cilindraje+"\n"
                +"Año: "+anio+"\n"+"Número de Puertas: "+numPuertas+"\n"+"Número de Airbags: "+numAirbags;
        return data;
    }
}
