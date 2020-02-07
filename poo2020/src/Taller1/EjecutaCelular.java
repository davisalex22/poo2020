package Taller1;

public class EjecutaCelular {
    public static void main(String[] args) {

        // Creación de Objeto Celular

        Celular cell1 = new Celular();

        cell1.actualizar_marca("Xiaomi");
        cell1.actualizar_modelo("9T PRO");
        cell1.actualizar_procesador("Snapdragon 855 2.84GHz");
        cell1.actualizar_ram("6 GB");
        cell1.actualizar_rom("128 GB");

        String mostrar_informacion = cell1.obtener_infoCelular();
        System.out.println(mostrar_informacion);

    }
}