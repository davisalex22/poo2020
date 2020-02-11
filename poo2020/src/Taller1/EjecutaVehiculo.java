package Taller1;

public class EjecutaVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setModelo("Rio");
        vehiculo.setMarca("Kia");
        vehiculo.setAnio("2019");
        vehiculo.setCilindraje("1600");
        vehiculo.setNumPuertas(5);
        vehiculo.setNumAirbags(7);
        String mostrar_datos = vehiculo.obtenerDatos();
        System.out.println(mostrar_datos);
    }
}
