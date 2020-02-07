package Taller1;
public class EjecutaAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.actualizar_Raza("Panda");
        animal.actualizar_Peso(521);
        animal.actualizar_Comida("Carne");
        animal.actualizar_Genero("Macho");
        animal.actualizar_Recorre(1365);
        animal.actualizar_Horas(12);
        String mostrar_datos = animal.obtenerDatos();
        System.out.println(mostrar_datos);
    }
}