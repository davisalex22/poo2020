package Taller1;

public class EjecutaComputadora {

    public static void main(String[] args) {

        // Creación de Objeto Computadora

        Computadora comp1 = new Computadora();
        comp1.actualizar_marca("Lenovo Legion Y530 (GTX-1050");
        comp1.actualizar_peso(15.5);
        comp1.actualizar_procesador("i7 Octava Generación");
        comp1.actualizar_pulgadas(17.5);
        comp1.actualizar_ram("16 GB");
        comp1.actualizar_rom("1 TB");

        String mostrar_informacion = comp1.obtener_infoComputadora();
        System.out.println(mostrar_informacion);
    }
}
