package arreglosDeberPoo;

    public class VerificadorCedula {
        // Declaración de variables
        private String numCedula;
        private int residuo = 0;
        private int suma = 0;
        private int verificador =0;
        private int producto = 0;
        private int[] coeficientes= {2, 1, 2, 1, 2, 1, 2, 1, 2};
        private String cadena;

        /**
         *  Método Constructor clase VerificadorCedula
         * @param numCedula
         */
        public VerificadorCedula(String numCedula) {
            this.setNumCedula(numCedula);
        }

        // Métodos get y set numCedula
        public String getNumCedula() {
            return numCedula;
        }

        public void setNumCedula(String numCedula) {
            this.numCedula = numCedula;
        }
        /**
         * Metodo para convertir String en Int
         * @return nums
         */
        public int[] trasformarInt() {
            int[] numeros = new int[getNumCedula().length()];
            for (int i = 0; i < getNumCedula().length(); i++) {
                numeros[i] = Character.getNumericValue(getNumCedula().charAt(i));
            }
            return numeros;
        }

        /**
         * Método para verificar
         * @return verficador
         */
        public int obtenerVerificador() {
            suma = 0;
            residuo = 0;
            for (int i = 0; i < 9; i++) {
                producto = trasformarInt()[i] * coeficientes[i];
                if (producto >= 10) {
                    producto = producto - 9;
                }
                suma = suma + producto;
            }
            residuo = suma%10;
            verificador= 10 - residuo;
            if (verificador== 10){
                verificador = 0;
            }

            return verificador;
        }
        /**
         * Método para la presentar en Pantalla
         * @return
         */
        public String presentarVerificacion() {
            if (trasformarInt()[9] == obtenerVerificador()) {
                cadena = String.format("Numero de cédula ingresado %s\nVerificador: %d\n" +
                        "El número de cédula es correcto", getNumCedula(), obtenerVerificador());
            } else {
                cadena = String.format("La cédula es incorrecta");
            }
            return cadena;
        }
    }
