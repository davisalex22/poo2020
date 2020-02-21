package arreglosDeberPoo;

public class ConvertorBinario {

    // Declaracion de variables
    private String numBinario;
    private static String cadena;
    private double decimal;
    private double suma = 0;

    /**
     * Método Constructor de la clase
     * @param numBinario
     */
    public ConvertorBinario(String numBinario) {
        this.setNumBinario(numBinario);
    }
    // Métodos get y set de numBinario
    public String getNumBinario() {
        return numBinario;
    }
    public void setNumBinario(String numBinario) {
        this.numBinario = numBinario;
    }
    /**
     * Método para transformar String a Int
     * @return numeros
     */
    public int[] transformacionInt() {
        int[] numeros = new int[getNumBinario().length()];
        for (int i = 0; i < getNumBinario().length(); i++) {
            numeros[i] = Character.getNumericValue(getNumBinario().charAt(i));
        }
        return numeros;
    }
    /**
     * Método para transformacion binario a decimal
     * @return suma
     */
    public double obtenerDecimal() {
        suma = 0;
        int exponente = getNumBinario().length()-1;
        for (int i = 0; i < getNumBinario().length(); i++) {
            decimal = transformacionInt()[i] * (Math.pow(2,exponente-i));
            suma = suma + decimal;
        }
        return suma;
    }
    /**
     * Metodo para la presentacion final en pantalla
     * @return
     */
    public  String presentarDecimal() {
        cadena =String.format("%s en binario = %.2f en decimal", getNumBinario(), obtenerDecimal());
        return cadena;
    }


}
